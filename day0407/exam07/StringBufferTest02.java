package exam07;

public class StringBufferTest02 {
	
	public static void execute(String sql) {
		
		System.out.println("-----------------------------------------");
		System.out.println(sql + "�� �����Ͽ����ϴ�.");
		System.out.println("-----------------------------------------");
	}
	
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		
		sql.append("member");
		sql.append(" values(?,?,?,?,?)"); //����ؼ� ���ڿ��� �߰�
		
		System.out.println(sql);
		
		sql.insert(0, "insert into "); //Ư����ġ�� ���ڿ� �߰�(insert), 0��° �ε����� insert into �߰�
		System.out.println(sql);
		
//		execute(sql); //string���� ��ȯ�ؾ���
		execute(sql.toString());
	}

}
