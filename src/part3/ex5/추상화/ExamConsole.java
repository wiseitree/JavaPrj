package part3.ex5.�߻�ȭ;

import java.util.Scanner;

public abstract class ExamConsole {
	
	// Composition Has A ��ü�� / ������ �� �����ֱⰡ ����
	private ExamList list = new ExamList();
	
	public void /*printList*/print() {
		  print/*printList*/(list.size());
}
	
	  public void /*printList*/print(int size) {
		System.out.println("����������������������������������������");
		System.out.println("��     ���� ���            ��");
		System.out.println("����������������������������������������");
		System.out.println();
		
		// int size = list.current;
		//Exam[] exams = this.exams;
		
		for(int i=0; i<size; i++) {
			Exam exam = list.get(i);//this.exams[i];
			int kor = exam.getKor();//exam.kor;
			int eng = exam.getEng();//exam.eng;
			int math = exam.getMath();//exam.math;
			
			int total = exam.total();//kor + eng + math;
			float avg = exam.avg();//total/3.0f;
			
			System.out.printf("����: %d\n",kor);
			System.out.printf("����: %d\n",eng);
			System.out.printf("����: %d\n",math);
			
			//Event Method
			onPrint(exam);
			
			System.out.printf("���� : %3d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("������������������������������������������������");
		}
}
	  
	

	public void input() /*inputList()*/ {
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
				
				
				//Exam exam = new Exam(kor,eng,math);
				Exam exam = makeExam();
				exam.setKor(kor);
				exam.setEng(eng);
				exam.setMath(math);
				
				//Event Method
				onInput(exam);
				
				/*---------------add-------------------------*/
				
				list.add(exam);
		}
	protected abstract void onPrint(Exam exam);
	protected abstract void onInput(Exam exam);

	//abstract �޼ҵ带 ���� �� �ִ� Ŭ������ ������ abstract Ŭ�������� �Ѵ�.
	protected abstract Exam makeExam();
	
}
