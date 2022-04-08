package exam14;

import java.util.HashMap;

public class MapTest03 {

	public static void main(String[] args) {
		String []names = {"Kim", "Choi", "Park", "Kim", "Kim", "Park"};
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<names.length; i++) {
			String name = names[i];
			Integer cnt = map.get(name);
			if(cnt == null) {
				map.put(name, 1);
			} else {
				map.put(name, cnt+1);
			}
		}
		
		System.out.println(map.size() + "개의 이름이 발견되었습니다.");
		System.out.println(map);

	}

}
