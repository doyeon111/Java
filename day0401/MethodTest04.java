package day0401;

public class MethodTest04 {

	public static void sayHello(String name, int n) { // 메소드의 정의 , 이름을 전달해주기 위한 name을 선언함
		for (int i = 1; i <= n; i++) {
			System.out.println(name + "야(아) 안녕");
		}
		return; // 호출한 곳으로 되돌아가.
	}

	public static void main(String[] args) {
		sayHello("민지", 10); // 메소드의 이름을 호출

		int year = 2022;

		System.out.println("올해는 " + year + "연도 입니다.");
		sayHello("주희", 5); // 메소드의 호출

		String title = "쌍용교육센터";
		System.out.println(title + "에서 훈련받고 있어요.");

		sayHello("다정", 2); // 메소드의 호출
	}

}
 
