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
public class DDetallePedido {
    String idpedido;
    String idproducto;
    String cantidad;

    public DDetallePedido() {
    }

    public DDetallePedido(String idpedido, String idproducto, String cantidad) {
        this.idpedido = idpedido;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
    }

    public String getIdpedido() {
        return idpedido;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setIdpedido(String idpedido) {
        this.idpedido = idpedido;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DDetallePedido{" + "idpedido=" + idpedido + ", idproducto=" + idproducto + ", cantidad=" + cantidad + '}';
    }
    
}
