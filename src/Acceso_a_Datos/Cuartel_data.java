package Acceso_a_Datos;

import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cuartel_data {

    private Connection con = null;

    public Cuartel_data() {
        con = Conexion.getConexion();
    }

    public void cargarCuartel(Cuartel cuartel) {
        String sql = "INSERT INTO cuartel (nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo) VALUES (?, ?, ?, ?, ?, ?)";
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
            if (rs.next()) {
                cuartel.setCodCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cuartel añadido con éxito. Código: " + cuartel.getCodCuartel());
            } 
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla cuartel " + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel " + ex.getMessage());
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

    public boolean compararCuarteles(Cuartel cuar) {
        boolean cuartelEncontrado = false;
        String nombre = cuar.getNombre_cuartel();
        String sql = "SELECT COUNT(*) FROM cuartel WHERE nombre_cuartel = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1); 
                if (count > 0) {
                    JOptionPane.showMessageDialog(null, "Ya existe un cuartel con ese nombre en la base de datos");
                    cuartelEncontrado = true;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectarse a la base de datos");
        }
        return cuartelEncontrado;
    }

    public Cuartel buscarCuartelPorId(int id) {
        String sql = "SELECT * FROM cuartel WHERE codCuartel = ?";
        Cuartel cuartel = new Cuartel();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cuartel.setCodCuartel(rs.getInt("codCuartel"));
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un cuartel con ID/Código: "+id);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos");
        }
        return cuartel;
    }

    public void modificarCuartel(Cuartel cuartel) {
        String sql = "UPDATE cuartel SET nombre_cuartel = ?, direccion = ?, coord_X = ?, coord_Y = ?, telefono = ?, correo = ? WHERE codCuartel = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.setInt(7, cuartel.getCodCuartel());
            int modificado = ps.executeUpdate();
           if (modificado == 1) {
                JOptionPane.showMessageDialog(null, "Cuartel modificado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un cuartel con ID/Código: " + cuartel.getCodCuartel());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel" + ex.getMessage());
        }
    }
}
