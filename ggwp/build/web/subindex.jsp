<%-- 
    Document   : subindex
    Created on : 2018-7-15, 13:14:37
    Author     : MaiBenBen
--%>
<%@page import="action.CommentsAction"%>
<%@page import="java.util.ArrayList"%>
<%@page import="service.CommentsService"%>
<%@page import="service.GameService"%>
<%@page import="domain.Game"%>
<%@page import="servlet.dbBean"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Game Introduction</title>
    </head>
    <jsp:useBean id="comments" class="domain.Comments" scope="page"/>
    
    
    <h1><em><strong>
            welcom to 肥宅游戏</strong></em></h1>
            <%String name =(String)session.getAttribute("user");
            Game g = new Game();
            String Id=request.getParameter("id");
            g=GameService.getById(Id);
            %>
            <p style="text-align:center;font-size: 34px;color:#0033cc"><%=g.getName()%>
            <p style="text-align:center;font-size: 15px;color:#000000">发行时间：<%=g.getTime()%>
            <p style="text-align:center;font-size: 15px;color:#000000">发行公司：<%=g.getPublisher()%>
            <p style="text-align:center;font-size: 15px;color:#000000">评分：<%=g.getScore()%>
            <p><div align="center"><img src="picture/<%=g.getImage()%>" width="277" height="234" alt=""/></div></p>
            <p><strong><em><%=g.getIntro()%></a></em></strong></p>
            <%
            comments=CommentsService.getPersonalComment(name, Id);
            
            
            
                            String comment=request.getParameter("comment");
            if(comments.getPinlun()==null){

                if(comment==null){
            %>
            <form action = "subindex.jsp" method="post">
            <p colspan="2">评论区<br> <textarea name="comment" cols="200" rows="3"></textarea></p>
            <p colspan="2">评分<br> <textarea name="score" cols="3" rows="2"></textarea>(请给出0-5之间的值)
            </p> 
            <p>
                <input type = "submit" value="Submit">
            </p>
            </form>
        <%}
else{
        String ns=request.getParameter("score");
double newscore=Double.parseDouble(ns);
double nnscore=CommentsAction.newScore(Id, newscore);
CommentsService.insertCommments(name, Id, comment, newscore);
CommentsService.updateScore(Id, nnscore);

  }}
else;
         %>
      <table>
                    <%
                        ArrayList a=new ArrayList();
                        ArrayList b=new ArrayList();
                        ArrayList c=new ArrayList();
                    CommentsService.getComments(a,b,c,g.getId());
                    int i=0;
                    for(i=0;i<a.size();i++){
                    %>
                    <tr>
                        <td><%=a.get(i)%></td>
                        <td><%=b.get(i)%></td>
                        <td><%=c.get(i)%></td>
                    </tr>
                    <%}
                    %>
                    
                    
                    </table>
            </form>
</html>
