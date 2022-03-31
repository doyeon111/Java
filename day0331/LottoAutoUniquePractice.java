package day0331;

import java.util.Random;
//컴퓨터가 자동으로 로또번호를 출력
public class LottoAutoUniquePractice {

	public static void main(String[] args) {
		
		int []data = new int[6];
		//1~45사이의 아무 숫자를 만들어야 됨. ==>  난수
		
		Random r = new Random(); //난수 
		
		for(int i=0; i<data.length;) {
			int n = r.nextInt(45) + 1;
			//n이 data 배열에 이미 있는지 판별하여 중복이 되지 않도록 처리하기.
			int j;
			for(j=0; j<i; j++) { 
				if(n == data[j]) { //앞에 숫자와 중복된 값이 있는지 판별 후 같은 값이 있으면 탈출
					break;
				}
			}
			
			if(j == i) {
				data[i] = n;
				i++;	
			}
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		


	}

}
