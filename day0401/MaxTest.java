package day0401;

//큰 수 찾기(음수일 경우)
public class MaxTest {

	public static void main(String[] args) {
		int[] data = { -9, -8, -5, -15, -7 };

		// 일단, 맨 첫번째 요소를 가장 크다고 본다.
		int max = data[0]; // 가장 큰 수를 찾아 max에 담을 것

		// 나머지 모든 데이터를 max와 비교하여 그 값이 max보다 더 크다면 그 값을 max로 한다.
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			} 
		}
		
		System.out.println("가장 큰 수는 " + max);
	}

}
 
