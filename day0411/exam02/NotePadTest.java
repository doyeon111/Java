package exam02;
//�޸��� �����(������ ��ġ�� �������� �ʰ� ����ڿ��� �����ϰ� �ϱ�)

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//NotePad �ڽ��� �޴��� ���� �̺�Ʈ ó�� Ŭ������ �ǵ��� �Ѵ�.(ActionListener)
class NotePad extends JFrame implements ActionListener {

	// ������ ���ϸ�� �о�� ���ϸ��� ������ �� �ִ� ���� ���� ���̾�α׸� ����� ����
	JFileChooser jfc;

	// �޸��忡 ���ڸ� �Է��ϴ� �κ��� ���� �ؽ�Ʈ����� ��������� ����
	JTextArea jta;

	public NotePad() {
		// ���ϼ��� ���̾�α׸� ����
		// ������ �����̸��� �����ϴ� �뵵�ε� ����, �о�� �����̸��� �����ϴ� �뵵�ε� ����.
		jfc = new JFileChooser("c:/temp");

		// �ؽ�Ʈ ������ ����
		jta = new JTextArea(10, 80); // ��, ��

		// �ؽ�Ʈ����� ��ũ���� �����ϱ� ���� ��ũ�� ���� �����Ѵ�.
		JScrollPane jsp = new JScrollPane(jta); // jta�� ��ũ���� �����޶�� �ǹ�

		// �����ӿ� ��ũ������ ��´�.
		// �����ӿ� ���̾ƿ������ �������� ������ �⺻�� BorderLayout�̴�.
		// ��,��,��,��,����� �������� ������ ����� ����ش�.
		add(jsp);

		// �޴��ٸ� ����
		JMenuBar jmb = new JMenuBar();

		// �ָ޴� "����"�� �����Ѵ�.
		JMenu mn_file = new JMenu("����");

		// "����"�� ���� �θ޴� "������, ����, �����ϱ�"�� ����
		JMenuItem file_new = new JMenuItem("������");
		JMenuItem file_open = new JMenuItem("����");
		JMenuItem file_save = new JMenuItem("����");

		// ������ �θ޴��鿡 �̺�Ʈ�� ����Ѵ�.
		// �̺�Ʈ ó�� ����ڴ� NotePad ��ü �ڽ��� ó���ϵ��� �ϱ� ���Ͽ� this�� �Ű������� �����Ѵ�.
		file_new.addActionListener(this);
		file_open.addActionListener(this);
		file_save.addActionListener(this);

		// �θ޴� (������, ����, ����)�� �� �޴� "����"�� ��´�.
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);

		// �޴��ٿ� �ָ޴� "����"�� ��´�.
		jmb.add(mn_file);

		// �޴��ٸ� �����ӿ� ����
		setJMenuBar(jmb);

		// â�� ũ�⸦ ����
		setSize(400, 300);

		// â�� ȭ�鿡 �����ֵ��� ����
		setVisible(true);

		// â�� ������ ���α׷��� �����ϵ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// �޴��� �������� �� �� �޼ҵ尡 �����Ѵ�.
	// � �޴��� ������������ ������ �Ű������� ActionEvent e�� ���޹޴´�.
	@Override
	public void actionPerformed(ActionEvent e) {
		// ������ �޴��� ���ڸ� ������ ����
		String cmd = e.getActionCommand();

		if (cmd.equals("������")) {

			// �ؽ�Ʈ����� �����ش�.
			jta.setText("");

		} else if (cmd.equals("����")) {
			// hello.txt ������ ������ �о�鿩 �ؽ�Ʈ����� ����Ѵ�.

			// ����������� ���� �����ڿ� �޼ҵ���� ���ܸ� �Ȱ� �־ ����ó���� �Ѵ�.
			try {

				// � ������ �о���� ���̾�α׸� ����
				int re = jfc.showOpenDialog(this);

				if (re == 0) {

					// ���̾�α׿��� ������ ������ �о�´�.
					File file = jfc.getSelectedFile();

					// ���ڴ����� �����Է��� ���� ��ü�� ����
					FileReader fr = new FileReader(file);

					// ������ ������ �о�ͼ� ��� ������ ���ڿ� ������ ����
					String str = "";

					// �� ���ھ� �о�� ������ ����
					int ch;

					while (true) {
						// ���Ϸκ��� �� ���ھ� �о���δ�.
						ch = fr.read();

						// ������ ���� �����ϸ� �ݺ����� Ż��
						if (ch == -1) {
							break;
						}
						// ���Ϸκ��� �о���� ������ �������� ���ڷ� ��ȯ�Ѵ�.
						char data = (char) ch;

						// �ѱ��ھ� �о� ���ڸ� str�� �����Ѵ�.
						str = str + data;

					}

					// ���Ϸ� ��� �о�� ���ڿ��� ������ str�� ������ �ؽ�Ʈ����� ����Ѵ�.
					jta.setText(str);

					// ����� ���� ������ �ݾ��ش�.
					fr.close();
				}
			} catch (Exception ex) {
				System.out.println("���ܹ߻�: " + ex.getMessage());
			}

		} else if (cmd.equals("����")) {

			// ���� �ؽ�Ʈ�������� ������ ���Ϸ� ���
			try {

				// ��������� ��̸����� ������ ������ ����� ���� ���̾�α׸� ����.
				int re = jfc.showSaveDialog(this);

				// �������� ����� 0, �������� ����� 1

				// �������� ����� �Ͽ����� ���Ϸ� �����ϵ��� �Ѵ�.
				if (re == 0) {
					// ���̾�α׿� ������ ���� ��ü�� �о�´�.
					File file = jfc.getSelectedFile();

					// ���ڴ����� ���Ϸ� ����ϱ� ���� FileWriter��ü�� ����
					FileWriter fr = new FileWriter(file);

					// �ؽ�Ʈ�������� ������ ��� ���Ϸ� ���
					fr.write(jta.getText());

					// ������ ����� �������� ������ �ݾ��ش�.
					fr.close();

					System.out.println("������ �����Ͽ����ϴ�.");
				}
			} catch (Exception ex) {
				System.out.println("���ܹ߻�: " + ex.getMessage());
			}
		}

	}

}

public class NotePadTest {

	public static void main(String[] args) {
		// ��Ʈ�е� ��ü�� ����
		new NotePad();
	}

}
