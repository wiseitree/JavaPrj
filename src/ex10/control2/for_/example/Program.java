package ex10.control2.for_.example;

import java.util.Scanner;



public class Program{
	public static void main(String[] args) {
		int total = 0;
		
		/*
		for(int i=0; i<10; i++)
			total += 1+i;
		*/
		
		/* 3부터 7 더하는거라면 
		for(int i=0; i<5; i++)
			total += 3+i;
		*/ 
		
		//n*(a+1)/2
		//수학을 알면 빠르게 할 수도 있는데, 모르면 모든 것을 절차로 할 수 밖에 없음.
		total = 5*(3+7)/2;
				
		System.out.printf("total is %d\n", total);
	}
}