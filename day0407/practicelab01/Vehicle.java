package practicelab01;

//pdf Lab 01번
public abstract class Vehicle {
	int speed; //추상클래스에 변수를 추가할 수 있다.
	public abstract double getKilosPerLiter();
	
	//추상 클래스에 body가 구체화된 메소드를 추가할 수 있다.
	public void printSpeed() {
		System.out.println("현재속도: " + speed);
	}
	
}
 
