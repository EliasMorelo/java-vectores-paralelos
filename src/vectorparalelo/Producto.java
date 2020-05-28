/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorparalelo;

/**
 *
 * @author Ideapad S145
 */
public class Producto {

    private int cantidad[], tam, codigo[];
    private String nombre[];
    private double precio[];

    public Producto(int tam) {
        this.tam = tam;
        cantidad = new int[tam];
        codigo = new int[tam];
        nombre = new String[tam];
        precio = new double[tam];
    }

    public int getCantidad(int pos) {
        return cantidad[pos];
    }

    public void setCantidad(int cantidad, int pos) {
        this.cantidad[pos] = cantidad;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getCodigo(int pos) {
        return codigo[pos];
    }

    public void setCodigo(int codigo, int pos) {
        this.codigo[pos] = codigo;
    }

    public String getNombre(int pos) {
        return nombre[pos];
    }

    public void setNombre(String nombre, int pos) {
        this.nombre[pos] = nombre;
    }

    public double getPrecio(int pos) {
        return precio[pos];
    }

    public void setPrecio(double precio, int pos) {
        this.precio[pos] = precio;
    }

}
