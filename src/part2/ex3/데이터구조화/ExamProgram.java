package part2.ex3.�����ͱ���ȭ;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
	
	Exam exam = new Exam();
	
	input(exam);
	
	print(exam);
	
	}

	private static void print(Exam exam) {
		System.out.println("����������������������������������������");
		System.out.println("��     ���� ���            ��");
		System.out.println("����������������������������������������");
		System.out.println();
		
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

	private static void input(Exam exam) {
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
			{
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
			}
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
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
			}
		}while(math<0 || 100 < math);
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
	}
}
