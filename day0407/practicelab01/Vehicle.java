package practicelab01;

//pdf Lab 01��
public abstract class Vehicle {
	int speed; //�߻�Ŭ������ ������ �߰��� �� �ִ�.
	public abstract double getKilosPerLiter();
	
	//�߻� Ŭ������ body�� ��üȭ�� �޼ҵ带 �߰��� �� �ִ�.
	public void printSpeed() {
		System.out.println("����ӵ�: " + speed);
	}
	
}
