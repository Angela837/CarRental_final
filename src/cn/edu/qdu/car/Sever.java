package cn.edu.qdu.car;

import java.util.Scanner;

public class Sever {
	Scanner input = new Scanner(System.in);
	private int days = 0;//��������
	private Bus bus = new Bus();
	private Car car = new Car();
	private String name=null;
	private String id=null;
	private String phoneNumber=null;
	
	public static void main(String[] args) {
		Sever s=new Sever();
		s.startRent();
		s.register();;
		s.chooseMoto();
	}
	

	public void startRent() {
		//������ʼ
		System.out.println("********************");
		System.out.println("****��ӭ�����⳵ϵͳ****");
		System.out.println("********************");

	}

	public void register() {
		//���⳵����������
		System.out.print("�������������֣�");
		name = input.next();
		//���⳵���������֤����
		System.out.println("�������������֤���룺");
		setId(input.next());
		//���⳵�������ֻ�����
		System.out.println("�����������ֻ����룺");
		setPhoneNumber(input.next());
		
		
	}

	public void chooseMoto() {
		//ѡ���⳵����
		String yn=null;
		do{
		System.out.print("��ѡ���⳵���ͣ�1.�γ� 2.�ͳ�  ");
		int type = input.nextInt();
		if (type == 1) {
			car.chooseType();
			//ѡ���⳵����
			System.out.print("�������������������");
			setDays(input.nextInt());
			car.dayRent();
			//�������
			System.out.println("����Ҫ�ķ��ã�"+getDays()*car.getRent());
			//ȷ����Ϣ����ӡ���
			System.out.println("�⳵��"+"\t"+"�⳵����"+"\t"+"����"+"\t"+"����"+"\t"+"����");
			System.out.println(name+"\t"+"�γ�"+"\t"+car.getMotoType()+"\t"+getDays()+"\t"+getDays()*car.getRent());
		} else {
			bus.chooseType();
			System.out.print("�������������������");
			setDays(input.nextInt());
			bus.dayRent();
			System.out.println("����Ҫ�ķ��ã�"+getDays()*bus.getRent());
			System.out.println("�⳵��"+"\t"+"�⳵����"+"\t"+"����"+"\t"+"����"+"\t"+"����");
			System.out.println(name+"\t"+"�ͳ�"+"\t"+bus.getMotoType()+"\t"+getDays()+"\t"+getDays()*bus.getRent());
		}
		System.out.print("�����⳵ô����y/n�� ");
		yn=input.next();
		}while(yn.equals("y"));
		if(yn.equals("n")){
			System.out.println("��лʹ�ã�");
		}
		
	}public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	


	
}
