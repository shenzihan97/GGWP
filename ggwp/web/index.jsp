<%-- 
    Document   : index
    Created on : 2018-7-15, 12:56:15
    Author     : hasee
--%>

<%@page import="service.GameService"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="domain.Game" %>
<jsp:useBean id="game" class="service.GameService" scope="session" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GGWP</title>
    </head>
    <body>
        <% String username=(String)session.getAttribute("user");
        if(username!=null) { %>
        <div>欢迎您，<%= username %>！</div> 
        <% } else { %>
        <div>欢迎您，游客，请先登录或注册！<a href="regist.jsp" target="_top" >免费注册</a>
        <a href="login.jsp" target="_top" >登录</a></div>
        <% } %>
        <h1 style="text-align:center;font-size: 34px;color:#0000ff">GGWP游戏介绍网站</h1>
    <table width="1580" border="6">
        <tr align="center" height="30">
            <th style="font-size: 28px;color:#ff0033">热门游戏名</th>
        </tr>
        <%
            for(int i = 0; i < 5; i++){
                String s = String.valueOf(i);
                String[] gamename=new String[5];
                Game g=game.getById(s);
        %>
        <tr align="center" height="50">
            <td style="font-size: 20px;"><a href="subindex.jsp?id=<%=i%>"><%= g.getName() %></a></td>
        </tr>
        <%
            }
        %>
    </table>
    </body>
</html>