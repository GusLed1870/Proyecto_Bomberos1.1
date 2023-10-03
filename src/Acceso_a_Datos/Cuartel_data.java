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

    private Connection con = null;

    public Cuartel_data() {
        con = Conexion.getConnection();
    }

    public void cargarCuartel(Cuartel cuartel) {
        String sql = "INSERT INTO cuartel (codCuartel, nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cuartel.getCodCuartel());
            ps.setString(2, cuartel.getNombre_cuartel());
            ps.setString(3, cuartel.getDireccion());
            ps.setInt(4, cuartel.getCoord_X());
            ps.setInt(5, cuartel.getCoord_Y());
            ps.setString(6, cuartel.getTelefono());
            ps.setString(7, cuartel.getCorreo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel " + ex.getMessage());
        }
    }
}
