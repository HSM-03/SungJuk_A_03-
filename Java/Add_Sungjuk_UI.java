package pro1;

public class Add_Sungjuk_UI {
    private 교수 prof = new 교수();
    
    // +submitScore() 역할 수행
    public String 성적전송(String 교수id, 성적 target, String 학생id, int java, int db, int sec) {
    	return target.성적입력(교수id, 학생id, java, db, sec);
    }
}