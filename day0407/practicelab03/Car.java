package practicelab03;

public class Car extends Vehicle implements Movable {
	
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
		speed += amount;
		System.out.println(amount + "��ŭ �ӵ��� �����Ͽ����ϴ�.");
	}

	@Override
	public void speedDown(int amount) {
		speed -= amount;
		System.out.println(amount + "��ŭ �ӵ��� �����Ͽ����ϴ�.");
	}

	@Override
	public double getKilosPerLiter() {

		return 13;
	}

}
