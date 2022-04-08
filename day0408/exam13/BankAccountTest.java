package exam13;
//pdf 3������
class NegativeBalanceException extends Exception { // ����� ���� ����(RuntimeException�� �ļ��� �ƴϱ� ������ ����ó���� �������)
	public NegativeBalanceException(String msg) {
		super(msg);
	}
}

class BankAccount {
	private int balance; // �ܾ�

	public void deposit(int amount) { // �Ա�
		balance += amount;
		System.out.println(amount + "�� �����Ͽ� �ܾ��� " +balance +"�� �Ǿ����ϴ�.");
	}

	public void withdraw(int amount) throws NegativeBalanceException { // ����ݾ�
		if (amount > balance) {
			throw new NegativeBalanceException("�ܾ��� �����մϴ�.");
		}
		balance -= amount;
		System.out.println(amount + "�� �����Ͽ� �ܾ��� " + balance +"�� �Ǿ����ϴ�.");
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
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}
}
