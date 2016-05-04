package cn.edu.qdu.car;

public abstract class Moto {
	private String MotoNo;
	private double fee;
	private String Types;
	
	
	public Moto(String MotoNo){
		this.setMotoNo(MotoNo);
	}
	
	
	public double rentFee(int day){
		return day*fee;
	}


	public String getMotoNo() {
		return MotoNo;
	}
	public void setMotoNo(String motoNo) {
		MotoNo = motoNo;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getTypes() {
		return Types;
	}
	public void setTypes(String types) {
		Types = types;
	}
		
	
}
