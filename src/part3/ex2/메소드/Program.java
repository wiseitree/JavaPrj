package part3.ex2.�޼ҵ�;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		
		
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop){
			menu = inputMenu();
			
			switch(menu){
			case 1:
				//ExamList.inputList(list);
				list.inputList();
				break;
			case 2:
				//ExamList.printList(list);
				list.printList();
				break;
			case 3:
				System.out.println("Bye~~");
				keepLoop = false;
				break;
			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");
			}
	
		}
	}
	
	static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������������������");
		System.out.println("��     ���� �޴�            ��");
		System.out.println("����������������������������������������");
		System.out.println("\t1. �����Է� ");
		System.out.println("\t2. ������� ");
		System.out.println("\t3. ���� ");
		System.out.println("\t����> ");
		int menu = scan.nextInt();
		
		return menu;
	}
	
	 

		


}
