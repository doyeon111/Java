package practice274;

class Sports {

	String getName() {
		return "아직 결정되지 않음";
	}
	int getPlayers() {
		return 0;
	}
	
	
	
}

class Soccer extends Sports {

	String getName() {
		return "축구";
	}
	int getPlayers() {
		return 11;
	}
	
	
}

public class SportTest {

	public static void main(String[] args) {
		Soccer s = new Soccer();
		
		System.out.println("경기이름: " + s.getName());
		System.out.println("경기자수: " + s.getPlayers());

	}

}
