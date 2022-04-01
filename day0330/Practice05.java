package day0330;

public class Practice05 {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) { //첫 번째 주사위 굴리기
			for (int j=1; j<=6; j++) { //두 번째 주사위 굴리기
				if(i+j==6) { //첫 번째 주사위 + 두 번째 주사위의 합이 6
					System.out.print("(" + i + "," + j + ")");
					
				} 
			} 
		}
   
	}

}
