package exam14;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>(); //중복을 허용하지 않고 순서를 유지하며 출력
		set.add("사과");
		set.add("포도");
		set.add("수박");
		set.add("포도");
		set.add("딸기");
		System.out.println(set);
	}

}
