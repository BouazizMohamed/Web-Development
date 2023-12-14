package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Reclamation.Reclamation;
import java.util.List;
import java.util.List;
import Reclamation.Reclamationafficher;

public final class ReclamationListe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>lise de réclamations</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("\tintegrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("<style>\n");
      out.write("    /* Appliquer le style de base à l'interrupteur basculant */\n");
      out.write("input[type=\"checkbox\"] {\n");
      out.write("  position: relative;\n");
      out.write("  width: 80px;\n");
      out.write("  height: 40px;\n");
      out.write("  background: brown;\n");
      out.write("  -webkit-appearance: none;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  outline: none;\n");
      out.write("  transition: .4s;\n");
      out.write("  box-shadow: inset 0 0 5px rgba(0, 0, 0, 0.2);\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input:checked[type=\"checkbox\"] {\n");
      out.write("  background:green;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"checkbox\"]::before {\n");
      out.write("  z-index: 2;\n");
      out.write("  position: absolute;\n");
      out.write("  content: \"\";\n");
      out.write("  left: 0;\n");
      out.write("  width: 40px;\n");
      out.write("  height: 40px;\n");
      out.write("  background: #fff;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  transform: scale(1.1);\n");
      out.write("  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);\n");
      out.write("  transition: .4s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input:checked[type=\"checkbox\"]::before {\n");
      out.write("  left: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".toggle {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  position: absolute;\n");
      out.write("  color: #fff;\n");
      out.write("  font-weight: 600;\n");
      out.write("  font-size: 20px;\n");
      out.write("  pointer-events: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".onbtn {\n");
      out.write("  bottom: 1Opx;\n");
      out.write("  left: 15px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".ofbtn {\n");
      out.write("  bottom: 1Opx;\n");
      out.write("  right: 14px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<br>\n");
      out.write("\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<!-- <div class=\"alert alert-success\" *ngIf='message'>{{message}}</div> -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3 class=\"text-center\">Liste de reclamations</h3>\n");
      out.write("\t\t\t<hr>\n");
      out.write("                        <div class=\"container text-left\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("\t\t\t<table class=\"table table-bordered\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>NumChambre</th>\n");
      out.write("\t\t\t\t\t\t<th>Type</th>\n");
      out.write("\t\t\t\t\t\t<th>Commentaire</th>\n");
      out.write("\t\t\t\t\t\t<th>Actions</th>\n");
      out.write("                                                <th>Etat</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t");

                                     List<Reclamationafficher> dataList = (List<Reclamationafficher>) request.getAttribute("dataList");
                                    
                                     int i=0;
                                     int  a;
                                    for (Reclamationafficher v : dataList) {
                                       
                                       i++;
                                           String ch = String.valueOf(i);
                                           request.setAttribute("ch",ch);
                                       
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                                            \n");
      out.write("                                                               <td>");
      out.print( v.getNUMERO_CHAMBRE() );
      out.write("</td>\n");
      out.write("                                                              <td>");
      out.print( v.getTYPE() );
      out.write("</td>\n");
      out.write("                                                               <td>");
      out.print( v.getCOMMENTAIRE() );
      out.write("</td>\n");
      out.write("                                                          \n");
      out.write("                                                                <td><a href=\"\" class=\"button\">Supprimer</a></td>\n");
      out.write("                                                              <td> \n");
      out.write("                                                                  <div class=\"toggleBox\">\n");
      out.write("                                                                <div class=\"toggle\" >\n");
      out.write("                                                                    \n");
      out.write("                                                                      <form id=\"toggle-switch1");
      out.print(ch);
      out.write("\" action=\"Afficher\" method=\"POST\">  \n");
      out.write("                                                                          <input type=\"checkbox\" id=\"toggle-switch1");
      out.print(ch);
      out.write("\" name=\"toggleSwitch");
      out.print(ch);
      out.write("\"  onchange=\"submitForm(");
      out.print(ch);
      out.write(")\" ");
 if ((v.getETAT()).equals("1")) { 
      out.write("checked");
 } 
      out.write(" >\n");
      out.write("                                                                          <label for=\"toggle-switch1");
      out.print(ch);
      out.write("\" class=\"ofbtn\"></label>\n");
      out.write("                                                                      </form>\n");
      out.write("                                                                    \n");
      out.write("                                                                </div>\n");
      out.write("                                                              </div>\n");
      out.write("                                                              </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("              \n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("                                <script>\n");
      out.write("function submitForm(ch){\n");
      out.write("  document.getElementById(\"toggle-switch1\"+ch).submit();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("                                            \n");
      out.write("                                </body>\n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
