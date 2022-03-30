package day0329;

public class OverFlowAndUnderFlow {

	public static void main(String[] args) {
		byte a = 127;
		a = (byte)(a + 1); //양수 128이 아닌 음수 128이 나옴. 
		System.out.println(a); //overflow
		
		byte b = -128;
		b = (byte)(b - 1); 
		System.out.println(b); //underflow
		

	}

}
