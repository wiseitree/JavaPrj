package part3.ex4.UI코드분리하기;

public class ExamList {
	//커밋테스트
	Exam[] exams;
	private int current;
	
	

	public void add(Exam exam) {
		Exam[] exams = this.exams;
		int size = this.current;
		
		if(exams.length == size) {
			// 1. 크기가 5개 정도 더 큰 새로운 배열을 생성하시오.
			Exam[] temp = new Exam[size + 5];
			// 2. 값을 이주시키기
			for(int i=0; i<size; i++)
				temp[i] = exams[i];
			//3. list.exams가 새로 만든 temp 배열을 참조하도록 한다.
			this.exams = temp;
			
		}
		
		this.exams[this.current] = exam;
		this.current++;
		
	}

	public Exam get(int i) {
		
		return this.exams[i];
	}

	//public void init() --> public void ExamList()
	// 개체 ExamList 의 객체를 List라는 이름으로 생성함과 동시에 초기화를 한 번 진행할  것 이므로
	public void ExamList() {
			this.exams = new Exam[3];
			this.current=0;			
		}

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}

}
