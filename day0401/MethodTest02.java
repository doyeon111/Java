package day0401;

public class MethodTest02 {
	public static void sayHello(){ //메소드의 정의
		System.out.println("주희야 안녕"); //이렇게 여러 번 반복되는 것들을 계속 적어주기 보다는 메소드를 설정하여 호출하면 간편하게 코드를 작성할 수 있다.
		System.out.println("주희야 안녕");
		System.out.println("주희야 안녕");
		return; //호출한 곳으로 되돌아가.
	}

	public static void main(String[] args) {
		sayHello(); //메소드의 호출
		
		
		int year = 2022;
		
		System.out.println("올해는 " + year + "연도 입니다.");
		sayHello(); //메소드의 호출
		
		String title = "쌍용교육센터";
		System.out.println(title + "에서 훈련받고 있어요.");
		
		sayHello(); //메소드의 호출
	}

}
 
