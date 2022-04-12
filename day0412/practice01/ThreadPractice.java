package practice01;

import practice01.Count.CountDownEvent;

//pdf 01번문제 (쓰레드연습)

class Count extends Thread {
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

	class CountDownEvent extends Count {
		private int time;
		private String msg;
		public CountDownEvent(int count, int time) {
			super(count);
			this.time = time;
		}

		@Override
		public void run() {
			for (int i = 1; i <= 20; i--) {
				System.out.println(i + "초 전입니다.");

				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("대기시간이 지났습니다.");
				}
			}

		}
	}
}

public class ThreadPractice {

	public static void main(String[] args) {
		Count c = new Count(20);
//		CountDownEvent c1 = new CountDownEvent(20, 30, )
		c.start();
	}

}
