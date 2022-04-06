package exam06;

import java.util.ArrayList;

abstract class A {
	public abstract void pro();
}

class B extends A {

	@Override
	public void pro() {
		System.out.println("B�� pro�Դϴ�.");

	}
	
	public void testB() {
		System.out.println("testB�Դϴ�.");
	}

}

class C extends A {

	@Override
	public void pro() {
		System.out.println("c�� pro�Դϴ�.");

	}

	public void testC() {
		System.out.println("testC�Դϴ�.");
	}
}

public class Test {

	public static void main(String[] args) {
		
//		A ob;
//		ob = new B();
//		ob.pro();
//		((B)ob).testB(); //ob�� testB�� ����ȯ�ض�.
//		
//		ob = new C();
//		ob.pro();
//		((C)ob).testC(); //ob�� C�� ĳ���� 
//		
		
		
		
		ArrayList<A> list = new ArrayList<A>();
		
		list.add(new B());
		list.add(new C());
		
		
		for(int i=0; i<list.size(); i++) {
			A ob = list.get(i);
			ob.pro(); //�������̵��� �ڽ��� �޼ҵ尡 �����Ѵ�.
			//���� ������ ����� ��ü�� B�� �ڷ����̸� B�� ����ȯ�Ѵ�.
			
			if(ob instanceof B) { //ob�� B�� �ڷ����̳�?
				((B)ob).testB();
			} else if (ob instanceof C) { //�׷��� �ʰ� C�� �ڷ����̸� C�� ����ȯ�Ѵ�.
				((C)ob).testC();
			}
			System.out.println("----------------------------------------------");
		}
	}

}
