package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p align=\"right\">\n");
      out.write("            ");
 
                String name=(String)session.getAttribute("N");
                out.println("Welcome "+name);
            
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <a href=\"login.jsp\">Logout</a>\n");
      out.write("        </p>\n");
      out.write("        <table width=\"100%\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"220px\">\n");
      out.write("                    <img src=\"pictures/logo.jpg\" height=\"180px\" width=\"220px\" style=\"border-radius: 25px;\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <p align=\"center\"><font size=\"10\">Roaming Beats Merchandise Sale</font></p>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <table width=\"100%\">\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\">\n");
      out.write("                    <a href=\"mens.jsp\" title=\"Men's Wear\">\n");
      out.write("                        <img src=\"pictures/mens.jpg\" height=\"200\" width=\"200\">\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("                <td align=\"center\" title=\"Women's Wear\">\n");
      out.write("                    <a href=\"womens.jsp\">\n");
      out.write("                        <img src=\"pictures/womens.jpg\" height=\"200\" width=\"200\">\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("                <td align=\"center\" title=\"Hoodies\">\n");
      out.write("                    <a href=\"hoodie.jsp\">\n");
      out.write("                        <img src=\"pictures/hoodie.jpg\" height=\"200\" width=\"200\">\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("                <td align=\"center\" title=\"Caps\">\n");
      out.write("                    <a href=\"caps.jsp\">\n");
      out.write("                        <img src=\"pictures/caps.jpg\" height=\"200\" width=\"200\">\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\">\n");
      out.write("                    Men's Wear\n");
      out.write("                </td>\n");
      out.write("                <td align=\"center\">\n");
      out.write("                    Women's Wear\n");
      out.write("                </td>\n");
      out.write("                <td align=\"center\">\n");
      out.write("                    Hoodies\n");
      out.write("                </td>\n");
      out.write("                <td align=\"center\">\n");
      out.write("                    Caps\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
