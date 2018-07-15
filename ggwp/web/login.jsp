<%-- 
    Document   : login
    Created on : 2018-7-15, 11:07:20
    Author     : hasee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<style type="text/css">
h1{text-align:center;}
h4{text-align:left;color:red;}
a{text-decoration:none;font-size:20px;color:black;}
a:hover{text-decoration:underline;font-size:24px;color:red;}
</style>

</head>
<body>
<form action="UserLogin" method="post">
    <h1>用户登录</h1>
    <hr/>
    <table align="center">
        <tr>
            <td>账号：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td colspan="1">
            </td>
            <td>
                <input type="submit" value="登录"/>
                <input type="reset" value="重置"/>
                <a href="regist.jsp" target="_blank">注册</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
 
