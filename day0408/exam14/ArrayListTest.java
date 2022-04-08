package exam14;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //중복을 허용하며 순서도 유지한다.
		
		list.add("사과");
		list.add("포도");
		list.add("오렌지");
		list.add("포도");
		list.add("감");
		System.out.println(list);
		list.remove(1); //1번째에 있는 것을 지워라.
		System.out.println(list);
		
		list.add(0, "체리"); //0번째 인덱스에 체리 추가
		System.out.println(list);
	}

}
