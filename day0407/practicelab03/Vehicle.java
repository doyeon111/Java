package practicelab03;

//pdf Lab 03번
public abstract class Vehicle {
	int speed;
	public abstract double getKilosPerLiter();
	
	public void printSpeed() {
		System.out.println("현재속도: " + speed);
	}
	
}
