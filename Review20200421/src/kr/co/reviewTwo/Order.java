package kr.co.reviewTwo;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			char ju = OrderFunc.selectJu(input);
			if(ju=='y'||ju=='Y') {
				OrderFunc.displayJu(1);
				int menu = OrderFunc.selectMenu(input);

				if(menu==1) {//¿⁄¿Â∏È º±≈√
					OrderFunc.displayMenu(1);
					char gob = OrderFunc.selectGob(input);
					
					if(gob=='y'||gob=='Y') {
						OrderFunc.displayGob(1);
					}else {
						OrderFunc.displayGob(2);
					}
					
				}else if (menu==2) {//¬´ªÕ º±≈√
					OrderFunc.displayMenu(2);
					char gob = OrderFunc.selectGob(input);
					
					if(gob=='y'||gob=='Y') {
						OrderFunc.displayGob(3);
					}else {
						OrderFunc.displayGob(4);
					}
					
				}else if (menu==3) {//≈¡ºˆ¿∞ º±≈√
					OrderFunc.displayMenu(3);
					int tang = OrderFunc.selectTang(input);
					
					if(tang==1) {
						OrderFunc.displayTang(1);
					}else if(tang==2) {
						OrderFunc.displayTang(2);
					}else if(tang==3) {
						OrderFunc.displayTang(3);
					}
					
				}else if (menu==4) {
					continue;
				}
			}else {
				OrderFunc.displayJu(2);
				break;
			}
		}
	}
}
