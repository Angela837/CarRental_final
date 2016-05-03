package cn.edu.qdu.car;

public class Car extends Moto {

	private String type;

	public Car(String MotoNo) {
		super(MotoNo);

	}

	public double rentFee(int day) {

		if (type.equals("����")) {
			setFee(500);
		} else if (type.equals("�������")) {
			setFee(600);
		} else {
			setFee(400);
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
