package pro1;

public class 교수 {
    private String 교수id = "nha"; // 요구사항: "nha"

    // +checkProfessor(id: String) boolean
    public boolean 교수체크(String id) {
        return this.교수id.equals(id);
    }
}