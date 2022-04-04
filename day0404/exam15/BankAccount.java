package exam15;
//pdf LAB 3������
public class BankAccount {
	private int balance; //�ܾ��� ǥ���ϴ� ����
	
	public void deposit(int amount) { //������ �ϴ� �޼ҵ�
		balance += amount;
	}

	public void withdraw(int amount) { //�����ϴ� �޼ҵ�
		if(amount > balance) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		balance -= amount;
	}
	
	public void printBalance() { //���� �ܾ��� ����ϴ� �޼ҵ�
		System.out.println("���� �ܾ�: " + getBalance());
	}
	
	public void addInterest() { //���� �ܾ׿� ���Ͽ� �� 7.5%���ڸ� ����Ͽ� �߰��ϴ� �޼ҵ�
		balance += (int)(balance*0.075);
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	//������ �޼ҵ� �ȿ� ������ ��üȭ �غ���.
}
