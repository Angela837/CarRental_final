package cn.edu.qdu.car;

import java.util.Scanner;

public class Car extends Moto{
	Scanner input = new Scanner(System.in);
	int num = 0;
	@Override
	public void chooseType() {
		System.out.print("请选择车型：1.别克商务   2.宝马550i 3.别克林荫大道  ");
		num=input.nextInt();
		switch (num) {
		case 1:
			setMotoType("别克商务");
			System.out.println("日租金为：600/天");
			break;
		case 2:
			setMotoType("宝马550i");
			System.out.println("日租金为：500/天");
			break;
		case 3:
			setMotoType("别克林荫大道");
			System.out.println("日租金为：300/天");
			break;
			

		default:
			System.out.println("你的选择有误!");
			break;
		}
	
		
		
	}

	@Override
	public void dayRent() {
		if (num==1){	
			setRent(600);		
		}else if(num==2){
			setRent(500);
		}else{
			setRent(300);
		}
		
	}

}
