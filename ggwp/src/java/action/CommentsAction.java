/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;
import service.*;
import domain.*;
import javax.swing.*;
import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 *
 * @author mec
 */
public class CommentsAction {
public static double newScore(String s1,double f){
    Game g=new Game();
    double newscore;
    int amount=0;
g=GameService.getById(s1);
amount=CommentsService.checkAmount(s1);
newscore=(g.getScore()*amount+f)/(amount+1);



return newscore;
} 
}

