package day0329;

public class ComplexAssignment {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		sum = sum + i; //sum = 1 //sum += i //대입연산자		
		i = i + 1; // i = 2 //i++
		
		sum += i; //sum = 3
		i++; //i = 3
		
		sum += i; //sum = 6
		i++; //i = 4
		
		System.out.println("sum: " + sum);
		System.out.println("i: " + i);

	}

}
