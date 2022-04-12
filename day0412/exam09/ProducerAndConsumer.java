package exam09;

import java.util.Random;

//��ǰ�� ���� Ŭ����
class Product {
	// �����߻��� ���� ������ü�� ����
	Random r = new Random();

	// �����ڴ� ����ؼ� ���ο� ������ ������, �Һ��ڴ� �� ������ ������ ������ �Ѵ�.
	private int num;

	// ���ο� ��ǰ�� ����Ǿ����� �Ǻ��� ������ �����.
	// �����ڰ� ���ο� ��ǰ�� ����� true�� ���, �Һ��ڰ� ��ǰ�� �Һ��ϸ� false�� ��´�.
	boolean isNew;

	// ������ ���� �޼ҵ�
	public synchronized void makeNumber() {

		// ���� �Һ��ڰ� �Һ� ���ѵ��� ��ٸ���.
		while (isNew == true) {

			try {
				wait();
			} catch (Exception e) {

			}
		}

		// ���ο� ��ǰ�� �����Ѵ�.
		num = r.nextInt(100);

		System.out.println("�����ڰ� ���ο� ��ǰ�� �����Ͽ����ϴ�. ===>" + num);

		// ���ο� ��ǰ�� ����Ǿ��ٴ� ǥ�÷� isNew�� true�� ����
		isNew = true;

		// ������� �Һ��ڸ� �����ش�
		notify();
	}

	// �Һ� ���� �޼ҵ�
	public synchronized int useNum() {

		// �����ڰ� ���ο� ��ǰ�� ������ ������ ��ٸ�.
		while (isNew == false) {
			try {
				wait(); // ��ٸ��� �޼ҵ�� ����ó���� �Ȱ��ִ�.
			} catch (Exception e) {

			}
		}

		// �Һ�Ǿ��ٰ� ǥ���ϱ� ���Ͽ� isNew�� false�� ����
		isNew = false;

		// ������� �����ڸ� ������.
		notify();

		System.out.println("�Һ��ڰ� ��ǰ�� �Һ��Ͽ����ϴ�. ==> " + num);

		return num;
	}

}

//������ Ŭ����
class Producer extends Thread {
	// ��ǰ Ŭ������ ��������� ����
	Product product;

	// �����ÿ� ��ǰ��ü�� ���޹޴´�.
	public Producer(Product product) {
		this.product = product;
	}

	// run�� �������̵��Ͽ� �����尡 �ؾ��� ���� ���ش�.
	public void run() {

		// 10�� �ݺ��Ͽ� ���ο� ��ǰ�� �����ϵ��� �Ѵ�.
		for (int i = 0; i <= 10; i++) {
			product.makeNumber();

			try {
				Thread.sleep(200);
			} catch (Exception e) {

			}
		}
	}

}

//�Һ��� Ŭ����
class Consumer extends Thread {
	// ��ǰ�� ��������� ����
	private Product product;

	// �����ÿ� ��ǰ�� ���޹޴´�.
	public Consumer(Product product) {
		this.product = product;
	}

	// run�� �������̵� �Ͽ� �����尡 �ؾ��� ���� ���ش�.
	public void run() {
		for (int i = 0; i < 10; i++) {
			product.useNum();

			try {
				Thread.sleep(300);
			} catch (Exception e) {

			}
		}
	}

}

public class ProducerAndConsumer {

	public static void main(String[] args) {
		//��ǰ��ü�� ����
		Product product = new Product();
		
		//�����ڰ�ü�� ����
		Producer pd = new Producer(product);
		
		//�Һ��ڰ�ü�� ����
		Consumer c = new Consumer(product);
		
		//�������� �����带 ����
		pd.start();
		
		//�Һ����� �����带 ����
		c.start();

	}

}
