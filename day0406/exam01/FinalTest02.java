package exam01;


//final 클래스의 메소드 앞에 올 경우
class A {
	public void pro() {
		System.out.println("A의 pro 입니다.");
	}
	public final void hello() { //자식이 오버라이딩 하지 못하게 final 사용
		System.out.println("hello 입니다.");
	}
}


class B extends A {
	public void pro() {
		System.out.println("B의 pro입니다.");//오버라이딩함.(자신에게 맞게끔)
	}
//	public void hello() { //부모로부터 물려받은 final메소드는 오버라이딩 할 수 없다.
//		
//	}
}

public class FinalTest02 {

	public static void main(String[] args) {
		

	} 

}
