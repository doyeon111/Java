package exam10;

//하늘을 날으는 새
class Bird {
	protected String name, color;
	protected boolean wing; //날개의 여부
	
	
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
			System.out.println(color + "색 " + name + "이(가) 펄럭~펄럭~");
		} else {
			System.out.println(color + "색 " + name + "이(가) 날 수 없어요.");
		}
	}
}

//비행기
//fly 메소드를 오버라이딩
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
			System.out.println(color + "색 " + name + "이(가) 쓩~쓩~, " + "엔진이 있어요 !");
		} else {
			System.out.println(color + "색 " + name + "이(가) 날 수 없고, " + "엔진이(가) 없어요! !");
		}
	}
	
	

}

public class BirdTest {

	public static void main(String[] args) {
		Bird b1 = new Bird("참새", "노랑", true);
		Bird b2 = new Bird("까치", "검은", false);
		b1.fly();
		b2.fly();

		Plane p = new Plane("보잉747", "하늘", true, true);
		p.fly();
		
	}

}
