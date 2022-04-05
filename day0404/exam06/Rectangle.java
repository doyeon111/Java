package exam06;
//pdf 01번문제

//Rectangle 클래스에 생성자를 만들어보자.
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
	
	public Rectangle(String type, double v) { //아래 처럼 가로, 세로길이만 초기화 하고 싶은 데 따로 만들 수 없기 때문에 이렇게 type에 따라 결정하게 해준다.
		//type: w, l 인지에 따라 결정
		if(type.equals("w")) { //w가 오면 가로길이만 초기화
			width = v;
			length = 10;
			
		} else if(type.equals("l")) { //l이 오면 세로길이만 초기화
			length = v;
			width = 10;
		} 
	}
	
//	public Rectangle(double w) {
//		width = w;
//	}
	
//	public Rectangle(double l) { //위의 double w 한 개의 매개변수가 있기 때문에 오류가 난다. 
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
