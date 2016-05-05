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
		// ������ʼ
		System.out.println("********************");
		System.out.println("** ��ӭ�����⳵ϵͳ **");
		System.out.println("********************");

	}

	public void register() {
		// ���⳵����������
		System.out.print("�������������֣�");
		name = input.next();

	}

	public void chooseMoto() {
		String[] carType = { "����", "����", "�µ�" };
		int[] busType = { 10, 32 };

		System.out.print("���⼸������ ");//�⳵��
		int n = input.nextInt();//�⼸������ѭ������
		
		int[] days = new int[n];// ��������
		int[] type = new int[n];
		String[] types = new String[n];

		int m = 0;

		double total = 0;
		double[] totalFee = new double[n];

		do {
			System.out.print("��ѡ���⳵���ͣ�1.�γ� 2.�ͳ�  ");
			type[m] = input.nextInt();
			if (type[m] == 1) {
				Moto moto = new Car("³ B88888");
				
				//ѡ��γ�����
				System.out.print("��ѡ��γ����ͣ�1.���� 2.���� 3.�µ�   ");
				type[m] = input.nextInt();
				Car car = (Car) moto;// ��motoǿ������ת����Car�����
				car.setType(carType[type[m] - 1]);// ����Car�����з���setType����
				
				// ѡ���⳵����
				System.out.print("�������������������");
				days[m] = input.nextInt();

				// �������
				totalFee[m] = moto.rentFee(days[m]);
				types[m]=car.getType();
			} else {
				Moto moto = new Bus("³ B66666");
				System.out.print("��ѡ��ͳ����ͣ�1.>16��  2.<=16��   ");
				type[m] = input.nextInt();
				Bus bus = (Bus) moto;// ��motoǿ������ת����Bus�����
				bus.setSeatCount(busType[type[m] - 1]);// ����Car�����з���setType����
				 
				// ѡ���⳵����
				System.out.print("�������������������");
				days[m] = input.nextInt();

				// �������
				totalFee[m] = moto.rentFee(days[m]);
				types[m]=bus.getTypes();
				
			}

			total = total + totalFee[m];// �ϼ�

			m = m + 1;
		} while (m != n);
		if (m == n) {
			System.out.println("���" + "\t" + "����" + "\t" + "����" + "\t" + "���");
			for (int i = 0; i < m; i++) {
				System.out.println(i + 1 + "\t" + types[i]+ "\t" +days[i]+"\t"+ totalFee[i]);

			}
			System.out.println("�ܼƣ� " + total);
			System.out.println("��лʹ�ã�");
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
