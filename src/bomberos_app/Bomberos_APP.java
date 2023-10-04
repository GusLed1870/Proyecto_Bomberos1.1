package bomberos_app;

import Acceso_a_Datos.Conexion;
import Acceso_a_Datos.Cuartel_data;
import Entidades.Cuartel;
import java.sql.Connection;

public class Bomberos_APP {

    private Cuartel_data cuart;

    public static void main(String[] args) {
     
        Connection Connection = Conexion.getConnection();
    }
}
