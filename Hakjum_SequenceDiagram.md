```mermaid
sequenceDiagram
    participant UI as Search_Sungjuk_UI
    participant P as 교수
    participant S as 성적

    UI->>P: 교수체크(교수id)
    P-->>UI: 결과 반환
    alt 체크 성공
        UI->>S: 학점조회()
        S->>S: 학점 부여 로직 실행
        S-->>UI: 학점 결과 반환
    else 체크 실패
        UI-->>UI: 오류 메시지 출력
    end