package kr.co.reviewTwo;

import java.util.Scanner;

public class OrderFunc {
	
	public static char selectJu(Scanner input) {
		System.out.println("�ֹ��ϼ���. y/n");
		char ju = input.next().charAt(0);
		return ju;
	}
	
	public static void displayJu(int number) {
		if(number==1) {
			System.out.println("�ֹ�����");
		}else {
			System.out.println("�ֹ����");
		}
	}
	
	public static int selectMenu(Scanner input) {
		System.out.println("�ֹ�����");
		System.out.println("=======�޴�����=======");
		System.out.println("1. �����");
		System.out.println("2. «��");
		System.out.println("3. ������");
		System.out.println("4. �����޴�");
		System.out.println("===================");
		System.out.println("��ȣ�� �����ϼ���.");
		int menu = input.nextInt();
		return menu;
	}
	
	public static char selectGob(Scanner input) {
		System.out.println("����� y/n");
		char gob = input.next().charAt(0);
		return gob;
	}
	
	public static void displayMenu(int number) {
		if(number==1) {
			System.out.println("����� ����");
		}else if(number==2) {
			System.out.println("«�� ����");
		}else if(number==3) {
			System.out.println("������ ����");
		}
	}
	
	public static void displayGob(int number) {
		if(number==1) {
			System.out.println("����� ����� ����");
			System.out.printf("������ %d�� �Դϴ�.", 6000);
		}else if(number==2) {
			System.out.println("����� ���� ����");
			System.out.printf("������ %d�� �Դϴ�.", 5000);
		}else if(number==3) {
			System.out.println("«�� ����� ����");
			System.out.printf("������ %d�� �Դϴ�.", 7000);
		}else if(number==4) {
			System.out.println("«�� ���� ����");
			System.out.printf("������ %d�� �Դϴ�.", 6000);
		}
	}
	
	public static int selectTang(Scanner input) {
		System.out.println("1. ���� 2. ���� 3. ����");
		int tang = input.nextInt();
		return tang;
	}
	
	public static void displayTang(int number) {
		if(number==1) {
			System.out.println("������ ���� ����");
			System.out.printf("������ %d�� �Դϴ�.", 15000);
		}else if(number==2) {
			System.out.println("������ ���� ����");
			System.out.printf("������ %d�� �Դϴ�.", 12000);
		}else if(number==3) {
			System.out.println("������ ���� ����");
			System.out.printf("������ %d�� �Դϴ�.", 9000);
		}
	}
}