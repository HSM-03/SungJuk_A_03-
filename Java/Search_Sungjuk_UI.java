package pro1;

public class Search_Sungjuk_UI {
    private 교수 prof = new 교수();

    // +showGradeResult() 역할 수행
    public String 결과표시(String 교수id, 성적 target) {
        return target.학점조회(교수id);
    }
}