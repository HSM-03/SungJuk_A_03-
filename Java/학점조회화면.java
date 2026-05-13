package pro1;

public class 학점조회화면 {
    private 교수 prof = new 교수();

    // +showGradeResult() 역할 수행
    public String 학점결과표시(String 교수id, 성적 target) {
        // 반드시 교수id 체크
        if (prof.교수체크(교수id)) {
            return "조회 성공 -> [학생ID: " + target.get학생id() + "] 학점: " + target.get학점() + " (평균: " + String.format("%.2f", target.get평균()) + ")";
        } else {
            return "인증 실패: 조회 권한이 없습니다.";
        }
    }
}
