package exam10;
//pdf 04�� ����
//1) �پ��� �����ڸ� ����� ����
//2) �����ڳ� �޼ҵ��� �Ű����� �̸��� �ǹ��ִ� �̸����� �����ش�.
public class Box {
	private double width, length, height, volume;
	
	public Box() {
		this(10, 10, 10); //�ݵ�� ù ��° ���忡 �;��Ѵ�.
		System.out.println("�Ű������� ���� �����ڰ� �����Ͽ����ϴ�.");
	}
	
	public Box (double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public void CalcVolume() {
		volume = width * length * height;
	}
	
	public double getCalVolume() {
		return volume;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getHeight() {
		return this.height;
	}
}
