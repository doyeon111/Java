package exam07;

public class StringTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "hello";
		String data2 = "Hello";

		if (data1.equals(data2)) { //equals == 대소문자 구별한다.
			System.out.println("대소문자 구별하여 같아요.");
		} else {
			System.out.println("대소문자 구별하여 달라요.");
		}

		System.out.println("--------------------------------");

		if (data1.equalsIgnoreCase(data2)) { //equalsIgnoreCase  == 대소문자 구별이 없다.
			System.out.println("대소문자 구별없이 같아요.");
		} else {
			System.out.println("대소문자 구별없이 달라요.");
		}
	}

}
 
