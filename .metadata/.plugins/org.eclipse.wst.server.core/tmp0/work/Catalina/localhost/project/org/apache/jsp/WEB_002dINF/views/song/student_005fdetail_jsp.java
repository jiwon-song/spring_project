/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.59
 * Generated at: 2022-08-05 03:08:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.song;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/song/../include/footer.jsp", Long.valueOf(1659604870751L));
    _jspx_dependants.put("/WEB-INF/views/song/../include/sidemenu.jsp", Long.valueOf(1659604800558L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1655271067748L));
    _jspx_dependants.put("/WEB-INF/views/song/../include/header.jsp", Long.valueOf(1659355775387L));
    _jspx_dependants.put("jar:file:/D:/qqq/Project_Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/song/../include/head.jsp", Long.valueOf(1659605376543L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"author\" content=\"\" />\r\n");
      out.write("<title>Bteam 프로젝트</title>\r\n");
      out.write("<!-- 표, 페이징 관련 스타일 -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("	\r\n");
      out.write("<!-- 전체 스타일 -->	\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!--  폰트어썸(아이콘) -->\r\n");
      out.write("<script src=\"https://use.fontawesome.com/releases/v6.1.0/js/all.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 달력UI : datepicker 관련된 부분 -->	\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\r\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.13.2/jquery-ui.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("<!-- 부트스트랩 아이콘 -->  \r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css\">\r\n");
      out.write("</head>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"sb-nav-fixed\">\r\n");
      out.write("\r\n");
      out.write("	<!-- 여기가 헤더부분 -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("	<!--  헤더 부분  -->\r\n");
      out.write("	<nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-primary\">\r\n");
      out.write("		<!-- Navbar Brand-->\r\n");
      out.write("		<button class=\"btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0\"	id=\"sidebarToggle\" href=\"#!\">\r\n");
      out.write("			<i class=\"fas fa-bars\"></i>\r\n");
      out.write("		</button>\r\n");
      out.write("		<a class=\"navbar-brand ps-3\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">S 클래스</a>\r\n");
      out.write("\r\n");
      out.write("		<!-- Sidebar Toggle-->\r\n");
      out.write("		<!-- Navbar Search-->\r\n");
      out.write("		<form\r\n");
      out.write("			class=\"d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0\">\r\n");
      out.write("			<div class=\"input-group\">\r\n");
      out.write("				<!--                     <input class=\"form-control\" type=\"text\" placeholder=\"Search for...\" aria-label=\"Search for...\" aria-describedby=\"btnNavbarSearch\" /> -->\r\n");
      out.write("				<div class=\"bd-example\">\r\n");
      out.write("					<button class=\" btn btn-light btn-outline-primary\"\r\n");
      out.write("						id=\"btnNavbarSearch\" type=\"button\">로그인</button>\r\n");
      out.write("					<a href=\"new.t\"><button class=\"btn btn-light\"\r\n");
      out.write("							id=\"btnNavbarSearch\" type=\"button\">회원가입</button></a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		<!-- Navbar-->\r\n");
      out.write("		<ul class=\"navbar-nav ms-auto ms-md-0 me-3 me-lg-4\">\r\n");
      out.write("			<li class=\"nav-item dropdown\"><a\r\n");
      out.write("				class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\"\r\n");
      out.write("				role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"><i\r\n");
      out.write("					class=\"fas fa-user fa-fw\"></i></a>\r\n");
      out.write("				<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("					aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#!\">설정</a></li>\r\n");
      out.write("					<li><hr class=\"dropdown-divider\" /></li>\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#!\">로그아웃</a></li>\r\n");
      out.write("				</ul></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<!-- 여기까지가 헤더부분 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div id=\"layoutSidenav\">\r\n");
      out.write("\r\n");
      out.write("		<!--  사이드 메뉴부분 include 함 -->\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!--  사이드바 -->	\r\n");
      out.write("		<div id=\"layoutSidenav_nav\">\r\n");
      out.write("			<nav class=\"sb-sidenav accordion sb-sidenav-light\"id=\"sidenavAccordion\">\r\n");
      out.write("				<div class=\"sb-sidenav-menu\">\r\n");
      out.write("					<div class=\"nav\">\r\n");
      out.write("						\r\n");
      out.write("						<a class=\"nav-link\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-tachometer-alt\"></i>\r\n");
      out.write("							</div> 홈화면\r\n");
      out.write("						</a>\r\n");
      out.write("												\r\n");
      out.write("						<div class=\"sb-sidenav-menu-heading\">\r\n");
      out.write("							<hr>\r\n");
      out.write("							반 / 학생 관리\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<a class=\"nav-link collapsed\" href=\"class_list.so\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-columns\"></i>\r\n");
      out.write("							</div> 반 관리\r\n");
      out.write("						</a> \r\n");
      out.write("						<a class=\"nav-link collapsed\"  href=\"#\" data-bs-toggle=\"collapse\"\r\n");
      out.write("							data-bs-target=\"#collapseLayouts1\" aria-expanded=\"false\"\r\n");
      out.write("							aria-controls=\"collapsePages\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-book-open\"></i>\r\n");
      out.write("							</div> 학생관리\r\n");
      out.write("							<div class=\"sb-sidenav-collapse-arrow\">\r\n");
      out.write("								<i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("						</a>\r\n");
      out.write("						<!-- 눌러서 열리고 눌러서 닫히게 -->\r\n");
      out.write("						<div class=\"collapse ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\" id=\"collapseLayouts1\"\r\n");
      out.write("							aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("							<nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("								");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("								<!--  여기에 반복문 써서 처리 -->\r\n");
      out.write("							</nav>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<div class=\"sb-sidenav-menu-heading\">\r\n");
      out.write("							<hr>\r\n");
      out.write("							과제 / 테스트 관리\r\n");
      out.write("						</div>\r\n");
      out.write("						<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\r\n");
      out.write("							data-bs-target=\"#collapseLayouts2\" aria-expanded=\"false\"\r\n");
      out.write("							aria-controls=\"collapseLayouts\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-columns\"></i>\r\n");
      out.write("							</div> 과제관리\r\n");
      out.write("							<div class=\"sb-sidenav-collapse-arrow\">\r\n");
      out.write("								<i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"collapse\" id=\"collapseLayouts2\"\r\n");
      out.write("							aria-labelledby=\"headingTwo\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("							<nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("								<a class=\"nav-link\" href=\"layout-static.html\">1반 과제</a> <a\r\n");
      out.write("									class=\"nav-link\" href=\"layout-sidenav-light.html\">2반 과제</a> <a\r\n");
      out.write("									class=\"nav-link\" href=\"layout-sidenav-light.html\">3반 과제</a>\r\n");
      out.write("								<!--  여기에 반복문 써서 처리 -->\r\n");
      out.write("							</nav>\r\n");
      out.write("						</div>\r\n");
      out.write("						<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\r\n");
      out.write("							data-bs-target=\"#collapseLayouts3\" aria-expanded=\"false\"\r\n");
      out.write("							aria-controls=\"collapseLayouts\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-columns\"></i>\r\n");
      out.write("							</div> 테스트 관리\r\n");
      out.write("							<div class=\"sb-sidenav-collapse-arrow\">\r\n");
      out.write("								<i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"collapse\" id=\"collapseLayouts3\"\r\n");
      out.write("							aria-labelledby=\"headingTwo\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("							<nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("								<a class=\"nav-link\" href=\"test_list.ho?class_id=0\">전체보기</a> \r\n");
      out.write("								");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("								<!--  여기에 반복문 써서 처리 -->\r\n");
      out.write("							</nav>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<div class=\"sb-sidenav-menu-heading\">\r\n");
      out.write("							<hr>\r\n");
      out.write("							학생 출석 / 선생님 스케줄 관리\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\r\n");
      out.write("							data-bs-target=\"#collapseLayouts4\" aria-expanded=\"false\"\r\n");
      out.write("							aria-controls=\"collapsePages\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-book-open\"></i>\r\n");
      out.write("							</div> 학생 출석 관리\r\n");
      out.write("							<div class=\"sb-sidenav-collapse-arrow\">\r\n");
      out.write("								<i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</a> \r\n");
      out.write("						<div class=\"collapse\" id=\"collapseLayouts4\"	aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("							<nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("								<a class=\"nav-link\" href=\"layout-static.html\">1반</a> \r\n");
      out.write("								<a class=\"nav-link\" href=\"layout-sidenav-light.html\">2반</a> \r\n");
      out.write("								<a class=\"nav-link\" href=\"layout-sidenav-light.html\">3반</a>\r\n");
      out.write("								<!--  여기에 반복문 써서 처리 -->\r\n");
      out.write("							</nav>\r\n");
      out.write("						</div>\r\n");
      out.write("						<a class=\"nav-link collapsed\" href=\"#\" \r\n");
      out.write("							data-bs-toggle=\"collapse\"\r\n");
      out.write("							data-bs-target=\"#collapsePages\" \r\n");
      out.write("							aria-expanded=\"false\"\r\n");
      out.write("							aria-controls=\"collapsePages\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-book-open\"></i>\r\n");
      out.write("							</div> 선생님 일정\r\n");
      out.write("\r\n");
      out.write("						</a>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</nav>\r\n");
      out.write("		</div>  <!--  여기까지 사이드바 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!--  여기부터 콘텐츠 부분 -->\r\n");
      out.write("		<div id=\"layoutSidenav_content\">\r\n");
      out.write("			<main>\r\n");
      out.write("				<div class=\"container-fluid px-4\">\r\n");
      out.write("					<h1 class=\"mt-4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu_de.student_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<table id=\"datatablesSimple\">\r\n");
      out.write("								<!--  이거때문에 자동 페이징처리? --><!-- 깃허브 수정해보려고 걍 쓴 주석 -->\r\n");
      out.write("								<thead>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th>학생이름</th>\r\n");
      out.write("										<th>학생아이디</th>\r\n");
      out.write("										<th>학생비밀번호</th>\r\n");
      out.write("										<th>학년</th>\r\n");
      out.write("										<th>학교</th>\r\n");
      out.write("										<th>보호자 전화번호</th>\r\n");
      out.write("										<th>학생 전화번호</th>\r\n");
      out.write("										<th>수정/삭제</th>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</thead>\r\n");
      out.write("								<tbody>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu_de.student_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("											<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu_de.student_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("											<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu_de.student_pw}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("											<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu_de.grade}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("											<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu_de.school_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("											<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu_de.parent_phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("											<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu_de.student_phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("											<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu_de.class_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("										</tr>\r\n");
      out.write("								</tbody>\r\n");
      out.write("							</table>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</main>\r\n");
      out.write("			\r\n");
      out.write("			<!--  여기까지가 콘텐츠 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!--  푸터부분 -->\r\n");
      out.write("			<footer class=\"py-4 bg-light mt-auto\">\r\n");
      out.write("				<div class=\"container-fluid px-4\">\r\n");
      out.write("					<div\r\n");
      out.write("						class=\"d-flex align-items-center justify-content-between small\">\r\n");
      out.write("						<div class=\"text-muted\">Copyright &copy; Your Website 2022</div>\r\n");
      out.write("						<div>\r\n");
      out.write("							<a href=\"#\">Privacy Policy</a> &middot; <a href=\"#\">Terms\r\n");
      out.write("								&amp; Conditions</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</footer>\r\n");
      out.write("			\r\n");
      out.write("		</div> <!--  여기까지 콘텐트 + 푸터 부분 -->\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	<!-- 부트스트랩 js -->	\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("		\r\n");
      out.write("	<!-- 템플릿 js -->	\r\n");
      out.write("	<script src=\"js/scripts.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script src=\"/js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("	<script src=\"/js/demo/chart-bar-demo.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<!-- 표 / 페이징 관련 js -->\r\n");
      out.write("	<script src=\"js/simple-datatables.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script src=\"js/datatables-simple-demo.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/song/../include/header.jsp(11,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/views/song/../include/sidemenu.jsp(10,32) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/song/../include/sidemenu.jsp(37,27) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dis eq 1}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("show");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/song/../include/sidemenu.jsp(40,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/song/../include/sidemenu.jsp(40,8) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/song/../include/sidemenu.jsp(40,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("vo");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("									<a class=\"nav-link\" href=\"student_list.so?class_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.class_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&dis=1&class_name=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.class_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.class_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a> \r\n");
            out.write("								");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/views/song/../include/sidemenu.jsp(84,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/song/../include/sidemenu.jsp(84,8) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/song/../include/sidemenu.jsp(84,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("vo");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("									<a class=\"nav-link\"  href=\"test_list.ho?class_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.class_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&class_name=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.class_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.class_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a> \r\n");
            out.write("								");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
