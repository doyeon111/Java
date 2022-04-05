package exam11;

class Box {
	double width, length, height;

	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public boolean equals(Object b) {
		boolean f = false;
		Box b2 = (Box)b; // �̰��� ��������� name�� age�� ����� �� �ִ�.

		if (width == b2.width && length == b2.length && height == b2.height) {
			f = true;
		}
		return f;
	}
	

}

public class EqualsTest02 {

	public static void main(String[] args) {
		Box b1 = new Box(10, 20, 30);
		Box b2 = new Box(10, 20, 30);

		// Box Ŭ������ equal �޼ҵ带 ������ �غ���.
		if (b1.equals(b2)) { // ==�� ����
			System.out.println("���ƿ�");
		} else {
			System.out.println("�޶��"); // �������̵��� ���� �ʾұ� ������ �޶�䰡 ��µȴ�.
		}

	}

}
