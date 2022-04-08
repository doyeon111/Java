package exam14;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<String, String>(); //키로 데이터에 접근할 수 있다.
		data.put("name", "홍길동");
		data.put("phone", "010-1234-5678");
		data.put("addr", "서울시 마포구 서교동");
		
		System.out.println("이름: " + data.get("name"));
		System.out.println("전화: " + data.get("phone"));
		System.out.println("주소: " + data.get("addr"));
		
		String oldPhone = data.put("phone", "010-1234-7777");
		System.out.println(oldPhone); //원래있던 번호를 반환함.
		System.out.println(data); //그리고 새로운 값으로 바뀜.
		//중복된 key에 값을 추가하면 원래의 데이터를 반환하고 value를 새로운 값으로 반환한다.
		
		String title = data.get("title"); //없는 키를 요청하면 null값을 반환함.
		System.out.println(title);
		//존재하지 않는 key의 값을 반환하면 null을 반환함.

	}

}
