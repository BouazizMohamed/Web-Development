package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.List;

public final class p1adminstration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("     <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>PA1</title>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("        @import url(\"https://fonts.googleapis.com/css?family=Poppins&display=swap\");\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("html {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-size: 62.5%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-color: white;\n");
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
      out.write("  margin-top: 70px;\n");
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
      out.write("    height: 300px;\n");
      out.write("    box-shadow: 0 3rem 6rem rgba(0, 0, 0, 0.1);\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: 0.2s;\n");
      out.write("    margin-bottom: 20px;\n");
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
      out.write("  color: white;\n");
      out.write("  background-color: gray;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 0.4rem;\n");
      out.write("  transition: 0.2s;\n");
      out.write("  cursor: pointer;\n");
      out.write("  letter-spacing: 0.1rem;\n");
      out.write("  padding-right: 0;\n");
      out.write("  padding-left: 0;\n");
      out.write("  text-decoration-line: none;\n");
      out.write("  margin-top: 50px\n");
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
      out.write("  background-color: gray;\n");
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
      out.write("\n");
      out.write(".nav {\n");
      out.write("    height: 50px;\n");
      out.write("    width: 100%;\n");
      out.write("      background-color: grey;\n");
      out.write("    box-shadow: 0 .8rem .8rem #0005;\n");
      out.write("    height: 55px;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: row;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    position: fixed;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("    margin-bottom: 100px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .nav > .nav-header {\n");
      out.write("    display: inline;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .nav > .nav-header > .nav-title {\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 22px;\n");
      out.write("    color: white;\n");
      out.write("    font-weight: 550;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("    padding: 15px 10px 10px 10px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .nav > .nav-btn {\n");
      out.write("    display: none;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .nav > .nav-links {\n");
      out.write("    display: inline;\n");
      out.write("    float: right;\n");
      out.write("    font-size: 18px;\n");
      out.write("  }\n");
      out.write("  .nav > .nav-links > ul li a{\n");
      out.write("    display: block;\n");
      out.write("    padding: 0 8px;\n");
      out.write("    color:white;\n");
      out.write("    font-weight: 550;\n");
      out.write("    line-height: 40px;\n");
      out.write("    font-size: 18px;\n");
      out.write("    text-decoration: none;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  .nav > .nav-links > ul{\n");
      out.write("    padding: 0;\n");
      out.write("    margin-top: 5px;\n");
      out.write("    list-style: none;\n");
      out.write("    position: relative;\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("  .nav > .nav-links > ul li{\n");
      out.write("    display: inline-block;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  }\n");
      out.write("  .nav > .nav-links > ul li:hover{\n");
      out.write("      background-color: grey;\n");
      out.write("      border-radius: 5px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .nav > #nav-check {\n");
      out.write("    display: none;\n");
      out.write("  }\n");
      out.write("\n");
      out.write(" .nav .nav-links ul a.icon{\n");
      out.write(" margin-left: 80px;\n");
      out.write(" margin-right: 10px;\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" .nav .nav-links ul a i{\n");
      out.write("    background-color: #fff;\n");
      out.write("    border-radius: 50px;\n");
      out.write("    padding: 7px;\n");
      out.write("    margin-left: 5px;\n");
      out.write(" }\n");
      out.write("\n");
      out.write("  \n");
      out.write("  @media (max-width:750px) {\n");
      out.write("    .nav > .nav-btn {\n");
      out.write("      display: inline-block;\n");
      out.write("      position: absolute;\n");
      out.write("      right: 0px;\n");
      out.write("      top: 0px;\n");
      out.write("    }\n");
      out.write("    .nav > .nav-btn > label {\n");
      out.write("      display: inline-block;\n");
      out.write("      width: 50px;\n");
      out.write("      height: 50px;\n");
      out.write("      padding: 13px;\n");
      out.write("    }\n");
      out.write("    .nav > .nav-btn > label:hover,.nav  #nav-check:checked ~ .nav-btn > label {\n");
      out.write("      background-color: rgba(0, 0, 0, 0.3);\n");
      out.write("    }\n");
      out.write("    .nav > .nav-btn > label > span {\n");
      out.write("      display: block;\n");
      out.write("      width: 25px;\n");
      out.write("      height: 10px;\n");
      out.write("      border-top: 2px solid #eee;\n");
      out.write("    }\n");
      out.write("    .nav > .nav-links {\n");
      out.write("      position: absolute;\n");
      out.write("      display: block;\n");
      out.write("      width: 100%;\n");
      out.write("      background-color: #333;\n");
      out.write("      height: 0px;\n");
      out.write("      transition: all 0.3s ease-in;\n");
      out.write("      overflow-y: hidden;\n");
      out.write("      top: 50px;\n");
      out.write("      left: 0px;\n");
      out.write("    }\n");
      out.write("    .nav > .nav-links > ul li a {\n");
      out.write("      display: block;\n");
      out.write("      width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /*   */\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("      .nav > .nav-links > ul li{\n");
      out.write("        display: block;\n");
      out.write("        margin-bottom:15px;\n");
      out.write("        padding: 0;\n");
      out.write("        background-color: #333;\n");
      out.write("         \n");
      out.write("      }\n");
      out.write("      .nav > .nav-links > ul li a{\n");
      out.write("          margin-left: 40%;\n");
      out.write("      }\n");
      out.write("      .nav .nav-links ul a.icon{\n");
      out.write("        margin-left: 33%;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("    /*   */\n");
      out.write("    .nav > #nav-check:not(:checked) ~ .nav-links {\n");
      out.write("      height: 0px;\n");
      out.write("    }\n");
      out.write("    .nav > #nav-check:checked ~ .nav-links {\n");
      out.write("      height: calc(100vh - 50px);\n");
      out.write("      overflow-y: auto;\n");
      out.write("    } \n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write(" \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("      <div class=\"nav\">\n");
      out.write("        <input type=\"checkbox\" id=\"nav-check\">\n");
      out.write("        <div class=\"nav-header\">\n");
      out.write("          <div class=\"nav-title\">\n");
      out.write("            EPT Reclamations\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"nav-btn\">\n");
      out.write("          <label for=\"nav-check\">\n");
      out.write("            <span></span>\n");
      out.write("            <span></span>\n");
      out.write("            <span></span>\n");
      out.write("          </label>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"nav-links\">\n");
      out.write("            <ul class=\"\">\n");
      out.write("                <li><a href=\"p1adminstration.jsp\" >Accueil</a></li>\n");
      out.write("          <li><a href=\"ajouter\" >Ajouter Etudiants</a></li>\n");
      out.write("          <li><a href=\"supprimer\" >Supprimer Etudiants</a></li>\n");
      out.write("          <li><a href=\"Afficher\" >Afficher Reclamations</a></li>\n");
      out.write("          <li><a href=\"demande\" >Changer Chambre</a></li>\n");
      out.write("          <li><a href=\"p1.jsp\" >Se deconnecter</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <div class=\"grid\">\n");
      out.write("      <div class=\"grid-item1\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          \n");
      out.write("          <div class=\"card-content\">\n");
      out.write("            <h1 class=\"card-header\">AJOUTER  ÉTUDIANTS</h1>\n");
      out.write("            <p class=\"card-text\">\n");
      out.write("              \n");
      out.write("            </p>\n");
      out.write("            <a href=\"ajouter\" class=\"card-btn\"> CONTINUER <span>&rarr;</span></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"grid-item1\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          \n");
      out.write("          <div class=\"card-content\">\n");
      out.write("            <h1 class=\"card-header\">SUPPRIMER ÉTUDIANTS</h1>\n");
      out.write("            <p class=\"card-text\">\n");
      out.write("              \n");
      out.write("              \n");
      out.write("            </p>\n");
      out.write("            <a href=\"supprimer\" class=\"card-btn\"> \n");
      out.write("              CONTINUER\n");
      out.write("              <span>&rarr;</span></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"grid-item1\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          \n");
      out.write("          <div class=\"card-content\">\n");
      out.write("            <h1 class=\"card-header\">AFFICHER RÉCLAMATIONS</h1>\n");
      out.write("            <p class=\"card-text\">\n");
      out.write("              \n");
      out.write("\n");
      out.write("            </p>\n");
      out.write("            <a href=\"Afficher\" class=\"card-btn\" >CONTINUER<span>&rarr;</span></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"grid-item1\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          \n");
      out.write("          <div class=\"card-content\">\n");
      out.write("            <h1 class=\"card-header\">CHANGER CHAMBRE</h1>\n");
      out.write("            <p class=\"card-text\">\n");
      out.write("              \n");
      out.write("\n");
      out.write("            </p>\n");
      out.write("            <a href=\"demande\" class=\"card-btn\" >CONTINUER<span>&rarr;</span></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
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
