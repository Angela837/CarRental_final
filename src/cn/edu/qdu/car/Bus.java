package cn.edu.qdu.car;

import java.util.Scanner;

public class Bus extends Moto {

	Scanner input = new Scanner(System.in);
	int num =0;
	@Override
	public void chooseType() {
		System.out.print("��ѡ���ͣ�1.<=16��  2.>16��   ");
		num=input.nextInt();
		switch (num) {
		case 1:
			setMotoType("<=16�� ");
			System.out.println("�����Ϊ��800/��");
			break;
		case 2:
			setMotoType(">16�� ");
			System.out.println("�����Ϊ��1500/��");
			break;

		default:
			System.out.println("���ѡ������!");
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
