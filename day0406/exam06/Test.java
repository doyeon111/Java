package exam06;

import java.util.ArrayList;

abstract class A {
	public abstract void pro();
}

class B extends A {

	@Override
	public void pro() {
		System.out.println("B의 pro입니다.");

	}
	
	public void testB() {
		System.out.println("testB입니다.");
	}

}

class C extends A {

	@Override
	public void pro() {
		System.out.println("c의 pro입니다.");

	}

	public void testC() {
		System.out.println("testC입니다.");
	}
}

public class Test {

	public static void main(String[] args) {
		
//		A ob;
//		ob = new B();
//		ob.pro();
//		((B)ob).testB(); //ob를 testB로 형변환해라.
//		
//		ob = new C();
//		ob.pro();
//		((C)ob).testC(); //ob를 C로 캐스팅 
//		
		
		
		
		ArrayList<A> list = new ArrayList<A>();
		
		list.add(new B());
		list.add(new C());
		
		
		for(int i=0; i<list.size(); i++) {
			A ob = list.get(i);
			ob.pro(); //오버라이딩한 자신의 메소드가 동작한다.
			//만약 끄집어 내어온 객체가 B의 자료형이면 B로 형변환한다.
			
			if(ob instanceof B) { //ob가 B의 자료형이냐?
				((B)ob).testB();
			} else if (ob instanceof C) { //그렇지 않고 C의 자료형이면 C로 형변환한다.
				((C)ob).testC();
			}
			System.out.println("----------------------------------------------");
		}
	}

} 
