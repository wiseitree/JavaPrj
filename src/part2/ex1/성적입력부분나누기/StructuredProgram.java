package part2.ex1.�����Էºκг�����;

import java.util.Scanner;

public class StructuredProgram {

	public static void main(String[] args) {
		
		int[] korList = new int[3];
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop){
			menu = inputMenu();
			
			switch(menu){
			case 1:
				inputKors(korList);
				break;
			case 2:
				printKors(korList);
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
	static void inputKors(int[] kors) {
		
		Scanner scan = new Scanner(System.in);
		int kor;
		System.out.println("����������������������������������������");
		System.out.println("��     ���� �Է�            ��");
		System.out.println("����������������������������������������");
		System.out.println();
		
		for(int i = 0; i < 3; i++){
			do {
				System.out.printf("����%d : ", i+1);
				kor = scan.nextInt();
				
				if(kor < 0 || 100 < kor)
				{
					System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
				}
			}while(kor<0 || 100 < kor);
			
			kors[i] = kor;
		}
		
		System.out.println("������������������������������������������������");
		
	}
	static void printKors(int[] kors) {
		
		int total = 0;
		float avg;
		
		for(int i = 0; i < 3; i++)
			total += kors[i];
		
		avg = total / 3.0f;
		
		System.out.println("����������������������������������������");
		System.out.println("��     ���� ���            ��");
		System.out.println("����������������������������������������");
		System.out.println();
		
		for(int i = 0; i < 3; i++)
		{
			System.out.printf("���� %d : %3d\n", 3-i, kors[i]);
		}
		System.out.printf("���� : %3d\n", total);
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("������������������������������������������������");
	}
}
