package Practice187_03;


public class SongTest {

	public static void main(String[] args) {
		Song s1 = new Song("Outward Bound", "Nana", 180);
		Song s2 = new Song("Jambalya", "Carpenters");
		Song s3 = new Song("yesterday");
		Song s4 = new Song();
		
		
		System.out.println("노래 제목: " +s1.getTitle() + "\t" +
							"가수: " +s1.getArtist() + "\t" +
							"길이: " +s1.getLength() + "\t");
		
		System.out.println("노래 제목: " +s2.getTitle() + "\t" +
				"가수: " +s2.getArtist() + "\t" +
				"길이: " +s2.getLength() + "\t");
		
		System.out.println("노래 제목: " +s3.getTitle() + "\t" +
				"가수: " +s3.getArtist() + "\t" +
				"길이: " +s3.getLength() + "\t");
		
		System.out.println("노래 제목: " +s4.getTitle() + "\t" +
				"가수: " +s4.getArtist() + "\t" +
				"길이: " +s4.getLength() + "\t");
		

	}

}
