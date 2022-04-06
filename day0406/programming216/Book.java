package programming216;

public class Book { //������
	String title; //�������� ���� �������
	int score; //������ ���� �������
	static int count; //��� ������ ���� �����ϱ� ���� Ŭ���� ����
	
	
	public Book(String title, int score) { //������
		super();
		this.title = title;
		this.score = score;
		count++;
	}


	public Book() {
		super();
		count++;
		
	}


	@Override
	public String toString() { //������ ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		return "[title=" + title + ", score=" + score + "]";
	}
	
	
}
