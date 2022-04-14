package practice03;

//pdf 01번문제 (쓰레드연습)

class Count implements Runnable {
	int count;

	public Count(int count) {
		this.count = count;

	}

	@Override
	public void run() {
		for (int i = count; i >= 1; i--) {
			System.out.println(i + "초 전입니다.");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}System.out.println("발사 !!!");
		
	}
}

class CountDownEvent extends Thread {
		int delay;
		String msg;

		public CountDownEvent(int delay, String msg) {
			this.delay = delay;
			this.msg = msg;
		}

		@Override
		public void run() {

			try {
				Thread.sleep(delay * 1000);
			} catch (Exception e) {

			}
			System.out.println(msg);
		}

	
}
 
public class ThreadPractice {

	public static void main(String[] args) {
		Count c = new Count(20);
//		CountDownEvent c1 = new CountDownEvent(20, 30, )
		(new Thread(c)).start();
		CountDownEvent cde = new CountDownEvent(2, "연결 장치 분리!!");
		cde.start();
	}

}
