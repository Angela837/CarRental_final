package cn.edu.qdu.car;

import java.util.Scanner;

public class Sever {
	Scanner input = new Scanner(System.in);
	private int days = 0;//租用天数
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
		//宣布开始
		System.out.println("********************");
		System.out.println("****欢迎来到租车系统****");
		System.out.println("********************");

	}

	public void register() {
		//请租车人输入姓名
		System.out.print("请输入您的名字：");
		name = input.next();
		//请租车人输入身份证号码
		System.out.println("请输入您的身份证号码：");
		setId(input.next());
		//请租车人输入手机号码
		System.out.println("请输入您的手机号码：");
		setPhoneNumber(input.next());
		
		
	}

	public void chooseMoto() {
		//选择租车类型
		String yn=null;
		do{
		System.out.print("请选择租车类型：1.轿车 2.客车  ");
		int type = input.nextInt();
		if (type == 1) {
			car.chooseType();
			//选择租车天数
			System.out.print("请输入您想租的天数：");
			setDays(input.nextInt());
			car.dayRent();
			//所需费用
			System.out.println("您需要的费用："+getDays()*car.getRent());
			//确认信息，打印结果
			System.out.println("租车人"+"\t"+"租车类型"+"\t"+"车型"+"\t"+"天数"+"\t"+"费用");
			System.out.println(name+"\t"+"轿车"+"\t"+car.getMotoType()+"\t"+getDays()+"\t"+getDays()*car.getRent());
		} else {
			bus.chooseType();
			System.out.print("请输入您想租的天数：");
			setDays(input.nextInt());
			bus.dayRent();
			System.out.println("您需要的费用："+getDays()*bus.getRent());
			System.out.println("租车人"+"\t"+"租车类型"+"\t"+"车型"+"\t"+"天数"+"\t"+"费用");
			System.out.println(name+"\t"+"客车"+"\t"+bus.getMotoType()+"\t"+getDays()+"\t"+getDays()*bus.getRent());
		}
		System.out.print("继续租车么？（y/n） ");
		yn=input.next();
		}while(yn.equals("y"));
		if(yn.equals("n")){
			System.out.println("感谢使用！");
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
