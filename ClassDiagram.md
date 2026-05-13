```mermaid
classDiagram
    class Professor {
        -String professorId
        +checkProfessor(id: String) boolean
    }

    class Sungjuk {
        -String studentId
        -int java
        -int db
        -int security
        -int total
        -double average
        -String grade
        +inputScore(studentId: String, java: int, db: int, security: int)
        +calculateTotal() int
        +calculateAverage() double
        +assignGrade() String
        +getSungjuk() Sungjuk
    }

    class AddSungjukUI {
        <<boundary>>
        +displayInputForm()
        +submitScore()
    }

    class SearchSungjukUI {
        <<boundary>>
        +displaySearchForm()
        +showGradeResult()
    }

    %% Relationships
    AddSungjukUI ..> Professor : use
    AddSungjukUI ..> Sungjuk : use
    SearchSungjukUI ..> Professor : use
    SearchSungjukUI ..> Sungjuk : use