package day0328;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date today = new Date(); //date을 이용하기 위함
		
		int year = today.getYear() + 1900;
		int month = today.getMonth() + 1; //0~11이기 때문에 + 1을 더해준다.
		int date = today.getDate();
		int hour = today.getHours();
		int minute = today.getMinutes();
		int second = today.getSeconds();

		
		System.out.println
		("현재는 " + year +"년 " + month + "월 " + date + "일 " + 
			hour + "시 " + minute + "분 " + second + "초 입니다.");
	}

}
