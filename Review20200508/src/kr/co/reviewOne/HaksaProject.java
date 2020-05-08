package kr.co.reviewOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String,String>>();

		while(true) {
			System.out.println("========�޴� ����========");
			System.out.println("1. ���");
			System.out.println("2. ã��");
			System.out.println("3. ����");
			System.out.println("4. ��ü ���");
			System.out.println("----------------------");
			System.out.println("0. ����");
			System.out.println("----------------------");
			System.out.printf("��ȣ�� ������ �ּ���. > ");
			int selectNum = scanner.nextInt();

			if(selectNum==1) {//���
				System.out.println("========�޴� ����========");
				System.out.println("1. �л�");
				System.out.println("2. ����");
				System.out.println("3. ������");
				System.out.println("4. �����޴�");
				System.out.printf("��ȣ�� ������ �ּ���. > ");
				selectNum = scanner.nextInt();

				if(selectNum==1) {//�л�
					HashMap<String, String> haksaHash = new HashMap<String, String>();

					System.out.println("���� : ");
					String age = scanner.next();
					System.out.println("�̸� : ");
					String name = scanner.next();
					System.out.println("�й� : ");
					String hakbun = scanner.next();

					haksaHash.put("age", age);
					haksaHash.put("name", name);
					haksaHash.put("hakbun", hakbun);
					haksaHash.put("label", "1");
					haksaList.add(haksaHash);
					System.out.println("�л��� ��ϵǾ����ϴ�.");


				}else if(selectNum==2) {//����
					HashMap<String, String> haksaHash = new HashMap<String, String>();

					System.out.println("���� : ");
					String age = scanner.next();
					System.out.println("�̸� : ");
					String name = scanner.next();
					System.out.println("���� : ");
					String subject = scanner.next();

					haksaHash.put("age", age);
					haksaHash.put("name", name);
					haksaHash.put("subject", subject);
					haksaHash.put("label", "2");
					haksaList.add(haksaHash);
					System.out.println("������ ��ϵǾ����ϴ�.");

				}else if(selectNum==3) {//������
					HashMap<String, String> haksaHash = new HashMap<String, String>();

					System.out.println("���� : ");
					String age = scanner.next();
					System.out.println("�̸� : ");
					String name = scanner.next();
					System.out.println("�μ� : ");
					String part = scanner.next();

					haksaHash.put("age", age);
					haksaHash.put("name", name);
					haksaHash.put("part", part);
					haksaHash.put("label", "3");
					haksaList.add(haksaHash);
					System.out.println("�����ڰ� ��ϵǾ����ϴ�.");

				}else if(selectNum==4) {//�����޴�
					continue;
				}
			}else if(selectNum==2) {//ã��
				System.out.println("ã�� ����� �̸��� �Է��� �ּ���.");
				System.out.println("�̸� > ");
				String searchName = scanner.next();
				
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					String label = haksaHash.get("label");
					
					if(label.equals("1")) {
						String name = haksaHash.get("name");
						if(name.equals(searchName)) {
							System.out.print("���� : ");
							System.out.print(haksaHash.get("age") + ("\t"));
							System.out.print("�̸� : ");
							System.out.print(haksaHash.get("name") + ("\t"));
							System.out.print("�й� : ");
							System.out.print(haksaHash.get("hakbun") + ("\n"));
						}
						
					}else if(label.equals("2")) {
						String name = haksaHash.get("name");
						if(name.equals(searchName)) {
							System.out.print("���� : ");
							System.out.print(haksaHash.get("age") + ("\t"));
							System.out.print("�̸� : ");
							System.out.print(haksaHash.get("name") + ("\t"));
							System.out.print("���� : ");
							System.out.print(haksaHash.get("subject") + ("\n"));
						}
						
					}else if(label.equals("3")) {
						String name = haksaHash.get("name");
						if(name.equals(searchName)) {
							System.out.print("���� : ");
							System.out.print(haksaHash.get("age") + ("\t"));
							System.out.print("�̸� : ");
							System.out.print(haksaHash.get("name") + ("\t"));
							System.out.print("�μ� : ");
							System.out.print(haksaHash.get("part") + ("\n"));
						}
					}
				}
				System.out.println("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է��� �ּ���.");
				selectNum = scanner.nextInt();

				if(selectNum==1) {
					continue;
				}else {
					System.exit(0);
				}
			}else if(selectNum==3) {//����
				System.out.println("������ ����� �̸��� �Է��� �ּ���.");
				System.out.print("�̸� > ");
				String deleteName = scanner.next();
				
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					String label = haksaHash.get("label");
					
					if(label.equals("1")) {
						String name = haksaHash.get("name");
						if(name.equals(deleteName)) {
							haksaList.remove(i);
							System.out.println(deleteName + "���� �����Ͽ����ϴ�.");
						}
						
					}else if(label.equals("2")) {
						String name = haksaHash.get("name");
						if(name.equals(deleteName)) {
							haksaList.remove(i);
							System.out.println(deleteName + "���� �����Ͽ����ϴ�.");
						}
						
					}else if(label.equals("3")) {
						String name = haksaHash.get("name");
						if(name.equals(deleteName)) {
							haksaList.remove(i);
							System.out.println(deleteName + "���� �����Ͽ����ϴ�.");
						}
					}
				}
				System.out.println("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է��� �ּ���.");
				selectNum = scanner.nextInt();

				if(selectNum==1) {
					continue;
				}else {
					System.exit(0);
				}
			}else if(selectNum==4) {//��ü ���
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					String label = haksaHash.get("label");

					if(label.equals("1")) {
						System.out.print("���� : ");
						System.out.print(haksaHash.get("age") + ("\t"));
						System.out.print("�̸� : ");
						System.out.print(haksaHash.get("name") + ("\t"));
						System.out.print("�й� : ");
						System.out.print(haksaHash.get("hakbun") + ("\n"));

					}else if(label.equals("2")) {
						System.out.print("���� : ");
						System.out.print(haksaHash.get("age") + ("\t"));
						System.out.print("�̸� : ");
						System.out.print(haksaHash.get("name") + ("\t"));
						System.out.print("���� : ");
						System.out.print(haksaHash.get("subject") + ("\n"));

					}else if(label.equals("3")) {
						System.out.print("���� : ");
						System.out.print(haksaHash.get("age") + ("\t"));
						System.out.print("�̸� : ");
						System.out.print(haksaHash.get("name") + ("\t"));
						System.out.print("�μ� : ");
						System.out.print(haksaHash.get("part") + ("\n"));

					}
				}
				System.out.println("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է��� �ּ���.");
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
