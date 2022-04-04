package exam06;
//pdf 01������

//Rectangle Ŭ������ �����ڸ� ������.
public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle() {
		width = 10;
		length = 10;
	}
	
	public Rectangle(double w, double l) {
		width = w;
		length = l;
	}
	
	public Rectangle(String type, double v) { //�Ʒ� ó�� ����, ���α��̸� �ʱ�ȭ �ϰ� ���� �� ���� ���� �� ���� ������ �̷��� type�� ���� �����ϰ� ���ش�.
		//type: w, l ������ ���� ����
		if(type.equals("w")) { //w�� ���� ���α��̸� �ʱ�ȭ
			width = v;
			length = 10;
			
		} else if(type.equals("l")) { //l�� ���� ���α��̸� �ʱ�ȭ
			length = v;
			width = 10;
		}
	}
	
//	public Rectangle(double w) {
//		width = w;
//	}
	
//	public Rectangle(double l) { //���� double w �� ���� �Ű������� �ֱ� ������ ������ ����. 
//		
//	}
	
	public double calcArea() {
		double area = width * length;
		return area;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
}
