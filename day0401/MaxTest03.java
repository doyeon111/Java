package day0401;

//각 배열에 있는 사람과 점수가 동일하다. 그 중 최고 점수인 사람의 이름을 출력하세요. +최고점 사람이 두명일 경우
public class MaxTest03 {

	public static void main(String[] args) {
		String[] name = { "홍길동", "유관순", "이순신", "김유신", "강감찬","고주희" };
		int[] score = { 40, 70, 30, 100, 90, 100 };

		//1. 일단, max를 구한다.
		//2. score 배열 중에 max와 같은 값을 갖는 인덱스들을 구한다.
		//3. 그 인덱스들에 해당하는 학생이름을 출력한다.
		
		
		//1. 일단, max를 구한다.
		int max = score[0]; //max를 먼저 구한다.
		
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
				
			}
		}
		
		//2. score 배열 중에 max와 같은 값을 갖는 인덱스들을 구한다.
		int []n = new int[score.length]; //score의 길이만큼 정한다.
		//									max  =  100
		//[3][5][][][][]						n배열	j=0,1
		//[40][70][30][100][90][100]		score   i=0,1,2,3 //i가 3번째일때 100과 같다. 따라서 j의 0번째 인덱스에 3을 넣어준다. 
		
		int j=0;
		for (int i=0; i<score.length; i++) {
			if(score[i] == max) { //score i값이 max와 같으면 n배열의 j에 i값을 집어넣어라.
				n[j] = i;
				j++;
			}
		}
		System.out.println("최고점수: " + max);
		System.out.print("최고점수의 학생: ");
		
		//j변수를 통하여 max와 동일한 값을 갖는 사람의 수를 알 수 있다. 
		for(int i=0; i<j; i++) {
			System.out.print(name[n[i]]+ " "); 
		}
		
	}	

}
 
