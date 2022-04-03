package day0331;

import java.util.Random;
//컴퓨터가 자동으로 로또번호를 출력
public class LottoAutoPractice {

	public static void main(String[] args) {
		
		int []data = new int[6];
		//1~45사이의 아무 숫자를 만들어야 됨. ==>  난수
		
		Random r = new Random(); //난수 
		
		for(int i=0; i<data.length; i++) {
			data[i] = r.nextInt(45) + 1; //0부터 시작하기 때문에 +1을 해주면 원하는 숫자가 나옴.
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		


	}

}
 
