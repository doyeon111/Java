package practice02;


//pdf 01������ (�����忬��)

class Count implements Runnable {
	protected int count;

	public Count(int count) {
		this.count = count;

	}

	@Override
	public void run() {
		for (int i = count; i >=1; i--) {
			System.out.println(i + "�� ���Դϴ�.");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
		System.out.println("�߻� !!!");
	}

}

public class ThreadPractice {

	public static void main(String[] args) {
		Count c = new Count(20);
//		CountDownEvent c1 = new CountDownEvent(20, 30, )
		(new Thread(c)).start();;
	}

}
