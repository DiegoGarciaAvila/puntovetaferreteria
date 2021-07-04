/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import Encapsulamiento.Dproductos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class DAOProductos extends coneccion {

    public ArrayList<Dproductos> getListaProductos() {

        ArrayList<Dproductos> ls = new ArrayList<Dproductos>();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "select *from producto";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {

                String idproducto = rs.getString(1);
                String nombre = rs.getString(2);
                String precioventa = rs.getString(3);
                String preciocompra = rs.getString(4);
                String tocks = rs.getString(5);
                String idproveedor = rs.getString(6);

                Dproductos dp = new Dproductos(idproducto, nombre, precioventa, preciocompra, tocks, idproveedor);

                ls.add(dp);

            }

        } catch (SQLException ex) {
            System.err.println("Error1: " + ex);
        } 

        

        return ls;

    }

    public Dproductos getModificaProduto(String id) {

        Dproductos dp = new Dproductos();

        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select*from producto where idproducto=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, id);
            rs = pst.executeQuery();

            while (rs.next()) {

                dp.setIdproducto(rs.getString(1));
                dp.setNombre(rs.getString(2));
                dp.setPrecioventa(rs.getString(3));
                dp.setPreciocompra(rs.getString(4));
                dp.setTocks(rs.getString(5));
                dp.setIdproveedor(rs.getString(6));

            }

        } catch (SQLException ex) {
            System.err.println("Error1: " + ex);
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
            }

        }

        return dp;
    }

    public boolean ModificarProducto(String idproducto, String nombre, String precioventa, String preciocompra, String tocks, String idproveedor) {
        PreparedStatement pst = null;

        try {
            String consulta = "update producto set nombre=?,precioventa=?,preciocompra=?,tocks=?,idproveedor=? where idproducto=?";

            pst = getConexion().prepareStatement(consulta);

            pst.setString(1, nombre);
            pst.setString(2, precioventa);
            pst.setString(3, preciocompra);
            pst.setString(4, tocks);
            pst.setString(5, idproveedor);
            pst.setString(6, idproducto);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error1: " + ex);
        } finally {
            try {
                if (pst != null) {

                }
                if (getConexion() != null) {

                }
            } catch (Exception e) {
                System.err.println("Error2: " + e);

            }
        }
        return false;
    }

    public boolean ElimaProducto(String id) {
        PreparedStatement pst = null;

        try {
            String consulta = "delete producto where idproducto=?";
            pst = getConexion().prepareStatement(consulta);

            pst.setString(1, id);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error1:" + ex);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();

                }
            } catch (SQLException e) {
                System.err.println("Error2:" + e);
            }
        }

        return false;
    }

    public boolean NuevoProductos(String idproducto, String nombre, String precioventa, String preciocompra, String tocks, String idproveedor) {
        PreparedStatement pst = null;

        try {

            String consulta = "insert producto (idproducto,nombre,precioventa,preciocompra,tocks,idproveedor) values(?,?,?,?,?,?)";

            pst = getConexion().prepareStatement(consulta);

            pst.setString(1, idproducto);
            pst.setString(2, nombre);
            pst.setString(3, precioventa);
            pst.setString(4, preciocompra);
            pst.setString(5, tocks);
            pst.setString(6, idproveedor);

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
            } catch (SQLException e) {
                System.err.println("Error1:" + 1);
            }
        }
        return false;

    }

      
        public static void main(String[] args) {
        DAOProductos dp = new DAOProductos();
        System.out.println(dp.NuevoProductos("7", "Pintura roja","23","20", "16", "3"));

    }
     
}
