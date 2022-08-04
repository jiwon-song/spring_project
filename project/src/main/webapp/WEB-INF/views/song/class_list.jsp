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
					<h1 class="mt-4">반 목록</h1>
					<div class="card">
						<div class="card-body">
							<div class="row justify-content-end">
								<a class="btn btn-modify mb-4 col-1 me-sm-3" href="modify.so?id=${vo.id}">수정</a>
								<a class="btn btn-delete mb-4 col-1 me-sm-3" 
									onclick="if(confirm('정말 삭제하시겠습니가?')) href='delete.so?id=${vo.id}'">삭제</a>
							</div>
							<table id="datatablesSimple">
								<!--  이거때문에 자동 페이징처리? -->
								<thead>
									<tr>
										<th>반 이름</th>
										<th>학생수</th>
										<th>반 아이디</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="vo">
										<tr>
											<td><a class="text-decoration-none" href="class_list.so?class_id=${vo.class_id}">${vo.class_name}</a></td>
											<td><a class="text-decoration-none" href="class_list.so?class_id=${vo.class_id}">${vo.stu_num}</a></td>
											<td><a class="text-decoration-none" href="class_list.so?class_id=${vo.class_id}">${vo.class_id}</a></td>
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
