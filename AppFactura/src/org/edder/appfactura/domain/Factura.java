package org.edder.appfactura.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int idfactura;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private DetalleFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS=12;
    private  static int ultimoFolio;

    public Factura(String descripcion,Cliente cliente){
        this.descripcion=descripcion;
        this.cliente=cliente;
        this.items= new DetalleFactura[MAX_ITEMS];
        this.idfactura = ++ ultimoFolio;
        this.fecha=new Date();
    }
    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public DetalleFactura[] getItems() {
        return items;
    }

    public void addItems(DetalleFactura items) {
        if(indiceItems < MAX_ITEMS){
            this.items[indiceItems ++] = items;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float calcularTotal(){
        float total=0.0f;
        for(DetalleFactura item: this.items){
            if(item==null){
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder("Factura N°:");
        sb.append(idfactura)
                .append("\n Cliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getIdentificacionTributaria())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyyy");
        sb.append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n");

        for(DetalleFactura item: this.items){
            if(item ==null){
                continue;
            }
            sb.append(item);
          //  sb.append(item.getProducto().getIdproducto())
//                    .append("\t")
//                    .append(item.getProducto().getNombre())
//                    .append("\t")
//                    .append(item.getProducto().getPrecio())
//                    .append("\t")
//                    .append(item.getProducto().getPrecio())
//                    .append("\t")
//                    .append(item.getCantidad())
//                    .append("\t")
//                    .append(item.calcularImporte())
//                    .append("\n");
        }
        sb.append("\nGran total: ")
                .append(calcularTotal());

        return sb.toString();
    }
}
