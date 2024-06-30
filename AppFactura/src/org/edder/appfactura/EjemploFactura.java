package org.edder.appfactura;

import org.edder.appfactura.domain.*;
//import org.edder.appfactura.domain.Cliente;
//import org.edder.appfactura.domain.DetalleFactura;
//import org.edder.appfactura.domain.Factura;
//import org.edder.appfactura.domain.Producto;

import java.util.Scanner;

public class EjemploFactura {

    public  static  void main(String[] args){
        Cliente cliente =new Cliente();
        cliente.setIdentificacionTributaria("5555-5");
        cliente.setNombre("Andres");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String desc= s.nextLine();
        Factura factura = new Factura(desc,cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for(int i=0; i<2; i++){
            producto =new Producto();
            System.out.print("Ingreso producto n°" + producto.getIdproducto()+":");
            //nombre = s.nextLine();
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio:");
            //precio=s.nextFloat();
            producto.setPrecio(s.nextFloat());
            System.out.print("Ingrese la cantidad:");
            //cantidad = s.nextInt();
            DetalleFactura item = new DetalleFactura(s.nextInt(),producto);
            factura.addItems(item);

            System.out.println();
            s.nextLine();
        }

        System.out.println(factura.generarDetalle());
    }
}
