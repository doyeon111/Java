package exam14;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(); //중복을 허용하지 않고 순서를 무시한다.
		
		set.add("사과");
		set.add("포도");
		set.add("수박");
		set.add("딸기");
		set.add("포도"); //중복된 데이터 허용하지 않는다.
		System.out.println(set);

	}

}
 
