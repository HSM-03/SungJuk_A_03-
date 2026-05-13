```mermaid
sequenceDiagram
    participant UI as Add_Sungjuk_UI
    participant P as 교수
    participant S as 성적

    UI->>P: 교수체크(교수id)
    P-->>UI: 결과 반환
    alt 체크 성공
        UI->>S: 성적입력(학생id, 자바, DB, 보안)
        S->>S: 총점 및 평균 계산
        S-->>UI: 입력 완료
    else 체크 실패
        UI-->>UI: 오류 메시지 출력
    end