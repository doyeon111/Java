package exam11;

class NotFoundException extends Exception { //사용자 정의 예외(RuntimeException의 후손이 아니기 때문에 예외처리를 해줘야함)
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
			throw new NotFoundException("찾고자 하는 " + data + "가 배열에 없습니다."); 
		} else {
			System.out.println("찾고자 하는 " + data + "는 배열에 " + i + "번째에 있습니다.");
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
			System.out.println("예외발생: " + e.getMessage());
		}
	}

} 
