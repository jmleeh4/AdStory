/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-18 06:01:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import board.model.vo.Board;
import java.util.List;
import java.text.DecimalFormat;
import member.model.vo.Member;

public final class BoardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1597637307753L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1597677649069L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("board.model.vo.Board");
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    DecimalFormat Commas = new DecimalFormat("#,###");

    Member memberLoggedIn = (Member)session.getAttribute("memberLoggedIn");
    boolean saveId = false;
    String memberId = "";
    Cookie[] cookies = request.getCookies();
    if(cookies != null){
        for(Cookie c : cookies){
            String key = c.getName();
            String value = c.getValue();
            if("saveId".equals(key)){
                saveId = true;
                memberId = value;
            }
        }
    }
    
    String changedMemberRole = "";
    String profileImageName = "";
    if(memberLoggedIn != null){
        if("A".equals(memberLoggedIn.getMemberRole())){
            changedMemberRole="관리자";
            profileImageName="profile_A.png";
        } else if("C".equals(memberLoggedIn.getMemberRole())) {
            changedMemberRole="기업회원";
            profileImageName="profile_C.png";
        } else {
            changedMemberRole="일반회원";
            profileImageName="profile_U.png";
        }
    }
    

      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\"\r\n");
      out.write("    href=\"");
      out.print(request.getContextPath() );
      out.write("/images/favicon.ico\"\r\n");
      out.write("    type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"shortcut icon\"\r\n");
      out.write("    href=\"");
      out.print(request.getContextPath() );
      out.write("/images/favicon.ico\"\r\n");
      out.write("    type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("    href=\"");
      out.print(request.getContextPath() );
      out.write("/css/main_style.css\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css\"\r\n");
      out.write("    rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300\"\r\n");
      out.write("    rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("    href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\"\r\n");
      out.write("    integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\"\r\n");
      out.write("    crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Open+Sans\"\r\n");
      out.write("    rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("    src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>AD STORY</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"all-of-div\">\r\n");
      out.write("        <div class=\"main-container\">\r\n");
      out.write("            <div class=\"menu-icon\">\r\n");
      out.write("                <i class=\"fas fa-bars header__menu\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <header class=\"header\">\r\n");
      out.write("                <div class=\"logout-div\">\r\n");
      out.write("                \r\n");
 if(memberLoggedIn == null){ 
      out.write(" \r\n");
      out.write("                       <button\r\n");
      out.write("                        class=\"float-right bg-transparent hover:bg-blue-500 text-gray-700 font-semibold hover:text-white py-2 px-4 border border-gray-700 hover:border-transparent rounded\"\r\n");
      out.write("                        onclick=\"openModal()\">\r\n");
      out.write("                                                      로그인\r\n");
      out.write("                        </button>\r\n");
} else { 
      out.write("\r\n");
      out.write("                       <button\r\n");
      out.write("                        class=\"float-right bg-transparent hover:bg-blue-500 text-gray-700 font-semibold hover:text-white py-2 px-4 border border-gray-700 hover:border-transparent rounded\"\r\n");
      out.write("                        onclick=\"location.href = '");
      out.print( request.getContextPath() );
      out.write("/member/logout';\"/>\r\n");
      out.write("                                                      로그아웃\r\n");
      out.write("                        </button>\r\n");
 } 
      out.write("             \r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <aside class=\"sidenav overflow-x\">\r\n");
      out.write("                <div class=\"sidenav__close-icon\">\r\n");
      out.write("                    <i class=\"fas fa-times sidenav__brand-close\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"LOGO\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/';\" >\r\n");
      out.write("                    <b>AD STORY</b>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
 if(memberLoggedIn == null){ 
      out.write(" \r\n");
      out.write("                <div class=\"profile_img_div border-b mx-4 py-10\" \r\n");
      out.write("                onclick=\"openModal()\">\r\n");
      out.write("                     <img class=\"profile_img\"\r\n");
      out.write("                     src=\"");
      out.print(request.getContextPath() );
      out.write("/images/profile.png\"\r\n");
      out.write("                     alt=\"프로필사진\"> \r\n");
      out.write("                     <br> \r\n");
      out.write("                     <p class=\"font-bold text-xl\">로그인 해주세요.</p>\r\n");
      out.write("                </div>\r\n");
} else { 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"profile_img_div border-b mx-4 py-10\"\r\n");
      out.write("                onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/myPage';\">\r\n");
      out.write("                     <img class=\"profile_img\"\r\n");
      out.write("                     src=\"");
      out.print(request.getContextPath() );
      out.write("/images/");
      out.print(profileImageName );
      out.write("\" alt=\"프로필사진\"> \r\n");
      out.write("                     \r\n");
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                     <br> \r\n");
      out.write("                     <p class=\"font-bold text-xl\">");
      out.print( memberLoggedIn.getName() );
      out.write("</p>\r\n");
      out.write("                     \r\n");
      out.write("                     ");
if("A".equals(memberLoggedIn.getMemberRole())){
      out.write("\r\n");
      out.write("                     <p class = \"text-sm\">관리자</p>\r\n");
      out.write("                     ");
} else if("C".equals(memberLoggedIn.getMemberRole())){ 
      out.write("\r\n");
      out.write("                     <p class = \"text-sm\">기업회원</p>\r\n");
      out.write("                     <br />\r\n");
      out.write("                     <p class=\"text-indigo-700\">");
      out.print( (String)Commas.format(memberLoggedIn.getPoint()) );
      out.write("P</p>\r\n");
      out.write("                     ");
 } else { 
      out.write("\r\n");
      out.write("                     <p class = \"text-sm\">일반회원</p>\r\n");
      out.write("                     <br />\r\n");
      out.write("                     <p class=\"text-indigo-700\">");
      out.print( (String)Commas.format(memberLoggedIn.getPoint()) );
      out.write("P</p>\r\n");
      out.write("                     ");
 } 
      out.write("\r\n");
      out.write("                </div>\r\n");
 } 
      out.write("             \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"sidenav__list\">\r\n");
      out.write("                    ");
if(memberLoggedIn != null&&"A".equals(memberLoggedIn.getMemberRole())){
      out.write("\r\n");
      out.write("                    <li class=\"font-bold text-indigo-700 sidenav__list-item\"\r\n");
      out.write("                    onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/admin/main';\">관리자 페이지 <i class=\"fas fa-tools\"></i></li>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    ");
 } 
      out.write(" \r\n");
      out.write("                    \r\n");
      out.write("                    <li class=\"sidenav__list-item\"\r\n");
      out.write("                        onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/';\">홈</li>\r\n");
      out.write("                    ");
 if(memberLoggedIn == null || !("A".equals(memberLoggedIn.getMemberRole()))) {
      out.write("\r\n");
      out.write("                    <li class=\"sidenav__list-item\"\r\n");
      out.write("                        onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/myPage';\">마이페이지</li>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    <li class=\"sidenav__list-item\"\r\n");
      out.write("                        onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/board/list';\">광고 게시판</li>\r\n");
      out.write("                    \r\n");
      out.write("                    <li class=\"sidenav__list-item\">문의게시판</li>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </aside>\r\n");
      out.write("\r\n");
      out.write("            <main class=\"main\">");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <!-- 상단 nav -->\r\n");
      out.write("                <nav class=\"text-center font-bold sm:flex sm:justify-center sm:items-center mt-4\">\r\n");
      out.write("                    <div class=\"flex flex-col sm:flex-row\">\r\n");
      out.write("                        <a class=\"mt-3 text-gray-700 hover:text-blue-700 hover:underline sm:mx-3 sm:mt-0\" href=\"#\">전체</a>\r\n");
      out.write("                        <a class=\"mt-3 text-gray-700 hover:text-blue-700 hover:underline sm:mx-3 sm:mt-0\" href=\"#\">건강식품</a>\r\n");
      out.write("                        <a class=\"mt-3 text-gray-700 hover:text-blue-700 hover:underline sm:mx-3 sm:mt-0\" href=\"#\">화장품&미용</a>\r\n");
      out.write("                        <a class=\"mt-3 text-gray-700 hover:text-blue-700 hover:underline sm:mx-3 sm:mt-0\" href=\"#\">가전제품</a>\r\n");
      out.write("                        <a class=\"mt-3 text-gray-700 hover:text-blue-700 hover:underline sm:mx-3 sm:mt-0\" href=\"#\">생활용품</a>\r\n");
      out.write("                        <a class=\"mt-3 text-gray-700 hover:text-blue-700 hover:underline sm:mx-3 sm:mt-0\" href=\"#\">교육</a>\r\n");
      out.write("                        <a class=\"mt-3 text-gray-700 hover:text-blue-700 hover:underline sm:mx-3 sm:mt-0\" href=\"#\">요식업</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("                \r\n");

    List<Board> list = (List<Board>)request.getAttribute("list");

      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"container my-12 mx-auto px-4 md:px-12\">\r\n");
      out.write("        <div class=\"flex flex-wrap -mx-1 lg:-mx-4\">\r\n");
      out.write("            ");
  if(list == null || list.isEmpty()){  
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("                <div class = \"m-auto text-xl\">조회된 게시물이 없습니다.</div>\r\n");
      out.write("\r\n");
      out.write("            ");
  
                } else {
                	
                    for(Board b : list){
            
      out.write("      \r\n");
      out.write("\r\n");
      out.write("                   <!-- Column -->\r\n");
      out.write("                    <div class=\"my-1 px-1 w-full md:w-1/2 lg:my-4 lg:px-4 lg:w-1/3 xl:w-1/4\">\r\n");
      out.write("            \r\n");
      out.write("                        <!-- Article -->\r\n");
      out.write("                        <article class=\"overflow-hidden rounded-lg shadow-lg\">\r\n");
      out.write("            \r\n");
      out.write("                            <a href=\"");
      out.print(request.getContextPath());
      out.write("/board/view?boardNo=");
      out.print(b.getKey());
      out.write("\">\r\n");
      out.write("                                <img alt=\"Placeholder\" class=\"block h-auto w-full\"\r\n");
      out.write("                                \r\n");
      out.write("                                ");
 if (b.getMainImageRename() == null){ 
      out.write("\r\n");
      out.write("                                     src=\"");
      out.print( request.getContextPath() );
      out.write("/images/defaultImg.png\" alt=\"홍보 사진\"/>\r\n");
      out.write("                                ");
 } else {
      out.write("\r\n");
      out.write("                                     src=\"");
      out.print(request.getContextPath() );
      out.write("/upload/board-images/");
      out.print(b.getMainImageRename());
      out.write("\"/>\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                            </a>\r\n");
      out.write("            \r\n");
      out.write("                            <header class=\"flex items-center justify-between leading-tight p-2 md:p-4\">\r\n");
      out.write("                                <h1 class=\"text-lg\">\r\n");
      out.write("                                    <a class=\"no-underline hover:underline text-black\" href=\"");
      out.print(request.getContextPath());
      out.write("/board/view?boardNo=");
      out.print(b.getKey());
      out.write("\">\r\n");
      out.write("                                      ");
      out.print( b.getTitle() );
      out.write("\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </h1>\r\n");
      out.write("                            </header>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"flex items-center justify-between leading-tight p-2 md:px-4\">\r\n");
      out.write("                                <a class=\"no-underline hover:underline text-black\" href=\"#\">\r\n");
      out.write("                                  ");
      out.print( b.getRefBoardCategoryName() );
      out.write("\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <p class=\"text-grey-darker text-sm\">\r\n");
      out.write("                                    ");
      out.print( b.getEnrollDate() );
      out.write("\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"text-sm leading-none p-2 md:px-4\">\r\n");
      out.write("                                <p>잔여 : ");
      out.print((String)Commas.format(b.getPoint()));
      out.write("P</p>\r\n");
      out.write("                                <p>단가 : ");
      out.print((String)Commas.format(b.getClickPrice()));
      out.write("P</p>\r\n");
      out.write("                                <p>참여인원 : ");
      out.print(b.getApplyNum() );
      out.write("</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <footer class=\"flex items-center justify-between leading-none p-2 md:p-4\">\r\n");
      out.write("                                <a class=\"flex items-center no-underline hover:underline text-black\" href=\"#\">\r\n");
      out.write("                                    <p class=\"text-sm\">\r\n");
      out.write("                                      ");
      out.print( b.getRefMemberName() );
      out.write("   \r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"no-underline text-grey-darker hover:text-red-dark\" href=\"#\">\r\n");
      out.write("                                    <span class=\"hidden\">Like</span>\r\n");
      out.write("                                    <i class=\"fa fa-heart\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </footer>\r\n");
      out.write("                        </article>\r\n");
      out.write("                        <!-- END Article -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- END Column -->\r\n");
      out.write("            \r\n");
      out.write("               ");
 } 
      out.write(" \r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("           \r\n");
      out.write("               ");
 if(memberLoggedIn != null&& !memberLoggedIn.getMemberRole().equals("U")){ 
      out.write("\r\n");
      out.write("               <div class = \"flow-root mt-5\">               \r\n");
      out.write("                   <div>\r\n");
      out.write("\t                    <button\r\n");
      out.write("\t                    class=\"float-right bg-transparent hover:bg-blue-500 text-gray-700 font-semibold hover:text-white py-2 px-4 border border-gray-700 hover:border-transparent rounded\"\r\n");
      out.write("\t                    onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/board/insert';\">\r\n");
      out.write("\t                                                  글쓰기\r\n");
      out.write("\t                    </button>\r\n");
      out.write("                   </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               ");
 } 
      out.write(" \r\n");
      out.write("    </div>         \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("                <div class=\"search-bar-div\">\r\n");
      out.write("                    <div class=\"search-bar relative text-lg bg-transparent text-gray-800\">\r\n");
      out.write("                        <div class=\"flex items-center border-b border-b-2 border-gray-500 py-2\">\r\n");
      out.write("                            <input class=\"bg-transparent border-none mr-3 px-2 leading-tight focus:outline-none\"\r\n");
      out.write("                                type=\"text\" placeholder=\"검색\">\r\n");
      out.write("                            <button type=\"submit\" class=\"absolute right-0 top-0 mt-3 mr-4\">\r\n");
      out.write("                                <svg class=\"h-4 w-4 fill-current\" xmlns=\"http://www.w3.org/2000/svg\"\r\n");
      out.write("                                    xmlns:xlink=\"http://www.w3.org/1999/xlink\" version=\"1.1\" id=\"Capa_1\" x=\"0px\" y=\"0px\"\r\n");
      out.write("                                    viewBox=\"0 0 56.966 56.966\" style=\"enable-background:new 0 0 56.966 56.966;\"\r\n");
      out.write("                                    xml:space=\"preserve\" width=\"512px\" height=\"512px\">\r\n");
      out.write("                                    <path\r\n");
      out.write("                                        d=\"M55.146,51.887L41.588,37.786c3.486-4.144,5.396-9.358,5.396-14.786c0-12.682-10.318-23-23-23s-23,10.318-23,23  s10.318,23,23,23c4.761,0,9.298-1.436,13.177-4.162l13.661,14.208c0.571,0.593,1.339,0.92,2.162,0.92  c0.779,0,1.518-0.297,2.079-0.837C56.255,54.982,56.293,53.08,55.146,51.887z M23.984,6c9.374,0,17,7.626,17,17s-7.626,17-17,17  s-17-7.626-17-17S14.61,6,23.984,6z\" />\r\n");
      out.write("                                </svg>\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- pageBar -->\r\n");
      out.write("\t\t\t    <div class=\"align-middle flex justify-center\">\r\n");
      out.write("\t\t\t         <div class=\"flex rounded-md mt-8\">\r\n");
      out.write("\t\t\t             ");
      out.print( request.getAttribute("pageBar") );
      out.write("\r\n");
      out.write("\t\t             </div>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("                <!-- 밑에 여백 -->\r\n");
      out.write("                <div class=\"bottom-of-main\"></div>\r\n");
      out.write("           ");
 } 
      out.write("     \r\n");
      out.write("\r\n");
      out.write("            </main>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- 로그인 모달 -->\r\n");
      out.write("\t<div class=\"hidden main-modal fixed w-full h-100 inset-0 z-50 overflow-hidden flex justify-center items-center animated fadeIn faster\"\r\n");
      out.write("\tstyle=\"background: rgba(0,0,0,.7);\">\r\n");
      out.write("\t<div\r\n");
      out.write("\t    class=\"border border-teal-500 shadow-lg modal-container bg-white w-11/12 md:max-w-md mx-auto rounded shadow-lg z-50 overflow-y-auto\">\r\n");
      out.write("\t    <div class=\"modal-content py-4 text-left px-6\">\r\n");
      out.write("\t        <!--Title-->\r\n");
      out.write("\t        <div class=\"flex justify-between items-center pb-3\">\r\n");
      out.write("\t            <p class=\"text-2xl font-bold\">AD Story 로그인</p>\r\n");
      out.write("\t            <div class=\"modal-close cursor-pointer z-50\">\r\n");
      out.write("\t                <svg class=\"fill-current text-black\" xmlns=\"http://www.w3.org/2000/svg\" width=\"18\" height=\"18\"\r\n");
      out.write("\t                    viewBox=\"0 0 18 18\">\r\n");
      out.write("\t                    <path\r\n");
      out.write("\t                        d=\"M14.53 4.53l-1.06-1.06L9 7.94 4.53 3.47 3.47 4.53 7.94 9l-4.47 4.47 1.06 1.06L9 10.06l4.47 4.47 1.06-1.06L10.06 9z\">\r\n");
      out.write("\t                    </path>\r\n");
      out.write("\t                </svg>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <!--Body-->\r\n");
      out.write("\t        <form action=\"");
      out.print( request.getContextPath() );
      out.write("/member/login\"\r\n");
      out.write("\t                                      method=\"POST\" \r\n");
      out.write("\t                                      id=\"loginFrm\">\r\n");
      out.write("\t                  <div class=\"mb-4\">\r\n");
      out.write("\t                    <label class=\"block text-md font-light mb-2\" for=\"username\">아이디</label>\r\n");
      out.write("\t                    <input class=\"w-full bg-drabya-gray border-gray-500 appearance-none border p-4 font-light leading-tight focus:outline-none focus:shadow-outline\" type=\"text\" name=\"memberId\" id=\"\" placeholder=\"아이디\">\r\n");
      out.write("\t                  </div>\r\n");
      out.write("\t                  <div class=\"mb-4\">\r\n");
      out.write("\t                    <label class=\"block text-md font-light mb-2\" for=\"password\">비밀번호</label>\r\n");
      out.write("\t                    <input class=\"w-full bg-drabya-gray border-gray-500 appearance-none border p-4 font-light leading-tight focus:outline-none focus:shadow-outline\" type=\"password\" name=\"password\" id=\"\" placeholder=\"비밀번호\">\r\n");
      out.write("\t                  </div>\r\n");
      out.write("\t                \r\n");
      out.write("\t                  <div class=\"flex items-center justify-between mb-5\">\r\n");
      out.write("\t                     <a class=\"inline-block align-baseline font-light text-sm text-indigo-600 hover:text-indigo-500\" href=\"#\">\r\n");
      out.write("\t                            비밀번호 찾기\r\n");
      out.write("\t                    </a>\r\n");
      out.write("\t                    <button class=\"bg-indigo-600 hover:bg-blue-700 text-white font-light py-2 px-6 rounded focus:outline-none focus:shadow-outline\" type=\"submit\">\r\n");
      out.write("\t                            로그인\r\n");
      out.write("\t                    </button>\r\n");
      out.write("\t                 \r\n");
      out.write("\t                  </div>\r\n");
      out.write("\t                  <p class=\"text-center text-md font-light\">아이디가 없으신가요? <a href=\"");
      out.print( request.getContextPath() );
      out.write("/member/SelectRole\" class=\"font-light text-md text-indigo-600\">회원가입</a></p>\r\n");
      out.write("\t                </form>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/script.js\"></script>\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/e65a97b364.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
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
}
