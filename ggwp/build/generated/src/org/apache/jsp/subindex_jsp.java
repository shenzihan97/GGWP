package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import service.CommentsService;
import service.GameService;
import domain.Game;
import servlet.dbBean;
import java.sql.ResultSet;

public final class subindex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Game Introduction</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      domain.Comments comments = null;
      synchronized (_jspx_page_context) {
        comments = (domain.Comments) _jspx_page_context.getAttribute("comments", PageContext.PAGE_SCOPE);
        if (comments == null){
          comments = new domain.Comments();
          _jspx_page_context.setAttribute("comments", comments, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <h1><em><strong>\n");
      out.write("            welcom to 肥宅游戏</strong></em></h1>\n");
      out.write("            <form id=\"form1\" name=\"form1\" method=\"post\" action=\"add.jsp\">\n");
      out.write("            ");
String name =(String)session.getAttribute("name");
            Game g = new Game();
            String Id=request.getParameter("id");
            g=GameService.getById(Id);
            
      out.write("\n");
      out.write("            <p style=\"text-align:center;font-size: 34px;color:#0033cc\">");
      out.print(g.getName());
      out.write("\n");
      out.write("            <p style=\"text-align:center;font-size: 15px;color:#000000\">发行时间：");
      out.print(g.getTime());
      out.write("\n");
      out.write("            <p style=\"text-align:center;font-size: 15px;color:#000000\">发行公司：");
      out.print(g.getPublisher());
      out.write("\n");
      out.write("            <p style=\"text-align:center;font-size: 15px;color:#000000\">评分：");
      out.print(g.getScore());
      out.write("\n");
      out.write("            <p><div align=\"center\"><img src=\"picture/");
      out.print(g.getImage());
      out.write("\" width=\"277\" height=\"234\" alt=\"\"/></div></p>\n");
      out.write("            <p><strong><em>");
      out.print(g.getIntro());
      out.write("</a></em></strong></p>\n");
      out.write("            ");

            comments=CommentsService.getPersonalComment("name", "Id");
            if(comments.getPinlun()==null){
            
      out.write("\n");
      out.write("            <p colspan=\"2\">评论区<br> <textarea name=\"intro\" cols=\"200\" rows=\"3\"></textarea></p>\n");
      out.write("            <p colspan=\"2\">评分<br> <textarea name=\"score\" cols=\"3\" rows=\"2\"></textarea>(请给出0-5之间的值)\n");
      out.write("            </p>    \n");
      out.write("        ");
}
         
      out.write("\n");
      out.write("      <table>\n");
      out.write("                    ");

                        ArrayList a=new ArrayList();
                        ArrayList b=new ArrayList();
                        ArrayList c=new ArrayList();
                    CommentsService.getComments(a,b,c,g.getId());
                    int i=0;
                    for(i=0;i<a.size();i++){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(a.get(i));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(b.get(i));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(c.get(i));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    </table>\n");
      out.write("            </form>\n");
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
