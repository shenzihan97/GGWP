<%-- 
    Document   : regist
    Created on : 2018-7-15, 11:15:39
    Author     : hasee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<style type="text/css">
h1{text-align:center;}
h4{text-align:left;color:red;}
a{text-decoration:none;font-size:20px;color:black;}
a:hover{text-decoration:underline;font-size:24px;color:red;}
</style>

</head>
<body>
<form action="UserRegist" method="post">
    <h1>用户注册</h1>
    <hr/>
    <table align="center">
        <tr>
            <td>账号：</td>
            <td><input type="text" name="name"</td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td colspan="1">
            </td>
            <td>
                <input type="submit" value="注册"/>
                <input type="reset" value="重置"/>
                <a href="login.jsp" target="_blank">登录</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
