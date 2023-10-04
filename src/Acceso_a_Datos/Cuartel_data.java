package Acceso_a_Datos;

import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Cuartel_data {

    //Atributos
    private Connection con = null;

    //Constructor
    public Cuartel_data() {
        con = Conexion.getConnection();
    }

    //Métodos ABM
    public void cargarCuartel(Cuartel cuartel) {

        String sql = "INSERT INTO cuartel ( nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
          
           
            
            
            
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel " + ex.getMessage());
        }

    }
}
