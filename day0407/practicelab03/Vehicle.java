package practicelab03;

//pdf Lab 03��
public abstract class Vehicle {
	int speed;
	public abstract double getKilosPerLiter();
	
	public void printSpeed() {
		System.out.println("����ӵ�: " + speed);
	}
	
}
