package practice595;

import java.util.LinkedHashMap;

public class Practice08 {

	public static void main(String[] args) {

		String names[] = { new String("Kim"), new String("Choi"), new String("Park"), new String("Kim"),
				new String("Kim"), new String("Park") };

		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>(); // 키로 데이터에 접근할 수 있다.
		int cnt = 1;
		int j = 0;

		for (int i = 0; i < names.length; i++) {
			cnt = 1;
			for (j = 0; j < i; j++) {
				if (names[j].equals(names[i])) {
					cnt++;
				}
			}
			map.put(names[j], Integer.toString(cnt));
		}

		System.out.println(map);
	}

}
