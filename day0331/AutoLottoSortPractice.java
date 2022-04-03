package day0331;

import java.util.Random;

public class AutoLottoSortPractice {

	public static void main(String[] args) {
		//로또번호를 중복되지 않도록 자동으로 생성하고, 오름차순으로 정렬하여 출력
		

		int []data = new int[6];
		
		Random r = new Random(); 
		
		for(int i=0; i<data.length;) {
			int n = r.nextInt(45) + 1; //0~44까지 난수가 만들어짐. +1을 함으로써 45를 만들어주기
			int j;
			for(j=0; j<i; j++) { 
				if(n == data[j]) { //발생한 난수 n이 이미 있는지 조사하기
					break;
				}
			}
			
			if(j == i) { //j가 i와 같아질 때 탈출
				data[i] = n;
				i++;	
			}
		}
		//정렬
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) { // i+1번부터 비교
				if (data[j] < data[i]) {
					int temp = data[i]; //오름차순으로 정렬
					data[i] = data[j];
					data[j] = temp;
				}
			} 
 
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		

	}

}
