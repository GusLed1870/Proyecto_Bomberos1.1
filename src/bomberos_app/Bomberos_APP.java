package bomberos_app;

import Acceso_a_Datos.Conexion;
import java.sql.Connection;

public class Bomberos_APP {

    public static void main(String[] args) {

        Connection Connection = Conexion.getConnection();
    }
}
