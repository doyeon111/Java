package day0331;
//김다정, 서동헉, 이희승, 조태헌, 최우림
//28, 27, 27, 25, 26
//배열을 이용하여 2조의 평균나이를 계산하여 출력하기.
public class ArrayTest02 {

	public static void main(String[] args) {
		int []data = {28, 27, 27, 25, 26};
		
		int total = 0;
		int avg;
		
		for(int i=0; i<data.length; i++) {
			total += data[i];
			
		}
		avg = total / data.length; //data.length: 데이터의 길이를 알려주는 것
		
		System.out.println("2조의 평균나이: " + avg);

	}

}
