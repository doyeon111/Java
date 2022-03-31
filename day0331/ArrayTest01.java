package day0331;

public class ArrayTest01 {

	public static void main(String[] args) {
//		int []data;
//		data = new int[5];
//		//김민혁, 김한희, 고민지, 백지연, 송승민
//		
//		data[0] = 28;
//		data[1] = 23;
//		data[2] = 27;
//		data[3] = 26;
//		data[4] = 26;
		
//		System.out.println(data[0]);
//		System.out.println(data[1]);
//		System.out.println(data[2]);
//		System.out.println(data[3]);
//		System.out.println(data[4]);
		
		//위의 것을 반복문으로 수정해보기.
		
		
		//배열을 선언함과 동시에 초기값을 설정할 수 있다.
		//초기화 한 만큼 배열의 크기가 정해진다.
		int []data = {28, 23, 27, 26, 26};
		for(int i=0; i<5; i++) {
			System.out.println(data[i]);
		}
	}

}
