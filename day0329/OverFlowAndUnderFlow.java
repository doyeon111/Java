package day0329;

public class OverFlowAndUnderFlow {

	public static void main(String[] args) {
		byte a = 127;
		a = (byte)(a + 1); //��� 128�� �ƴ� ���� 128�� ����. 
		System.out.println(a); //overflow
		
		byte b = -128;
		b = (byte)(b - 1); 
		System.out.println(b); //underflow
		

	}

}
