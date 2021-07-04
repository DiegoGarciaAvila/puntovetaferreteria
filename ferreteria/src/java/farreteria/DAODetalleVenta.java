/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import Encapsulamiento.DDetalleVenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class DAODetalleVenta extends coneccion {

    public ArrayList<DDetalleVenta> getListaDetalleVentas(String idvent) {
        ArrayList<DDetalleVenta> al = new ArrayList<DDetalleVenta>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select detalleventa.idventa, producto.nombre,detalleventa.cantidad, detalleventa.preciopieza, detalleventa.subtotal\n"
                    + "from detalleventa inner join producto on detalleventa.idproducto=producto.idproducto inner join ventas on detalleventa.idventa=ventas.idventa\n"
                    + "where detalleventa.idventa = ? ";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idvent);
            rs = pst.executeQuery();

            while (rs.next()) {

                String idventa = rs.getString(1);
                String idproducto = rs.getString(2);
                String cantidad = rs.getString(3);
                String preciopieza = rs.getString(4);
                String subtotal = rs.getString(5);
                DDetalleVenta de = new DDetalleVenta(idventa, idproducto, cantidad, preciopieza, subtotal);
                al.add(de);;
            }

        } catch (SQLException e) {
            System.err.println("Error1: " + e);

        }

        return al;

    }

    public boolean eliminarDetalleVenta(String idventa, String idproducto) {

        PreparedStatement pst = null;

        try {
            String consulta = "delete detalleventa \n"
                    + "from detalleventa join producto on detalleventa.idproducto = producto.idproducto\n"
                    + "where detalleventa.idventa=? and producto.nombre=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idventa);
            pst.setString(2, idproducto);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error1: " + e);
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (getConexion() != null) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                System.err.println("Error2: " + e);

            }

        }

        return false;

    }

    public boolean NuevoDetalleVenta(String idencargo, String idproducto, String cantidad) {

        PreparedStatement pst = null;

        try {
            String consulta = "insert into detalleventa (idventa,idproducto,cantidad,preciopieza) values(\n"
                    + "?,?,?,(select(producto.preciocompra) from producto where producto.idproducto=?))";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idencargo);
            pst.setString(2, idproducto);
            pst.setString(3, cantidad);
            pst.setString(4, idproducto);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error1: " + e);
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (getConexion() != null) {
                    getConexion().close();
                }
            } catch (Exception e) {
            }

        }

        return false;

    }

    /* public static void main(String[] args) {
        DAODetalleEncargo de = new DAODetalleEncargo();
        System.out.println(de.NuevoDetalleEncargo("1","1", "3"));
    }
     */
}
