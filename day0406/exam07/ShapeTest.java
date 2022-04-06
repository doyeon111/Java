package exam07;

import java.util.ArrayList;


class Shape {
	protected int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}

}

abstract class TwoDimShape extends Shape {

	public TwoDimShape(int x, int y) {
		super(x, y);
	}

	protected double area;

	public abstract double getArea(); // 넓이
}

abstract class ThreeDimShape extends Shape {

	public ThreeDimShape(int x, int y) {
		super(x, y);
	}

	protected double volume;

	public abstract double getVolume(); // 부피
}

class Ellipse extends TwoDimShape { // 타원
	private double l_r, s_r;

	public Ellipse(int x, int y, double l_r, double s_r) {
		super(x, y);
		this.l_r = l_r;
		this.s_r = s_r;
	}

	@Override
	public double getArea() { // 타원의 넓이
		area = Math.PI * l_r + s_r;
		return area;
	}

	@Override
	public String toString() {
		return "Ellipse [l_r=" + l_r + ", s_r=" + s_r + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}

}

class Rectangle extends TwoDimShape { // 사각형
	private double width, height;

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() { // 사각형의 넓이
		area = width * height;
		return area;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}

}

class Triangle extends TwoDimShape { // 삼각형
	private int width, height;

	public Triangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() { // 삼각형의 넓이
		area = width * height / 2;
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}

}

class Shpere extends ThreeDimShape { // 구
	private double r;

	public Shpere(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}

	@Override
	public double getVolume() { // 구의 부피
		volume = 4.0 / 3 * Math.PI * Math.pow(r, 3);
		return volume;
	}

	@Override
	public String toString() {
		return "Shpere [r=" + r + ", volume=" + volume + ", x=" + x + ", y=" + y + "]";
	}

}

class Cube extends ThreeDimShape { // 직육면체
	private double width, length, height;

	public Cube(int x, int y, double width, double length, double height) {
		super(x, y);
		this.width = width;
		this.length = length;
		this.height = height;
	}

	@Override
	public double getVolume() { // 직육면체 부피
		volume = width * length * height;
		return volume;
	}

	@Override
	public String toString() {
		return "Cube [width=" + width + ", length=" + length + ", height=" + height + ", volume=" + volume + ", x=" + x
				+ ", y=" + y + "]";
	}

}

class Cylinder extends ThreeDimShape { // 원기둥
	private double r, height;

	public Cylinder(int x, int y, double r, double height) {
		super(x, y);
		this.r = r;
		this.height = height;
	}

	@Override
	public double getVolume() { // 원기둥 부피
		volume = Math.PI * Math.pow(r, 2) * height;
		return volume;
	}

	@Override
	public String toString() {
		return "Cylinder [r=" + r + ", height=" + height + ", volume=" + volume + ", x=" + x + ", y=" + y + "]";
	}

}

public class ShapeTest {

	public static void main(String[] args) {
		//모든 종류의 도형을 담을 수 있는 배열을 만든다.
		//배열의 크기는 3으로 한다.
		//3가지의 도형을 배열에 생성하여 담는다.
		//반복문을 이용하여 배열의 요소를 하나씩 끄집어 내어와 그 요소가 2차원 도형이면 면적, 3차원 도형이면 부피를 계산
		//그리고 그 도형의 정보를 출력한다.
		
		
//		ArrayList<Shape> list = new ArrayList<Shape>();
		
		Shape[] arr = new Shape[3];
		
		arr[0] = new Triangle(30, 20, 10, 10);
		arr[1] = new Shpere(50, 100, 50);
		arr[2] = new Cube(40, 30, 50, 70, 80);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof TwoDimShape) { //2차원 도형이라면
				((TwoDimShape)arr[i]).getArea();
			} else if(arr[i] instanceof ThreeDimShape) {
				((ThreeDimShape)arr[i]).getVolume();
			}
			
			System.out.println(arr[i]);
		}
		
		
	}

}
