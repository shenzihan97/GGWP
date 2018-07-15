package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author dabao
 */
public class dbBean {
    private Connection connection;
    private Statement statement;
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    //static final String DATABASE_URL="jdbc:mysql://localhost:3306/sys?users=root&password=123456&useSSL=true";
  
    public dbBean()
    {
        try{
             Class.forName(JDBC_DRIVER);
              
             connection=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","123456");
             statement=(com.mysql.jdbc.Statement) connection.createStatement();
             
             }
         catch(ClassNotFoundException | SQLException e){
             System.out.println(e.getMessage());
             System.out.println("数据库连接失败！");}
     
     }
     
     public  int  executeUpd(String s) {
     int result=0;   
     try
     {
     result=statement.executeUpdate(s);
        } 
     catch(SQLException ex) {
            System.out.println("执行更新错误！");
        }
       return result; 
           
    }

    
    public ResultSet executeQ(String s) {
        ResultSet rs = null;
         
    try
      {
            rs = statement.executeQuery(s);
        } 
    catch(Exception ex) {
            System.out.println(
"ִ执行查询错误！");
        }
        
         return rs;
    }
    
 

    
public void close() {
        
try
 {
            statement.close();
            connection.close();
        } 
catch
 (Exception e) {
        }
    }

         
}
         
    
