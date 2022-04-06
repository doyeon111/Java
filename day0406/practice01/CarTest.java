package practice01;

abstract class Vehicle {
	int speed;

	public Vehicle(int speed) {
		super();
		this.speed = speed;
	}

	
	public abstract double getKilosPerLiter();

	public String printSpeed() {
		return "현재 속도: " + speed;
	}

}

class Car extends Vehicle {

	public Car(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getKilosPerLiter() {
		
		return 0;
	}

	@Override
	public String printSpeed() {
		return "현재 속도: " + speed;
	}
	
	
	
}

public class CarTest {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle(10);
		Car c = new Car(10);
		
		c.printSpeed();
		
		

	}

}
