package exam14;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(); //�ߺ��� ������� �ʰ� ������ �����Ѵ�.
		
		set.add("���");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����"); //�ߺ��� ������ ������� �ʴ´�.
		System.out.println(set);

	}

}
