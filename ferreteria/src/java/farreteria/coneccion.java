/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farreteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diego
 */
public class coneccion {

    private String drive = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    private String url = "jdbc:sqlserver://localhost:1433;databaseName=ferreteria;user=Diego;password=201723075";

    private Connection con;

    public coneccion() {
        try {
            Class.forName(drive);
            con = DriverManager.getConnection(url);
            System.out.println("Exito");
        } catch (ClassNotFoundException ex) {
            System.err.println("Error" + ex);
        } catch (SQLException ex) {
            System.err.println("Error2" + ex);
        }

    }

    public Connection getConexion() {
        return con;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        coneccion con = new coneccion();

    }

}
