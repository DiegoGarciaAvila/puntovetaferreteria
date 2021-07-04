/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author Diego
 */
public class DDetalleVenta {
    String idventa;
    String idproducto;
    String cantidad;
    String preciopieza;
    String subtotal;

    public DDetalleVenta() {
    }

    @Override
    public String toString() {
        return "DDetalleVenta{" + "idventa=" + idventa + ", idproducto=" + idproducto + ", cantidad=" + cantidad + ", preciopieza=" + preciopieza + ", subtotal=" + subtotal + '}';
    }

    public DDetalleVenta(String idventa, String idproducto, String cantidad, String preciopieza, String subtotal) {
        this.idventa = idventa;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.preciopieza = preciopieza;
        this.subtotal = subtotal;
    }

    public String getIdventa() {
        return idventa;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getPreciopieza() {
        return preciopieza;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setPreciopieza(String preciopieza) {
        this.preciopieza = preciopieza;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    
}
