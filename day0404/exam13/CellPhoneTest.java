package exam13;

public class CellPhoneTest {

	public static void main(String[] args) {

		CellPhone p1 = new CellPhone();
		CellPhone p2 = new CellPhone("������S10", "�Ｚ", "���", false, true);
		p2.powerOn();
		System.out.println("�𵨸�:" + p1.getModel() + "\t" + "������:" + p1.getCompany() + "\t" + "����:" + p1.getColor()
				+ "\t " + "��������:" + p1.isPower() + "\t" + "ī�޶����:" + p1.isCamera());

		System.out.println("�𵨸�:" + p2.getModel() + "\t" + "������:" + p2.getCompany() + "\t" + "����:" + p2.getColor()
				+ "\t" + "��������:" + p2.isPower() + "\t" + "ī�޶����:" + p2.isCamera());

		p2.powerOff();
		System.out.println("�𵨸�:" + p2.getModel() + "\t" + "������:" + p2.getCompany() + "\t" + "����:" + p2.getColor()
				+ "\t" + "��������:" + p2.isPower() + "\t" + "ī�޶����:" + p2.isCamera());

	}

}
