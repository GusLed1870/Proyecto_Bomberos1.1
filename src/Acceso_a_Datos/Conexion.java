package Acceso_a_Datos;

import java.sql.Connection;

public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost:3307/";
    private static final String DB = "universidad";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection connection;
}
