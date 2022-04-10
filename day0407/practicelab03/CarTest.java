package practicelab03;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("K5", "검정");
		System.out.println(c1.getKilosPerLiter());
		c1.speedUp(150);
		c1.printSpeed();
		
		c1.speedDown(100);
		c1.printSpeed();
		
		c1.turnRight();
		System.out.println("-----------------------------------------------------");
		
		Car c2 = new Car("람보르기니", "흰색");
		System.out.println(c2.getKilosPerLiter());
		c2.speedUp(100);
		c2.printSpeed();
		
		c2.speedDown(60);
		c2.printSpeed();
		
		c2.turnRight();


	}

}
