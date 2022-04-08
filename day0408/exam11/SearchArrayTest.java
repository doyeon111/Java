package exam11;

class NotFoundException extends Exception { //����� ���� ����(RuntimeException�� �ļ��� �ƴϱ� ������ ����ó���� �������)
	public NotFoundException(String msg) {
		super(msg);
	}
}

class SearchArray {
	public void search(int []arr, int data) throws NotFoundException {
		

		int i;
		for(i=0; i<arr.length; i++) {
			if(data == arr[i]) {
				break;
			}
		}
		
		if(i == arr.length) {
			throw new NotFoundException("ã���� �ϴ� " + data + "�� �迭�� �����ϴ�."); 
		} else {
			System.out.println("ã���� �ϴ� " + data + "�� �迭�� " + i + "��°�� �ֽ��ϴ�.");
		}
	
	
	}}


public class SearchArrayTest {

	public static void main(String[] args) {
		
		try {
		int []a = {10,20,30,40,50};
		SearchArray sa = new SearchArray();
		sa.search(a, 20);
		sa.search(a, 100);
		}catch(NotFoundException e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}

}
