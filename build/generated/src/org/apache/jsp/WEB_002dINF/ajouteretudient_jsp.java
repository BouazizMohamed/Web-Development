package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajouteretudient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("<title>PA2</title>\n");
      out.write("    <style>\n");
      out.write("        /* @extend display-flex; */\n");
      out.write("display-flex, .display-flex, .display-flex-center, .signup-content, .signin-content, .social-login, .socials {\n");
      out.write("  display: flex;\n");
      out.write("  display: -webkit-flex; }\n");
      out.write("\n");
      out.write("/* @extend list-type-ulli; */\n");
      out.write("list-type-ulli, .socials {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0; }\n");
      out.write("\n");
      out.write("/* poppins-300 - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: normal;\n");
      out.write("  font-weight: 300;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-300.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins Light\"), local(\"Poppins-Light\"), url(\"../fonts/poppins/poppins-v5-latin-300.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-300.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-300.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-300.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-300.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-300italic - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: italic;\n");
      out.write("  font-weight: 300;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-300italic.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins Light Italic\"), local(\"Poppins-LightItalic\"), url(\"../fonts/poppins/poppins-v5-latin-300italic.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-300italic.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-300italic.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-300italic.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-300italic.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-regular - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: normal;\n");
      out.write("  font-weight: 400;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-regular.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins Regular\"), local(\"Poppins-Regular\"), url(\"../fonts/poppins/poppins-v5-latin-regular.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-regular.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-regular.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-regular.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-regular.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-italic - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: italic;\n");
      out.write("  font-weight: 400;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-italic.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins Italic\"), local(\"Poppins-Italic\"), url(\"../fonts/poppins/poppins-v5-latin-italic.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-italic.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-italic.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-italic.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-italic.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-500 - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: normal;\n");
      out.write("  font-weight: 500;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-500.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins Medium\"), local(\"Poppins-Medium\"), url(\"../fonts/poppins/poppins-v5-latin-500.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-500.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-500.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-500.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-500.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-500italic - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: italic;\n");
      out.write("  font-weight: 500;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-500italic.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins Medium Italic\"), local(\"Poppins-MediumItalic\"), url(\"../fonts/poppins/poppins-v5-latin-500italic.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-500italic.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-500italic.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-500italic.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-500italic.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-600 - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: normal;\n");
      out.write("  font-weight: 600;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-600.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins SemiBold\"), local(\"Poppins-SemiBold\"), url(\"../fonts/poppins/poppins-v5-latin-600.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-600.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-600.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-600.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-600.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-700 - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: normal;\n");
      out.write("  font-weight: 700;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-700.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins Bold\"), local(\"Poppins-Bold\"), url(\"../fonts/poppins/poppins-v5-latin-700.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-700.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-700.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-700.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-700.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-700italic - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: italic;\n");
      out.write("  font-weight: 700;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-700italic.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins Bold Italic\"), local(\"Poppins-BoldItalic\"), url(\"../fonts/poppins/poppins-v5-latin-700italic.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-700italic.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-700italic.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-700italic.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-700italic.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-800 - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: normal;\n");
      out.write("  font-weight: 800;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-800.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins ExtraBold\"), local(\"Poppins-ExtraBold\"), url(\"../fonts/poppins/poppins-v5-latin-800.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-800.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-800.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-800.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-800.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-800italic - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: italic;\n");
      out.write("  font-weight: 800;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-800italic.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins ExtraBold Italic\"), local(\"Poppins-ExtraBoldItalic\"), url(\"../fonts/poppins/poppins-v5-latin-800italic.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-800italic.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-800italic.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-800italic.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-800italic.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("/* poppins-900 - latin */\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Poppins';\n");
      out.write("  font-style: normal;\n");
      out.write("  font-weight: 900;\n");
      out.write("  src: url(\"../fonts/poppins/poppins-v5-latin-900.eot\");\n");
      out.write("  /* IE9 Compat Modes */\n");
      out.write("  src: local(\"Poppins Black\"), local(\"Poppins-Black\"), url(\"../fonts/poppins/poppins-v5-latin-900.eot?#iefix\") format(\"embedded-opentype\"), url(\"../fonts/poppins/poppins-v5-latin-900.woff2\") format(\"woff2\"), url(\"../fonts/poppins/poppins-v5-latin-900.woff\") format(\"woff\"), url(\"../fonts/poppins/poppins-v5-latin-900.ttf\") format(\"truetype\"), url(\"../fonts/poppins/poppins-v5-latin-900.svg#Poppins\") format(\"svg\");\n");
      out.write("  /* Legacy iOS */ }\n");
      out.write("a:focus, a:active {\n");
      out.write("  text-decoration: none;\n");
      out.write("  outline: none;\n");
      out.write("  transition: all 300ms ease 0s;\n");
      out.write("  -moz-transition: all 300ms ease 0s;\n");
      out.write("  -webkit-transition: all 300ms ease 0s;\n");
      out.write("  -o-transition: all 300ms ease 0s;\n");
      out.write("  -ms-transition: all 300ms ease 0s; }\n");
      out.write("\n");
      out.write("input, select, textarea {\n");
      out.write("  outline: none;\n");
      out.write("  appearance: unset !important;\n");
      out.write("  -moz-appearance: unset !important;\n");
      out.write("  -webkit-appearance: unset !important;\n");
      out.write("  -o-appearance: unset !important;\n");
      out.write("  -ms-appearance: unset !important; }\n");
      out.write("\n");
      out.write("input::-webkit-outer-spin-button, input::-webkit-inner-spin-button {\n");
      out.write("  appearance: none !important;\n");
      out.write("  -moz-appearance: none !important;\n");
      out.write("  -webkit-appearance: none !important;\n");
      out.write("  -o-appearance: none !important;\n");
      out.write("  -ms-appearance: none !important;\n");
      out.write("  margin: 0; }\n");
      out.write("\n");
      out.write("input:focus, select:focus, textarea:focus {\n");
      out.write("  outline: none;\n");
      out.write("  box-shadow: none !important;\n");
      out.write("  -moz-box-shadow: none !important;\n");
      out.write("  -webkit-box-shadow: none !important;\n");
      out.write("  -o-box-shadow: none !important;\n");
      out.write("  -ms-box-shadow: none !important; }\n");
      out.write("\n");
      out.write("input[type=checkbox] {\n");
      out.write("  appearance: checkbox !important;\n");
      out.write("  -moz-appearance: checkbox !important;\n");
      out.write("  -webkit-appearance: checkbox !important;\n");
      out.write("  -o-appearance: checkbox !important;\n");
      out.write("  -ms-appearance: checkbox !important; }\n");
      out.write("\n");
      out.write("input[type=radio] {\n");
      out.write("  appearance: radio !important;\n");
      out.write("  -moz-appearance: radio !important;\n");
      out.write("  -webkit-appearance: radio !important;\n");
      out.write("  -o-appearance: radio !important;\n");
      out.write("  -ms-appearance: radio !important; }\n");
      out.write("\n");
      out.write("img {\n");
      out.write("  max-width: 100%;\n");
      out.write("  height: auto; }\n");
      out.write("\n");
      out.write("figure {\n");
      out.write("  margin: 0; }\n");
      out.write("\n");
      out.write("p {\n");
      out.write("  margin-bottom: 0px;\n");
      out.write("  font-size: 15px;\n");
      out.write("  color: #777; }\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("  line-height: 1.66;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color: #222;\n");
      out.write("  font-family: Poppins;\n");
      out.write("  font-size: 36px; }\n");
      out.write("\n");
      out.write(".main {\n");
      out.write("  background: #f8f8f8;\n");
      out.write("  padding: 50px 0; }\n");
      out.write("\n");
      out.write(".clear {\n");
      out.write("  clear: both; }\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  font-size: 13px;\n");
      out.write("  line-height: 1.8;\n");
      out.write("  color: #222;\n");
      out.write("  background: #f8f8f8;\n");
      out.write("  font-weight: 400;\n");
      out.write("  font-family: Poppins; }\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  width: 900px;\n");
      out.write("  background: #fff;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  box-shadow: 0px 15px 16.83px 0.17px rgba(0, 0, 0, 0.05);\n");
      out.write("  -moz-box-shadow: 0px 15px 16.83px 0.17px rgba(0, 0, 0, 0.05);\n");
      out.write("  -webkit-box-shadow: 0px 15px 16.83px 0.17px rgba(0, 0, 0, 0.05);\n");
      out.write("  -o-box-shadow: 0px 15px 16.83px 0.17px rgba(0, 0, 0, 0.05);\n");
      out.write("  -ms-box-shadow: 0px 15px 16.83px 0.17px rgba(0, 0, 0, 0.05);\n");
      out.write("  border-radius: 20px;\n");
      out.write("  -moz-border-radius: 20px;\n");
      out.write("  -webkit-border-radius: 20px;\n");
      out.write("  -o-border-radius: 20px;\n");
      out.write("  -ms-border-radius: 20px; }\n");
      out.write("\n");
      out.write(".display-flex {\n");
      out.write("  justify-content: space-between;\n");
      out.write("  -moz-justify-content: space-between;\n");
      out.write("  -webkit-justify-content: space-between;\n");
      out.write("  -o-justify-content: space-between;\n");
      out.write("  -ms-justify-content: space-between;\n");
      out.write("  align-items: center;\n");
      out.write("  -moz-align-items: center;\n");
      out.write("  -webkit-align-items: center;\n");
      out.write("  -o-align-items: center;\n");
      out.write("  -ms-align-items: center; }\n");
      out.write("\n");
      out.write(".display-flex-center {\n");
      out.write("  justify-content: center;\n");
      out.write("  -moz-justify-content: center;\n");
      out.write("  -webkit-justify-content: center;\n");
      out.write("  -o-justify-content: center;\n");
      out.write("  -ms-justify-content: center;\n");
      out.write("  align-items: center;\n");
      out.write("  -moz-align-items: center;\n");
      out.write("  -webkit-align-items: center;\n");
      out.write("  -o-align-items: center;\n");
      out.write("  -ms-align-items: center; }\n");
      out.write("\n");
      out.write(".position-center {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  -moz-transform: translate(-50%, -50%);\n");
      out.write("  -webkit-transform: translate(-50%, -50%);\n");
      out.write("  -o-transform: translate(-50%, -50%);\n");
      out.write("  -ms-transform: translate(-50%, -50%); }\n");
      out.write("\n");
      out.write(".signup {\n");
      out.write("  margin-bottom: 50px; }\n");
      out.write("\n");
      out.write(".signup-content {\n");
      out.write("  padding: 75px 0; }\n");
      out.write("\n");
      out.write(".signup-form, .signup-image, .signin-form, .signin-image {\n");
      out.write("  width: 50%;\n");
      out.write("  overflow: hidden; }\n");
      out.write("\n");
      out.write(".signup-image {\n");
      out.write("  margin: 0 55px; }\n");
      out.write("\n");
      out.write(".form-title {\n");
      out.write("  margin-bottom: 33px; }\n");
      out.write("\n");
      out.write(".signup-image {\n");
      out.write("  margin-top: 45px; }\n");
      out.write("\n");
      out.write("figure {\n");
      out.write("  margin-bottom: 50px;\n");
      out.write("  text-align: center; }\n");
      out.write("\n");
      out.write(".form-submit {\n");
      out.write("  display: inline-block;\n");
      out.write("  background: #6dabe4;\n");
      out.write("  color: #fff;\n");
      out.write("  border-bottom: none;\n");
      out.write("  width: auto;\n");
      out.write("  padding: 15px 39px;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  -moz-border-radius: 5px;\n");
      out.write("  -webkit-border-radius: 5px;\n");
      out.write("  -o-border-radius: 5px;\n");
      out.write("  -ms-border-radius: 5px;\n");
      out.write("  margin-top: 25px;\n");
      out.write("  cursor: pointer; }\n");
      out.write("  .form-submit:hover {\n");
      out.write("    background: #4292dc; }\n");
      out.write("\n");
      out.write("#signin {\n");
      out.write("  margin-top: 16px; }\n");
      out.write("\n");
      out.write(".signup-image-link {\n");
      out.write("  font-size: 14px;\n");
      out.write("  color: #222;\n");
      out.write("  display: block;\n");
      out.write("  text-align: center; }\n");
      out.write("\n");
      out.write(".term-service {\n");
      out.write("  font-size: 13px;\n");
      out.write("  color: #222; }\n");
      out.write("\n");
      out.write(".signup-form {\n");
      out.write("  margin-left: 75px;\n");
      out.write("  margin-right: 75px;\n");
      out.write("  padding-left: 34px; }\n");
      out.write("\n");
      out.write(".register-form {\n");
      out.write("  width: 100%; }\n");
      out.write("\n");
      out.write(".form-group {\n");
      out.write("  position: relative;\n");
      out.write("  margin-bottom: 25px;\n");
      out.write("  overflow: hidden; }\n");
      out.write("  .form-group:last-child {\n");
      out.write("    margin-bottom: 0px; }\n");
      out.write("\n");
      out.write("input {\n");
      out.write("  width: 100%;\n");
      out.write("  display: block;\n");
      out.write("  border: none;\n");
      out.write("  border-bottom: 1px solid #999;\n");
      out.write("  padding: 6px 30px;\n");
      out.write("  font-family: Poppins;\n");
      out.write("  box-sizing: border-box; }\n");
      out.write("  input::-webkit-input-placeholder {\n");
      out.write("    color: #999; }\n");
      out.write("  input::-moz-placeholder {\n");
      out.write("    color: #999; }\n");
      out.write("  input:-ms-input-placeholder {\n");
      out.write("    color: #999; }\n");
      out.write("  input:-moz-placeholder {\n");
      out.write("    color: #999; }\n");
      out.write("  input:focus {\n");
      out.write("    border-bottom: 1px solid #222; }\n");
      out.write("    input:focus::-webkit-input-placeholder {\n");
      out.write("      color: #222; }\n");
      out.write("    input:focus::-moz-placeholder {\n");
      out.write("      color: #222; }\n");
      out.write("    input:focus:-ms-input-placeholder {\n");
      out.write("      color: #222; }\n");
      out.write("    input:focus:-moz-placeholder {\n");
      out.write("      color: #222; }\n");
      out.write("\n");
      out.write("input[type=checkbox]:not(old) {\n");
      out.write("  width: 2em;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  font-size: 1em;\n");
      out.write("  display: none; }\n");
      out.write("\n");
      out.write("input[type=checkbox]:not(old) + label {\n");
      out.write("  display: inline-block;\n");
      out.write("  line-height: 1.5em;\n");
      out.write("  margin-top: 6px; }\n");
      out.write("\n");
      out.write("input[type=checkbox]:not(old) + label > span {\n");
      out.write("  display: inline-block;\n");
      out.write("  width: 13px;\n");
      out.write("  height: 13px;\n");
      out.write("  margin-right: 15px;\n");
      out.write("  margin-bottom: 3px;\n");
      out.write("  border: 1px solid #999;\n");
      out.write("  border-radius: 2px;\n");
      out.write("  -moz-border-radius: 2px;\n");
      out.write("  -webkit-border-radius: 2px;\n");
      out.write("  -o-border-radius: 2px;\n");
      out.write("  -ms-border-radius: 2px;\n");
      out.write("  background: white;\n");
      out.write("  background-image: -moz-linear-gradient(white, white);\n");
      out.write("  background-image: -ms-linear-gradient(white, white);\n");
      out.write("  background-image: -o-linear-gradient(white, white);\n");
      out.write("  background-image: -webkit-linear-gradient(white, white);\n");
      out.write("  background-image: linear-gradient(white, white);\n");
      out.write("  vertical-align: bottom; }\n");
      out.write("\n");
      out.write("input[type=checkbox]:not(old):checked + label > span {\n");
      out.write("  background-image: -moz-linear-gradient(white, white);\n");
      out.write("  background-image: -ms-linear-gradient(white, white);\n");
      out.write("  background-image: -o-linear-gradient(white, white);\n");
      out.write("  background-image: -webkit-linear-gradient(white, white);\n");
      out.write("  background-image: linear-gradient(white, white); }\n");
      out.write("\n");
      out.write("input[type=checkbox]:not(old):checked + label > span:before {\n");
      out.write("  content: '\\f26b';\n");
      out.write("  display: block;\n");
      out.write("  color: #222;\n");
      out.write("  font-size: 11px;\n");
      out.write("  line-height: 1.2;\n");
      out.write("  text-align: center;\n");
      out.write("  font-family: 'Material-Design-Iconic-Font';\n");
      out.write("  font-weight: bold; }\n");
      out.write("\n");
      out.write(".agree-term {\n");
      out.write("  display: inline-block;\n");
      out.write("  width: auto; }\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  position: absolute;\n");
      out.write("  left: 0;\n");
      out.write("  top: 50%;\n");
      out.write("  transform: translateY(-50%);\n");
      out.write("  -moz-transform: translateY(-50%);\n");
      out.write("  -webkit-transform: translateY(-50%);\n");
      out.write("  -o-transform: translateY(-50%);\n");
      out.write("  -ms-transform: translateY(-50%);\n");
      out.write("  color: #222; }\n");
      out.write("\n");
      out.write(".label-has-error {\n");
      out.write("  top: 22%; }\n");
      out.write("\n");
      out.write("label.error {\n");
      out.write("  position: relative;\n");
      out.write("  background: url(\"../images/unchecked.gif\") no-repeat;\n");
      out.write("  background-position-y: 3px;\n");
      out.write("  padding-left: 20px;\n");
      out.write("  display: block;\n");
      out.write("  margin-top: 20px; }\n");
      out.write("\n");
      out.write("label.valid {\n");
      out.write("  display: block;\n");
      out.write("  position: absolute;\n");
      out.write("  right: 0;\n");
      out.write("  left: auto;\n");
      out.write("  margin-top: -6px;\n");
      out.write("  width: 20px;\n");
      out.write("  height: 20px;\n");
      out.write("  background: transparent; }\n");
      out.write("  label.valid:after {\n");
      out.write("    font-family: 'Material-Design-Iconic-Font';\n");
      out.write("    content: '\\f269';\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    position: absolute;\n");
      out.write("    /* right: 0; */\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: green; }\n");
      out.write("\n");
      out.write(".label-agree-term {\n");
      out.write("  position: relative;\n");
      out.write("  top: 0%;\n");
      out.write("  transform: translateY(0);\n");
      out.write("  -moz-transform: translateY(0);\n");
      out.write("  -webkit-transform: translateY(0);\n");
      out.write("  -o-transform: translateY(0);\n");
      out.write("  -ms-transform: translateY(0); }\n");
      out.write("\n");
      out.write(".material-icons-name {\n");
      out.write("  font-size: 18px; }\n");
      out.write("\n");
      out.write(".signin-content {\n");
      out.write("  padding-top: 67px;\n");
      out.write("  padding-bottom: 87px; }\n");
      out.write("\n");
      out.write(".social-login {\n");
      out.write("  align-items: center;\n");
      out.write("  -moz-align-items: center;\n");
      out.write("  -webkit-align-items: center;\n");
      out.write("  -o-align-items: center;\n");
      out.write("  -ms-align-items: center;\n");
      out.write("  margin-top: 80px; }\n");
      out.write("\n");
      out.write(".social-label {\n");
      out.write("  display: inline-block;\n");
      out.write("  margin-right: 15px; }\n");
      out.write("\n");
      out.write(".socials li {\n");
      out.write("  padding: 5px; }\n");
      out.write("  .socials li:last-child {\n");
      out.write("    margin-right: 0px; }\n");
      out.write("  .socials li a {\n");
      out.write("    text-decoration: none; }\n");
      out.write("    .socials li a i {\n");
      out.write("      width: 30px;\n");
      out.write("      height: 30px;\n");
      out.write("      color: #fff;\n");
      out.write("      font-size: 14px;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      -moz-border-radius: 5px;\n");
      out.write("      -webkit-border-radius: 5px;\n");
      out.write("      -o-border-radius: 5px;\n");
      out.write("      -ms-border-radius: 5px;\n");
      out.write("      transform: translateZ(0);\n");
      out.write("      -moz-transform: translateZ(0);\n");
      out.write("      -webkit-transform: translateZ(0);\n");
      out.write("      -o-transform: translateZ(0);\n");
      out.write("      -ms-transform: translateZ(0);\n");
      out.write("      -webkit-transition-duration: 0.3s;\n");
      out.write("      transition-duration: 0.3s;\n");
      out.write("      -webkit-transition-property: transform;\n");
      out.write("      transition-property: transform;\n");
      out.write("      -webkit-transition-timing-function: ease-out;\n");
      out.write("      transition-timing-function: ease-out; }\n");
      out.write("  .socials li:hover a i {\n");
      out.write("    -webkit-transform: scale(1.3) translateZ(0);\n");
      out.write("    transform: scale(1.3) translateZ(0); }\n");
      out.write("\n");
      out.write(".zmdi-facebook {\n");
      out.write("  background: #3b5998; }\n");
      out.write("\n");
      out.write(".zmdi-twitter {\n");
      out.write("  background: #1da0f2; }\n");
      out.write("\n");
      out.write(".zmdi-google {\n");
      out.write("  background: #e72734; }\n");
      out.write("\n");
      out.write(".signin-form {\n");
      out.write("  margin-right: 90px;\n");
      out.write("  margin-left: 80px; }\n");
      out.write("\n");
      out.write(".signin-image {\n");
      out.write("  margin-left: 110px;\n");
      out.write("  margin-right: 20px;\n");
      out.write("  margin-top: 10px; }\n");
      out.write("\n");
      out.write("@media screen and (max-width: 1200px) {\n");
      out.write("  .container {\n");
      out.write("    width: calc( 100% - 30px);\n");
      out.write("    max-width: 100%; } }\n");
      out.write("@media screen and (min-width: 1024px) {\n");
      out.write("  .container {\n");
      out.write("    max-width: 1200px; } }\n");
      out.write("@media screen and (max-width: 768px) {\n");
      out.write("  .signup-content, .signin-content {\n");
      out.write("    flex-direction: column;\n");
      out.write("    -moz-flex-direction: column;\n");
      out.write("    -webkit-flex-direction: column;\n");
      out.write("    -o-flex-direction: column;\n");
      out.write("    -ms-flex-direction: column;\n");
      out.write("    justify-content: center;\n");
      out.write("    -moz-justify-content: center;\n");
      out.write("    -webkit-justify-content: center;\n");
      out.write("    -o-justify-content: center;\n");
      out.write("    -ms-justify-content: center; }\n");
      out.write("\n");
      out.write("  .signup-form {\n");
      out.write("    margin-left: 0px;\n");
      out.write("    margin-right: 0px;\n");
      out.write("    padding-left: 0px;\n");
      out.write("    /* box-sizing: border-box; */\n");
      out.write("    padding: 0 30px; }\n");
      out.write("\n");
      out.write("  .signin-image {\n");
      out.write("    margin-left: 0px;\n");
      out.write("    margin-right: 0px;\n");
      out.write("    margin-top: 50px;\n");
      out.write("    order: 2;\n");
      out.write("    -moz-order: 2;\n");
      out.write("    -webkit-order: 2;\n");
      out.write("    -o-order: 2;\n");
      out.write("    -ms-order: 2; }\n");
      out.write("\n");
      out.write("  .signup-form, .signup-image, .signin-form, .signin-image {\n");
      out.write("    width: auto; }\n");
      out.write("\n");
      out.write("  .social-login {\n");
      out.write("    justify-content: center;\n");
      out.write("    -moz-justify-content: center;\n");
      out.write("    -webkit-justify-content: center;\n");
      out.write("    -o-justify-content: center;\n");
      out.write("    -ms-justify-content: center; }\n");
      out.write("\n");
      out.write("  .form-button {\n");
      out.write("    text-align: center; }\n");
      out.write("\n");
      out.write("  .signin-form {\n");
      out.write("    order: 1;\n");
      out.write("    -moz-order: 1;\n");
      out.write("    -webkit-order: 1;\n");
      out.write("    -o-order: 1;\n");
      out.write("    -ms-order: 1;\n");
      out.write("    margin-right: 0px;\n");
      out.write("    margin-left: 0px;\n");
      out.write("    padding: 0 30px; }\n");
      out.write("\n");
      out.write("  .form-title {\n");
      out.write("    text-align: center; } }\n");
      out.write("@media screen and (max-width: 400px) {\n");
      out.write("  .social-login {\n");
      out.write("    flex-direction: column;\n");
      out.write("    -moz-flex-direction: column;\n");
      out.write("    -webkit-flex-direction: column;\n");
      out.write("    -o-flex-direction: column;\n");
      out.write("    -ms-flex-direction: column; }\n");
      out.write("\n");
      out.write("  .social-label {\n");
      out.write("    margin-right: 0px;\n");
      out.write("    margin-bottom: 10px; } }\n");
      out.write("\n");
      out.write("/*# sourceMappingURL=style.css.map */\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<section class=\"signup\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"signup-content\">\n");
      out.write("\t\t\t\t\t<div class=\"signup-form\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"form-title\">AJOUTER ÉTUDIANT</h2>\n");
      out.write("\t\t\t\t\t\t<form method=\"\" action=\"\" class=\"register-form\"\n");
      out.write("\t\t\t\t\t\t\tid=\"register-form\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"name\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"zmdi zmdi-account material-icons-name\"></i></label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"name\" id=\"name\" placeholder=\"Nom\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"name\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"zmdi zmdi-account material-icons-name\"></i></label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"name\" id=\"name\" placeholder=\"Prenom\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"email\"><i class=\"zmdi zmdi-email\"></i></label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"email\" name=\"email\" id=\"email\" placeholder=\"Email\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"email\"><i class=\"zmdi zmdi-email\"></i></label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"email\" name=\"email\" id=\"email\" placeholder=\"Numero de Chambre\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"pass\"><i class=\"zmdi zmdi-lock\"></i></label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"password\" name=\"pass\" id=\"pass\" placeholder=\"Niveau \" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"re-pass\"><i class=\"zmdi zmdi-lock-outline\"></i></label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"re_pass\" id=\"re_pass\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Mot de passe \" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group form-button\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"signup\" id=\"signup\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-submit\" value=\"AJOUTER\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"signup-image\">\n");
      out.write("\t\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"https://images.pexels.com/photos/1157804/pexels-photo-1157804.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1\" alt=\"sing up image\">\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- JS -->\n");
      out.write("\t<script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
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
