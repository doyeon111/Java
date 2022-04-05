package exam07;
//pdf 02번문제
//다양한 형태의 생성자를 만들어보자.
public class Book {
	private String title;
	private String author;
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public Book() {
		title = "제목없음";
		author = "저자없음";
	}
	
	public Book(String type, String t, String a) {
		if(type == "t") {
			title = t;
			author = "김유신";
		} else if (type == "a") {
			title = "자바";
			author = a;
		}
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public void setAuthor(String a) {
		author = a;
	} 
	
	public String getTitle() { //title 반환
		return title;
	}
	
	public String getAuthor() { //author 반환
		return author;
	}
}
