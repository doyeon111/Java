package exam07;

public class BookTest {

	public static void main(String[] args) {	
		Book b1 = new Book("����ִ� �ڹ�", "�赵��");
		Book b2 = new Book();
		Book b3 = new Book("t", "�޴԰� �޴�", "");
		Book b4 = new Book("a","", "�����");
		
		System.out.println("å ����: " + b1.getTitle() + ", å ����: " + b1.getAuthor());
		System.out.println("å ����: " + b2.getTitle() + ", å ����: " + b2.getAuthor());
		System.out.println("å ����: " + b3.getTitle() + ", å ����: " + b3.getAuthor());
		System.out.println("å ����: " + b4.getTitle() + ", å ����: " + b4.getAuthor());

	}

}
