package day0330;

public class Practice06 {

	public static void main(String[] args) {
		int x, y;
		
		for(x=0; x<=10; x++) { //x�� �� 0~10����
			for(y=0; y<=10; y++) { //y�� �� 0~10����
				if(3 * x + 10 * y == 100) { //3x+10y=100�� ������ ��
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

	}

}
