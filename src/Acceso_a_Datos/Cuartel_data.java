package Acceso_a_Datos;

import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.JOptionPane;

public class Cuartel_data {

    //Atributos
    private Connection con = null;
    private Cuartel cuartel;

    //Constructor
    public Cuartel_data() {
        con = Conexion.getConexion();
    }

    //Métodos ABM
    public boolean compararCuarteles(Cuartel cuar) {
        boolean cuartelEncontrado = false;

        String nombre = cuar.getNombre_cuartel();
        String direccion = cuar.getDireccion();
        int coordenadaX = cuar.getCoord_X();
        int coordenadaY = cuar.getCoord_Y();
        String telefono = cuar.getTelefono();
        String correo = cuar.getCorreo();

        String sql = "SELECT COUNT(*) FROM cuartel WHERE nombre_cuartel = ? AND direccion = ? AND coord_X = ? AND coord_Y = ? AND telefono = ? AND correo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setInt(3, coordenadaX);
            ps.setInt(4, coordenadaY);
            ps.setString(5, telefono);
            ps.setString(6, correo);
            ResultSet rs = ps.executeQuery();
            System.out.println(rs);
            if (rs.next()) {
                int count = rs.getInt(1); // Obtiene el valor del recuento
                if (count > 0) {
                    JOptionPane.showMessageDialog(null, "ERROR!!! El cuartel ya se encuentra en la base de datos");
                    cuartelEncontrado = true;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al conectarse a la base de datos");
        }
        return cuartelEncontrado;
    }

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

    public Cuartel buscarCuartelId(int id) {
        String sql = "SELECT * FROM cuartel WHERE codCuartel = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cuartel = new Cuartel();

                cuartel.setCodCuartel(rs.getInt("codCuartel"));
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar cuartel");
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

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel " + ex.getMessage());
        }
    }
}
