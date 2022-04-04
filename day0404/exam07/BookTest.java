package exam07;

public class BookTest {

	public static void main(String[] args) {	
		Book b1 = new Book("재미있는 자바", "김도연");
		Book b2 = new Book();
		Book b3 = new Book("t", "햇님과 달님", "");
		Book b4 = new Book("a","", "김민지");
		
		System.out.println("책 제목: " + b1.getTitle() + ", 책 저자: " + b1.getAuthor());
		System.out.println("책 제목: " + b2.getTitle() + ", 책 저자: " + b2.getAuthor());
		System.out.println("책 제목: " + b3.getTitle() + ", 책 저자: " + b3.getAuthor());
		System.out.println("책 제목: " + b4.getTitle() + ", 책 저자: " + b4.getAuthor());

	}

}
