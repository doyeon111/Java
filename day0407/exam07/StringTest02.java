package exam07;

public class StringTest02 {

	//문자열을 매개변수로 갖는 메소드는 대체로 String으로 되어있다. 
	public static void pro(String data) {
		System.out.println(data);
	}
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" java");
		
		//pro(sb); //처리할 수 없다. 오류남
		//pro(new String(sb)); //스트링 버퍼를 가지고 스트링을 만들 수 있다.
		pro(sb.toString());
		
		
		//변하는 문자열 처리를 위하여 StringBuffer로 처리된 객체를 바로 String을 매개변수로 갖는 메소드를 호출할 수 없다.
		//호출하려면 String생성자로 String 객체를 생성한 후 호출하거나 toString 메소드를 통하여 String으로 변환 후 호출해야한다.
	}

}
