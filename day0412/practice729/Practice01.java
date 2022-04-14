package practice729;


class A extends Thread {

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
//		try {
//			Thread.sleep(1000);
//		}catch(Exception e) {
//			
//		}
		System.out.print("A" + i + " ");
	}
	}
	
}

class B extends Thread {

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
//		try {
//			Thread.sleep(1000);
//		}catch(Exception e) {
//			
//		}
		System.out.print("B" + i + " ");
	}
	}
	
}

class C extends Thread {

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
//		try {
//			Thread.sleep(1000);
//		}catch(Exception e) {
//			
//		}
		System.out.print("C" + i + " ");
	}
	}
	
}

	

public class Practice01 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.start();
		b.start();
		c.start();
	}
 
}
