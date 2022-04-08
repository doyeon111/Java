package exam13;
//pdf 3번문제
class NegativeBalanceException extends Exception { // 사용자 정의 예외(RuntimeException의 후손이 아니기 때문에 예외처리를 해줘야함)
	public NegativeBalanceException(String msg) {
		super(msg);
	}
}

class BankAccount {
	private int balance; // 잔액

	public void deposit(int amount) { // 입금
		balance += amount;
		System.out.println(amount + "를 저금하여 잔액이 " +balance +"가 되었습니다.");
	}

	public void withdraw(int amount) throws NegativeBalanceException { // 인출금액
		if (amount > balance) {
			throw new NegativeBalanceException("잔액이 부족합니다.");
		}
		balance -= amount;
		System.out.println(amount + "를 인출하여 잔액이 " + balance +"가 되었습니다.");
	}

}

public class BankAccountTest {

	public static void main(String[] args) {
		try {
			BankAccount b = new BankAccount();
			b.deposit(1000);
			b.withdraw(500);
			b.withdraw(700);
		} catch (NegativeBalanceException e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}
}
