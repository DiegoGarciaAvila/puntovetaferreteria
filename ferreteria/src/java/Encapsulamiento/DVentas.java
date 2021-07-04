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
public class DVentas {
    
    String idventa;
    String total;
    String fecha;
    String idpersonal;

    @Override
    public String toString() {
        return "DVentas{" + "idventa=" + idventa + ", total=" + total + ", fecha=" + fecha + ", idpersonal=" + idpersonal + '}';
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIdpersonal(String idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getIdventa() {
        return idventa;
    }

    public String getTotal() {
        return total;
    }

    public String getFecha() {
        return fecha;
    }

    public String getIdpersonal() {
        return idpersonal;
    }

    public DVentas() {
    }

    public DVentas(String idventa, String total, String fecha, String idpersonal) {
        this.idventa = idventa;
        this.total = total;
        this.fecha = fecha;
        this.idpersonal = idpersonal;
    }
    
    
    
}
