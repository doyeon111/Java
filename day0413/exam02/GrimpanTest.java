package exam02;

//�޴� �߰����ֱ�

//���콺�� Ŭ���ϰ� ���� �� �׸���
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

//�ϳ��� �׷����� ������ ǥ���ϱ� ���� Ŭ������ �����.
//��ü ������ ����� �ϱ� ���� Ŭ������ "����ȭ" �Ǿ�� �Ѵ�. (����ȭ: ������ �ִ�) // Serializable
class GraphicInfo implements Serializable {
	private int x1, y1, x2, y2;
	private int drawType; // �׷����� ������ ���� �Ӽ��� �߰�
	private Color drawColor; // ����� ���õ� �������

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

//�׷����� ǥ���ϱ� ���Ͽ� JPanel�� ����� Ŭ������ ������ش�.
//��, ���콺 �̺�Ʈ ó���� ���Ͽ� MouseListener�� ����
class GrimpanPanel extends JPanel implements MouseListener {

	// �׷��� �׷����� ������ ��� ���� ����Ʈ�� �����.
	ArrayList<GraphicInfo> list;

	// ��, ��, �簢���� �׸����� ���� ������ ����
	int drawType; // 0: ��, 1: ��, 2: �簢��

	// ������ ���� ������ ����
	Color drawColor;

	// ���콺�� ������ ������, ������ �����ϱ� ���� ������ ����
	int x1, y1, x2, y2;

	// �����ڿ��� ���콺 �̺�Ʈ�� ���
	public GrimpanPanel() {

		// �׷��� �׷����� ������ ��� ���� ����Ʈ�� ����
		list = new ArrayList<GraphicInfo>();

		// �гο� ���콺 �̺�Ʈ�� ���
		addMouseListener(this);
	}

