package part3.ex1.ĸ��ȭ;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;
	int current;
	
	static void inputList(ExamList list) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("����������������������������������������");
		System.out.println("��     ���� �Է�            ��");
		System.out.println("����������������������������������������");
		System.out.println();

			int kor, eng, math;			
				do {
					System.out.printf("���� :");
					kor = scan.nextInt();
					
					if(kor < 0 || 100 < kor)
						System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
				}while(kor<0 || 100 < kor);
				
				do {
					System.out.printf("���� :");
					eng = scan.nextInt();
					
					if(eng < 0 || 100 < eng)
					{
						System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
					}
				}while(eng<0 || 100 < eng);
				
				do {
					System.out.printf("���� :");
					math = scan.nextInt();
					
					if(math < 0 || 100 < math)
					{
						System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");
					}
				}while(math<0 || 100 < math);
				
				Exam exam = new Exam();
				exam.kor = kor;
				exam.eng = eng;
				exam.math = math;
				
				Exam[] exams = list.exams;
				int size = list.current;
				
				if(list.exams.length == list.current) {
					// 1. ũ�Ⱑ 5�� ���� �� ū ���ο� �迭�� �����Ͻÿ�.
					Exam[] temp = new Exam[size + 5];
					// 2. ���� ���ֽ�Ű��
					for(int i=0; i<size; i++)
						temp[i] = exams[i];
					//3. list.exams�� ���� ���� temp �迭�� �����ϵ��� �Ѵ�.
					list.exams = temp;
					
				}
				
				list.exams[list.current] = exam;
				list.current++;
		}
	
		 static void printList(ExamList list) {
			printList(list, list.current);
	}
		
		 static void printList(ExamList list, int size) {
			System.out.println("����������������������������������������");
			System.out.println("��     ���� ���            ��");
			System.out.println("����������������������������������������");
			System.out.println();
			
			// int size = list.current;
			Exam[] exams = list.exams;
			
			for(int i=0; i<size; i++) {
				Exam exam = exams[i];
				int kor = exam.kor;
				int eng = exam.eng;
				int math = exam.math;
				
				int total = kor + eng + math;
				float avg = total/3.0f;
				
				System.out.printf("����: %d\n",kor);
				System.out.printf("����: %d\n",eng);
				System.out.printf("����: %d\n",math);
			
				System.out.printf("���� : %3d\n", total);
				System.out.printf("��� : %6.2f\n", avg);
				System.out.println("������������������������������������������������");
			}
	}

		public static void init(ExamList list) {
			list.exams = new Exam[3];
			list.current=0;
			
		}
}
