/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import Encapsulamiento.DVentas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class DAOVentas extends coneccion {

    public ArrayList<DVentas> getListaVentas() {
        ArrayList<DVentas> al = new ArrayList<DVentas>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select*from ventas";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {

                String ideventa = rs.getString(1);
                String total = rs.getString(2);
                String fecha = rs.getString(3);
                String idpersonal = rs.getString(4);
                DVentas de = new DVentas(ideventa, total, fecha, idpersonal);
                al.add(de);
            }

        } catch (SQLException e) {
            System.err.println("Error1: " + e);
        }

        return al;

    }

    public boolean NuevoVenta (String idencargo, String fecha, String idpersonal ) {

        PreparedStatement pst = null;
        String consulta = "insert into ventas (idventa,fecha,idpersonal) values(?,?,?)";
        try {
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idencargo);
            pst.setString(2, fecha);
            pst.setString(3, idpersonal);

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

    public boolean modificarVenta(String idproducto) {
        PreparedStatement pst = null;

      DVentas de = new DVentas();

        try {
            String consulta = "UPDATE ventas SET ventas.total = (SELECT SUM(detalleventa.subtotal) from detalleventa where detalleventa.idventa=?) where ventas.idventa=? ";

            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idproducto);
            pst.setString(2, idproducto);
            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error1:" + e);
        }

        return false;

    }

    /*public static void main(String[] args) {
        DAOVentas de = new DAOVentas();
        System.out.println(de.NuevoVenta("2", "26/06/2020", "1"));
    }
    */
}
