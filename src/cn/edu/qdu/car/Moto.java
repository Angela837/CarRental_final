package cn.edu.qdu.car;

public abstract class Moto {
	private String motoType;
	private int rent;
	
	public abstract void chooseType();
	public abstract void dayRent();

	public String getMotoType() {
		return motoType;
	}

	public void setMotoType(String motoType) {
		this.motoType = motoType;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}
	
		
	
}
