package exam01;

public class PersonTest {

	public static void main(String[] args) {
		Person kim;
		kim = new Person();
//		kim.name = "김민혁";
//		kim.age = 28; 
		//name과 age는 private 영역이라서 직접 접근할 수 없다.
		
		
		//public에 있는 메소드를 통해서 private 맴버변수에 접근한다.
		kim.setName("김민혁");
		kim.setAge(28);
		
		System.out.println(kim.getName()); //이름을 불러올 수 있다. 
		System.out.println(kim.getAge()); //나이를 불러올 수 있다.
		//맴버에 접근하여 값을 변경하는 것 뿐만 아니라, 맴버의 접근하여 값을 읽어오는 것도 불가능하다. --> get으로 받아옴.
		
		kim.eat("우유");
		kim.wash("샴푸");
		
		

	}

}
 
