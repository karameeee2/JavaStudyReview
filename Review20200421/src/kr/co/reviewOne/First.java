package kr.co.reviewOne;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("주문하세요. y/n");
			char ju = input.next().charAt(0);

			if(ju=='y'||ju=='Y') {
				System.out.println("주문선택");
				System.out.println("=======메뉴선택=======");
				System.out.println("1. 자장면");
				System.out.println("2. 짬봉");
				System.out.println("3. 탕수육");
				System.out.println("4. 이전메뉴");
				System.out.println("===================");
				System.out.println("번호를 선택하세요.");
				int menu = input.nextInt();
				
				if(menu==1) {
					System.out.println("자장면 선택");
					System.out.println("곱배기 선택 y/n");
					char gob = input.next().charAt(0);
					
					if(gob=='y'||gob=='Y') {
						System.out.println("자장면 곱배기 선택");
					}else {
						System.out.println("자장면 보통 선택");
					}
				}else if (menu==2) {
					System.out.println("짬뽕 선택");
					System.out.println("곱배기 선택 y/n");
					char gob = input.next().charAt(0);
					
					if(gob=='y'||gob=='Y') {
						System.out.println("짬뽕 곱배기 선택");
					}else {
						System.out.println("찜뽕 보통 선택");
					}
				}else if (menu==3) {
					System.out.println("탕수육 선택");
					System.out.println("1. 대자   2. 중자   3. 소자");
					int tang = input.nextInt();
					
					if(tang==1) {
						System.out.println("탕수육 대자 선택");
					}else if(tang==2) {
						System.out.println("탕수육 중자 선택");
					}else if(tang==3) {
						System.out.println("탕수육 소자 선택");
					}
				}else if (menu==4) {
					continue;
				}
			}else {
				System.out.println("주문취소");
				break;
			}
		}
	}
}
