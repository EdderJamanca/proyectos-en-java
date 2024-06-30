package org.edder.appfactura.domain;

import java.util.Date;

public class Producto {

    private int idproducto;
    private String nombre;
    private float precio;
    private static int ultimoid;

    public Producto(){
        this.idproducto=++ultimoid;
    }
    public int getIdproducto(){
        return this.idproducto;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public float getPrecio(){
        return this.precio;
    }

    public void setPrecio(float precio){
        this.precio=precio;
    }

    @Override
    public String toString(){
        return idproducto +
                "\t"+nombre +
                "\t"+precio;
    }
}
