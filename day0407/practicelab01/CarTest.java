package practicelab01;

//pdf 파일 lab 1번 문제 안에 3번, 6번
public class CarTest {

	public static void main(String[] args) {
		//Vehicle v = new Vehicle();
		//추상클래스의 객체는 생성할 수 없다. (3번)
		
		Car c = new Car();
		System.out.println(c.getKilosPerLiter());
		c.printSpeed(); //메소드를 호출할 시에는 이렇게 써준다.
		
		

	}

}
 
