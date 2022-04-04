package exam13;

public class CellPhoneTest {

	public static void main(String[] args) {

		CellPhone p1 = new CellPhone();
		CellPhone p2 = new CellPhone("갤럭시S10", "삼성", "흰색", false, true);
		p2.powerOn();
		System.out.println("모델명:" + p1.getModel() + "\t" + "제조사:" + p1.getCompany() + "\t" + "색상:" + p1.getColor()
				+ "\t " + "전원상태:" + p1.isPower() + "\t" + "카메라상태:" + p1.isCamera());

		System.out.println("모델명:" + p2.getModel() + "\t" + "제조사:" + p2.getCompany() + "\t" + "색상:" + p2.getColor()
				+ "\t" + "전원상태:" + p2.isPower() + "\t" + "카메라상태:" + p2.isCamera());

		p2.powerOff();
		System.out.println("모델명:" + p2.getModel() + "\t" + "제조사:" + p2.getCompany() + "\t" + "색상:" + p2.getColor()
				+ "\t" + "전원상태:" + p2.isPower() + "\t" + "카메라상태:" + p2.isCamera());

	}

}
