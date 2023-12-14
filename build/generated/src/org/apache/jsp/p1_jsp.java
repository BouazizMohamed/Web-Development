package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>P1</title>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<style>\n");
      out.write("*{\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("html{\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-size: 62.5%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-color: whitesmoke;\n");
      out.write("  font-family: \"Poppins\", sans-serif;\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: center;\n");
      out.write("  align-items: center;\n");
      out.write("  min-height: 100vh;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".grid {\n");
      out.write("  display: grid;\n");
      out.write("  width: 114em;\n");
      out.write("  grid-gap: 6rem;\n");
      out.write("  grid-template-columns: repeat(auto-fit, minmax(30rem, 1fr));\n");
      out.write("  align-items: start;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".grid-item {\n");
      out.write("  background-color: #fff;\n");
      out.write("  border-radius: 0.4rem;\n");
      out.write("  overflow: hidden;\n");
      out.write("  height: 600px;\n");
      out.write("  box-shadow: 0 3rem 6rem rgba(0, 0, 0, 0.1);\n");
      out.write("  cursor: pointer;\n");
      out.write("  transition: 0.2s;\n");
      out.write("}\n");
      out.write(".grid-item1 {\n");
      out.write("    background-color: #fff;\n");
      out.write("    border-radius: 0.4rem;\n");
      out.write("    overflow: hidden;\n");
      out.write("    height: 500px;\n");
      out.write("    box-shadow: 0 3rem 6rem rgba(0, 0, 0, 0.1);\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: 0.2s;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("\n");
      out.write(".grid-item:hover {\n");
      out.write("  transform: translateY(-0.5%);\n");
      out.write("  box-shadow: 0 4rem 8rem rgba(0, 0, 0, 0.5);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-img {\n");
      out.write("  display: block;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 20rem;\n");
      out.write("  object-fit: cover;\n");
      out.write("  height: 300px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-content {\n");
      out.write("  padding: 3rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-header {\n");
      out.write("  font-size: 3rem;\n");
      out.write("  font-weight: 500;\n");
      out.write("  color: #0d0d0d;\n");
      out.write("  margin-bottom: 1.5rem;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-text {\n");
      out.write("  font-size: 1.6rem;\n");
      out.write("  letter-spacing: 0.1rem;\n");
      out.write("  line-height: 1.7;\n");
      out.write("  color: #3d3d3d;\n");
      out.write("  margin-bottom: 2.5rem;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-btn {\n");
      out.write("  display: block;\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 1.5rem;\n");
      out.write("  font-size: 2rem;\n");
      out.write("  text-align: center;\n");
      out.write("  color: #3363ff;\n");
      out.write("  background-color: #d8e0fd;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 0.4rem;\n");
      out.write("  transition: 0.2s;\n");
      out.write("  cursor: pointer;\n");
      out.write("  letter-spacing: 0.1rem;\n");
      out.write("  padding-right: 0;\n");
      out.write("  padding-left: 0;\n");
      out.write("  text-decoration-line: none;\n");
      out.write("  margin-top: 40px;\n");
      out.write("\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-btn span {\n");
      out.write("  margin-left: 1rem;\n");
      out.write("  transition: 0.2s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-btn:hover,\n");
      out.write(".card-btn:active {\n");
      out.write("  background-color: #c2cffc;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-btn:hover span,\n");
      out.write(".card-btn:active span {\n");
      out.write("  margin-left: 1.5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media only screen and (max-width: 60em) {\n");
      out.write("  body {\n");
      out.write("    padding: 3rem;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .grid {\n");
      out.write("    grid-gap: 3rem;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"grid\">\n");
      out.write("      <div class=\"grid-item1\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"card-img\" src=\"https://images.prismic.io/onatera-shop-intl-prod/153d3322-71a7-48c6-bc59-0c6cbf6f8feb_5-soutiens-naturels-a-la-reussite-de-vos-examens-et-concours.jpg?auto=compress%2Cformat&amp%3Brect=0%2C0%2C784%2C526&amp%3Bw=392&amp%3Bh=263&fbclid=IwAR0Tp10PiDMYy9pi2GnEy50d-WDsxmVPwMKELiYX2oIYKNtZbS5JxZv7zVc\"  />\n");
      out.write("          <div class=\"card-content\">\n");
      out.write("            <h1 class=\"card-header\">ESPACE ETUDIANT </h1>\n");
      out.write("            \n");
      out.write("            <a href=\"login.jsp\" class=\"card-btn\"> CONTINUER <span>&rarr;</span></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"grid-item1\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img\n");
      out.write("            class=\"card-img\"\n");
      out.write("            src=\"https://images.unsplash.com/photo-1497633762265-9d179a990aa6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1173&q=80\" />\n");
      out.write("          <div class=\"card-content\">\n");
      out.write("            <h1 class=\"card-header\">ESPACE ADMINISTRATION</h1>\n");
      out.write("            \n");
      out.write("            <a href=\"espaceadmin.jsp\" class=\"card-btn\">CONTINUER <span>&rarr;</span></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
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