	// �г��� �ٽ� �׷��� �ʿ䰡 ���� ���� paintComponent�� �ڵ����� ���۵�.
	// paintComponent�� �������̵� �Ͽ� �׷����� ǥ�����ش�.
	@Override
	protected void paintComponent(Graphics g) {

		// ����Ʈ�� ��� �׷����� ������ŭ �׷��ش�.
		for (GraphicInfo info : list) { // ���� �׸� ������ ����Ʈ�� ��� ũ�⸦ �����Ͽ��� ���� ������� �ʰ� �����ְ� �ϱ�
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

			System.out.println("�׸��� ����: " + info.getDrawColor());
			g.setColor(info.getDrawColor()); // ���� ����

			// drawType�� ���� ��, ��, �簢�� ����
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

	// ���콺�� �������� ��
	@Override
	public void mouseClicked(MouseEvent e) {

	}

	// ���콺�� �������� �� x,y��ǥ�� �׷����� ���������� ����
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX(); // ���콺�� ������ x1�� �ֱ�
		y1 = e.getY();

	}

	// ���콺�� �������� ���� x,y��ǥ�� �׷����� �������� ����
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX(); // ���콺�� ������ ���� x2�� �ֱ�
		y2 = e.getY();

		// ���� �ϼ��� �׷����� ������ ����Ʈ�� ��´�.
		list.add(new GraphicInfo(x1, y1, x2, y2, drawType, drawColor));

		// �׷����� �ϼ��Ǿ��� �� �׷����� �׷��޶�� ��û
		// "�ٽ� �׷��ּ���"��� ��û
		repaint(); // paintComponent�� ���۵ȴ�.

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

class Grimpan extends JFrame implements ActionListener { // �޴��� ���� �̺�Ʈó���� �ϱ� ���ؼ��� ActionListener�������̽� �ʿ�

	// �پ��� ������ �����ϱ� ���� ���̾�α׸� ��������� ����
	JColorChooser jcc;

	// �����ϰ�, ���⸦ �� ���� ������ �����ϱ� ���� ���̾�α׸� ��������� ����
	JFileChooser jfc;

	// �׸��� �ų��� ����� ����
	GrimpanPanel gp; // Grimpan�� �׸��� �г��� has a ����

	public Grimpan() {
		jfc = new JFileChooser("c:/temp"); // ������ �����ϱ� ���� ���̾�α� ����

		jcc = new JColorChooser();

		gp = new GrimpanPanel();
		add(gp);

		// �޴��� ����
		JMenuBar jmb = new JMenuBar();

		// ������ �ָ޴� �����
		JMenu mn_file = new JMenu("����");
		// ������ �θ޴�
		JMenuItem file_new = new JMenuItem("������");
		JMenuItem file_open = new JMenuItem("����");
		JMenuItem file_save = new JMenuItem("����");
		JMenuItem file_exit = new JMenuItem("����");

		file_new.addActionListener(this);
		file_open.addActionListener(this);
		file_save.addActionListener(this);
		file_exit.addActionListener(this);

		// �θ޴����� �ָ޴��� ���
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		mn_file.add(file_exit);

		// �׸��� ������ �ָ޴�
		JMenu mn_draw = new JMenu("�׸��⵵��");

		// �׸��⵵���� �θ޴�
		JMenuItem draw_line = new JMenuItem("��");
		JMenuItem draw_rect = new JMenuItem("�簢��");
		JMenuItem draw_oval = new JMenuItem("��");

		// �޴��� ���� �̺�Ʈó��
		draw_line.addActionListener(this);
		draw_rect.addActionListener(this);
		draw_oval.addActionListener(this);

		// ��޴����� �ָ޴��� ���
		mn_draw.add(draw_line);
		mn_draw.add(draw_rect);
		mn_draw.add(draw_oval);

		// ����� ���õ� �ָ޴�
		JMenu mn_color = new JMenu("�׸��� ����");

		// ����� ���õ� �θ޴�
		JMenuItem color_black = new JMenuItem("����");
		JMenuItem color_red = new JMenuItem("����");
		JMenuItem color_blue = new JMenuItem("�Ķ�");
		JMenuItem color_green = new JMenuItem("�ʷ�");
		JMenuItem color_other = new JMenuItem("�ٸ�����...");

		// ����� ���õ� �̺�Ʈ ���
		color_black.addActionListener(this);
		color_red.addActionListener(this);
		color_blue.addActionListener(this);
		color_green.addActionListener(this);
		color_other.addActionListener(this);

		// �θ޴��� �ָ޴��� �߰�
		mn_color.add(color_black);
		mn_color.add(color_red);
		mn_color.add(color_blue);
		mn_color.add(color_green);
		mn_color.add(color_other);

		// �ָ޴��� �޴��ٿ� ��´�.
		jmb.add(mn_file);
		jmb.add(mn_draw);
		jmb.add(mn_color);

		// �޴��� ����
		setJMenuBar(jmb);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // �޴��� ������ �� ������ �̵�

		// 0: ��, 1: ��, 2: �簢��
		String cmd = e.getActionCommand(); // ������ �޴��� ���ڵ��� �������� ��
		if (cmd.equals("��")) {
			gp.drawType = 0;
		} else if (cmd.equals("��")) {
			gp.drawType = 1;
		} else if (cmd.equals("�簢��")) {
			gp.drawType = 2;

		} else if (cmd.equals("����")) { // ������ ����
			gp.drawColor = Color.red;
		} else if (cmd.equals("����")) {
			gp.drawColor = Color.black;
		} else if (cmd.equals("�Ķ�")) {
			gp.drawColor = Color.blue;
		} else if (cmd.equals("�ʷ�")) {
			gp.drawColor = Color.green;
		} else if (cmd.equals("�ٸ�����...")) {
			gp.drawColor = jcc.showDialog(this, "������ �����ϼ���", Color.red);
		} else if (cmd.equals("������")) {
			//�׸��� �г��� ����Ʈ�� �����.
			gp.list.clear();
			
			//�׸��� �г��� �ٽ� �׷��ش�.
			gp.repaint(); 
			
		} else if (cmd.equals("����")) {
			try {
				int re = jfc.showOpenDialog(this); // �б����� �뵵�� ����.
				if (re == 0) {
					File file = jfc.getSelectedFile();

					// ��ü������ �б� ���� ObjectInputStream��ü�� ����
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

					// ���Ϸκ��� ��ü�� �о�鿩 �׸��� �г��� ����Ʈ�� ��´�.
					gp.list = (ArrayList) ois.readObject();

					// �׸��� �гο��� ����Ʈ�� ��� �� ��ŭ �ٽ� �׷��޶�� ��û
					gp.repaint();
				}

			} catch (Exception ex) {
				System.out.println("���ܹ߻�: " + ex.getMessage());
			}
		} else if (cmd.equals("����")) {
			// ������ �����ؾ� �ұ�?
			// ������ �����ʹ� ��� �ֳ���? ==> gp.list

			// ���ڴ����� ����� Reader, Writer
			// ����Ʈ������ ����� <---------- �׸��� InputStream, OutputStream
			// ObjectOutputStream : OutputStream�� �ļ��̸�, ��ü������ ����� ���� Ŭ����
			// ObjectInputStream: InputStream�� �ļ��̸�, ��ü������ �Է��� ���� Ŭ����

			try {
				int re = jfc.showSaveDialog(this); // ���̾�α׸� ���

				if (re == 0) {
					File file = jfc.getSelectedFile(); // ���̾�α׿��� ������ ������ ������

					// ��ü������ ���� ����� ���� ObjectOutputStream ��ü�� ����
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

					// �׷����� ������ ����ִ� list�� ���Ϸ� ����Ѵ�.
					oos.writeObject(gp.list);

					// ������ ����� ������ ������ �ݾ��ش�.
					oos.close();

					JOptionPane.showMessageDialog(this, "�����Ͽ����ϴ�.");

				}

			} catch (Exception ex) {
				System.out.println("���ܹ߻�: " + ex.getMessage());
			}

		} else if (cmd.equals("����")) {
			// ���� �����ϴ��� ����� �����ϵ��� �ϱ�
			int re = JOptionPane.showConfirmDialog(this, "������ �����ұ��?");
			System.out.println(re);
			// 0: �� 1: �ƴϿ� 2: ���

			if (re == 0) {
				System.exit(0);
			}

			// System.exit(0); //���α׷� ����
		}

	}
}

public class GrimpanTest {

	public static void main(String[] args) {

		new Grimpan();
	}

}
