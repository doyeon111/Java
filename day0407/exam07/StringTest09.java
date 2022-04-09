package exam07;

public class StringTest09 {

	public static void main(String[] args) {
		String data = "hello java";
		int n = data.indexOf('e'); //j가 몇번째에 나오는지 (글자가 중복이 될 경우 가장 앞에 있는 번째로 출력 , a는 7번째)
		int n2 = data.indexOf("java"); //java라는 글자가 몇번째에 나오는지 (indexOf)
		
		System.out.println(n);
		System.out.println(n2);
		
		System.out.println("--------------------------------");
		
		int n3 = data.lastIndexOf("a"); //a라는 글자를 끝에서부터 찾는다. 하지만, 인덱스를 따질 때는 왼쪽부터(lastIndexOf)
		System.out.println(n3);
		
		String data2 = data.replace("java", "oracle"); //data2는 java에서 oracle로 글자가 바뀌게 됨.
		System.out.println(data2);
		System.out.println(data);// 하지만 data의 값은 변하지 않는다.
	}

}
 
