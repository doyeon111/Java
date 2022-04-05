package exam10;

//�ϴ��� ������ ��
class Bird {
	protected String name, color;
	protected boolean wing; //������ ����
	
	
	public Bird(String name, String color, boolean wing) {
		super();
		this.name = name;
		this.color = color;
		this.wing = wing;
	}


	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void fly() {
		if(wing == true) {
			System.out.println(color + "�� " + name + "��(��) �޷�~�޷�~");
		} else {
			System.out.println(color + "�� " + name + "��(��) �� �� �����.");
		}
	}
}

//�����
//fly �޼ҵ带 �������̵�
class Plane extends Bird {
	private boolean engine;

	public Plane(String name, String color, boolean wing, boolean engine) {
		super(name, color, wing);
		this.engine = engine;
	}

	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void fly() {
		if(wing == true && engine == true) {
			System.out.println(color + "�� " + name + "��(��) ��~��~, " + "������ �־�� !");
		} else {
			System.out.println(color + "�� " + name + "��(��) �� �� ����, " + "������(��) �����! !");
		}
	}
	
	

}

public class BirdTest {

	public static void main(String[] args) {
		Bird b1 = new Bird("����", "���", true);
		Bird b2 = new Bird("��ġ", "����", false);
		b1.fly();
		b2.fly();

		Plane p = new Plane("����747", "�ϴ�", true, true);
		p.fly();
		
	}

}
