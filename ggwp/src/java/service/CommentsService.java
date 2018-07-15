/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import domain.Comments;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mec
 */
public class CommentsService {
    //下面的方法用来取得用户对某款游戏的打分，s1是用户名，s2是游戏id,用来避免用户对某款游戏的重复打分。
public static Comments getPersonalComment(String s1,String s2){
    Comments co=new Comments();
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ggwp?user=root&password=971203");
            Statement stmt = conn.createStatement();
            ResultSet rs1 = stmt.executeQuery("select * from ggwp.pinfen where user='"+s1+"'and id='"+s2+"'");
            if(rs1.next()){
            co.setUser(rs1.getString(1));
            co.setId(rs1.getString(2));
            co.setScore(rs1.getString(3));
            co.setPinlun(rs1.getString(4));
            }
            
                
                }
            
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
            
        }
return co;
}
//下面的方法用来取得所有用户对某款游戏的打分与评论，String s 是游戏在数据库中的id；
public static void getComments(ArrayList a,ArrayList b,ArrayList c,String s){
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ggwp?user=root&password=971203");
            Statement stmt = conn.createStatement();
            ResultSet rs1 = stmt.executeQuery("select * from ggwp.pinfen where id='"+s+"'");
            while(rs1.next()){
            a.add((String)rs1.getString(1));//a存储评论的用户，b存储用户打分，c存储具体评论
            b.add((String)rs1.getString(3));
            c.add((String)rs1.getString(4));
            }

                
                }
            
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
            
        }
}
//下面方法用来修改数据库中id为s1的游戏的评分
public static void updateScore(String s1,double f){
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ggwp?user=root&password=19987821dw");
            Statement stmt = conn.createStatement();
            //ResultSet rs1 = stmt.executeQuery("select * from user where name='"+name+"'and password='"+password+"'");
            //if(rs1.next());
             stmt.execute("update ggwp.game set score="+f+"where id='"+s1+"'");
                
                }
            
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
            
        }
}
//用来查询对某个id为s1的游戏查询有多少人评论过
public static int checkAmount(String s){
    int m=0;
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ggwp?user=root&password=971203");
            Statement stmt = conn.createStatement();
            ResultSet rs1 = stmt.executeQuery("select count(pinlun) from ggwp.pinfen where id='"+s+"'");
            if(rs1.next()){//String ss=rs1.getString(1);
            //m=Integer.parseInt(ss);
            m=rs1.getInt(1);
            }
            
            
                
                }
            
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
            
        }
return m;
}
//插入user为s1的用户对id为s2游戏的评分f和评论s3
public static void insertCommments(String s1,String s2,String s3,double f){
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ggwp?user=root&password=971203");
            Statement stmt = conn.createStatement();
            //f=(float)f;
            stmt.execute("insert into ggwp.pinfen values('"+s1+"','"+s2+"',"+f+",'"+s3+"')");
            
                
                }
            
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
            
        }
}


}
