package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import DTO.OrderMangeDTO;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!-- Boxicons -->\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("        <!-- My CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("        <title>AdminHub</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- SIDEBAR -->\n");
      out.write("        <section id=\"sidebar\">\n");
      out.write("            <a href=\"#\" class=\"brand\">\n");
      out.write("                <i class='bx bxs-smile'></i>\n");
      out.write("                <span class=\"text\">AdminHub</span>\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"side-menu top\">\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a href=\"admin.jsp\">\n");
      out.write("                        <i class='bx bxs-dashboard' ></i>\n");
      out.write("                        <span class=\"text\">Order</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
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
      out.write("                    <a href=\"mangeCate?page=categories\">\n");
      out.write("                        <i class='bx bxs-message-dots' ></i>\n");
      out.write("                        <span class=\"text\">Categories</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"side-menu\">\n");
      out.write("\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"dispatch?btAction=Signout\" class=\"logout\">\n");
      out.write("                        <i class='bx bxs-log-out-circle' ></i>\n");
      out.write("                        <span class=\"text\">Logout</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write("        <!-- SIDEBAR -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- CONTENT -->\n");
      out.write("        <section id=\"content\">\n");
      out.write("            <!-- NAVBAR -->\n");
      out.write("            <nav>\n");
      out.write("                <i class='bx bx-menu' ></i>\n");
      out.write("                <a href=\"#\" class=\"nav-link\">Categories</a>\n");
      out.write("                <form action=\"#\">\n");
      out.write("                    <div class=\"form-input\">\n");
      out.write("                        <input type=\"search\" placeholder=\"Search...\">\n");
      out.write("                        <button type=\"submit\" class=\"search-btn\"><i class='bx bx-search' ></i></button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <input type=\"checkbox\" id=\"switch-mode\" hidden>\n");
      out.write("                <label for=\"switch-mode\" class=\"switch-mode\"></label>\n");
      out.write("                <a href=\"#\" class=\"notification\">\n");
      out.write("                    <i class='bx bxs-bell' ></i>\n");
      out.write("                    <span class=\"num\">8</span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"profile\">\n");
      out.write("                    <img src=\"img/people.png\">\n");
      out.write("                </a>\n");
      out.write("            </nav>\n");
      out.write("            <!-- NAVBAR -->\n");
      out.write("\n");
      out.write("            <!-- MAIN -->\n");
      out.write("            <main>\n");
      out.write("                <div class=\"head-title\">\n");
      out.write("                    <div class=\"left\">\n");
      out.write("                        <h1>Order</h1>\n");
      out.write("                        <ul class=\"breadcrumb\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"admin.jsp\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><i class='bx bx-chevron-right' ></i></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"active\" href=\"admin.jsp\">Order</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"table-data\">\n");
      out.write("                    <div class=\"order\">\n");
      out.write("                        <div class=\"head\">\n");
      out.write("                            <h3>Orders</h3>\n");
      out.write("                            <i class='bx bx-search' ></i>\n");
      out.write("                            <i class='bx bx-filter' ></i>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 ArrayList<OrderMangeDTO> OM = (ArrayList<OrderMangeDTO>) session.getAttribute("ordermange");
                            if (OM != null) {
                        
      out.write("\n");
      out.write("                        <table>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>User</th>\n");
      out.write("                                    <th>Date Order</th>\n");
      out.write("                                    <th>Ship Date</th>\n");
      out.write("                                    <th>Order ID</th>\n");
      out.write("                                    <th>Status</th>\n");
      out.write("                                    <th>Update</th>\n");
      out.write("                                    <th>Delete</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    for (OrderMangeDTO mange : OM) {
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <img src=\"img/people.png\">\n");
      out.write("                                        <p>");
      out.print( mange.getEmail());
      out.write("</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>");
      out.print( mange.getOrdDate());
      out.write("</td>\n");
      out.write("                                    <td> <input type=\"text\" name=\"txtshipdate\" value=\" ");
      out.print( mange.getShipDate());
      out.write("\" /></td>\n");
      out.write("                                    <td>");
      out.print( mange.getOrderID());
      out.write("</td>\n");
      out.write("                                    ");
if (mange.getStatus() == 1) { 
      out.write("\n");
      out.write("                                    <td><span class=\"status completed\">Completed</span></td>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    ");
if (mange.getStatus() == 2) { 
      out.write("\n");
      out.write("                                    <td><span class=\"status process\">Process</span></td>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    ");
if (mange.getStatus() == 3) { 
      out.write("\n");
      out.write("                                    <td><span class=\"status pending\">Canceled</span></td>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    \n");
      out.write("                            <form action=\"dispatch\">\n");
      out.write("                                <td> <input type=\"submit\" value=\"UpdateOrder\" name=\"btAcion\" />\n");
      out.write("                                    <input type=\"hidden\" name=\"txtUpdateOrder\" value=\"");
      out.print( mange.getOrderID() );
      out.write("\" />\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                                <td>     <input type=\"submit\" value=\"DeleteOrder\" name=\"btAcion\" />\n");
      out.write("                                         <input type=\"hidden\" name=\"txtUpdateOrder\" value=\"");
      out.print( mange.getOrderID() );
      out.write("\"\n");
      out.write("                            </td>\n");
      out.write("                            </form>\n");
      out.write("                           \n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                        }
                                    }
                                
      out.write("\n");
      out.write("                                <!--                                <tr>\n");
      out.write("                                                                    <td>\n");
      out.write("                                                                        <img src=\"img/people.png\">\n");
      out.write("                                                                        <p>John Doe</p>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td>01-10-2021</td>\n");
      out.write("                                                                    <td>01-10-2021</td>\n");
      out.write("                                                                    <td><span class=\"status pending\">Canceled</span></td>\n");
      out.write("                                                                </tr>\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <td>\n");
      out.write("                                                                        <img src=\"img/people.png\">\n");
      out.write("                                                                        <p>John Doe</p>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td>01-10-2021</td>\n");
      out.write("                                                                    <td>01-10-2021</td>\n");
      out.write("                                                                    <td><span class=\"status process\">Process</span></td>\n");
      out.write("                                                                </tr>\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <td>\n");
      out.write("                                                                        <img src=\"img/people.png\">\n");
      out.write("                                                                        <p>John Doe</p>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td>01-10-2021</td>\n");
      out.write("                                                                    <td>01-10-2021</td>\n");
      out.write("                                                                    <td><span class=\"status pending\">Pending</span></td>\n");
      out.write("                                                                </tr>\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <td>\n");
      out.write("                                                                        <img src=\"img/people.png\">\n");
      out.write("                                                                        <p>John Doe</p>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td>01-10-2021</td>\n");
      out.write("                                                                    <td>01-10-2021</td>\n");
      out.write("                                                                    <td><span class=\"status completed\">Completed</span></td>\n");
      out.write("                                                                </tr>-->\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("            <!-- MAIN -->\n");
      out.write("        </section>\n");
      out.write("        <!-- CONTENT -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"script.js\"></script>\n");
      out.write("    </body>\n");
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
