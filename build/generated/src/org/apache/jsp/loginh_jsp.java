package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginh_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"csslink.css\">\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\n");
      out.write("      \n");
      out.write("<div id=\"menu\">\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("<li></li>   \n");
      out.write("<li style=\"font-size:20px;\">Home</li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"loginh.jsp\" style=\"text-decoration:none\">Login</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\"><a href=\"register.jsp\" style=\"text-decoration:none\">Register</a></li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\">About us</li>\n");
      out.write("<li></li>\n");
      out.write("<li style=\"font-size:20px;\">Contact us</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("<div id=\"data1\">\n");
      out.write("<center>\n");
      out.write("<form action=\"login.jsp\">\n");
      out.write("<table cellpadding=\"10\"  cellspacing=\"0\" >\n");
      out.write("<tr>\n");
      out.write("<tr>\n");
      out.write("<td align=center><h3 style=\"color:black;\">Login Page</h3></td><br>\n");
      out.write("</tr>\n");
      out.write("<td><input type=\"text\"  placeholder=\"username\" name=\"un\" class=\"t1\" ><br></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td> <input type=\"password\" placeholder=\"password\" name=\"up\" class=\"t1\"><br></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\"><input type=\"submit\" value=\"login\" id=\"button\" ></td> \n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td align=\"center\"><h6><a href=\"register.jsp\" style=\"color: black;\"> Register your account</a><a href=\"forget.html\" style=\"color: black\">     /forgot password</a></h6></td>\n");
      out.write("<tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
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
