package practicelab02;

//pdf lab 02�� ���� �ȿ� 6��, 7��, 8��
public class CarTest {

	public static void main(String[] args) {
//		Car car = new Car("K5", "����"); (6��)
//		car.speedUp(100);
//		car.speedDown(50);

//		Movable m = new Car("K5", "����");
//		m.speedUp(100); //���� �θ� interface�� ����� �޼ҵ�� ȣ���� �� �ִ�.
//		//m.turnLeft(); //�ڽ�Ŭ�������� �߰��� �޼ҵ�� �θ� ���������� ȣ���� �� ����.
//		//ȣ���Ϸ��� �ڽ�Ŭ������ ����ȯ�Ͽ� ȣ���ؾ��Ѵ�.
//		((Car)m).turnLeft(); (7��)
		
		//Car c = m; //�����߻�, �ڽ��� ���������� �θ��� ���������� ����ų �� ����.
		//Car c = (Car)m; //���� (����ȯ�� ��)
		Car c = new Car("K5", "����"); //����
		//Movable m = c; //���� 11��° ���̶� ���� ��. �θ��� ���������� �ڽİ�ü�� ������ �� �ִ�.
		Movable m = (Movable)c; //Movable�� ����ȯ, �θ��� ���������� �ڽ��� ��ü�� �θ�Ŭ������ ����ȯ�Ͽ� ������ �� �ִ�.
		
	}

}
