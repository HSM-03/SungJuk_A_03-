package pro1;

public class 성적등록화면 {
    private 교수 prof = new 교수();
    
    // +submitScore() 역할 수행
    public String 성적전송(String 교수id, 성적 target, String 학생id, int java, int db, int sec) {
        // 반드시 교수id 체크
        if (prof.교수체크(교수id)) {
            target.성적입력(학생id, java, db, sec);
            return "성적 입력 성공! (대상 학생: " + 학생id + ")";
        } else {
            return "인증 실패: 교수ID(" + 교수id + ")가 일치하지 않습니다.";
        }
    }
}