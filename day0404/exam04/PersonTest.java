package exam04;

public class PersonTest {

	public static void main(String[] args) {
		Person kim;
		kim = new Person(); //��ü �����ÿ� �̸��� ���̰� �ڵ����� ����

		System.out.println(kim.getName()); 
		System.out.println(kim.getAge()); 

		
		kim.eat("����");
		kim.wash("��Ǫ");
		
		kim.setName("������");
		kim.setAge(20);
		kim.eat("û����");
		
		
		

	}

}
