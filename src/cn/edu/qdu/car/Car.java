package cn.edu.qdu.car;

public class Car extends Moto {

	private String type;

	public Car(String MotoNo) {
		super(MotoNo);

	}

	public double rentFee(int day) {

		if (type.equals("±¦Âí")) {
			setFee(500);
			setTypes("±¦Âí");
		} else if (type.equals("±¼³Û")) {
			setFee(600);
			setTypes("±¼³Û");
		} else {
			setFee(400);
			setTypes("°ÂµÏ");
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
