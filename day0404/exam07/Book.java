package exam07;
//pdf 02������
//�پ��� ������ �����ڸ� ������.
public class Book {
	private String title;
	private String author;
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public Book() {
		title = "�������";
		author = "���ھ���";
	}
	
	public Book(String type, String t, String a) {
		if(type == "t") {
			title = t;
			author = "������";
		} else if (type == "a") {
			title = "�ڹ�";
			author = a;
		}
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public String getTitle() { //title ��ȯ
		return title;
	}
	
	public String getAuthor() { //author ��ȯ
		return author;
	}
}
