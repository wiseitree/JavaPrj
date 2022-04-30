public class Program{
	public static void main(String[] args) {
		
		int kor1, kor2, kor3, kor4, kor5;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 70;
		kor4 = 80;
		kor5 = 90;
		total = kor1 + kor2 + kor3 + kor4 + kor5;
		avg = total/5;
		
		System.out.printf("total is %d\n", total);
		System.out.printf("avg is %f\n", avg);
		
	}
}