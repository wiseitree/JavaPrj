package ex10.control2.for_.example;

import java.util.Scanner;



public class Program{
	public static void main(String[] args) {
		int total = 0;
		
		/*
		for(int i=0; i<10; i++)
			total += 1+i;
		*/
		
		/* 3���� 7 ���ϴ°Ŷ�� 
		for(int i=0; i<5; i++)
			total += 3+i;
		*/ 
		
		//n*(a+1)/2
		//������ �˸� ������ �� ���� �ִµ�, �𸣸� ��� ���� ������ �� �� �ۿ� ����.
		total = 5*(3+7)/2;
				
		System.out.printf("total is %d\n", total);
	}
}