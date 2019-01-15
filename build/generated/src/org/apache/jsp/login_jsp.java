package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.User;
import db.Database;
import java.util.List;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <script>\r\n");
      out.write("            var function getUsername(){\r\n");
      out.write("            return document.getElementById(username).value;\r\n");
      out.write("            }\r\n");
      out.write("            var function getPassword(){\r\n");
      out.write("            retrun document.getElementById(password).value;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <center>\r\n");
      out.write("        <form method=\"post\" id=\"loginForm\">\r\n");
      out.write("            <input type=\"text\" id=\"username\"name=\"username\" placeholder=\"username\"required=\"\"/>\r\n");
      out.write("            <br/><br/>\r\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"password\"/>\r\n");
      out.write("            <br/><br/>\r\n");
      out.write("            <input type=\"submit\" value=\"Log In\" name=\"login\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        ");

            if (request.getParameter("login") != null) {

                Database db = new Database();
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                if (password == null) {
                    password = "";
                }
                User user = db.getUser(username, password);
                if (user != null) {
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1>");
      out.print(user.getUsername());
      out.write(" is logined</h1>\r\n");
      out.write("        ");
  } else {
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1>Username or Password wrong please try again</h1>\r\n");
      out.write("        ");
}
            }
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    </center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
