/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.InputStream;

/**
 *
 * @author Bartsam
 */
public class Producto {
       int idProducto;
    String nombreProducto;
    InputStream fotoProducto;
    String descProducto;
    double precioProducto;
    int stockProducto;

    public Producto() {

    }

    public Producto(int idProducto, String nombreProducto, InputStream fotoProducto, String descProducto, double precioProducto, int stockProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.fotoProducto = fotoProducto;
        this.descProducto = descProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public InputStream getFotoProducto() {
        return fotoProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setFotoProducto(InputStream fotoProducto) {
        this.fotoProducto = fotoProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

}
