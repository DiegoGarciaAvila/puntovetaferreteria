/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import Encapsulamiento.Dpersonal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class DAOPersonal extends coneccion {

    //Creamos un metodo tipo array, que guardate todo lo que encuentre en el encapsulamiento
    public ArrayList<Dpersonal> ListaPersonal() {
        //Preparamos pst para executar la consulta y rs para devolver los valores
        PreparedStatement pst = null;
        ResultSet rs = null;
        //Creamos un arraylist para poder guardar los valores obtenidos de la busqueda
        ArrayList<Dpersonal> ls = new ArrayList<Dpersonal>();

        try {
            //Creamos la consulta
            String consulta = "select *from personal";
            //Pedimos que se execute la consulta
            pst = getConexion().prepareStatement(consulta);
            //Pedimos devolver los valores obtenidos de la consulta
            rs = pst.executeQuery();
            //Creamos variables para guardar cada dato, fila por fila
            while (rs.next()) {
                //Pedimos los valores de la tabla, los numero son segun la pocicon en la que se estan recibiendo en el encapsulamiento
                String idpersonal = rs.getString(1);
                String nombre = rs.getString(2);
                String am = rs.getString(3);
                String ap = rs.getString(4);
                String salario = rs.getString(5);
                String contra = rs.getString(6);
                String cargo = rs.getString(7);
                String telefono = rs.getString(8);
                
                //Abrimos el encapsulamiento para poder mandarlos a visualizar
                Dpersonal dpersonal = new Dpersonal(idpersonal, nombre, am, ap, salario, contra, cargo, telefono);
                
                //Agregamos los datos obtenidos a la lista que vamos a visualizar
                ls.add(dpersonal);
            }

        } catch (SQLException ex) {
            System.err.println("Error1:" + ex);
        }

        return ls;

    }

    public boolean autorizacion(String usuario, String password) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            //Esto es para evitar sqlinyeccion, los signos de ? se aclaran mas abajo
            String consulta = "select * from personal where nombre = ? and contra = ?";
            //Llama a la coneccion
            pst = getConexion().prepareStatement(consulta);
            //Se asignan los valores a mandar en la consulta
            pst.setString(1, usuario);
            pst.setString(2, password);
            //Guarda el resultado de la consulta, si encuentra un registro
            rs = pst.executeQuery();

            //Si existe el registro manda verdadero, punto next es para que valla de uno en uno
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            System.err.println("Error1: " + e);
        } //Para cerrar todas las consultas, seguridad
        finally {
            try {
                //Cierra la conexion
                if (getConexion() != null) {
                    getConexion().close();
                }
                //Cirra la consulta
                if (pst != null) {
                    pst.close();
                }
                //Cierra los resultados
                if (rs != null) {
                    rs.close();
                }

            } catch (SQLException ex) {
                System.err.println("Error2" + ex);
            }
        }

        return false;

    }

    public boolean RegistrarPersonal(String id, String nombre, String am, String ap, String salario, String contra, String cargo, String telefono) {

        PreparedStatement pst = null;

        try {
            String consulta = "insert into personal (idpersonal,nombre,am,ap,salario,contra,cargo,telefono) values(?,?,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, id);
            pst.setString(2, nombre);
            pst.setString(3, am);
            pst.setString(4, ap);
            pst.setString(5, salario);
            pst.setString(6, contra);
            pst.setString(7, cargo);
            pst.setString(8, telefono);
            //executeUpdate() devueve un numero entero
            if (pst.executeUpdate() == 1) {

                return true;

            }

        } catch (Exception e) {
            System.err.println("Error1: " + e);

        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                };
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.err.println("Error2: " + e);

            }
        }

        return false;

    }

    public boolean EliminarPersonal(String id) {
        PreparedStatement pst = null;
        String consulta = "delete from personal where idpersonal= ? ";

        try {
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
                System.err.println("Error2:" + ex);
            }

        }

        return false;

    }

    public Dpersonal getModificarP(String id) {

        //Recivimos un el id que deceamos modificar
        PreparedStatement pst = null;
        ResultSet rs = null;
        Dpersonal dp = new Dpersonal();
        //Hacemos una busqueda en la base de datos respecto al id
        try {
            String consulta = "select * from personal where idpersonal= ? ";
            //ejecutamos el query
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, id);

            rs = pst.executeQuery();

            //Buscamos en la base de datos
            while (rs.next()) {
                //mandamos el valor a la clase encapsulamiento, para mostrar en la nueva ventana, necesitamos los numeros para ubicarlos en la tabla

                dp.setIdpersonal(rs.getString(1));
                dp.setNombre(rs.getString(2));
                dp.setAm(rs.getString(3));
                dp.setAp(rs.getString(4));
                dp.setSalario(rs.getString(5));
                dp.setContra(rs.getString(6));
                dp.setCargo(rs.getString(7));
                dp.setTelefono(rs.getString(8));

            }

        } catch (SQLException ex) {
            System.err.println("Error1: " + ex);
        }

        return dp;

    }

    public boolean ModificaF(String idpersonal, String nombre, String am, String ap, String salario, String contra, String cargo, String telefono) {

        PreparedStatement pst = null;

        try {
            String consulta = "update personal \n"
                    + "set nombre =? ,\n"
                    + "am= ? ,\n"
                    + "ap= ? ,\n"
                    + "salario= ? ,\n"
                    + "contra = ? ,\n"
                    + "cargo= ? ,\n"
                    + "telefono= ? \n"
                    + "where idpersonal = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, am);
            pst.setString(3, ap);
            pst.setString(4, salario);
            pst.setString(5, contra);
            pst.setString(6, cargo);
            pst.setString(7, telefono);
            pst.setString(8, idpersonal);
            DAOPersonal pd = new DAOPersonal();
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

}
