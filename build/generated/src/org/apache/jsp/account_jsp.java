package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import DTO.AccountDTO;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("\t<!-- Boxicons -->\n");
      out.write("\t<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("\t<!-- My CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("\t<title>AdminHub</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- SIDEBAR -->\n");
      out.write("\t<section id=\"sidebar\">\n");
      out.write("\t\t<a href=\"#\" class=\"brand\">\n");
      out.write("\t\t\t<i class='bx bxs-smile'></i>\n");
      out.write("\t\t\t<span class=\"text\">AdminHub</span>\n");
      out.write("\t\t</a>\n");
      out.write("\t\t<ul class=\"side-menu top\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"admin.jsp\">\n");
      out.write("                        <i class='bx bxs-dashboard' ></i>\n");
      out.write("                        <span class=\"text\">Order</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a href=\"mangeAcc?page=account\">\n");
      out.write("                        <i class='bx bxs-shopping-bag-alt' ></i>\n");
      out.write("                        <span class=\"text\">Account</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"dispatch?btAction=Mange&page=plant\">\n");
      out.write("                        <i class='bx bxs-doughnut-chart' ></i>\n");
      out.write("                        <span class=\"text\">Plant</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"categories.jsp?btAction=categories\">\n");
      out.write("                        <i class='bx bxs-message-dots' ></i>\n");
      out.write("                        <span class=\"text\">Categories</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\t\t<ul class=\"side-menu\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<a href=\"dispatch?btAction=Signout\" class=\"logout\">\n");
      out.write("\t\t\t\t\t<i class='bx bxs-log-out-circle' ></i>\n");
      out.write("\t\t\t\t\t<span class=\"text\">Logout</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- SIDEBAR -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- CONTENT -->\n");
      out.write("\t<section id=\"content\">\n");
      out.write("\t\t<!-- NAVBAR -->\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<i class='bx bx-menu' ></i>\n");
      out.write("\t\t\t<a href=\"#\" class=\"nav-link\">Categories</a>\n");
      out.write("\t\t\t<form action=\"#\">\n");
      out.write("\t\t\t\t<div class=\"form-input\">\n");
      out.write("\t\t\t\t\t<input type=\"search\" placeholder=\"Search...\">\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"search-btn\"><i class='bx bx-search' ></i></button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"switch-mode\" hidden>\n");
      out.write("\t\t\t<label for=\"switch-mode\" class=\"switch-mode\"></label>\n");
      out.write("\t\t\t<a href=\"#\" class=\"notification\">\n");
      out.write("\t\t\t\t<i class='bx bxs-bell' ></i>\n");
      out.write("\t\t\t\t<span class=\"num\">8</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"profile\">\n");
      out.write("\t\t\t\t<img src=\"img/people.png\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</nav>\n");
      out.write("\t\t<!-- NAVBAR -->\n");
      out.write("\n");
      out.write("\t\t<!-- MAIN -->\n");
      out.write("\t\t<main>\n");
      out.write("\t\t\t<div class=\"head-title\">\n");
      out.write("\t\t\t\t<div class=\"left\">\n");
      out.write("\t\t\t\t\t<h1>Account</h1>\n");
      out.write("\t\t\t\t\t<ul class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"admin.jsp\">Home</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><i class='bx bx-chevron-right' ></i></li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"active\" href=\"account.jsp\">Account</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"table-data\">\n");
      out.write("\t\t\t\t<div class=\"order\">\n");
      out.write("\t\t\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t\t\t<h3>Account</h3>\n");
      out.write("\t\t\t\t\t\t<i class='bx bx-search' ></i>\n");
      out.write("\t\t\t\t\t\t<i class='bx bx-filter' ></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        ");
 ArrayList<AccountDTO> AC = (ArrayList<AccountDTO>) session.getAttribute("account");
                            if (AC != null) {
                        
      out.write("\n");
      out.write("                        <table>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>ACC ID</th>\n");
      out.write("                                    <th>Email</th>\n");
      out.write("                                    <th>Password</th>\n");
      out.write("                                    <th>FullName</th>\n");
      out.write("                                    <th>Phone</th>\n");
      out.write("                                    <th>Status</th>\n");
      out.write("                                    <th>Role</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    for (AccountDTO mange : AC) {
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <img src=\"img/people.png\">\n");
      out.write("                                        <p>");
      out.print( mange.getAccID());
      out.write("</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>");
      out.print( mange.getEmail() );
      out.write("</td>\n");
      out.write("                                    <td>  ");
      out.print( mange.getPassword() );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( mange.getFullnameString() );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( mange.getPhone() );
      out.write("</td>\n");
      out.write("                                    ");
if (mange.getStatus() == 1) { 
      out.write("\n");
      out.write("                                    <td><span class=\"status completed\">Open</span></td>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    ");
if (mange.getStatus() == 0) { 
      out.write("\n");
      out.write("                                    <td><span class=\"status process\">Block</span></td>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    ");
if (mange.getRole() == 1) { 
      out.write("\n");
      out.write("                                    <td><span class=\"status completed\">Admin</span></td>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    ");
if (mange.getRole() == 0) { 
      out.write("\n");
      out.write("                                    <td><span class=\"status process\">User</span></td>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                        }
                                    }
                                
      out.write("\n");
      out.write("\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</main>\n");
      out.write("\t\t<!-- MAIN -->\n");
      out.write("\t</section>\n");
      out.write("\t<!-- CONTENT -->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<script src=\"script.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
