```mermaid
graph LR
    %% Actor 정의
    교수((교수))

    subgraph 성적_관리_시스템 [성적 관리 시스템]
        %% Use Case 정의
        UC1(성적입력)
        UC2(학점조회)
        UC3(교수체크)

        %% 관계 정의
        교수 --> UC1
        교수 --> UC2
        
        UC1 -.->|&lt;&lt;include&gt;&gt;| UC3
        UC2 -.->|&lt;&lt;include&gt;&gt;| UC3
    end

    %% 스타일 설정
    style UC1 fill:#f9f,stroke:#333,stroke-width:2px
    style UC2 fill:#f9f,stroke:#333,stroke-width:2px
    style UC3 fill:#fff,stroke:#333,stroke-dasharray: 5 5