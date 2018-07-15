/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import java.text.DecimalFormat;

/**
 *
 * @author mec
 */
public class Game {
    private String id;
    private String name;
    private String publisher;
    private String time;
    private String image;
    private String intro;
    private double score;
    public void setId(String s){
id=s;
}
    public void setName(String s){
name=s;
}
    public void setPublisher(String s){
publisher=s;
}
        public void setTime(String s){
time=s;
}
            public void setImage(String s){
image=s;
}
                public void setIntro(String s){
intro=s;
}
                    public void setScore(String s){
score=Double.parseDouble(s);
}
public String getId(){
return id;
}
public String getName(){
return name;
}
public String getPublisher(){
return publisher;
}public String getTime(){
return time;
}public String getImage(){
return image;
}public String getIntro(){
return intro;
}
public double getScore(){
return score;
}
public String printScore(){
DecimalFormat df = new DecimalFormat(".00");
       // System.out.println(df.format(d));
       return df.format(score);

}
    
    
}
