package cn.edu.qdu.car;

public class Car extends Moto {

	private String type;

	public Car(String MotoNo) {
		super(MotoNo);

	}

	public double rentFee(int day) {

		if (type.equals("±¦Âí")) {
			setFee(500);
			setType("±¦Âí");
		} else if (type.equals("±¼³Û")) {
			setFee(600);
			setType("±¼³Û");
		} else {
			setFee(400);
			setType("°ÂµÏ");
		}

		return super.rentFee(day);

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
