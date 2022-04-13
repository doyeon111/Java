package exam02;

//메뉴 추가해주기

//마우스를 클릭하고 뗄때 선 그리기
import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//하나의 그래픽의 정보를 표현하기 위한 클래스를 만든다.
//객체 단위로 출력을 하기 위한 클래스는 "직렬화" 되어야 한다. (직렬화: 순서가 있다) // Serializable
class GraphicInfo implements Serializable {
	private int x1, y1, x2, y2;
	private int drawType; // 그래픽의 종류를 위한 속성을 추가
	private Color drawColor; // 색상과 관련된 멤버변수

	public GraphicInfo(int x1, int y1, int x2, int y2, int drawType, Color drawColor) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.drawType = drawType;
		this.drawColor = drawColor;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getDrawType() {
		return drawType;
	}

	public void setDrawType(int drawType) {
		this.drawType = drawType;
	}

	public Color getDrawColor() {
		return drawColor;
	}

	public void setDrawColor(Color drawColor) {
		this.drawColor = drawColor;
	}

	@Override
	public String toString() {
		return "GraphicInfo [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", drawType=" + drawType
				+ ", drawColor=" + drawColor + "]";
	}

}

//그래픽을 표현하기 위하여 JPanel을 상속한 클래스를 만들어준다.
//또, 마우스 이벤트 처리를 위하여 MouseListener를 구현
class GrimpanPanel extends JPanel implements MouseListener {

	// 그려진 그래픽의 정보를 담기 위한 리스트를 만든다.
	ArrayList<GraphicInfo> list;

	// 선, 원, 사각형을 그릴지를 위한 변수를 선언
	int drawType; // 0: 선, 1: 원, 2: 사각형

	// 색상을 위한 변수를 선언
	Color drawColor;

	// 마우스가 눌러진 시작점, 끝점을 저장하기 위한 변수를 선언
	int x1, y1, x2, y2;

	// 생성자에서 마우스 이벤트를 등록
	public GrimpanPanel() {

		// 그려진 그래픽의 정보를 담기 위한 리스트를 생성
		list = new ArrayList<GraphicInfo>();

		// 패널에 마우스 이벤트를 등록
		addMouseListener(this);
	}

	// 패널을 다시 그려줄 필요가 있을 때에 paintComponent가 자동으로 동작됨.
	// paintComponent를 오버라이딩 하여 그래픽을 표현해준다.
	@Override
	protected void paintComponent(Graphics g) {

		// 리스트에 담긴 그래픽의 정보만큼 그려준다.
		for (GraphicInfo info : list) { // 현재 그린 정보를 리스트에 담아 크기를 조절하여도 원이 사라지지 않고 남아있게 하기
			int width = info.getX2() - info.getX1();
			int height = info.getY2() - info.getY1();
			int x = info.getX1();
			int y = info.getY1();

			if (info.getX2() < info.getX1()) {
				x = info.getX2();
				width = info.getX1() - info.getX2();

			}

			if (info.getY2() < info.getY1()) {
				y = info.getY2();
				height = info.getY1() - info.getY2();
			}

			System.out.println("그리기 색상: " + info.getDrawColor());
			g.setColor(info.getDrawColor()); // 색상 설정

			// drawType에 따라 선, 원, 사각형 선택
			switch (info.getDrawType()) {
			case 0:
				g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());
				break;
			case 1:
				g.drawOval(x, y, width, height);
				break;
			case 2:
				g.drawRect(x, y, width, height);
				break;
			}

		}

	}

	// 마우스가 눌러졌을 때
	@Override
	public void mouseClicked(MouseEvent e) {

	}

	// 마우스가 눌러졌을 때 x,y좌표를 그래픽의 시작점으로 저장
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX(); // 마우스가 눌러진 x1에 넣기
		y1 = e.getY();

	}

	// 마우스가 떼어졌을 때에 x,y좌표를 그래픽의 끝점으로 저장
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX(); // 마우스가 떼어진 순간 x2에 넣기
		y2 = e.getY();

		// 현재 완성된 그래픽의 정보를 리스트에 담는다.
		list.add(new GraphicInfo(x1, y1, x2, y2, drawType, drawColor));

		// 그래픽이 완성되었을 때 그래픽을 그려달라고 요청
		// "다시 그려주세요"라고 요청
		repaint(); // paintComponent가 동작된다.

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}

class Grimpan extends JFrame implements ActionListener { // 메뉴에 대한 이벤트처리를 하기 위해서는 ActionListener인터페이스 필요

	// 다양한 색상을 선택하기 위한 다이얼로그를 멤버변수로 선언
	JColorChooser jcc;

	// 저장하고, 열기를 할 때에 파일을 선택하기 위한 다이얼로그를 멤버변수로 선언
	JFileChooser jfc;

	// 그림판 매널을 멤버로 선언
	GrimpanPanel gp; // Grimpan과 그림판 패널은 has a 관계

