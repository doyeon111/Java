package exam14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest02 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이", "20");
		map.put("주소", "서울");
		
		System.out.println(map);
		//{이름=홍길동, 주소=서울, 나이=20} -> 내가 입력한 순서를 유지하지 않음.

		
		 
		LinkedHashMap<String, String> map2 = new LinkedHashMap<String, String>(); //순서를 유지한다
		map2.put("이름", "홍길동");
		map2.put("나이", "20");
		map2.put("주소", "서울");
		
		System.out.println(map2);
		
		
		
		TreeMap<String, String> map3 = new TreeMap<String, String>(); //키를 기준으로 정렬해준다.
		map3.put("이름", "홍길동");
		map3.put("나이", "20");
		map3.put("주소", "서울");
		
		System.out.println(map3); 

	}

}
