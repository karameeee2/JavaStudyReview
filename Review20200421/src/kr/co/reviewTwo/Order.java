package kr.co.reviewTwo;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			char ju = OrderFunc.selectJu(input);
			if(ju=='y'||ju=='Y') {
				int menu = OrderFunc.selectMenu(input);

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
	}
}
