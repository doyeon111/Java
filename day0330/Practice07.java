package day0330;

public class Practice07 {

	public static void main(String[] args) {
		int i, cnt=0;
		System.out.print("2부터 100사이의 모든 소수: ");
		
		for(i=2; i<=100; i++) { //i가 2부터 100까지 1씩 증가하며 반복실행
			for(int j=2; j<=i; j++) { //j가 2부터 i까지 1씩 증가하며 반복실행
				if(i%j ==0) { //i에서 j를 나눈 나머지 값이 0이 되면 
					cnt++; //증감
				}
			}
		}
		
		if(cnt == 1) { //cnt가 1이면 소수
			System.out.println(i + " ");
		} 
		 
		}	

	} 

		
	


