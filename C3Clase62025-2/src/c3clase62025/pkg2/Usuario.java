/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c3clase62025.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Usuario {
    //atributos
    private String pwd;
    public String user;

    public Usuario() {
        this.user="temp1";
        this.pwd="123";
    }

    public Usuario(String user) {
        this.user = user;
        this.pwd="123";
    }

    public Usuario(String pwd, String user) {
        this.pwd = pwd;
        this.user = user;
    }
    
    
    
    

    public String getPwd() {
        return "*********";
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    private String getRealPwd(){
        return pwd;
    }
    
    public void login(){
        if ("12345678".compareTo(getRealPwd())==0)
            JOptionPane.showConfirmDialog(null, "Usuario si puede logear");
    }

    @Override
    public String toString() {
        return "Usuario{" + "pwd=******" +  ", user=" + user + '}';
    }
    
    
    
    
    
}
