package exam11;

import exam09.Box;

public class BoxTest {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(20, 30, 50);
		b1.CalcVolume();
		b2.CalcVolume();
		
		System.out.println("����: " + b1.getWidth() 
							+ " ����: " + b1.getLength()
							+ " ����: " + b1.getHeight()
							+ " ����: " + b1.getCalVolume());
		
		System.out.println("����: " + b2.getWidth() 
		+ " ����: " + b2.getLength()
		+ " ����: " + b2.getHeight()
		+ " ����: " + b2.getCalVolume());

	}
}