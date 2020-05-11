package kr.co.green;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String,String>>();

		while(true) {
			System.out.println("=======메뉴 선택=======");
			System.out.println("1. 등록");
			System.out.println("2. 찾기");
			System.out.println("3. 삭제");
			System.out.println("4. 전체 출력");
			System.out.println("---------------------");
			System.out.println("0. 종료");
			System.out.println("---------------------");
			System.out.println("번호를 선택해주세요.");
			int selectNum = scanner.nextInt();

			if(selectNum==1) {//등록
				HaksaFunction.register(selectNum, scanner, haksaList);
				
				if(selectNum==4) {//이전메뉴
					continue;
				}
			}else if(selectNum==2) {//찾기
				HaksaFunction.search(scanner, haksaList);
				
				System.out.print("계속하시려면 1, 종료하시려면 0을 입력해주세요. > ");
				selectNum = scanner.nextInt();
				
				if(selectNum==1) {
					continue;
				}else {
					System.exit(0);
				}
				
			}else if(selectNum==3) {//삭제
				HaksaFunction.delete(scanner, haksaList);
				
				System.out.print("계속하시려면 1, 종료하시려면 0을 입력해주세요. >");
				selectNum = scanner.nextInt();
				
				if(selectNum==1) {
					continue;
				}else {
					System.exit(0);
				}
			}else if(selectNum==4) {//전체출력
				HaksaFunction.list(haksaList);
				
				System.out.print("계속하시려면 1, 종료하시려면 0을 입력해주세요. > ");
				selectNum = scanner.nextInt();
				
				if(selectNum==1) {
					continue;
				}else {
					System.exit(0);
				}
			}else if(selectNum==0) {//종료
				System.exit(0);
			}
		}
	}
}
