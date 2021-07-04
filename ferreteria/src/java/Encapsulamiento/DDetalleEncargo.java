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
public class DDetalleEncargo {
    String idencargo;
    String idproducto;
    String cantidad;
    String preciopieza;
    String subtotal;

    public String getIdencargo() {
        return idencargo;
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

    public void setIdencargo(String idencargo) {
        this.idencargo = idencargo;
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
    

    public DDetalleEncargo() {
    }

    public DDetalleEncargo(String idencargo, String idproducto, String cantidad, String preciopieza, String subtotal) {
        this.idencargo = idencargo;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.preciopieza = preciopieza;
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DDetalleEncargo{" + "idencargo=" + idencargo + ", idproducto=" + idproducto + ", cantidad=" + cantidad + ", preciopieza=" + preciopieza + ", subtotal=" + subtotal + '}';
    }
    
    

   
    
}
