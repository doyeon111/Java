package exam13;
//pdf 06������
public class CellPhone {
	private String model, company, color;
	private boolean power, camera;
	
	//������ �Ѵ� �޼ҵ�
	public void powerOn() {
		power = true;
	}
	
	//������ ���� �޼ҵ�
	public void powerOff() {
		power = false;
	}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public CellPhone(String model, String company, String color, boolean power, boolean camera) {

		this.model = model;
		this.company = company;
		this.color = color;
		this.power = power;
		this.camera = camera;
	}

	public CellPhone() {
		
	}
	
}
