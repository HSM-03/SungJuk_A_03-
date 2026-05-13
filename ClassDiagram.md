```mermaid
classDiagram
    class 교수 {
        -String 교수번호
        +교수체크(입력id: String) boolean
    }

    class 성적 {
        -String 학생번호
        -int 자바
        -int DB
        -int 보안
        -int 총점
        -double 평균
        -String 학점
        +성적입력(학생id: String, 자바: int, DB: int, 보안: int)
        +총점계산() int
        +평균계산() double
        +학점부여() String
        +학점조회() 성적
    }

    class 성적등록화면 {
        <<boundary>>
        +입력폼표시()
        +성적전송()
    }

    class 성적조회화면 {
        <<boundary>>
        +조회폼표시()
        +결과표시()
    }

    %% 관계 설정
    성적등록화면 ..> 교수 : 교수확인요청
    성적등록화면 ..> 성적 : 데이터저장
    성적조회화면 ..> 교수 : 교수확인요청
    성적조회화면 ..> 성적 : 데이터검색