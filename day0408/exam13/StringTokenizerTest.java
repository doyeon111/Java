package exam13;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		//String data = "홍길동: 이순신: 유관순: 김유신";
		String data = "홍길동 이순신 유관순 김유신";
		StringTokenizer st = new StringTokenizer(data, " ");
		
		
		while(st.hasMoreTokens()) { //토큰이 있는만큼 하나씩 가져옴
			String name = st.nextToken();
			System.out.println(name);
		}
		
		
//		String a = st.nextToken(); //하나씩 끄집어 내어옴 , 홍길동
//		String b = st.nextToken(); //이순신
//		String c = st.nextToken(); //유관순
//		String d = st.nextToken(); //김유신
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		
		
		
		

	}
 
}
