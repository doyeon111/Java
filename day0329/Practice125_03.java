package day0329;

public class Practice125_03 {

	public static void main(String[] args) {
		int age = 66;
		
		if(age > 20) 
			if(age < 65)
				System.out.println("1번 그룹");
			else
				System.out.println("2번 그룹"); // 이 else는 바로 위에 있는 if와 대응이 되는 것 처럼 보이기 때문에 들여쓰기가 필요

		
		/* 
		 중첩 if일때에 else가 오면 가장 가까운 if와 대응이 된다.
		 */
	}

}
