package cn.edu.qdu.car;

public class Car extends Moto {

	private String type;

	public Car(String MotoNo) {
		super(MotoNo);

	}

	public double rentFee(int day) {

		if (type.equals("����")) {
			setFee(500);
			setTypes("����");
		} else if (type.equals("����")) {
			setFee(600);
			setTypes("����");
		} else {
			setFee(400);
			setTypes("�µ�");
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
