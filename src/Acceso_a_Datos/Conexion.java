package Acceso_a_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static String url = "jdbc:mariadb://localhost/bomberosg77";
    private static String usuario = "root";
    private static String password = "";
    private static Connection con;

    public static Connection getConexion() {
        try {
            if (con == null) {
                con = DriverManager.getConnection(url, usuario, password);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos. Error: " + ex.getMessage());
        }
        return con;
    }
}