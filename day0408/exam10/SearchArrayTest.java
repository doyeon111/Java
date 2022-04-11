package exam10;
//pdf 1번문제

class SearchArray {
	public void search(int[] arr, int data) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				break;
			}
		}
		if (i == arr.length) {
			System.out.println("찾고자 하는 데이터는 배열에 없습니다.");
		} else {
			System.out.println("찾고자 하는 " + data + "는 배열의 " + i + "번째 있어요!");
		}
	}
}

public class SearchArrayTest {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		SearchArray sa = new SearchArray();
		sa.search(a, 100);
		
		//찾고자 하는 데이터가 배열에 없을 때에 이것은 단순히 메시지를 출력할 수도 있지만,
		//우리는 이러한 상황을 문제의 상황 즉 "예외"로 인식시키자.
		//그렇게 하기 위해 "사용자정의예외"를 만들고 그러한 상황이 되었을 때 강제로 예외를 발생시킨다.

	}

}
 
