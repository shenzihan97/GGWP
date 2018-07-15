/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import domain.Game;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mec
 */
public class GameService {
    //下面方法用来取得某款具体游戏的所有信息，s是游戏的id
public static Game getById(String s){
    Game g=new Game();
 try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ggwp?user=root&password=971203");
            Statement stmt = conn.createStatement();
            ResultSet rs1 = stmt.executeQuery("select * from ggwp.game where id='"+s+"'");
            
            if(rs1.next()){
            g.setId(rs1.getString(1));
            g.setName(rs1.getString(2));
            g.setPublisher(rs1.getString(3));
            g.setTime(rs1.getString(4));
            g.setImage(rs1.getString(5));
            g.setIntro(rs1.getString(6));
            g.setScore(rs1.getString(7));
            }
            else{
            System.out.println("nothing");
            }
                ;

                
                }
            
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
            
        }
             return g;

}
}
