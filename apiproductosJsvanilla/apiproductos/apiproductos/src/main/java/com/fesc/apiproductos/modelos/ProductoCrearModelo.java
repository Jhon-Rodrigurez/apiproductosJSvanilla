package com.fesc.apiproductos.modelos;

public class ProductoCrearModelo {
    
    private String idProducto;
    private String nombre;
    private int precio;
    private float iva;
    
    public String getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public float getIva() {
        return iva;
    }
    public void setIva(float iva) {
        this.iva = iva;
    }

    
}