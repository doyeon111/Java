package exam11;
//pdf 04�� ����
//�츮�� Ŭ������ ���� ���� setter�� getter�� ������ ������� ���ŷӴ�.(�����ڵ� ��������)
//��Ŭ������ �ڵ����� ���� (���콺 ������ ���� + source + Generate getters and setters)
//������ (���콺 ������ ���� + source + Generate Constuctor using Fiels... �Ű����� ���� ������
//							   + Generate Constuctor from Superclass ... �Ű����� ���� ������
public class Box {

	private double width, length, height, volume;
	
	public void calcVolume() {
		volume = width * length * height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return volume;
	}

	public Box(double width, double length, double height) {

		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public Box() {
		width = 10;
		length = 10;
		height = 10;
	}

	
	
}
