package day0331;

public class GugudanAll {

	public static void main(String[] args) {

		int i = 2;
		while (i <= 9) { //처음 ~단을 출력하기 위함 (2 * 1 중 2를 실행
			System.out.println(i + "단");

			int j = 1;//이 초기값이 첫 번째 while문 안에 있어야함.
			while (j <= 9) { //1~9까지 돌기위함. (2 * 1 중 1을 실행
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}
			i++;
			System.out.println("---------------------------");
		}
		//중첩 while문에서 안쪽에 있는 while문의 초기값은 바깥쪽 while문 속에 있어야 한다.
	}

}
