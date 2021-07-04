/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import Encapsulamiento.DDetallePedido;
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
public class DAODetallePedido extends coneccion {

    public ArrayList<DDetallePedido> getDetallePedido(String idpedido) {

        ArrayList<DDetallePedido> al = new ArrayList<DDetallePedido>();
        DDetallePedido dp = new DDetallePedido();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "select pedido.idpedido,producto.nombre,producto.tocks\n"
                    + "from producto inner join detallepedido on producto.idproducto=detallepedido.idproducto \n"
                    + "inner join pedido on pedido.idpedido=detallepedido.idpedido\n"
                    + "where pedido.idpedido=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idpedido);
            rs = pst.executeQuery();

            while (rs.next()) {
                String idpedidos = rs.getString(1);
                String idproducto = rs.getString(2);
                String cantidad = rs.getString(3);
                DDetallePedido dpp = new DDetallePedido(idpedidos, idproducto, cantidad);
                al.add(dpp);
            }

        } catch (SQLException e) {
            System.err.println("Error1: " + e);

        }

        return al;

    }
    

   
    public boolean NuevoDetallePedido(String idpedido) {

        PreparedStatement pst = null;

        try {
            String consulta = "insert into detallepedido (idpedido,idproducto,cantidad)\n"
                    + "select pedido.idpedido,producto.idproducto,producto.tocks from pedido ,producto \n"
                    + "where pedido.idpedido = ? and producto.tocks <=15";

            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, idpedido);
            //el executeUpdate gresa el valor numerico de las filas afectadas
            //System.out.println(pst.executeUpdate() + "");

            if (pst.executeUpdate() != 0) {
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

    /* public static void main(String[] args) {
        DAODetallePedido ddp = new DAODetallePedido();
        System.out.println(ddp.NuevoDetallePedido("1"));
    }
     */
}
