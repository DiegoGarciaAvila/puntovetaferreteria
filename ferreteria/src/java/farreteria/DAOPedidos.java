/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import Encapsulamiento.Dpedidos;
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
public class DAOPedidos extends coneccion {

    public ArrayList<Dpedidos> getListaPedidos() {

        ArrayList<Dpedidos> al = new ArrayList<Dpedidos>();
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            String consulta = "select*from pedido";
            pst = getConexion().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {

                String idpersonal= rs.getString(1);
                String fecha = rs.getString(2);
                Dpedidos dp = new Dpedidos(idpersonal, fecha);
                al.add(dp);
                
                
            }
        } catch (SQLException ex) {
            System.err.println("Error1: " + ex);
        }

        return al;

    }

    public boolean NuevoPedido(String idpedido, String fecha) {
        PreparedStatement pst = null;

        try {
            String consulta = "insert into pedido (idpedido,fecha) values  (?,?)";

            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idpedido);
            pst.setString(2, fecha);
            DAOPedidos dp = new DAOPedidos();

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error1:" + ex);
        } finally {

            try {
                if (pst != null) {
                    pst.close();
                }
                if (getConexion() != null) {
                    getConexion().close();
                }
            } catch (SQLException ex) {
                System.err.println("Error2:" + ex);
            }
        }

        return false;

    }

 /*   public static void main(String[] args) {
        DAOPedidos dp = new DAOPedidos();
        System.out.println(dp.NuevoPedido("3", "12 jul"));
    }
*/

}
