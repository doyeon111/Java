package exam07;

public class StringTest01 {

	public static void main(String[] args) {
		String data = new String("hello");
		data = data + " java";
		System.out.println(data);

	}
	
	//String에 연산을 하게 되면 새로운 객체를 생성하게되고, 참조변수를 새로운 메모리를 참조하게 된다.
	// 이전에 참조하던 메모리는 더 이상 참조되지 않는 grabage가 된다.(쓰레기 값)

}
