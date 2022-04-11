package exam08;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("c:/temp/hello.txt"); //해당 폴더에 파일을 생성
			fw.write("hello java"); //파일 내용에 hello java가 입력되어 있다.
			fw.close();
			
			System.out.println("파일을 생성하였습니다.");
		} catch (IOException e) {
			System.out.println("예외가 발생되었습니다." + e.getMessage()); // e.getMessage를 하면 예외의 메시지를 알 수 있다.
		}
	}

}

/*
 * public FileWriter(String fileName) throws IOException
 */

//FileWriter의 생성자는 다음과 같이 예외를 포함하고 있다.
//public FileWriter(String fileName)
//throws IOException
//IOException은 RuntimeException의 후손이 아니기 때문에 사용자가 반드시 예외처리를 해야 컴파일이 된다. 
