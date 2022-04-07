package exam12;

import java.util.Objects;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//오른쪽 마우스로 자동생성
	@Override //오버라이딩 됐다는 표시
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}

public class ToStringTest {

	public static void main(String[] args) {
		Person kim = new Person("김민혁", 28);
		Person kim2 = new Person("김민혁", 28);
		System.out.println(kim); //exam12.Person@1c4af82c가 출력됨.(주소값) ==> 오버라이딩 후에는 정상적으로 출력됨.
		//주소말고 그 객체가 갖고있는 속성들을 출력하고 싶다.
		// 그렇게 하려면 자바 조상의 제일 조상클레스인 Object의 toString을 나한테 맞게 재정의한다.
		//출력문에 객체를 표현하면 toString이 자동으로 출력된다.
		if(kim.equals(kim2)) {
			System.out.println("같아요");
		} else {
			System.out.println("달라요");
		}
	}

} 
