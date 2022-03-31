package day0331;

public class SortTest {

	public static void main(String[] args) {
		int[] data = { 15, 24, 10, 18, 44, 42 };
		// 정렬: 값의 크기 순서대로 배치하는 것
		// 오름차순 정렬: 값이 작은 것 부터 오도록 하는 것
		// 내림차순 정렬: 값이 큰 것 부터 오도록 하는 것

		//정렬하는 반복문
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) { // i+1번부터 비교
				if (data[j] < data[i]) {
					int temp = data[i]; //오름차순으로 정렬
					data[i] = data[j];
					data[j] = temp;
				}
			} 

		}
		//출력하는 반복문
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
