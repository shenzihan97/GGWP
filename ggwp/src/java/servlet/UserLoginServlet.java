/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");  
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        String sql="select * from user where user='"+request.getParameter("name")+"'and password='"+request.getParameter("password")+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ggwp?user=root&password=971203");
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
                out.println("登录成功！1秒后自动跳转到首页...");
                String user=request.getParameter("name");
                session.setAttribute("user", user); 
                response.setHeader("Refresh", "1;URL=index.jsp");
            }
            else
            {
                out.println("登录失败，用户名不存在或密码错误！1秒后自动返回到登录页面...");
                response.setHeader("Refresh", "1;URL=login.jsp");
            }
            conn.close();
            stmt.close();
            rs.close();
        } catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            out.println(e.getMessage());
        }
    }
}
