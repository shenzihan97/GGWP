package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class regist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>注册</title>\n");
      out.write(" \n");
      out.write("</head>\n");
      out.write(" ");
      bean.dbBean db = null;
      synchronized (session) {
        db = (bean.dbBean) _jspx_page_context.getAttribute("db", PageContext.SESSION_SCOPE);
        if (db == null){
          db = new bean.dbBean();
          _jspx_page_context.setAttribute("db", db, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write(' ');
     request.setCharacterEncoding("UTF-8");
        String user=request.getParameter("user");
        String password=request.getParameter("password");
     if(request.getParameter("user")==null||request.getParameter("password")==null)
      
    {
      out.write("\n");
      out.write("    \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        body,td,th {\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("<h1>&nbsp;</h1>\n");
      out.write("<h1 align=\"center\"><strong><em>注册</em></strong></h1>\n");
      out.write("<form id=\"form2\" name=\"form2\" method=\"post\" action=\"Regist.jsp\">\n");
      out.write(" <p align=\"center\">\n");
      out.write("    <label for=\"textfield\"><strong><em><br>\n");
      out.write("    </em></strong>Username:</label>\n");
      out.write("    <input type=\"text\" name=\"name\" id=\"textfield\">\n");
      out.write("  </p>\n");
      out.write("  <p align=\"center\">\n");
      out.write("    <label for=\"password3\">Password:</label>\n");
      out.write("    <input type=\"password\" name=\"password\" id=\"password3\">\n");
      out.write("  </p>\n");
      out.write("  <p align=\"center\">\n");
      out.write("    <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Submit\">\n");
      out.write("  </p>\n");
      out.write("</form>\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("<p>\n");
      out.write("  <label for=\"textfield2\"> </label>\n");
      out.write("</p>\n");
      out.write("<blockquote>\n");
      out.write("  <blockquote>\n");
      out.write("    <h1>&nbsp;</h1>\n");
      out.write("  </blockquote>\n");
      out.write("     \n");
      out.write("</blockquote>\n");
      out.write(" ");
 }
    else{
         
         String sql="insert into user values('"+user+"','"+password+"')";
         db.executeUpd(sql); 
        

      out.write("   \n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward("login.jsp");
        return;
      }
      out.write(" \n");
      out.write("             ");
}
      out.write('\n');
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
