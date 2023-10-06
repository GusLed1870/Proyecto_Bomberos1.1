package bomberos_app;

import Acceso_a_Datos.Conexion;
import Acceso_a_Datos.Cuartel_data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Bomberos_APP {

    private Cuartel_data cuart;

    public static void main(String[] args) throws SQLException {
     
        Connection conn = Conexion.getConexion();
        
        
        // Bombero(String dni, String nombre_ape, LocalDate fecha_nac, int celular, Brigada brigada, String grupoSanguineo, boolean estado)
        
     // d) Insertar 3 Cuarteles.
        
            String sql = "INSERT INTO `cuartel` (`nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`) "
                + "VALUES ('Estación II Patricios', 'Av. Caseros 2849', '3445', '4567', '4943-2222', 'estpalermo@gmail.com'),"
                + "('Destacamento Nueva Pompeya', 'Av. Saenz 1457', '2342', '1275', '4911-4852', 'jhgghfh@gmail.com'),"
                + "('Estación III Barracas', 'Brandsen 1046', '8234', '0975', '4567-8655', 'dhfhswjj@gmail.com')";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        int filas = ps.executeUpdate();
        if (filas >0){
        JOptionPane.showMessageDialog(null, "Cuarteles agregados correctamente");
        }
//                       
//            // d) Insertar 4 Materias.
//            
//            String sql2 = "INSERT INTO materia(nombre, anio, estado) "
//                + "VALUES ('Análisis Matemático III', 3, 1),"
//                + "('Laboratorio I', 1, 1),"
//                + "('Álgebra III', 3, 1),"
//                + "('Lógica II', 2, 1)";
//        
//        PreparedStatement ps2 = conexion.prepareStatement(sql2);
//        int filas2 = ps2.executeUpdate();
//        if (filas2 > 0){
//        JOptionPane.showMessageDialog(null, "Materias agregadas correctamente");
//        }
    }
}
