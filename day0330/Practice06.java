package day0330;

public class Practice06 {

	public static void main(String[] args) {
		int x, y;
		
		for(x=0; x<=10; x++) { //x의 값 0~10까지
			for(y=0; y<=10; y++) { //y의 값 0~10까지
				if(3 * x + 10 * y == 100) { //3x+10y=100을 만족할 때
					System.out.println("(" + x + "," + y + ")");  
				}
			}
		}

	}

}
