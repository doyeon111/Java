package exam06;

public class MagazineTest {

	public static void main(String[] args) {
		Book b = new Book("��������", 100, "ȫ�浿");
		Magazine m = new Magazine("�����ڹ�", 300, "�ֿ뱳������", "2022-04-05");

		System.out
				.println("����: " + b.getTitle() + "\t" + "������ ��: " + b.getPage() + "\t" + "����: " + b.getAuthor() + "\t");

		System.out.println("����: " + m.getTitle() + "\t" + "������ ��: " + m.getPage() + "\t" + "����: " + m.getAuthor() + "\t"
				+ "�߸���: " + m.getDate());

	}

}
