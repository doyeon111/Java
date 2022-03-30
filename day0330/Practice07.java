package day0330;

public class Practice07 {

	public static void main(String[] args) {
		int i, cnt=0;
		System.out.print("2부터 100사이의 모든 소수: ");
		
		for(i=2; i<=100; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j ==0) {
					cnt++;
				}
			}
		}
		
		if(cnt == 1) {
			System.out.println(i + " ");
		} 
		 
		}	

	} 

		
	


