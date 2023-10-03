package Acceso_a_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    //Atributos
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "bomberos";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection connection;
    
    //Constructor
    private Conexion(){}
    
    //Método adicional
    public static Connection getConnection(){
        
        if(connection == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC" +
                                                         "&user=" + USER + "&password=" + PASSWORD);
                System.out.println("Conectado correctamente.\n");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers: " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD: " + ex.getMessage());
            }
        }
        
        return connection;
    }
}