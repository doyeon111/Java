package exam08;

//임계영역

//모금액을 위한 클래스
class Account {
	// 잔액을 위한 변수
	private int balance;

	// 입금을 위한 메소드 정의
	// balance는 한 번에 하나의 쓰레드에게 접근하도록 하기 위하여 synchronized 키워드를 붙여 "임계영역"을 설정
	public synchronized void deposit(String name, int amount) {

		// 입금할 금액을 매개변수로 전달받아 잔액에 누적한다.
		balance += amount;
		System.out.println(name + "이(가) " + amount + "입금하여 잔액이 " + balance + "가 되었습니다.");
	}

	// 현재 잔액을 반환하는 메소드를 정의
	public int getBalance() {
		return balance;
	}
}

//성금자를 위한 클래스를 정의
//각각의 성금자들은 서로 영향을 끼치지 않고 돈을 보내도록 하기 위하여 쓰레드로 구현
class Contributor extends Thread {
	// 성금자를 구별하기 위하여 이름을 멤버변수로 선언
	private String name;

	// 모금액 클래스의 객체를 멤버변수로 가진다. 
	private Account account;

	// 생성시에 모금액 객체를 전달받는다.
	public Contributor(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	@Override
	// run을 오버라이딩 하여 쓰레드가 해야하는 일을 써준다.
	// 이 쓰레드(성금자)들은 경쟁적으로 돈을 입금해요, 모금액이 500,000원이 될 때 까지
	public void run() {
		while (true) {

			if (account.getBalance() >= 500000) { 
				break;
			}

			account.deposit(name, 1000); //순서 주의
			
			try {

				Thread.sleep(200);
			} catch (Exception e) {

			}
		}
	}

}



public class TVArs {

	public static void main(String[] args) {
		//모금액 계좌를 위한 객체를 생성
		Account account = new Account();
		
		//이 계좌를 공유하는 5명의 성금자 객체를 생성
		Contributor c1 = new Contributor("김소윤", account);
		Contributor c2 = new Contributor("고민지", account);
		Contributor c3 = new Contributor("서동혁", account);
		Contributor c4 = new Contributor("고주희", account);
		Contributor c5 = new Contributor("송승민", account);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		
		
		//c1, c2, c3, c4, c5의 스레드가 끝날 때 까지 기다리도록 한다.
		try {
			c1.join(); //기다리도록 하는 명령어
			c2.join();
			c3.join();
			c4.join();
			c5.join();
		}catch(Exception e) {
			
		}
		
		System.out.println("최종모금액: " + account.getBalance());
		

	}

}
