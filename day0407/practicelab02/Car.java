package practicelab02;

//pdf lab 02������ �ȿ� 5��
public class Car implements Movable { //���� ���̴� is a ����
	private String model, color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public void turnLeft() {
		System.out.println("��ȸ�� �մϴ�.");
	}	
	
	public void turnRight() {
		System.out.println("��ȸ�� �մϴ�.");
	}
	
	@Override
	public void speedUp(int amount) {
		System.out.println(amount + "��ŭ �ӵ��� �����մϴ�.");

	}

	@Override
	public void speedDown(int amount) {
		System.out.println(amount + "��ŭ �ӵ��� �����մϴ�.");

	}

}
