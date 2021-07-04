/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import Encapsulamiento.DDetalleEncargo;
import Encapsulamiento.DEncargos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class DAOEncargos extends coneccion {

    public ArrayList<DEncargos> getListaEncargos() {
        ArrayList<DEncargos> al = new ArrayList<DEncargos>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select*from encargos";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {

                String idencargo = rs.getString(1);
                String nombre = rs.getString(2);
                String fecha = rs.getString(3);
                String total = rs.getString(4);
                DEncargos de = new DEncargos(idencargo, nombre, fecha, total);
                al.add(de);
            }

        } catch (SQLException e) {
            System.err.println("Error1: "+ e);
        }

        return al;

    }

    public boolean NuevoEncargo(String idencargo, String nombre, String fecharealizado) {

        PreparedStatement pst = null;
        String consulta = "insert into encargos (idencargo,nombre,fecharealizado) values(?,?,?)";
        try {
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idencargo);
            pst.setString(2, nombre);
            pst.setString(3, fecharealizado);

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

    public boolean modificarEncargo(String idproducto) {
        PreparedStatement pst = null;
        
        DEncargos de = new DEncargos();

        try {
            String consulta = "UPDATE encargos SET \n"
                    + "encargos.total = (SELECT SUM(detalleencargos.subtotal) from detalleencargos where detalleencargos.idencargo=?)\n"
                    + "where encargos.idencargo=?";

            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idproducto);
            pst.setString(2, idproducto);
            if (pst.executeUpdate()==1) {
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error1:" + e);
        }

        return false;

    }

     /*public static void main(String[] args) {
        DAOEncargos de = new DAOEncargos();
        System.out.println(de.modificarEncargo("1"));
    } 
   */
}
