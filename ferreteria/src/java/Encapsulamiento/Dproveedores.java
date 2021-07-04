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
public class Dproveedores {
    
    String idproveedor;
    String nombre;
    String ap;
    String am;
    String contacto;

    public Dproveedores() {
    }

    @Override
    public String toString() {
        return "Dproveedores{" + "idproveedor=" + idproveedor + ", nombre=" + nombre + ", ap=" + ap + ", am=" + am + ", contacto=" + contacto + '}';
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAp() {
        return ap;
    }

    public String getAm() {
        return am;
    }

    public String getContacto() {
        return contacto;
    }

    public void setIdproveedor(String idproveedor) {
        this.idproveedor = idproveedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Dproveedores(String idproveedor, String nombre, String ap, String am, String contacto) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.contacto = contacto;
    }
    
    
}
