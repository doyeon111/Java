package exam03;

public class BookTest {

	public static void main(String[] args) {	
		Book b = new Book();
		b.setTitle("Great Java");
		b.setAuthor("bob");
		
		System.out.println("책 제목: " + b.getTitle());
		System.out.println("책 저자: " + b.getAuthor());

	}

}
