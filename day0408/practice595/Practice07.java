package practice595;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>(); // ������ �����Ѵ�
		map.put("USA", "Washington");
		map.put("Japan", "Tokyo");
		map.put("China", "Beijing");
		map.put("UK", "London");
		map.put("Korea", "Seoul");

		String name;
		Scanner sc = new Scanner(System.in);

		System.out.print("�����̸��� �Է��ϼ���: ");
		name = sc.next();

		System.out.println(name + "�� ����: " + map.get(name));

	}

}
