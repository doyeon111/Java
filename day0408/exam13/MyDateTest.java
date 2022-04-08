package exam13;
//pdf 4������

import java.util.StringTokenizer;

class MyDate {
	int year, month, date;
	public MyDate(String data) throws IllegalArgumentException {
		
		if(data == null) {
			throw new IllegalArgumentException("��¥ �����Ͱ� �����ϴ�.");
		}
		
		StringTokenizer st = new StringTokenizer(data, "/");
		year = Integer.parseInt(st.nextToken());
		month = Integer.parseInt(st.nextToken());
		date = Integer.parseInt(st.nextToken());
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	
	
}

class IllegalArgumentException extends Exception {
	public IllegalArgumentException(String msg) {
		super(msg);
	}
}

public class MyDateTest {

	public static void main(String[] args) {
		try {
		String data = "2022/04/08";
//		String data=null;
		MyDate md = new MyDate(data);
		System.out.println("����: " + md.getYear());
		System.out.println("��: " + md.getMonth());
		System.out.println("��: " + md.getDate());
		}catch(Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}

}
