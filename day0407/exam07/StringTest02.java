package exam07;

public class StringTest02 {

	//���ڿ��� �Ű������� ���� �޼ҵ�� ��ü�� String���� �Ǿ��ִ�. 
	public static void pro(String data) {
		System.out.println(data);
	}
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" java");
		
		//pro(sb); //ó���� �� ����. ������
		//pro(new String(sb)); //��Ʈ�� ���۸� ������ ��Ʈ���� ���� �� �ִ�.
		pro(sb.toString());
		
		
		//���ϴ� ���ڿ� ó���� ���Ͽ� StringBuffer�� ó���� ��ü�� �ٷ� String�� �Ű������� ���� �޼ҵ带 ȣ���� �� ����.
		//ȣ���Ϸ��� String�����ڷ� String ��ü�� ������ �� ȣ���ϰų� toString �޼ҵ带 ���Ͽ� String���� ��ȯ �� ȣ���ؾ��Ѵ�.
	}

}
