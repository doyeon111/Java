package practicelab02;

//pdf lab 02번문제 안에 5번
public class Car implements Movable { //둘의 사이는 is a 관계
	private String model, color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public void turnLeft() {
		System.out.println("좌회전 합니다.");
	}	
	
	public void turnRight() {
		System.out.println("우회전 합니다.");
	}
	
	@Override
	public void speedUp(int amount) {
		System.out.println(amount + "만큼 속도를 증가합니다.");

	}

	@Override
	public void speedDown(int amount) {
		System.out.println(amount + "만큼 속도를 감소합니다.");

	} 

}
