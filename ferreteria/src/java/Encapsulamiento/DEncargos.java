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
public class DEncargos {
    String idencargo;
    String nombre;
    String fecharealizado;
    String total;

    @Override
    public String toString() {
        return "DEncargos{" + "idencargo=" + idencargo + ", nombre=" + nombre + ", fecharealizado=" + fecharealizado + ", total=" + total + '}';
    }

    public void setIdencargo(String idencargo) {
        this.idencargo = idencargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecharealizado(String fecharealizado) {
        this.fecharealizado = fecharealizado;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public DEncargos() {
    }

    public DEncargos(String idencargo, String nombre, String fecharealizado, String total) {
        this.idencargo = idencargo;
        this.nombre = nombre;
        this.fecharealizado = fecharealizado;
        this.total = total;
    }

    public String getIdencargo() {
        return idencargo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecharealizado() {
        return fecharealizado;
    }

    public String getTotal() {
        return total;
    }
   

    
           

}
