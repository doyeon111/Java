package day0331;

public class Practice128_03 {

	// 단순히 3의 배수에 짝을 출력하는 것이 아니라 10의 자리 수와 1의 자리의 각각이 3의 배수인지 판별하여 짝을 출력해야함.
	// 만약, i가 한 자리 숫자라면 그 수가 3의 배수인지 판별하여 짝을 출력하거나 아니면 그 숫자를 출력한다.
	// 만약, i가 두 자리 숫자라면 10의자리와 1의자리를 각각 구하여
	// 10의 자리가 3의 배수이고 1의 자리도 3의 배수라면 '짝짝' 출력
	// 그렇지 않고, 10의자리만 3의 배수이거나 1의자리만 3의 배수라면 '짝' 출력
	// 10의자리도 3의 배수가 아니고 1의자리도 3의 배수가 아니라면 그 수를 출력
	
	public static void main(String[] args) {
		int i = 1;
		int n10, n1;// n10은 10의자리를 저장할 변수, n1은 1의자리를 저장할 변수

		// 20 1의자리가 0일 때
		// 30

		do {
			n10 = i / 10;
			n1 = i % 10;
			if (i < 10) { // 1자리 숫자
				if (i % 3 != 0) { // 한자리 숫자일 때 3의 배수가 아닌 것은 i를 출력
					System.out.print(i + " ");
				} else {
					System.out.print("짝 ");
				}
			} else { // 두자리 숫자
				// 10의자리 처리
				if (n10 % 3 == 0) { // 10의자리가 3의 배수인가?
					if (n1 > 0 && n1 % 3 == 0) { // 1의자리도 3의 배수인가? (30도 출력되기때문에 n1>0이라는 조건을 넣어줌)
						System.out.print("짝짝 "); // 10의자리, 1의자리 모두 3의 배수일 때 짝짝
					} else {
						System.out.print("짝 "); // 10의자리만 3의 배수일 때 짝
					}
				} else { // 10의 자리가 3의 배수가 아닌 경우
					if (n1 > 0 && n1 % 3 == 0) { // 1의 자리가 0보다 크고, 1의 자리가 3의 배수일 때 짝
						System.out.print("짝 ");
					} else {
						System.out.print(i + " "); // 10의자리, 1의자리가 3의 배수가 아닌경우 i출력
					}
				}
				// 1의자리 처리
			}

			i++;
		} while (i <= 50);
	}

}

//30 ==> 짝
//31 ==> 짝
//33 ==> 짝짝
//10의 자리가 3의 배수이고 1의자리도 3의 배수라면 짝짝
//10의 자리가 3의 배수이고 1의자리는 3의 배수가 아니라면 짝