package exam03;

public class BookTest {

	public static void main(String[] args) {	
		Book b = new Book();
		b.setTitle("Great Java");
		b.setAuthor("bob");
		
		System.out.println("å ����: " + b.getTitle());
		System.out.println("å ����: " + b.getAuthor());

	}

}
