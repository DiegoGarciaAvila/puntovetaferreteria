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
public class Dnotas {

    String idnotas;
    String descripcion;
    String idpersonal;

    public void setIdnotas(String idnotas) {
        this.idnotas = idnotas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdpersonal(String idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getIdnotas() {
        return idnotas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getIdpersonal() {
        return idpersonal;
    }

    @Override
    public String toString() {
        return "Dnotas{" + "idnotas=" + idnotas + ", descripcion=" + descripcion + ", idpersonal=" + idpersonal + '}';
    }

    public Dnotas(String idnotas, String descripcion, String idpersonal) {
        this.idnotas = idnotas;
        this.descripcion = descripcion;
        this.idpersonal = idpersonal;
    }
    
    public Dnotas() {
    }
    
}
