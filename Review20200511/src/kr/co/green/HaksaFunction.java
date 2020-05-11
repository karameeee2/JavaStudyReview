package kr.co.green;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaFunction {
	
	public static void register(int selectNum, Scanner scanner, ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("=======메뉴 선택=======");
		System.out.println("1. 학생");
		System.out.println("2. 교수");
		System.out.println("3. 관리자");
		System.out.println("4. 이전메뉴");
		System.out.println("번호를 선택해주세요.");
		selectNum = scanner.nextInt();
		
		if(selectNum==1) {//학생
			HashMap<String, String> haksaHash = new HashMap<String, String>();

			System.out.println("나이 : ");
			String age = scanner.next();
			System.out.println("이름 : ");
			String name = scanner.next();
			System.out.println("학번 : ");
			String studentNum = scanner.next();

			haksaHash.put("age", age);
			haksaHash.put("name", name);
			haksaHash.put("studentNum", studentNum);
			haksaHash.put("label", "1");
			haksaList.add(haksaHash);
			System.out.println("학생이 등록되었습니다.");

		}else if(selectNum==2) {//교수
			HashMap<String, String> haksaHash = new HashMap<String, String>();

			System.out.println("나이 : ");
			String age = scanner.next();
			System.out.println("이름 : ");
			String name = scanner.next();
			System.out.println("과목 : ");
			String subject = scanner.next();

			haksaHash.put("age", age);
			haksaHash.put("name", name);
			haksaHash.put("subject", subject);
			haksaHash.put("label", "2");
			haksaList.add(haksaHash);
			System.out.println("교수가 등록되었습니다.");

		}else if(selectNum==3) {//관리자
			HashMap<String, String> haksaHash = new HashMap<String, String>();

			System.out.println("나이 : ");
			String age = scanner.next();
			System.out.println("이름 : ");
			String name = scanner.next();
			System.out.println("부서 : ");
			String part = scanner.next();

			haksaHash.put("age", age);
			haksaHash.put("name", name);
			haksaHash.put("part", part);
			haksaHash.put("label", "3");
			haksaList.add(haksaHash);
			System.out.println("관리자가 등록되었습니다.");
			
		}
	}
	
	public static void search(Scanner scanner, ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("찾을 사람의 이름을 입력해주세요.");
		System.out.println("이름 > ");
		String searchName = scanner.next();
		
		for(int i=0; i<haksaList.size(); i++) {
			HashMap<String, String> haksaHash = haksaList.get(i);
			String label = haksaHash.get("label");
			
			if(label.equals("1")) {
				String name = haksaHash.get("name");
				
				if(name.equals(searchName)) {
					System.out.print("나이 : ");
					System.out.print(haksaHash.get("age") + ("\t"));
					System.out.print("이름 : ");
					System.out.print(haksaHash.get("name") + ("\t"));
					System.out.print("학번 : ");
					System.out.print(haksaHash.get("studentNum") + ("\n"));
				}
			}else if(label.equals("2")) {
				String name = haksaHash.get("name");
				
				if(name.equals(searchName)) {
					System.out.print("나이 : ");
					System.out.print(haksaHash.get("age") + ("\t"));
					System.out.print("이름 : ");
					System.out.print(haksaHash.get("name") + ("\t"));
					System.out.print("과목 : ");
					System.out.print(haksaHash.get("subject") + ("\n"));
				}
			}else if(label.equals("3")) {
				String name = haksaHash.get("name");
				
				if(name.equals(searchName)) {
					System.out.print("나이 : ");
					System.out.print(haksaHash.get("age") + ("\t"));
					System.out.print("이름 : ");
					System.out.print(haksaHash.get("name") + ("\t"));
					System.out.print("부서 : ");
					System.out.print(haksaHash.get("part") + ("\n"));
					
				}
			}
		}
	}
	
	public static void delete(Scanner scanner, ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("삭제할 사람의 이름을 입력해주세요.");
		System.out.print("이름 >");
		String deleteName = scanner.next();
		
		for(int i=0; i<haksaList.size(); i++) {
			HashMap<String, String> haksaHash = haksaList.get(i);
			String label = haksaHash.get("label");
			
			if(label.equals("1")) {
				String name = haksaHash.get("name");
				
				if(name.equals(deleteName)) {
					haksaList.remove(i);
					System.out.println(deleteName + "님을 삭제하였습니다.");
				}
			}else if(label.equals("2")) {
				String name = haksaHash.get("name");
				
				if(name.equals(deleteName)) {
					haksaList.remove(i);
					System.out.println(deleteName + "님을 삭제하였습니다.");
				}
			}else if(label.equals("3")) {
				String name = haksaHash.get("name");
				
				if(name.equals(deleteName)) {
					haksaList.remove(i);
					System.out.println(deleteName + "님을 삭제하였습니다.");
				}
			}
		}
	}
	
	public static void list(ArrayList<HashMap<String, String>> haksaList) {
		for(int i=0; i<haksaList.size(); i++) {
			HashMap<String, String> haksaHash = haksaList.get(i);
			String label = haksaHash.get("label");
			
			if(label.equals("1")) {
				System.out.print("나이 : ");
				System.out.print(haksaHash.get("age") + ("\t"));
				System.out.print("이름 : ");
				System.out.print(haksaHash.get("name") + ("\t"));
				System.out.print("학번 : ");
				System.out.print(haksaHash.get("studentNum") + ("\n"));
				
			}else if(label.equals("2")) {
				System.out.print("나이 : ");
				System.out.print(haksaHash.get("age") + ("\t"));
				System.out.print("이름 : ");
				System.out.print(haksaHash.get("name") + ("\t"));
				System.out.print("과목 : ");
				System.out.print(haksaHash.get("subject") + ("\n"));
				
			}else if(label.equals("3")) {
				System.out.print("나이 : ");
				System.out.print(haksaHash.get("age") + ("\t"));
				System.out.print("이름 : ");
				System.out.print(haksaHash.get("name") + ("\t"));
				System.out.print("부서 : ");
				System.out.print(haksaHash.get("part") + ("\n"));
			}
			
		}
	}
}
