package kr.co.reviewTwo;

import java.util.Scanner;

public class OrderFunc {
	
	public static char selectJu(Scanner input) {
		System.out.println("�ֹ��ϼ���. y/n");
		char ju = input.next().charAt(0);
		return ju;
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
	
	public static void selectGob() {
		
	}
}
/*
Scanner input = new Scanner(System.in);
while(true) {

	if(ju=='y'||ju=='Y') {
		
		if(menu==1) {
			System.out.println("����� ����");
			System.out.println("����� ���� y/n");
			char gob = input.next().charAt(0);
			
			if(gob=='y'||gob=='Y') {
				System.out.println("����� ����� ����");
			}else {
				System.out.println("����� ���� ����");
			}
		}else if (menu==2) {
			System.out.println("«�� ����");
			System.out.println("����� ���� y/n");
			char gob = input.next().charAt(0);
			
			if(gob=='y'||gob=='Y') {
				System.out.println("«�� ����� ����");
			}else {
				System.out.println("��� ���� ����");
			}
		}else if (menu==3) {
			System.out.println("������ ����");
			System.out.println("1. ����   2. ����   3. ����");
			int tang = input.nextInt();
			
			if(tang==1) {
				System.out.println("������ ���� ����");
			}else if(tang==2) {
				System.out.println("������ ���� ����");
			}else if(tang==3) {
				System.out.println("������ ���� ����");
			}
		}else if (menu==4) {
			continue;
		}
	}else {
		System.out.println("�ֹ����");
		break;
	}
}
*/