	public Grimpan() {
		jfc = new JFileChooser("c:/temp"); // 파일을 선택하기 위한 다이얼로그 생성

		jcc = new JColorChooser();

		gp = new GrimpanPanel();
		add(gp);

		// 메뉴바 생성
		JMenuBar jmb = new JMenuBar();

		// 파일의 주메뉴 만들기
		JMenu mn_file = new JMenu("파일");
		// 파일의 부메뉴
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		JMenuItem file_exit = new JMenuItem("종료");

		file_new.addActionListener(this);
		file_open.addActionListener(this);
		file_save.addActionListener(this);
		file_exit.addActionListener(this);

		// 부메뉴들을 주메뉴에 담기
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		mn_file.add(file_exit);

		// 그리기 도구의 주메뉴
		JMenu mn_draw = new JMenu("그리기도구");

		// 그리기도구의 부메뉴
		JMenuItem draw_line = new JMenuItem("선");
		JMenuItem draw_rect = new JMenuItem("사각형");
		JMenuItem draw_oval = new JMenuItem("원");

		// 메뉴에 대한 이벤트처리
		draw_line.addActionListener(this);
		draw_rect.addActionListener(this);
		draw_oval.addActionListener(this);

		// 뷰메뉴들을 주메뉴에 담기
		mn_draw.add(draw_line);
		mn_draw.add(draw_rect);
		mn_draw.add(draw_oval);

		// 색상과 관련된 주메뉴
		JMenu mn_color = new JMenu("그리기 색상");

		// 색상과 관련된 부메뉴
		JMenuItem color_black = new JMenuItem("검정");
		JMenuItem color_red = new JMenuItem("빨강");
		JMenuItem color_blue = new JMenuItem("파랑");
		JMenuItem color_green = new JMenuItem("초록");
		JMenuItem color_other = new JMenuItem("다른색상...");

		// 색상과 관련된 이벤트 등록
		color_black.addActionListener(this);
		color_red.addActionListener(this);
		color_blue.addActionListener(this);
		color_green.addActionListener(this);
		color_other.addActionListener(this);

		// 부메뉴를 주메뉴에 추가
		mn_color.add(color_black);
		mn_color.add(color_red);
		mn_color.add(color_blue);
		mn_color.add(color_green);
		mn_color.add(color_other);

		// 주메뉴를 메뉴바에 담는다.
		jmb.add(mn_file);
		jmb.add(mn_draw);
		jmb.add(mn_color);

		// 메뉴바 실행
		setJMenuBar(jmb);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 메뉴를 누르면 이 쪽으로 이동

		// 0: 선, 1: 원, 2: 사각형
		String cmd = e.getActionCommand(); // 눌러진 메뉴의 글자들을 가져오는 것
		if (cmd.equals("선")) {
			gp.drawType = 0;
		} else if (cmd.equals("원")) {
			gp.drawType = 1;
		} else if (cmd.equals("사각형")) {
			gp.drawType = 2;

		} else if (cmd.equals("빨강")) { // 색상을 결정
			gp.drawColor = Color.red;
		} else if (cmd.equals("검정")) {
			gp.drawColor = Color.black;
		} else if (cmd.equals("파랑")) {
			gp.drawColor = Color.blue;
		} else if (cmd.equals("초록")) {
			gp.drawColor = Color.green;
		} else if (cmd.equals("다른색상...")) {
			gp.drawColor = jcc.showDialog(this, "색상을 선택하세요", Color.red);
		} else if (cmd.equals("새파일")) {
			//그림판 패널의 리스트를 지운다.
			gp.list.clear();
			
			//그림판 패널을 다시 그려준다.
			gp.repaint(); 
			
		} else if (cmd.equals("열기")) {
			try {
				int re = jfc.showOpenDialog(this); // 읽기위한 용도로 연다.
				if (re == 0) {
					File file = jfc.getSelectedFile();

					// 객체단위를 읽기 위한 ObjectInputStream객체를 생성
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

					// 파일로부터 객체를 읽어들여 그림판 패널의 리스트를 담는다.
					gp.list = (ArrayList) ois.readObject();

					// 그림판 패널에게 리스트에 담긴 것 만큼 다시 그려달라고 요청
					gp.repaint();
				}

			} catch (Exception ex) {
				System.out.println("예외발생: " + ex.getMessage());
			}
		} else if (cmd.equals("저장")) {
			// 무엇을 저장해야 할까?
			// 저장할 데이터는 어디에 있나요? ==> gp.list

			// 문자단위의 입출력 Reader, Writer
			// 바이트단위의 입출력 <---------- 그림판 InputStream, OutputStream
			// ObjectOutputStream : OutputStream의 후손이며, 객체단위로 출력을 위한 클래스
			// ObjectInputStream: InputStream의 후손이며, 객체단위로 입력을 위한 클래스

			try {
				int re = jfc.showSaveDialog(this); // 다이얼로그를 띄움

				if (re == 0) {
					File file = jfc.getSelectedFile(); // 다이얼로그에서 선택한 파일을 가져옴

					// 객체단위로 파일 출력을 위한 ObjectOutputStream 객체를 생성
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

					// 그래픽의 정보가 담겨있는 list를 파일로 출력한다.
					oos.writeObject(gp.list);

					// 파일의 사용이 끝나면 파일을 닫아준다.
					oos.close();

					JOptionPane.showMessageDialog(this, "저장하였습니다.");

				}

			} catch (Exception ex) {
				System.out.println("예외발생: " + ex.getMessage());
			}

		} else if (cmd.equals("종료")) {
			// 정말 종료하는지 물어보고 종료하도록 하기
			int re = JOptionPane.showConfirmDialog(this, "정말로 종료할까요?");
			System.out.println(re);
			// 0: 예 1: 아니오 2: 취소

			if (re == 0) {
				System.exit(0);
			}

			// System.exit(0); //프로그램 종료
		}

	}
}

public class GrimpanTest {

	public static void main(String[] args) {

		new Grimpan();
	}

}
