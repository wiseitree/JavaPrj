package part1.ex13.control2.continue_break;

import java.util.Scanner;



public class Program{
	public static void main(String[] args) {
		int n = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� sp�� �����ؼ� 5�� �̻� �Է��ϼ���:");
				
		// 3 Enter �� �ϳ��� ��, 34 5 6 234 345 54 45 Enter
		
		 while(scan.hasNext()) {
			n = scan.nextInt();
			
			if(n<10)
				continue;
			
			if(n>200)
				break;
			
			System.out.println(n);
		 }
		
	}	
}