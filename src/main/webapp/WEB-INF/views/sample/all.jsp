<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>/sample/all Page</h1>

<ul>
	<li>principal  :  <sec:authentication property="principal"/> </li>
	<li>MemberVO  :  <sec:authentication property="principal.member"/> </li>
	<li>사용자 ID  :  <sec:authentication property="principal.username"/> </li>
	<li>사용자 이름  :  <sec:authentication property="principal.member.userName"/> </li>
	<li>사용자 권한  :  <sec:authentication property="principal.member.authList"/> </li>
</ul>

<a href="/customLogout">로그아웃</a>

</body>
</html>