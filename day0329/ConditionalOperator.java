package day0329;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a = 5;
		int b = (a > 0) ? 1 : 0;
		System.out.println(b);
		
		String c = (a > 0) ? "OK" : "NO";
		System.out.println(c);
		//(a>0)?System.out.print("ok");:System.out.print("no");
		//항2와 항3에는 문장이 올 수 없다.
		// 수식이나 변수나 상수가 올 수 있다. 조건연산자
		System.out.println((a>0) ? "ok" : "no"); //이렇게는 사용가능하다.
	}

}
