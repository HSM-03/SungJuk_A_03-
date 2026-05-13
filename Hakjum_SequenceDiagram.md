```mermaid
sequenceDiagram
    participant UI as Search_Sungjuk_UI
    participant S as 성적
    participant P as 교수

    UI->>S: 학점조회(교수id)
    activate S
    S->>P: 교수체크(교수id)
    activate P
    P-->>S: 체크 결과(boolean)
    deactivate P

    alt 체크 성공
        Note right of S: 학점 부여(A, B, C)
        S-->>UI: 학점 결과 반환
    else 체크 실패
        S-->>UI: "조회 권한 없음" 메시지
    end
    deactivate S