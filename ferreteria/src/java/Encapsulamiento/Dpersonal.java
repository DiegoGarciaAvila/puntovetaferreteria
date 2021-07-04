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
public class Dpersonal {
    
    /*Declaramos las variables de forma privada para que solo esta clase tenga acceso a ellas
        Necesitamos constructor vacio, constructor para encapsular, setters y getters
    */
    private String idpersonal,nombre,am,ap,salario,contra,cargo,telefono;

    
    public Dpersonal() {
    }

    public Dpersonal(String idpersonal, String nombre, String am, String ap, String salario, String contra, String cargo, String telefono) {
        this.idpersonal = idpersonal;
        this.nombre = nombre;
        this.am = am;
        this.ap = ap;
        this.salario = salario;
        this.contra = contra;
        this.cargo = cargo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Dpersonal{" + "idpersonal=" + idpersonal + ", nombre=" + nombre + ", am=" + am + ", ap=" + ap + ", salario=" + salario + ", contra=" + contra + ", cargo=" + cargo + ", telefono=" + telefono + '}';
    }

    public void setIdpersonal(String idpersonal) {
        this.idpersonal = idpersonal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdpersonal() {
        return idpersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAm() {
        return am;
    }

    public String getAp() {
        return ap;
    }

    public String getSalario() {
        return salario;
    }

    public String getContra() {
        return contra;
    }

    public String getCargo() {
        return cargo;
    }

    public String getTelefono() {
        return telefono;
    }

   
    
    
}
