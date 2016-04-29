package cn.edu.qdu.car;

import java.util.Scanner;

public class Bus extends Moto {

	Scanner input = new Scanner(System.in);
	int num =0;
	@Override
	public void chooseType() {
		System.out.print("请选择车型：1.<=16座  2.>16座   ");
		num=input.nextInt();
		switch (num) {
		case 1:
			setMotoType("<=16座 ");
			System.out.println("日租金为：800/天");
			break;
		case 2:
			setMotoType(">16座 ");
			System.out.println("日租金为：1500/天");
			break;

		default:
			System.out.println("你的选择有误!");
			break;
		}
	

	}
	public void dayRent(){
		if (num==1){	
			setRent(800);		
		}else{
			setRent(1500);
		}
		
		
	}

}
