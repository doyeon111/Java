package exam08;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("c:/temp/hello.txt"); //�ش� ������ ������ ����
			fw.write("hello java"); //���� ���뿡 hello java�� �ԷµǾ� �ִ�.
			fw.close();
			
			System.out.println("������ �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�." + e.getMessage()); // e.getMessage�� �ϸ� ������ �޽����� �� �� �ִ�.
		}
	}

}

/*
 * public FileWriter(String fileName) throws IOException
 */

//FileWriter�� �����ڴ� ������ ���� ���ܸ� �����ϰ� �ִ�.
//public FileWriter(String fileName)
//throws IOException
//IOException�� RuntimeException�� �ļ��� �ƴϱ� ������ ����ڰ� �ݵ�� ����ó���� �ؾ� �������� �ȴ�.