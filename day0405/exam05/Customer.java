package exam05;

public class Customer extends Person { // 이름, 주소, 전화번호는 부모 Person의 생성자가 초기화 해야함.
	private int no, mileage;
	
	public Customer(String name, String addr, String phone, int no, int mileage) { //값을 초기화
		super(name, addr, phone); //부모의 생성자를 요구하는 것 super, 반드시 첫 번째 줄에 와야한다.
		//this.name = name; //아무리 자식클래스라 할지라도 부모의 private 영역에는 접근할 수 없다.
		this.addr = addr; //외부의 다른클래스로 부터는 보호하되 자식클래스들에게는 접근을 허용하기 위해서 protected를 이용한다.
		this.no = no;
		this.mileage = mileage;
	}
	
	public Customer() {
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	 
}
