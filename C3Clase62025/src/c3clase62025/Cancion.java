/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c3clase62025;

/**
 *
 * @author viti
 */
public class Cancion {
    public String nombre;
    public int tiempo;
    public Album album;
    
    
    public Cancion createSong(){
        Artista artista = new Artista ();
        artista.age=20;
        artista.name="Benito";
        artista.realName="Alberto";
        
        
        Album album = new Album();
        album.artista=artista;
        album.cantidadCanciones = 3;
        
        this.nombre="No voy ir a clases";
        this.tiempo=200;// segundos
        this.album=album;
        return null;
    }
    
    
}
