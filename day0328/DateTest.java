package day0328;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date today = new Date(); //date�� �̿��ϱ� ����
		
		int year = today.getYear() + 1900;
		int month = today.getMonth() + 1; //0~11�̱� ������ + 1�� �����ش�.
		int date = today.getDate();
		int hour = today.getHours();
		int minute = today.getMinutes();
		int second = today.getSeconds();

		
		System.out.println
		("����� " + year +"�� " + month + "�� " + date + "�� " + 
			hour + "�� " + minute + "�� " + second + "�� �Դϴ�.");
	}

}
