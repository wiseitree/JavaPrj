package part3.ex3.Getters��Setters;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;
	int current;
	
	public void inputList() {
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
				
				/*
				Exam exam = new Exam();
				exam.setKor(kor);//exam.kor = kor;
				exam.setEng(eng);//exam.eng = eng;
				exam.setMath(math);//exam.math = math;
				*/
				
				Exam exam1 = new Exam();
				
				Exam exam = new Exam(kor,eng,math);

				Exam[] exams = this.exams;
				int size = this.current;
				
				if(exams.length == size) {
					// 1. ũ�Ⱑ 5�� ���� �� ū ���ο� �迭�� �����Ͻÿ�.
					Exam[] temp = new Exam[size + 5];
					// 2. ���� ���ֽ�Ű��
					for(int i=0; i<size; i++)
						temp[i] = exams[i];
					//3. list.exams�� ���� ���� temp �迭�� �����ϵ��� �Ѵ�.
					this.exams = temp;
					
				}
				
				this.exams[this.current] = exam;
				this.current++;
		}
	
	
		  public void printList() {
			  printList(current);
	}
		
		  public void printList(int size) {
			System.out.println("����������������������������������������");
			System.out.println("��     ���� ���            ��");
			System.out.println("����������������������������������������");
			System.out.println();
			
			// int size = list.current;
			Exam[] exams = this.exams;
			
			for(int i=0; i<size; i++) {
				Exam exam = exams[i];
				int kor = exam.getKor();//exam.kor;
				int eng = exam.getEng();//exam.eng;
				int math = exam.getMath();//exam.math;
				
				int total = exam.total();//kor + eng + math;
				float avg = exam.avg();//total/3.0f;
				
				System.out.printf("����: %d\n",kor);
				System.out.printf("����: %d\n",eng);
				System.out.printf("����: %d\n",math);
			
				System.out.printf("���� : %3d\n", total);
				System.out.printf("��� : %6.2f\n", avg);
				System.out.println("������������������������������������������������");
			}
	}

		public ExamList() {
			exams = new Exam[3];
			current=0;
			
		}
}
