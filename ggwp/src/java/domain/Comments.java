/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author mec
 */
public class Comments {
    private String user;
    private String id;
    private double score;
    private String pinlun;
    public void setUser(String s){
    user=s;
    }
public void setId(String s){
    id=s;
    }    
 public void setScore(String s){
    score=Double.parseDouble(s);
    }
 public void setPinlun(String s){
    pinlun=s;
    }
 public String getUser(){
 return user;
 }
  public String getId(){
 return id;
 } public double getScore(){
 return score;
 } public String getPinlun(){
 return pinlun;
 }
}
