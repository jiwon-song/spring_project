<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="ko">
<%@ include file="../include/head.jsp"%>

<body class="sb-nav-fixed">

	<!-- 여기가 헤더부분 -->
	<%@ include file="../include/header.jsp"%>


	<div id="layoutSidenav">

		<!--  사이드 메뉴부분 include 함 -->
		<%@ include file="../include/sidemenu.jsp"%>


		<!--  여기부터 콘텐츠 부분 -->
		<div id="layoutSidenav_content">
			<main>
				<div class="container-fluid px-4">
					<h1 class="mt-4">${class_name}</h1>
					<div class="card">
						<div class="card-body">
							<table id="datatablesSimple">
								<!--  이거때문에 자동 페이징처리? -->
								<thead>
									<tr>
										<th>학생이름</th>
										<th>학생아이디</th>
										<th>학생비밀번호</th>
										<th>학년</th>
										<th>학교</th>
										<th>보호자 전화번호</th>
										<th>학생 전화번호</th>
										<th>수정/삭제</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${stu_list}" var="vo">
										<tr>
											<td><a class="text-decoration-none" href="student_detail.so?dis=1&class_name=${class_name}&student_id=${vo.student_id}">${vo.student_name}</a></td>
											<td><a class="text-decoration-none" href="student_list.so?class_id=${vo.class_id}">${vo.student_id}</a></td>
											<td><a class="text-decoration-none" href="student_list.so?class_id=${vo.class_id}">${vo.student_pw}</a></td>
											<td><a class="text-decoration-none" href="student_list.so?class_id=${vo.class_id}">${vo.grade}</a></td>
											<td><a class="text-decoration-none" href="student_list.so?class_id=${vo.class_id}">${vo.school_name}</a></td>
											<td><a class="text-decoration-none" href="student_list.so?class_id=${vo.class_id}">${vo.parent_phone}</a></td>
											<td><a class="text-decoration-none" href="student_list.so?class_id=${vo.class_id}">${vo.student_phone}</a></td>
											<td><a class="text-decoration-none" href="student_list.so?class_id=${vo.class_id}">${vo.class_id}</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					
				</div>
			</main>
			<!--  여기까지가 콘텐츠 -->


			<%@include file="../include/footer.jsp"%>

		</div>
</body>
</html>
