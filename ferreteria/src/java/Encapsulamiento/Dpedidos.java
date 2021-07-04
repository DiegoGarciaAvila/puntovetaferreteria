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
public class Dpedidos {
    String idpedido;
    String fecha;

    public Dpedidos() {
    }

    public void setIdpedido(String idpedido) {
        this.idpedido = idpedido;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Dpedidos{" + "idpedido=" + idpedido + ", fecha=" + fecha + '}';
    }

    public Dpedidos(String idpedido, String fecha) {
        this.idpedido = idpedido;
        this.fecha = fecha;
    }

    public String getIdpedido() {
        return idpedido;
    }

    public String getFecha() {
        return fecha;
    }
    
    
}
