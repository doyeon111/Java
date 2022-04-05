package exam15;
//pdf LAB 3번문제
public class BankAccount {
	private int balance; //잔액을 표시하는 변수
	
	public void deposit(int amount) { //저금을 하는 메소드
		balance += amount;
	}

	public void withdraw(int amount) { //인출하는 메소드
		if(amount > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= amount;
	}
	
	public void printBalance() { //현재 잔액을 출력하는 메소드
		System.out.println("현재 잔액: " + getBalance());
	}
	
	public void addInterest() { //현재 잔액에 대하여 연 7.5%이자를 계산하여 추가하는 메소드
		balance += (int)(balance*0.075);
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	//각각의 메소드 안에 내용을 구체화 해보기.
}
 
