package practicelab02;

//pdf lab02�� ���� �ȿ� 1��, 2��, 3��, 4��
public interface Movable {
	//final int speed = 100;
	//�������̽����� ����� �� �� �ִ�. ����� �ʱⰪ�� �ʿ��ϴ�.
	//�������̽� �ȿ� ������ �ڵ� ��� �̹Ƿ� final�� ������ �� �ִ�.
	
//	public void printSpeed() {
//		System.out.println("����ӵ�: " + speed);
//	}
	//�������̽� ���� �޼ҵ�� �ڵ� �߻��̱� ������ body�� ��üȭ�� �޼ҵ带 ���� �� ����.
	
	public void speedUp(int amount);
	public void speedDown(int amount);
	//�������̽��� �����߻��� �������� abstract�� �����ص� �ڵ� abstract�̴�. (1��)
}
