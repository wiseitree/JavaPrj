package part3.ex4.UI코드분리하기;

public class ExamList {
	private Exam[] exams;
	private int current;

	public Exam get(int i) {
		
		return this.exams[i];
	}
	
	public void add(Exam exam) {
		Exam[] exams = this.exams;
		int size = this.current;

		if (exams.length == size) {
			// 1. 크기가 5개 정도 더 큰 새로운 배열을 생성하시오.
			Exam[] temp = new Exam[size + 5];
			// 2. 값을 이주시키기
			for (int i = 0; i < size; i++)
				temp[i] = exams[i];
			// 3. list.exams가 새로 만든 temp 배열을 참조하도록 한다.
			exams = temp;

		}

		exams[current] = exam;
		current++;

	}

	// Aggregation Has 집합형 / 생성될 때 생명주기가 다름
	public ExamList() {
		exams = new Exam[3];
		current = 0;

	}

	
	public int size() {

		return current;
	}
}
