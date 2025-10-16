/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c3clase62025.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C3Clase620252 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario = new Usuario();
        usuario.user="dnunez";
        usuario.setPwd("12345678");
        
        JOptionPane.showMessageDialog(null, usuario.getUser() + usuario.getPwd());
        usuario.login();
        
        Botella botella =new Botella();
        
        JOptionPane.showMessageDialog(null, botella.toString());
        botella.setPais("China");
        JOptionPane.showConfirmDialog(null, botella.getPais());
    
        
        Usuario user2 = new Usuario();
        JOptionPane.showConfirmDialog(null, user2.toString());
        
        Usuario user3 = new Usuario("Ramona");
        JOptionPane.showConfirmDialog(null, user3.toString());
        
        Usuario user4 = new Usuario("654","Lupita");
        JOptionPane.showConfirmDialog(null, user4.toString());
        
        for (int i = 0; i < 3; i++) {
            solUsuario();
        }
        
        
        botella.setEstadosBotella(EstadosBotella.arrugada);
        
        JOptionPane.showConfirmDialog(null, botella.toString());
        
    }
    
    
    public static Usuario solUsuario(){
        String user = JOptionPane.showInputDialog("Digite el usuario");
        String pwd =  JOptionPane.showInputDialog("Digite la clave");
        Usuario usuario = new Usuario(pwd, user);
        return usuario;

    }
    
    
    
    
}
