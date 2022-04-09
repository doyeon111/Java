package programming216;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
	public static Scanner sc; // 스캐너를 공동으로 사용하기 위함.

	public static void printMenu() {
		System.out.println("==========================================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 모든 책 출력");
		System.out.println("4. 종료");
		System.out.println("==========================================");
		System.out.print("번호를 입력하시오: ");

	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		// Book []bookList = new Book[100];
		ArrayList<Book> list = new ArrayList<Book>(); // 배열의 수를 정하지 않고 계속해서 실행
		//도서의 정보를 담을 리스트를 선언한다.
		int menu; // 메뉴를 선택하기 위한 변수를 선언한다.
		
		
		//종료를 위한 메뉴 4를 입력하지 않는 한 계속 실행한다.
		while (true) {
			printMenu(); //메뉴를 출력
			menu = sc.nextInt(); //메뉴를 입력
			if (menu == 4) { //입력한 메뉴가 4이면 반복문을 
				break; //탈출
			}

			switch (menu) { //선택한 메뉴에 따라서
			case 1: 
				insertBook(list); //메뉴가 1이면 도서를 등록하기 위한 메소드를 호출
				break;
			case 2:
				searchBook(list); //메뉴가 2이면 도서를 검색하기 위한 메소드를 호출
				break;
			case 3:
				printBook(list); //메뉴가 3이라면 모든 도서를 출력하기 위한 메소드를 호출
				break;
			}
		}
		
		System.out.println("프로그램을 종료하였습니다."); //메뉴에 4를 입력하여 반복문을 탈출했으면 프로그램을 종료하였다고 출력

	}

	//반복문 안에서 메뉴를 출력하기 위한 메소드를 만든다. (모든 도서를 출력하기 위한 메소드)
	public static void printBook(ArrayList<Book> list) {
//		for (int i = 0; i < list.size(); i++) {
		for(int i=0; i<Book.count; i++) { //리스트에 담긴 도서의 수 만큼 반복실행하여
			System.out.println(list.get(i)); //도서를 하나씩 끄집어내어 와서 출력
		}
	}

	//도서를 검색하기 위한 메소드
	public static void searchBook(ArrayList<Book> list) {
		String title; //검색할 도서명을 입력하기 위한 변수
		int score = -1;  //검색할 도서의 평점을 저장하기 위한 변수
		
		
		//찾을 도서명을 입력
		System.out.print("찾고자 하는 도서명을 입력하세요: ");
		title = sc.next();
		
		
		for (int i = 0; i < Book.count; i++) { //리스트에 담긴 도서의 수 만큼 반복실행하여
			Book b = list.get(i); //도서를 하나씩 끄집어내어와 b에 저장

			if (b.title.equals(title)) { // 끄집어 내어온 b의 도서명과 입력한 찾을 도서명이 일치하다면 
				score = b.score;	//그 평점을 변수에 저장
			}
		}
		//만약 찾을 도서명이 리스트에 존재하지 않는다면 score는 -1을 유지하고 있다.
		
		if(score != -1) { //찾는도서가 리스트에 있었다면 
			System.out.println(title + "도서의 평점은 " + score + " 입니다."); //평점을 출력
		} else { //찾는 도서가 리스트에 없다면
			System.out.println(title + "도서의 평점은 없습니다."); //없다고 출력
		}

		

	}
	
	//도서를 등록하기 위한 메소드
	public static void insertBook(ArrayList<Book> list) {
		String title;  //등록할 도서의 이름을 저장하기 위한 변수
		int score; //등록할 도서의 평점을 저장하기 위한 변수
		System.out.print("제목: ");
		title = sc.next();
		System.out.print("평점: ");
		score = sc.nextInt();
		
		//도서이름과 평점을 멤버변수 갖는 Book 객체를 생성
		Book book = new Book(title, score);
		//생성한 Book을 리스트에 담는다.
		list.add(book);
		System.out.println("도서의 평점을 등록하였습니다."); //등록했다고 메시지를 출력

	}
 
}
