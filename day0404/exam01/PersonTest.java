package exam01;

public class PersonTest {

	public static void main(String[] args) {
		Person kim;
		kim = new Person();
//		kim.name = "�����";
//		kim.age = 28; 
		//name�� age�� private �����̶� ���� ������ �� ����.
		
		
		//public�� �ִ� �޼ҵ带 ���ؼ� private �ɹ������� �����Ѵ�.
		kim.setName("�����");
		kim.setAge(28);
		
		System.out.println(kim.getName()); //�̸��� �ҷ��� �� �ִ�. 
		System.out.println(kim.getAge()); //���̸� �ҷ��� �� �ִ�.
		//�ɹ��� �����Ͽ� ���� �����ϴ� �� �Ӹ� �ƴ϶�, �ɹ��� �����Ͽ� ���� �о���� �͵� �Ұ����ϴ�. --> get���� �޾ƿ�.
		
		kim.eat("����");
		kim.wash("��Ǫ");
		
		

	}

}
