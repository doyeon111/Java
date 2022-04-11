package exam14;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(); //중복을 허용하지 않고 사전식으로 정렬한다.
		set.add("사과");
		set.add("포도");
		set.add("수박");
		set.add("감");
		set.add("수박");
		set.add("오렌지");
		
		System.out.println(set);
	}

}
 
