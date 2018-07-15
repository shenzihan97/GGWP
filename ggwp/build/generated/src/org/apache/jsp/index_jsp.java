package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import service.GameService;
import java.util.ArrayList;
import domain.Game;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      service.GameService game = null;
      synchronized (session) {
        game = (service.GameService) _jspx_page_context.getAttribute("game", PageContext.SESSION_SCOPE);
        if (game == null){
          game = new service.GameService();
          _jspx_page_context.setAttribute("game", game, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>GGWP</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 String username=(String)session.getAttribute("user");
        if(username!=null) { 
      out.write("\n");
      out.write("        <div>欢迎您，");
      out.print( username );
      out.write("！</div> \n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("        <div>欢迎您，游客，请先登录或注册！<a href=\"regist.jsp\" target=\"_top\" >免费注册</a>\n");
      out.write("        <a href=\"login.jsp\" target=\"_top\" >登录</a></div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        <h1 style=\"text-align:center;font-size: 34px;color:#0000ff\">GGWP游戏介绍网站</h1>\n");
      out.write("    <table width=\"1580\" border=\"6\">\n");
      out.write("        <tr align=\"center\" height=\"30\">\n");
      out.write("            <th style=\"font-size: 28px;color:#ff0033\">热门游戏名</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            for(int i = 0; i < 5; i++){
                String s = String.valueOf(i);
                String[] gamename=new String[5];
                Game g=game.getById(s);
        
      out.write("\n");
      out.write("        <tr align=\"center\" height=\"50\">\n");
      out.write("            <td style=\"font-size: 20px;\"><a href=\"subindex.jsp?id=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print( g.getName() );
      out.write("</a></td>\n");
      out.write("        </tr>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </table>\n");
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
