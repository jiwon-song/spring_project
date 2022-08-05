<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

		<!--  사이드바 -->	
		<div id="layoutSidenav_nav">
			<nav class="sb-sidenav accordion sb-sidenav-light"id="sidenavAccordion">
				<div class="sb-sidenav-menu">
					<div class="nav">
						
						<a class="nav-link" href="<c:url value='/'/>">
							<div class="sb-nav-link-icon">
								<i class="fs-5 fa-brands fa-fort-awesome"></i>
							</div> 홈화면
						</a>
												
						<div class="sb-sidenav-menu-heading">
							<hr>
							반 / 학생 관리
						</div>
						
						<a class="nav-link collapsed" href="class_list.so">
							<div class="sb-nav-link-icon">
								<i class="fs-5 fa-solid fa-chess-rook"></i>
							</div> 반 관리
						</a> 
						<a class="nav-link collapsed"  href="#" data-bs-toggle="collapse"
							data-bs-target="#collapseLayouts1" aria-expanded="false"
							aria-controls="collapsePages">
							<div class="sb-nav-link-icon">
								<i class="fs-5 fa-regular fa-chess-pawn"></i>
							</div> 학생관리
							<div class="sb-sidenav-collapse-arrow">
								<i class="fas fa-angle-down"></i>
							</div>
						</a>
						<!-- 눌러서 열리고 눌러서 닫히게 -->
						<div class="collapse <c:if test='${dis eq 1}'>show</c:if>" id="collapseLayouts1"
							aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
							<nav class="sb-sidenav-menu-nested nav">
								<c:forEach items="${list}" var="vo">
									<a class="nav-link" href="student_list.so?class_id=${vo.class_id}&dis=1&class_name=${vo.class_name}">${vo.class_name}</a> 
								</c:forEach>
								<!--  여기에 반복문 써서 처리 -->
							</nav>
						</div>
						
						<div class="sb-sidenav-menu-heading">
							<hr>
							과제 / 테스트 관리
						</div>
						<a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
							data-bs-target="#collapseLayouts2" aria-expanded="false"
							aria-controls="collapseLayouts">
							<div class="sb-nav-link-icon">
								<i class="fs-5 fa-solid fa-chess-knight"></i>
							</div> 과제관리
							<div class="sb-sidenav-collapse-arrow">
								<i class="fas fa-angle-down"></i>
							</div>
						</a>
						<div class="collapse" id="collapseLayouts2"
							aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
							<nav class="sb-sidenav-menu-nested nav">
								<a class="nav-link" href="layout-static.html">1반 과제</a> <a
									class="nav-link" href="layout-sidenav-light.html">2반 과제</a> <a
									class="nav-link" href="layout-sidenav-light.html">3반 과제</a>
								<!--  여기에 반복문 써서 처리 -->
							</nav>
						</div>
						<a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
							data-bs-target="#collapseLayouts3" aria-expanded="false"
							aria-controls="collapseLayouts">
							<div class="sb-nav-link-icon">
								<i class="fs-5 fa-regular fa-chess-bishop"></i>
							</div> 테스트 관리
							<div class="sb-sidenav-collapse-arrow">
								<i class="fas fa-angle-down"></i>
							</div>
						</a>
						<div class="collapse" id="collapseLayouts3"
							aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
							<nav class="sb-sidenav-menu-nested nav">
								<a class="nav-link" href="test_list.ho?class_id=0">전체보기</a> 
								<c:forEach items="${list}" var="vo">
									<a class="nav-link"  href="test_list.ho?class_id=${vo.class_id}&class_name=${vo.class_name}">${vo.class_name}</a> 
								</c:forEach>
								<!--  여기에 반복문 써서 처리 -->
							</nav>
						</div>
						
						<div class="sb-sidenav-menu-heading">
							<hr>
							학생 출석 / 선생님 스케줄 관리
						</div>

						<a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
							data-bs-target="#collapseLayouts4" aria-expanded="false"
							aria-controls="collapsePages">
							<div class="sb-nav-link-icon">
								<i class="fs-5 fa-solid fa-chess-board"></i>
							</div> 학생 출석 관리
							<div class="sb-sidenav-collapse-arrow">
								<i class="fas fa-angle-down"></i>
							</div>

						</a> 
						<div class="collapse" id="collapseLayouts4"	aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
							<nav class="sb-sidenav-menu-nested nav">
								<a class="nav-link" href="layout-static.html">1반</a> 
								<a class="nav-link" href="layout-sidenav-light.html">2반</a> 
								<a class="nav-link" href="layout-sidenav-light.html">3반</a>
								<!--  여기에 반복문 써서 처리 -->
							</nav>
						</div>
						<a class="nav-link collapsed" href="#" 
							data-bs-toggle="collapse"
							data-bs-target="#collapsePages" 
							aria-expanded="false"
							aria-controls="collapsePages">
							<div class="sb-nav-link-icon">
								<i class="fs-5 fa-regular fa-chess-queen"></i>
							</div> 선생님 일정

						</a>

					</div>
				</div>

			</nav>
		</div>  <!--  여기까지 사이드바 -->

