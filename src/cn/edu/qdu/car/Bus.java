package cn.edu.qdu.car;

import java.util.Scanner;

public class Bus extends Moto {
private int seatCount;
	public Bus(String MotoNo) {
		super(MotoNo);
		
	}
	public double rentFee(int day){
		if(seatCount>16){
			setFee(1500);
		}else{
			setFee(1000);
		}
		return super.rentFee(day);
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}


}
