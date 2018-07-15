<%-- 
    Document   : HouDuanTest
    Created on : 2018-7-15, 16:51:28
    Author     : mec
--%><%@ page language="java" contentType="text/json; charset=UTF-8"
	pageEncoding="UTF-8" import="domain.UserInformation,org.json.*,util.*"%><%
response.addHeader("Access-Control-Allow-Origin", "*");


UserInformation info =new UserInformation();
info.setUser("DongWei");
info.setBirth("1998-7-8");
info.setEmail("1825937473@qq.com");


JSONObject jo1 = OrgJsonHelper.toJSON(info);

out.println(jo1.toString());%>