package exam04;

public class PersonTest {

	public static void main(String[] args) {
		Person kim;
		kim = new Person(); //객체 생성시에 이름과 나이가 자동으로 생성

		System.out.println(kim.getName()); 
		System.out.println(kim.getAge()); 

		
		kim.eat("우유");
		kim.wash("샴푸");
		
		kim.setName("김유신");
		kim.setAge(20);
		kim.eat("청국장");
		
		
		

	}

}
