package pro1;

public class 성적 {
    private String 학생id;
    private int 자바;
    private int DB;
    private int 보안;
    private int 총점;
	private double 평균;
	private String 학점;
	
	// +inputScore(studentId: String, java: int, db: int, security: int)
	public void 성적입력(String 학생id, int 자바, int DB, int 보안) {
	    this.학생id = 학생id;
	    this.자바 = 자바;
	    this.DB = DB;
	    this.보안 = 보안;
	    
	    // 계산 로직 호출
	    총점계산();
	    평균계산();
	    학점부여();
	}
	
	// +calculateTotal() int
	public int 총점계산() {
	    this.총점 = 자바 + DB + 보안;
	    return this.총점;
	}
	
	// +calculateAverage() double
	public double 평균계산() {
	    this.평균 = this.총점 / 3.0;
	    return this.평균;
	}
	
	// +assignGrade() String
	public String 학점부여() {
	    if (this.평균 >= 90) this.학점 = "A";
	    else if (this.평균 >= 80) this.학점 = "B";
	    else this.학점 = "C";
	    return this.학점;
	}
	
	// 결과 조회를 위한 Getter들
	public String get학생id() { return 학생id; }
	public int get총점() { return 총점; }
	public double get평균() { return 평균; }
	public String 학점조회() { return 학점; }
}