package day0329;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		//증감 연산자가 변수명 앞, 뒤에 올 수 있다.
		//증감 연산자가 단독으로 사용되면 앞에 오거나 뒤에 오거나 동일하게 값을 출력한다.
		//그러나, 다른 연산자와 같이 사용되면 의미가 달라진다.
		
		
		int a = 5;
		int b = 5;
		
		int i = a++; //증감연산자
		int j = ++b;
		
		System.out.println("a: " + a); //6
		System.out.println("b: " + b); //6
		System.out.println("i: " + i); //5
		System.out.println("j: " + j); //6
		
		
		
		
		
		
		
//		int a = 5;
//		int b = 5;
//		
//		++a; // a = a + 1
//		--b; // b = b - 1
//		System.out.println(a);
//		System.out.println(b);
		
		
		
//		int a = 5;
//		int b = 5;
//		
//		a++; // a = a + 1
//		b--; // b = b - 1
//		System.out.println(a);
//		System.out.println(b);

	}

}
