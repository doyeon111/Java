package exam14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest02 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�̸�", "ȫ�浿");
		map.put("����", "20");
		map.put("�ּ�", "����");
		
		System.out.println(map);
		//{�̸�=ȫ�浿, �ּ�=����, ����=20} -> ���� �Է��� ������ �������� ����.

		
		 
		LinkedHashMap<String, String> map2 = new LinkedHashMap<String, String>(); //������ �����Ѵ�
		map2.put("�̸�", "ȫ�浿");
		map2.put("����", "20");
		map2.put("�ּ�", "����");
		
		System.out.println(map2);
		
		
		
		TreeMap<String, String> map3 = new TreeMap<String, String>(); //Ű�� �������� �������ش�.
		map3.put("�̸�", "ȫ�浿");
		map3.put("����", "20");
		map3.put("�ּ�", "����");
		
		System.out.println(map3); 

	}

}
