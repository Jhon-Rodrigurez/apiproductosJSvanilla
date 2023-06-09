package com.fesc.apiproductos.modelos;

import java.io.Serializable;

public class ProductoDto implements Serializable {

    private static final long serialVersionUID= 1L;
    
    private long id;
    private String idProducto;
    private String nombre;
    private int precio;
    private float iva;
    private boolean estado;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
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
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
