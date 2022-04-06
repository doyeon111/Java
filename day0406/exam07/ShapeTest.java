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

	public abstract double getArea(); // ����
}

abstract class ThreeDimShape extends Shape {

	public ThreeDimShape(int x, int y) {
		super(x, y);
	}

	protected double volume;

	public abstract double getVolume(); // ����
}

class Ellipse extends TwoDimShape { // Ÿ��
	private double l_r, s_r;

	public Ellipse(int x, int y, double l_r, double s_r) {
		super(x, y);
		this.l_r = l_r;
		this.s_r = s_r;
	}

	@Override
	public double getArea() { // Ÿ���� ����
		area = Math.PI * l_r + s_r;
		return area;
	}

	@Override
	public String toString() {
		return "Ellipse [l_r=" + l_r + ", s_r=" + s_r + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}

}

class Rectangle extends TwoDimShape { // �簢��
	private double width, height;

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() { // �簢���� ����
		area = width * height;
		return area;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}

}

class Triangle extends TwoDimShape { // �ﰢ��
	private int width, height;

	public Triangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() { // �ﰢ���� ����
		area = width * height / 2;
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}

}

class Shpere extends ThreeDimShape { // ��
	private double r;

	public Shpere(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}

	@Override
	public double getVolume() { // ���� ����
		volume = 4.0 / 3 * Math.PI * Math.pow(r, 3);
		return volume;
	}

	@Override
	public String toString() {
		return "Shpere [r=" + r + ", volume=" + volume + ", x=" + x + ", y=" + y + "]";
	}

}

class Cube extends ThreeDimShape { // ������ü
	private double width, length, height;

	public Cube(int x, int y, double width, double length, double height) {
		super(x, y);
		this.width = width;
		this.length = length;
		this.height = height;
	}

	@Override
	public double getVolume() { // ������ü ����
		volume = width * length * height;
		return volume;
	}

	@Override
	public String toString() {
		return "Cube [width=" + width + ", length=" + length + ", height=" + height + ", volume=" + volume + ", x=" + x
				+ ", y=" + y + "]";
	}

}

class Cylinder extends ThreeDimShape { // �����
	private double r, height;

	public Cylinder(int x, int y, double r, double height) {
		super(x, y);
		this.r = r;
		this.height = height;
	}

	@Override
	public double getVolume() { // ����� ����
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
		//��� ������ ������ ���� �� �ִ� �迭�� �����.
		//�迭�� ũ��� 3���� �Ѵ�.
		//3������ ������ �迭�� �����Ͽ� ��´�.
		//�ݺ����� �̿��Ͽ� �迭�� ��Ҹ� �ϳ��� ������ ����� �� ��Ұ� 2���� �����̸� ����, 3���� �����̸� ���Ǹ� ���
		//�׸��� �� ������ ������ ����Ѵ�.
		
		
//		ArrayList<Shape> list = new ArrayList<Shape>();
		
		Shape[] arr = new Shape[3];
		
		arr[0] = new Triangle(30, 20, 10, 10);
		arr[1] = new Shpere(50, 100, 50);
		arr[2] = new Cube(40, 30, 50, 70, 80);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof TwoDimShape) { //2���� �����̶��
				((TwoDimShape)arr[i]).getArea();
			} else if(arr[i] instanceof ThreeDimShape) {
				((ThreeDimShape)arr[i]).getVolume();
			}
			
			System.out.println(arr[i]);
		}
		
		
	}

}
