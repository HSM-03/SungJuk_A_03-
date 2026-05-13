package pro1;

public class 교수 {
    private String 교수id = "inha"; // 요구사항: "inha"

    // +checkProfessor(id: String) boolean
    public boolean 교수체크(String id) {
        return this.교수id.equals(id);
    }
}