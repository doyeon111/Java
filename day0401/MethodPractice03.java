package day0401;

public class MethodPractice03 {
	public static double getAvg(double[] a) {
		double total = 0;
		double avg = 0;
		for (int i = 1; i < a.length; i++) {
			total += a[i];

		}
		avg = total / a.length;
		return avg;

	}

	public static void main(String[] args) {
		double[] n = {2.5, 6.7, 3.2};
		
		System.out.println("배열의 평균: " +getAvg(n));
	}

}
