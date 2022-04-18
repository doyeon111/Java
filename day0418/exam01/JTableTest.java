package exam01;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {

	// 엑셀의 화면과 같이 행, 열로 구성되는 화면을 위하여 JTable을 만든다.
	JTable table;

	// JTable에 들어갈 컬럼이름을 담기 위한 Vector를 선언
	Vector<String> colNames;

	// JTable에 들어갈 데이터를 담기 위한 Vector를 선언
	Vector<Vector<String>> rowData;

	public JTableTest() {
		// 컬럼이름을 위한 Vector를 생성
		colNames = new Vector<String>();

		// 테이블에 담길 데이터를 위한 벡터를 생성
		rowData = new Vector<Vector<String>>();

		// 컬럼이름의 백터 데이터를 추가
		colNames.add("아이디");
		colNames.add("이름");
		colNames.add("나이");

		// 테이블의 row데이터에 들어갈 첫 번째 레코드를 위한 벡터를 만든다.
		Vector<String> row1 = new Vector<String>();

		// 첫 번째 행의 데이터를 추가
		row1.add("tiger");
		row1.add("홍길동");
		row1.add("20");

		// 테이블의 row데이터에 들어갈 두 번째 레코드를 위한 벡터를 만든다.
		Vector<String> row2 = new Vector<String>();

		// 두 번째 행의 데이터를 추가
		row2.add("lion");
		row2.add("김사자");
		row2.add("24");

		// 테이블의 row데이터에 들어갈 세 번째 레코드를 위한 벡터를 만든다.
		Vector<String> row3 = new Vector<String>();

		// 세 번째 행의 데이터를 추가
		row3.add("kim");
		row3.add("김유신");
		row3.add("30");

		// row데이터에 각 행의 데이터가 담긴 벡터를 추가
		rowData.add(row1);
		rowData.add(row2);
		rowData.add(row3);
		
		// JTable를 생성
		table = new JTable(rowData, colNames);

		// 텍스트에리어를 스크롤팬으로 감싸듯이 JTable도 스크롤팬으로 감싸야한다.
		JScrollPane jsp = new JScrollPane(table);

		// 테이블이 담긴 스크롤팬을 프레임에 담는다.
		add(jsp);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JTableTest();
		
	}

}
