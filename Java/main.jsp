<%@page import="pro1.학점조회화면"%>
<%@page import="pro1.성적등록화면"%>
<%@page import="pro1.성적"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>성적 처리 시스템 결과 리포트</h1>
    <hr>

    <%
        // 1. 객체 준비
        성적 data = new 성적();
    	성적등록화면 inputUI = new 성적등록화면();
        학점조회화면 searchUI = new 학점조회화면();

        // 2. 성적 입력 실행 (교수id: inha)
        out.println("<h3>[성적 입력 시나리오]</h3>");
        String inputLog = inputUI.성적전송("inha", data, "2026_001", 95, 85, 90);
        out.println("<p>처리 메시지: " + inputLog + "</p>");

        out.println("<br>");

        // 3. 학점 조회 실행 (교수id: inha)
        out.println("<h3>[학점 조회 시나리오]</h3>");
        String searchLog = searchUI.결과표시("inha", data);
        out.println("<p>처리 메시지: " + searchLog + "</p>");

        out.println("<br>");

        // 4. 권한 오류 테스트 (교수id: wrong)
        out.println("<h3>[인증 실패 테스트]</h3>");
        String failLog = searchUI.학점결과표시("wrong", data);
        out.println("<p style='color:red;'>처리 메시지: " + failLog + "</p>");
    %>
</body>
</html>