package practicelab02;

//pdf lab 02번 문제 안에 6번, 7번, 8번
public class CarTest {

	public static void main(String[] args) {
//		Car car = new Car("K5", "검정"); (6번)
//		car.speedUp(100);
//		car.speedDown(50);

//		Movable m = new Car("K5", "검정");
//		m.speedUp(100); //원래 부모 interface에 선언된 메소드는 호출할 수 있다.
//		//m.turnLeft(); //자식클래스에서 추가된 메소드는 부모 참조변수로 호출할 수 없다.
//		//호출하려면 자식클래스로 형변환하여 호출해야한다.
//		((Car)m).turnLeft(); (7번)
		
		//Car c = m; //오류발생, 자식의 참조변수가 부모의 참조변수를 가리킬 수 없다.
		//Car c = (Car)m; //가능 (형변환한 것)
		Car c = new Car("K5", "검정"); //가능
		//Movable m = c; //가능 11번째 줄이랑 같은 말. 부모의 참조변수가 자식객체를 참조할 수 있다.
		Movable m = (Movable)c; //Movable로 형변환, 부모의 참조변수가 자식의 객체를 부모클래스로 형변환하여 참조할 수 있다.
		
	}

}
 
