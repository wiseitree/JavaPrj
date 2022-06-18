package part3.ex5.추상화;

public abstract class Exam {
	int kor;
	int eng;
	int math;
	
	public Exam() {
		this(0,0,0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	/* 메소드 추상화를 위한 주석 처리
	public int total() {
		
		return kor+eng+math;
	}
	public float avg() {
		
		return total()/3.0f;
	}
	*/
	public abstract int total();
	
	protected int onTotal() {
		return kor+eng+math;
	}
		
	public abstract float avg();
}
