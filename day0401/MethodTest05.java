package day0401;

public class MethodTest05 {
	public static void gugudan(int dan) { // (int dan) �� �Ű�������� ��.
		System.out.println("*** " + dan + "�� ***");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		gugudan(7);
		gugudan(2);

	}

}
