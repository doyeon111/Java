package practice595;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>(); // 순서를 유지한다
		map.put("USA", "Washington");
		map.put("Japan", "Tokyo");
		map.put("China", "Beijing");
		map.put("UK", "London");
		map.put("Korea", "Seoul");

		String name;
		Scanner sc = new Scanner(System.in);

		System.out.print("국가이름을 입력하세요: ");
		name = sc.next();

		System.out.println(name + "의 수도: " + map.get(name));

	}

}
