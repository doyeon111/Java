package day0401;


//자바의 배열은 자료형에 따라 초기값을 가진다.
//int 		0
//double	0.0
//boolean	false

public class ArrayTest {

	public static void main(String[] args) {
		int []a = new int[3];
		double [] b = new double[3];
		boolean [] c = new boolean[3];
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i<a.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i<a.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();

	}

}
