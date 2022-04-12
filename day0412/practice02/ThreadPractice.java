package practice02;


//pdf 01번문제 (쓰레드연습)

class Count implements Runnable {
	protected int count;

	public Count(int count) {
		this.count = count;

	}

	@Override
	public void run() {
		for (int i = count; i >=1; i--) {
			System.out.println(i + "초 전입니다.");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
		System.out.println("발사 !!!");
	}

}

public class ThreadPractice {

	public static void main(String[] args) {
		Count c = new Count(20);
//		CountDownEvent c1 = new CountDownEvent(20, 30, )
		(new Thread(c)).start();;
	}

}
