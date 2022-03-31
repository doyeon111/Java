package day0329;

public class IntAndDouble {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		
		double r = a / b; // 값이 2.5가 아닌 2.0이 나옴. 그 이유는, a와 b가 모두 int 이기 때문.
		System.out.println(r);
		
		double r2 = a / (double)b; //원하는 2.5를 얻을 수 있다.
		System.out.println(r2);
	}

}
