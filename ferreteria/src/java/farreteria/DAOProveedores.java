/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import Encapsulamiento.Dproveedores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class DAOProveedores extends coneccion {

    public ArrayList<Dproveedores> getListaProveedores() {
        ArrayList<Dproveedores> ls = new ArrayList<Dproveedores>();

        PreparedStatement pst = null;
        ResultSet rs = null;
        try {

            String consulta = "select * from proveedor";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {
                String idproveedor = rs.getString(1);
                String nombre = rs.getString(2);
                String ap = rs.getString(3);
                String am = rs.getString(4);
                String contacto = rs.getString(5);

                Dproveedores dp = new Dproveedores(idproveedor, nombre, ap, am, contacto);
                ls.add(dp);
            }

        } catch (SQLException ex) {
            System.err.println("Error1: " + ex);
        }
        return ls;

    }

    public Dproveedores getMoficarProveedores(String idproveedor) {
        Dproveedores dp = new Dproveedores();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from proveedor where idproveedor=?";
            pst = getConexion().prepareStatement(consulta);

            pst.setString(1, idproveedor);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                dp.setIdproveedor(rs.getString(1));
                dp.setNombre(rs.getString(2));
                dp.setAp(rs.getString(3));
                dp.setAm(rs.getString(4));
                dp.setContacto(rs.getString(5));
            }

        } catch (SQLException ex) {
            System.err.println("Error1: " + ex);
        }
        return dp;

    }

    public boolean ModificarProveedor(String idproveedor, String nombre, String ap, String am, String contacto) {
        PreparedStatement pst = null;

        try {
            String consulta = "update proveedor set nombre=?,ap=?,am=?,contacto=? where idproveedor=?";

            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, ap);
            pst.setString(3, am);
            pst.setString(4, contacto);
            pst.setString(5, idproveedor);
            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error1: " + ex);
        } finally {

            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error2: " + ex);
            }
        }
        return false;

    }

    public boolean EliminarProveedor(String id) {
        PreparedStatement pst = null;

        try {
            String consulta = "delete proveedor where idproveedor = ?";

            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, id);
            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error1: " + ex);
        } finally {

            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error2: " + ex);
            }

        }
        return false;

    }

    public boolean NuevoProveedor(String idproveedor, String nombre, String ap, String am, String contacto) {

        PreparedStatement pst = null;
        try {
            String consulta = "insert into proveedor (idproveedor,nombre,ap,am,contacto) values (?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idproveedor);
            pst.setString(2, nombre);
            pst.setString(3, ap);
            pst.setString(4, am);
            pst.setString(5, contacto);
            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error1: " + e);
        } finally {

            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error2: " + ex);
            }

        }

        return false;

    }
/*
    public static void main(String[] args) {
        DAOProveedores dp = new DAOProveedores();
        System.out.println(dp.ModificarProveedor("3", "Bocho", "N/A", "N/A", "7131234567"));
    }*/
}
