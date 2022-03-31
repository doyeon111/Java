package day0329;

public class ShortCutOperation {

	public static void main(String[] args) {
		int a, b, c, d;
		a = b = c = d = 5; //5를 d에 넣고 d를 c에 넣고....
		
		
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

//둘다 논리곱을 사용하지만 (&)연산자는 첫번째 조건식이 거짓이더라도 뒤에 조건식을 동작시킨다.
//하지만 &&연산자는 첫번째 조건식이 거짓이면 뒤에 조건식을 동작시키지 않는다. 따라서 shortcut operation이라 부른다.
