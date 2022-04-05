package exam09;

public class MelonTest {

	public static void main(String[] args) {
		Food f = new Food(35, 2500, 50);
		System.out.println(f.getInfo());
		
		
		Melon m = new Melon(25, 3000, 60, "½Ö¿ë³ó¿ø");
		System.out.println(m.getInfo());

	}

}
