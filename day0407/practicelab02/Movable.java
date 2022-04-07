package practicelab02;

//pdf lab02번 문제 안에 1번, 2번, 3번, 4번
public interface Movable {
	//final int speed = 100;
	//인터페이스에는 상수만 올 수 있다. 상수는 초기값이 필요하다.
	//인터페이스 안에 변수는 자동 상수 이므로 final을 생략할 수 있다.
	
//	public void printSpeed() {
//		System.out.println("현재속도: " + speed);
//	}
	//인터페이스 안의 메소드는 자동 추상이기 때문에 body가 구체화된 메소드를 가질 수 없다.
	
	public void speedUp(int amount);
	public void speedDown(int amount);
	//인터페이스는 완전추상의 개념으로 abstract을 생략해도 자동 abstract이다. (1번)
}
