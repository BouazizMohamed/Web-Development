package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class awelpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\" \"http://www.w3.org/TR/REC-html40/loose.dtd\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--Code by Divinector (www.divinectorweb.com)-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>How to Create responsive Homepage</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;700;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tfont-family: 'Poppins', sans-serif;\n");
      out.write("}\n");
      out.write(".wrapper {\n");
      out.write("\twidth: 1170px;\n");
      out.write("\tmargin: auto;\n");
      out.write("}\n");
      out.write("header {\n");
      out.write("\tbackground: linear-gradient(rgba(0, 0, 0, 0.8), rgba(0, 0, 0, 0.8)), url(ept.jpg);\n");
      out.write("\theight: 100vh;\n");
      out.write("\t-webkit-background-size: cover;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-position: center center;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write(".nav-area {\n");
      out.write("\tfloat: right;\n");
      out.write("\tlist-style: none;\n");
      out.write("\tmargin-top: 30px;\n");
      out.write("}\n");
      out.write(".nav-area li {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("}\n");
      out.write(".nav-area li a {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tpadding: 5px 20px;\n");
      out.write("\tfont-family: poppins;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("}\n");
      out.write(".nav-area li a:hover {\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tcolor: #333;\n");
      out.write("}\n");
      out.write(".logo {\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write(".logo img {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tpadding: 15px 0;\n");
      out.write("}\n");
      out.write(".welcome-text {\n");
      out.write("\tposition: absolute;\n");
      out.write("\twidth: 600px;\n");
      out.write("\theight: 300px;\n");
      out.write("\tmargin: 20% 30%;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write(".welcome-text h1 {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tfont-size: 60px;\n");
      out.write("}\n");
      out.write(".welcome-text h1 span {\n");
      out.write("\tcolor: #009bac;\n");
      out.write("}\n");
      out.write(".welcome-text a {\n");
      out.write("\tborder: 1px solid #fff;\n");
      out.write("\tpadding: 10px 25px;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tmargin-top: 20px;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write(".welcome-text a:hover {\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tcolor: #333;\n");
      out.write("}\n");
      out.write("/*resposive*/\n");
      out.write("\n");
      out.write("@media (max-width:600px) {\n");
      out.write("\t.wrapper {\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t}\n");
      out.write("\t.logo {\n");
      out.write("\t\tfloat: none;\n");
      out.write("\t\twidth: 50%;\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.nav-area {\n");
      out.write("\t\tfloat: none;\n");
      out.write("\t\tmargin-top: 0;\n");
      out.write("\t}\n");
      out.write("\t.nav-area li a {\n");
      out.write("\t\tpadding: 5px;\n");
      out.write("\t\tfont-size: 11px;\n");
      out.write("\t}\n");
      out.write("\t.nav-area {\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("\t.welcome-text {\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\theight: auto;\n");
      out.write("\t\tmargin: 30% 0;\n");
      out.write("\t}\n");
      out.write("\t.welcome-text h1 {\n");
      out.write("\t\tfont-size: 30px;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("    \n");
      out.write("<div class=\"welcome-text\">\n");
      out.write("        <h1>\n");
      out.write("Welcome to <span>EPT RECLAMATION</span></h1>\n");
      out.write("<a href=\"p1.jsp\">Se Connecter</a>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("</body>\n");
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
