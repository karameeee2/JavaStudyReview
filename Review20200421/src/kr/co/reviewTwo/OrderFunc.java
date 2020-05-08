package kr.co.reviewTwo;

import java.util.Scanner;

public class OrderFunc {
	
	public static char selectJu(Scanner input) {
		System.out.println("주문하세요. y/n");
		char ju = input.next().charAt(0);
		return ju;
	}
	
	public static void displayJu(int number) {
		if(number==1) {
			System.out.println("주문선택");
		}else {
			System.out.println("주문취소");
		}
	}
	
	public static int selectMenu(Scanner input) {
		System.out.println("주문선택");
		System.out.println("=======메뉴선택=======");
		System.out.println("1. 자장면");
		System.out.println("2. 짬봉");
		System.out.println("3. 탕수육");
		System.out.println("4. 이전메뉴");
		System.out.println("===================");
		System.out.println("번호를 선택하세요.");
		int menu = input.nextInt();
		return menu;
	}
	
	public static char selectGob(Scanner input) {
		System.out.println("곱배기 y/n");
		char gob = input.next().charAt(0);
		return gob;
	}
	
	public static void displayMenu(int number) {
		if(number==1) {
			System.out.println("자장면 선택");
		}else if(number==2) {
			System.out.println("짬뽕 선택");
		}else if(number==3) {
			System.out.println("탕수육 선택");
		}
	}
	
	public static void displayGob(int number) {
		if(number==1) {
			System.out.println("자장면 곱배기 선택");
			System.out.printf("가격은 %d원 입니다.", 6000);
		}else if(number==2) {
			System.out.println("자장면 보통 선택");
			System.out.printf("가격은 %d원 입니다.", 5000);
		}else if(number==3) {
			System.out.println("짬뽕 곱배기 선택");
			System.out.printf("가격은 %d원 입니다.", 7000);
		}else if(number==4) {
			System.out.println("짬뽕 보통 선택");
			System.out.printf("가격은 %d원 입니다.", 6000);
		}
	}
	
	public static int selectTang(Scanner input) {
		System.out.println("1. 대자 2. 중자 3. 소자");
		int tang = input.nextInt();
		return tang;
	}
	
	public static void displayTang(int number) {
		if(number==1) {
			System.out.println("탕수육 대자 선택");
			System.out.printf("가격은 %d원 입니다.", 15000);
		}else if(number==2) {
			System.out.println("탕수육 중자 선택");
			System.out.printf("가격은 %d원 입니다.", 12000);
		}else if(number==3) {
			System.out.println("탕수육 소자 선택");
			System.out.printf("가격은 %d원 입니다.", 9000);
		}
	}
}