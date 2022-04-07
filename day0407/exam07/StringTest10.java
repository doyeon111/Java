package exam07;

public class StringTest10 {

	public static void main(String[] args) {
		String data = "김도연, 김소윤, 김혜림, 백지연, 이창희"; //5명의 이름이 ,로 구분되고 있다.
//		String[] split(String regex);
		
		//split 메소드를 이용하여 모든 사람의 이름을 출력해보자.
		
		String []arr = data.split(", "); //split을 통해 ,로 이용하여 출력
		
		for(String name: arr) {
			System.out.println(name);
		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		

	}
	//배열의 길이: length
	//문자열의 길이: length()

}
