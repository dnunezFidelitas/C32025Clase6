/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c3clase62025.pkg2;

/**
 *
 * @author viti
 */
public class Botella {
    private String marca;
    private String color;
    private String material;
    private String pais;
    // cerrada, abierta, vacia, llena, rota, nueva, arrugada
    private EstadosBotella estadosBotella;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPais() {
        if (pais.equals("China"))
            return "US";
        return pais;
    }

    public EstadosBotella getEstadosBotella() {
        return estadosBotella;
    }

    public void setEstadosBotella(EstadosBotella estadosBotella) {
        this.estadosBotella = estadosBotella;
    }

    
    
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Botella{" + "marca=" + marca + ", color=" + color + ", material=" + material + ", pais=" + pais + ", estadosBotella=" + estadosBotella + '}';
    }

    

    
    
    
    
}
