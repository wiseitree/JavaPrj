package ex11.control2.elseif;

import java.util.Scanner;



public class Program{
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		int menu;
		
		Scanner scan = new Scanner(System.in);
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		while(true) {
			//------------------   ���� �޴� �κ�   ---------------------
			System.out.println("����������������������������������������������������������������");
			System.out.println("��            ���� �޴�                     ��");
			System.out.println("����������������������������������������������������������������");
			System.out.println("\t1.�����Է�");
			System.out.println("\t2.�������");
			System.out.println("\t3.����");
			System.out.print("\t>");
			menu = scan.nextInt();
		
		if(menu==1) {
			//------------------   ���� �Է� �κ�   ---------------------
			System.out.println("����������������������������������������������������������������");
			System.out.println("��            �����Է�                     ��");
			System.out.println("����������������������������������������������������������������");
			
			do {
				System.out.print("����1:");
				kor1 = scan.nextInt();
				
				if(kor1<0 || 100<kor1)
					System.out.println("��������(0~100)�� ������ϴ�.");
			}while(kor1<0 || 100<kor1);
			
			do {
				System.out.print("����2:");
				kor2 = scan.nextInt();
				
				if(kor2<0 || 100<kor2)
					System.out.println("��������(0~100)�� ������ϴ�.");
				
			}while(kor2<0 || 100<kor2);
			
			
			do {
				System.out.print("����3:");
				kor3 = scan.nextInt();
				
				if(kor3<0 || 100<kor3)
					System.out.println("��������(0~100)�� ������ϴ�.");
				
			}while(kor3<0 || 100<kor3);
		}
		else if(menu==2) {
			//------------------   ���� ��� �κ�   ---------------------
			total = kor1 + kor2 + kor3;
			avg = total/3.0f;
			
			
			System.out.println("����������������������������������������������������������������");
			System.out.println("��            �������                     ��");
			System.out.println("����������������������������������������������������������������");
			
			
			for(int i=0; i<3; i++)
				System.out.printf("����%d : %3d\n", i+1, kor1);
			
			System.out.printf("���� : %3d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println(" ������������������������������������������������������������");
			System.out.println(avg);
		}
		
		else if(menu==3)
			break;
		else
			System.out.println("�Է� ����. 1~3������ �Է��� �� �ֽ��ϴ�.");
		}
		System.out.println("good bye~");
	}	
}