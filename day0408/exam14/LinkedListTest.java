package exam14;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); //중복을 허용하고 순서를 유지한다.
		
		list.add("사과");
		list.add("포도");
		list.add("수박");
		list.add("포도");
		list.add("오렌지");
		System.out.println(list);
		
		System.out.println(list.get(0));
		list.remove(1);
		System.out.println(list);
		
		list.add(0, "체리");
		System.out.println(list);
	}

}
 
