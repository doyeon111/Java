package day0329;

public class ShortCutOperation {

	public static void main(String[] args) {
		int a, b, c, d;
		a = b = c = d = 5; //5�� d�� �ְ� d�� c�� �ְ�....
		
		
		if(++c > 100 & ++d >100) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		
		if(++a > 100 && ++b > 100) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}

		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}

//�Ѵ� ������ ��������� (&)�����ڴ� ù���� ���ǽ��� �����̴��� �ڿ� ���ǽ��� ���۽�Ų��.
//������ &&�����ڴ� ù��° ���ǽ��� �����̸� �ڿ� ���ǽ��� ���۽�Ű�� �ʴ´�. ���� shortcut operation�̶� �θ���.