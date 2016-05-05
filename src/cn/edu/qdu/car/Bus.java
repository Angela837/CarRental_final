package cn.edu.qdu.car;



public class Bus extends Moto {
private int seatCount;
private String Types;
	public Bus(String MotoNo) {
		super(MotoNo);
		
	}
	public double rentFee(int day){
		if(seatCount>16){
			setFee(1500);
			setTypes(">16×ù");
		}else{
			setFee(1000);
			setTypes("<=16×ù");
		}
		return super.rentFee(day);
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public String getTypes() {
		return Types;
	}
	public void setTypes(String string) {
		this.Types = string;
	}


}
