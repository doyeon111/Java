package day0401;

public class MethodPractic04 {
	public static boolean isEquals(int[] a, int[] b) {
		boolean flag = true;
		if (a.length != b.length) { //a배열의 수와 b 배열의 개수가 같지 않으면 false 반환. (끝)
			return false;
		}
		
		for (int i=0; i<a.length; i++) { // a의 i값과 b의 i값이 같지않으면 탈출
			if(a[i] != b[i]) {
				flag = false;
				break;
			}
		}

		return flag; // 하나라도 틀리는 것이 있으면 false 반환
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };
		
		if(isEquals(a,b)) { //두 배열이 같을 경우
			System.out.println("두 배열이 같아요!");
		} else {
			System.out.println("두 배열이 달라요!");
		}

	}

} 
