package exam05;

public class CustomerTest {

	public static void main(String[] args) {
		Person p = new Person("이순신", "서울", "010-1234-5678");
		Customer c = new Customer("이순신", "서울", "010-1234-5678", 1001, 10000);

		System.out.println(p.getName() + ", " + p.getAddr() + ", " + p.getPhone());
		System.out.println(
				c.getName() + ", " + c.getAddr() + ", " + c.getPhone() + ", " + c.getNo() + ", " + c.getMileage());

	}

}
