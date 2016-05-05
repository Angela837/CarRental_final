package cn.edu.qdu.car;

import java.util.Scanner;

public class Sever {
	Scanner input = new Scanner(System.in);

	private String name = null;
	private String id = null;
	private String phoneNumber = null;

	public static void main(String[] args) {
		Sever s = new Sever();
		s.startRent();
		s.register();
		s.chooseMoto();

	}

	public void startRent() {
		// 宣布开始
		System.out.println("********************");
		System.out.println("** 欢迎来到租车系统 **");
		System.out.println("********************");

	}

	public void register() {
		// 请租车人输入姓名
		System.out.print("请输入您的名字：");
		name = input.next();

	}

	public void chooseMoto() {
		String[] carType = { "宝马", "奔驰", "奥迪" };
		int[] busType = { 10, 32 };

		System.out.print("想租几辆车： ");//租车数
		int n = input.nextInt();//租几辆车就循环几次
		
		int[] days = new int[n];// 租用天数
		int[] type = new int[n];
		String[] types = new String[n];

		int m = 0;

		double total = 0;
		double[] totalFee = new double[n];

		do {
			System.out.print("请选择租车类型：1.轿车 2.客车  ");
			type[m] = input.nextInt();
			if (type[m] == 1) {
				Moto moto = new Car("鲁 B88888");
				
				//选择轿车车型
				System.out.print("请选择轿车类型：1.宝马 2.奔驰 3.奥迪   ");
				type[m] = input.nextInt();
				Car car = (Car) moto;// 将moto强制类型转换成Car类对象
				car.setType(carType[type[m] - 1]);// 调用Car类特有方法setType（）
				
				// 选择租车天数
				System.out.print("请输入您想租的天数：");
				days[m] = input.nextInt();

				// 所需费用
				totalFee[m] = moto.rentFee(days[m]);
				types[m]=car.getType();
			} else {
				Moto moto = new Bus("鲁 B66666");
				System.out.print("请选择客车类型：1.>16座  2.<=16座   ");
				type[m] = input.nextInt();
				Bus bus = (Bus) moto;// 将moto强制类型转换成Bus类对象
				bus.setSeatCount(busType[type[m] - 1]);// 调用Car类特有方法setType（）
				 
				// 选择租车天数
				System.out.print("请输入您想租的天数：");
				days[m] = input.nextInt();

				// 所需费用
				totalFee[m] = moto.rentFee(days[m]);
				types[m]=bus.getTypes();
				
			}

			total = total + totalFee[m];// 合计

			m = m + 1;
		} while (m != n);
		if (m == n) {
			System.out.println("编号" + "\t" + "车型" + "\t" + "天数" + "\t" + "租金");
			for (int i = 0; i < m; i++) {
				System.out.println(i + 1 + "\t" + types[i]+ "\t" +days[i]+"\t"+ totalFee[i]);

			}
			System.out.println("总计： " + total);
			System.out.println("感谢使用！");
		}

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
