package exam14;

import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {
	
		ArrayList<String> data = new ArrayList<String>();
		data.add("홍길동");
		data.add("010-1234-5678");
		data.add("서울시 마포구 서교동");
		
		System.out.println("이름: " + data.get(0));
		System.out.println("전화: " + data.get(1));
		System.out.println("주소: " + data.get(2));


	}

}
