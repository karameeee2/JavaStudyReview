package kr.co.green;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String,String>>();

		while(true) {
			System.out.println("=======�޴� ����=======");
			System.out.println("1. ���");
			System.out.println("2. ã��");
			System.out.println("3. ����");
			System.out.println("4. ��ü ���");
			System.out.println("---------------------");
			System.out.println("0. ����");
			System.out.println("---------------------");
			System.out.println("��ȣ�� �������ּ���.");
			int selectNum = scanner.nextInt();

			if(selectNum==1) {//���
				HaksaFunction.register(selectNum, scanner, haksaList);
				
				if(selectNum==4) {//�����޴�
					continue;
				}
			}else if(selectNum==2) {//ã��
				HaksaFunction.search(scanner, haksaList);
				
				System.out.print("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է����ּ���. > ");
				selectNum = scanner.nextInt();
				
				if(selectNum==1) {
					continue;
				}else {
					System.exit(0);
				}
				
			}else if(selectNum==3) {//����
				HaksaFunction.delete(scanner, haksaList);
				
				System.out.print("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է����ּ���. >");
				selectNum = scanner.nextInt();
				
				if(selectNum==1) {
					continue;
				}else {
					System.exit(0);
				}
			}else if(selectNum==4) {//��ü���
				HaksaFunction.list(haksaList);
				
				System.out.print("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է����ּ���. > ");
				selectNum = scanner.nextInt();
				
				if(selectNum==1) {
					continue;
				}else {
					System.exit(0);
				}
			}else if(selectNum==0) {//����
				System.exit(0);
			}
		}
	}
}
