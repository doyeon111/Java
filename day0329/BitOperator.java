package day0329;

public class BitOperator {

	public static void main(String[] args) {
		int a = 10; //2����: 1010
		int b = 5;  //2����: 0101
		int i = a & b;
		int j = a | b;
		int k = a ^ b;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("k: " + k);
	}

}
