/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import Encapsulamiento.Dnotas;
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
public class DAONotas extends coneccion {

    public ArrayList<Dnotas> getListaNotas() {
        ArrayList<Dnotas> al = new ArrayList<Dnotas>();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "select notas.idnotas,notas.descripcion, personal.nombre \n"
                    + "from notas,personal where notas.idpersonal=personal.idpersonal;";
            pst = getConexion().prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {
                String idnotas = rs.getString(1);
                String descripcion = rs.getString(2);
                String idpersonal = rs.getString(3);
                Dnotas dn = new Dnotas(idnotas, descripcion, idpersonal);
                al.add(dn);

            }
        } catch (SQLException e) {
            System.err.println("Error1: " + e);

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs!= null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("Error2: " + e);

            }
        }

        return al;

    }

    public boolean NuevoNota(String idnota, String descripcion, String idpersonal) {
        PreparedStatement pst = null;

        try {
            String consulta = "insert into notas (idnotas,descripcion,idpersonal) values(?,?,?)";

            pst = getConexion().prepareStatement(consulta);

            pst.setString(1, idnota);
            pst.setString(2, descripcion);
            pst.setString(3, idpersonal);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error1: " + ex);
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                System.err.println("Error2: " + e);

            }
        }
        return false;
    }

    public static void main(String[] args) {
        DAONotas dn = new DAONotas();
        System.out.println(dn.NuevoNota("1", "Realizar limpieza del pasillo 1", "1"));
    }

}
