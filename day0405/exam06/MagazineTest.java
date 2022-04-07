package exam06;

public class MagazineTest {

	public static void main(String[] args) {
		Book b = new Book("콩쥐팥쥐", 100, "홍길동");
		Magazine m = new Magazine("월간자바", 300, "쌍용교육센터", "2022-04-05");

		System.out
				.println("제목: " + b.getTitle() + "\t" + "페이지 수: " + b.getPage() + "\t" + "저자: " + b.getAuthor() + "\t");

		System.out.println("제목: " + m.getTitle() + "\t" + "페이지 수: " + m.getPage() + "\t" + "저자: " + m.getAuthor() + "\t"
				+ "발매일: " + m.getDate());

	}

}
 
