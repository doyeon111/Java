package exam05;

public class Customer extends Person { // �̸�, �ּ�, ��ȭ��ȣ�� �θ� Person�� �����ڰ� �ʱ�ȭ �ؾ���.
	private int no, mileage;
	
	public Customer(String name, String addr, String phone, int no, int mileage) { //���� �ʱ�ȭ
		super(name, addr, phone); //�θ��� �����ڸ� �䱸�ϴ� �� super, �ݵ�� ù ��° �ٿ� �;��Ѵ�.
		//this.name = name; //�ƹ��� �ڽ�Ŭ������ ������ �θ��� private �������� ������ �� ����.
		this.addr = addr; //�ܺ��� �ٸ�Ŭ������ ���ʹ� ��ȣ�ϵ� �ڽ�Ŭ�����鿡�Դ� ������ ����ϱ� ���ؼ� protected�� �̿��Ѵ�.
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
