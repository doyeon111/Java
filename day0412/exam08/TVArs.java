package exam08;

//�Ӱ迵��

//��ݾ��� ���� Ŭ����
class Account {
	// �ܾ��� ���� ����
	private int balance;

	// �Ա��� ���� �޼ҵ� ����
	// balance�� �� ���� �ϳ��� �����忡�� �����ϵ��� �ϱ� ���Ͽ� synchronized Ű���带 �ٿ� "�Ӱ迵��"�� ����
	public synchronized void deposit(String name, int amount) {

		// �Ա��� �ݾ��� �Ű������� ���޹޾� �ܾ׿� �����Ѵ�.
		balance += amount;
		System.out.println(name + "��(��) " + amount + "�Ա��Ͽ� �ܾ��� " + balance + "�� �Ǿ����ϴ�.");
	}

	// ���� �ܾ��� ��ȯ�ϴ� �޼ҵ带 ����
	public int getBalance() {
		return balance;
	}
}

//�����ڸ� ���� Ŭ������ ����
//������ �����ڵ��� ���� ������ ��ġ�� �ʰ� ���� �������� �ϱ� ���Ͽ� ������� ����
class Contributor extends Thread {
	// �����ڸ� �����ϱ� ���Ͽ� �̸��� ��������� ����
	private String name;

	// ��ݾ� Ŭ������ ��ü�� ��������� ������.
	private Account account;

	// �����ÿ� ��ݾ� ��ü�� ���޹޴´�.
	public Contributor(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	@Override
	// run�� �������̵� �Ͽ� �����尡 �ؾ��ϴ� ���� ���ش�.
	// �� ������(������)���� ���������� ���� �Ա��ؿ�, ��ݾ��� 500,000���� �� �� ����
	public void run() {
		while (true) {

			if (account.getBalance() >= 500000) { 
				break;
			}

			account.deposit(name, 1000); //���� ����
			
			try {

				Thread.sleep(200);
			} catch (Exception e) {

			}
		}
	}

}



public class TVArs {

	public static void main(String[] args) {
		//��ݾ� ���¸� ���� ��ü�� ����
		Account account = new Account();
		
		//�� ���¸� �����ϴ� 5���� ������ ��ü�� ����
		Contributor c1 = new Contributor("�����", account);
		Contributor c2 = new Contributor("�����", account);
		Contributor c3 = new Contributor("������", account);
		Contributor c4 = new Contributor("������", account);
		Contributor c5 = new Contributor("�۽¹�", account);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		
		
		//c1, c2, c3, c4, c5�� �����尡 ���� �� ���� ��ٸ����� �Ѵ�.
		try {
			c1.join(); //��ٸ����� �ϴ� ��ɾ�
			c2.join();
			c3.join();
			c4.join();
			c5.join();
		}catch(Exception e) {
			
		}
		
		System.out.println("������ݾ�: " + account.getBalance());
		

	}

}
