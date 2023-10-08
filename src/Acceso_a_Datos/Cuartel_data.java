package Acceso_a_Datos;

import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cuartel_data {

    //Atributos
    private Connection con = null;

    //Constructor
    public Cuartel_data() {
        con = Conexion.getConexion();
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
    
        public Cuartel buscarCuartel(int codCuartel) {
        Cuartel cuartel = null;
        String sql = "SELECT codCuartel, nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo FROM cuartel WHERE codCuartel = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cuartel = new Cuartel();
                cuartel.setCodCuartel(codCuartel);
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
          

            } else {
              ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return cuartel;
    }
        
         public List<Cuartel> listarCuarteles() {

        List<Cuartel> cuarteles = new ArrayList<>();
        try {
            String sql = "SELECT * FROM cuartel ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cuartel cuartel = new Cuartel();
                cuartel.setCodCuartel(rs.getInt("codCuartel"));
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                cuarteles.add(cuartel);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Cuartel " + ex.getMessage());
        }
        return cuarteles;
    }
}
