package exam07;

public class StringBufferTest02 {
	
	public static void execute(String sql) {
		
		System.out.println("-----------------------------------------");
		System.out.println(sql + "을 동작하였습니다.");
		System.out.println("-----------------------------------------");
	}
	
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		
		sql.append("member");
		sql.append(" values(?,?,?,?,?)"); //계속해서 문자열을 추가
		
		System.out.println(sql);
		
		sql.insert(0, "insert into "); //특정위치에 문자열 추가(insert), 0번째 인덱스에 insert into 추가
		System.out.println(sql);
		
//		execute(sql); //string으로 변환해야함
		execute(sql.toString());
	}

}
 
