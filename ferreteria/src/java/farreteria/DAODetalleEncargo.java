/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import Encapsulamiento.DDetalleEncargo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class DAODetalleEncargo extends coneccion {

    public ArrayList<DDetalleEncargo> getListaDetalleEncargos(String idproduc) {
        ArrayList<DDetalleEncargo> al = new ArrayList<DDetalleEncargo>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select detalleencargos.idencargo, producto.nombre,detalleencargos.cantidad, detalleencargos.preciopieza, detalleencargos.subtotal\n"
                    + "from detalleencargos inner join producto on detalleencargos.idproducto=producto.idproducto inner join encargos on detalleencargos.idencargo=encargos.idencargo\n"
                    + "where detalleencargos.idencargo = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idproduc);
            rs = pst.executeQuery();

            while (rs.next()) {

                String idencargo = rs.getString(1);
                String idproducto = rs.getString(2);
                String cantidad = rs.getString(3);
                String preciopieza = rs.getString(4);
                String subtotal = rs.getString(5);
                DDetalleEncargo de = new DDetalleEncargo(idencargo, idproducto, cantidad, preciopieza, subtotal);
                al.add(de);;
            }

        } catch (SQLException e) {
        }

        return al;

    }

    public boolean eliminarDetalleEncargo(String idencargo, String idproducto) {
        
        PreparedStatement pst = null;

        try {
            String consulta = "delete detalleencargos \n"
                    + "from detalleencargos  join producto on detalleencargos .idproducto = producto.idproducto\n"
                    + "where detalleencargos.idencargo=? and producto.nombre=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idencargo);
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
            } catch (Exception e) {
            }

        }

        return false;

    }

    public boolean NuevoDetalleEncargo(String idencargo, String idproducto, String cantidad) {
        
        PreparedStatement pst = null;

        try {
            String consulta = "insert into detalleencargos (idencargo,idproducto,cantidad,preciopieza) values(?,?,?,(select(producto.preciocompra) from producto where producto.idproducto=?))";
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
