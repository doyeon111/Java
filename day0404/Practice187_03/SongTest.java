package Practice187_03;


public class SongTest {

	public static void main(String[] args) {
		Song s1 = new Song("Outward Bound", "Nana", 180);
		Song s2 = new Song("Jambalya", "Carpenters");
		Song s3 = new Song("yesterday");
		Song s4 = new Song();
		
		
		System.out.println("�뷡 ����: " +s1.getTitle() + "\t" +
							"����: " +s1.getArtist() + "\t" +
							"����: " +s1.getLength() + "\t");
		
		System.out.println("�뷡 ����: " +s2.getTitle() + "\t" +
				"����: " +s2.getArtist() + "\t" +
				"����: " +s2.getLength() + "\t");
		
		System.out.println("�뷡 ����: " +s3.getTitle() + "\t" +
				"����: " +s3.getArtist() + "\t" +
				"����: " +s3.getLength() + "\t");
		
		System.out.println("�뷡 ����: " +s4.getTitle() + "\t" +
				"����: " +s4.getArtist() + "\t" +
				"����: " +s4.getLength() + "\t");
		

	}

}
