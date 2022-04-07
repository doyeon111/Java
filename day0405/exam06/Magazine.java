package exam06;

public class Magazine extends Book {
	private String date;
	
	public Magazine(String title, int page, String author, String date) {
		super(title, page, author);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

 
