<%@page import="com.smhrd.model.WebMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Forty by HTML5 UP</title>
<meta charset="UTF-8" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
<link rel="stylesheet" href="assets/css/main.css" />
<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
</head>

<style>
</style>

<body style="text-align: center;">


	<!-- Wrapper -->
	<div id="wrapper">
		<%


String email = request.getParameter("email");
String pw =  request.getParameter("pw");
String tel =  request.getParameter("tel");
String address = request.getParameter("address");

%>
		<!-- Menu -->
		<nav id="Update"> <font size="8">회원가입성공</font>
		<br>
		정보를 확인하세요<br>
		<br>
		
		<table>
			<tr>
				<td>Email</td>
				<td><%=email%></td>	
			</tr>
			<tr>
				<td>Tel</td>
				<td><%=tel%></td>	
			</tr>
			<tr>
				<td>Address</td>
				<td><%=address%></td>	
			</tr>
			
		</table>
		<a href="index.jsp"><input type="button" value="메인페이지로"></a> </nav>
	</div>
	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
	<script src="assets/js/main.js"></script>
</body>
</html>
