```mermaid
sequenceDiagram
    participant UI as Add_Sungjuk_UI
    participant S as 성적
    participant P as 교수

    UI->>S: 성적입력(교수id, 학생id, 자바, DB, 보안)
    activate S
    S->>P: 교수체크(교수id)
    activate P
    P-->>S: 체크 결과(boolean)
    deactivate P
    
    alt 체크 성공
        Note right of S: 총점 및 평균 계산
        S-->>UI: 입력 및 계산 완료 메시지
    else 체크 실패
        S-->>UI: "교수 인증 실패" 메시지
    end
    deactivate S