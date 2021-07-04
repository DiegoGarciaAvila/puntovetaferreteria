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
public class Dproductos {

    String idproducto;
    String nombre;
    String precioventa;
    String preciocompra;
    String tocks;
    String idproveedor;

    @Override
    public String toString() {
        return "Dproductos{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", precioventa=" + precioventa + ", preciocompra=" + preciocompra + ", tocks=" + tocks + ", idproveedor=" + idproveedor + '}';
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioventa(String precioventa) {
        this.precioventa = precioventa;
    }

    public void setPreciocompra(String preciocompra) {
        this.preciocompra = preciocompra;
    }

    public void setTocks(String tocks) {
        this.tocks = tocks;
    }

    public void setIdproveedor(String idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecioventa() {
        return precioventa;
    }

    public String getPreciocompra() {
        return preciocompra;
    }

    public String getTocks() {
        return tocks;
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public Dproductos(String idproducto, String nombre, String precioventa, String preciocompra, String tocks, String idproveedor) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precioventa = precioventa;
        this.preciocompra = preciocompra;
        this.tocks = tocks;
        this.idproveedor = idproveedor;
    }

    public Dproductos() {
    }

    
}
