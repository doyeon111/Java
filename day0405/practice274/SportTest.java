package practice274;

class Sports {

	String getName() {
		return "���� �������� ����";
	}
	int getPlayers() {
		return 0;
	}
	
	
	
}

class Soccer extends Sports {

	String getName() {
		return "�౸";
	}
	int getPlayers() {
		return 11;
	}
	
	
}

public class SportTest {

	public static void main(String[] args) {
		Soccer s = new Soccer();
		
		System.out.println("����̸�: " + s.getName());
		System.out.println("����ڼ�: " + s.getPlayers());

	}

}
