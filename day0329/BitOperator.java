package day0329;

public class BitOperator {

	public static void main(String[] args) {
		int a = 10; //2진수: 1010
		int b = 5;  //2진수: 0101
		int i = a & b; //비트곱
		int j = a | b; //비트합
		int k = a ^ b; //비트차
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("k: " + k);
	}

}
