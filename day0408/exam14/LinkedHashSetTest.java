package exam14;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>(); //�ߺ��� ������� �ʰ� ������ �����ϸ� ���
		set.add("���");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		System.out.println(set);
	}

}
