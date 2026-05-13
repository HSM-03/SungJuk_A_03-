package pro1;

public class 성적 {
	private 교수 p = new 교수(); 
    private String 학생id;
    private int 자바;
    private int DB;
    private int 보안;
    private int 총점;
	private double 평균;
	private String 학점;
	
	// +inputScore(studentId: String, java: int, db: int, security: int)
	public String 성적입력(String 교수id, String 학생id, int 자바, int DB, int 보안) {
		if (p.교수체크(교수id)) {
			this.학생id = 학생id;
		    this.자바 = 자바;
		    this.DB = DB;
		    this.보안 = 보안;
		    
		    // 계산 로직 호출
		    총점계산();
		    평균계산();
		    String rtnmsg = "성적 입력 성공! (대상 학생: " + 학생id + ")";
		    return rtnmsg;
		} else {
			String rtnmsg = "인증 실패: 교수ID(" + 교수id + ")가 일치하지 않습니다.";
			return rtnmsg;
		}
	    
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
	
	public String 학점조회(String 교수id) { 
		if (p.교수체크(교수id)) {
			학점부여();
			return "조회 성공 -> [학생ID: " + this.학생id + "] 학점: " + this.학점 + " (평균: " + String.format("%.2f", this.평균) + ")";
		} else {
			return "인증 실패: 조회 권한이 없습니다.";
		}
	}
}