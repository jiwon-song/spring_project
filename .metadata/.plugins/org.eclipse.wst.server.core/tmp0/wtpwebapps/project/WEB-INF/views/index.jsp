<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="ko">
<%@ include file="include/head.jsp" %>
<style>
.bgb{
	background: white;
}
.bgb img{
	opacity: 0.5;
}



</style>
<body class="sb-nav-fixed">

	<!-- 여기가 헤더부분 -->
	<%@ include file="include/header.jsp" %>


	<div id="layoutSidenav">
	
		<!--  사이드 메뉴부분 include 함 -->
 		<%@ include file="include/sidemenu.jsp"  %>
	

		<!--  여기부터 콘텐츠 부분 -->
		<div id="layoutSidenav_content" class="bgb">
			<img height="100%" src="img/class1.jpg" alt="교실배경" />
			
			
	<%@include file="include/footer.jsp" %>
		
	</div>



</body>
</html>
