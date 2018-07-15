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
//这里信息拼错了。
public class UserInformation {
private String user;
private String birth;
private String email;
public void setUser(String s){
user=s;
}
public void setBirth(String s){
birth=s;
}
public void setEmail(String s){
email=s;
}


public String getUser(){
return user;
}
public String getBirth(){
return birth;
}
public String getEmail(){
return email;
}

}
    
