package cn.edu.qdu.car;

import java.util.Scanner;

public class Car extends Moto{
	Scanner input = new Scanner(System.in);
	int num = 0;
	@Override
	public void chooseType() {
		System.out.print("��ѡ���ͣ�1.�������   2.����550i 3.���������  ");
		num=input.nextInt();
		switch (num) {
		case 1:
			setMotoType("�������");
			System.out.println("�����Ϊ��600/��");
			break;
		case 2:
			setMotoType("����550i");
			System.out.println("�����Ϊ��500/��");
			break;
		case 3:
			setMotoType("���������");
			System.out.println("�����Ϊ��300/��");
			break;
			

		default:
			System.out.println("���ѡ������!");
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
