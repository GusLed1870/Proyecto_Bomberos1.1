package Acceso_a_Datos;

import Entidades.Bombero;
import Entidades.Brigada;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BomberoData {

    private Connection con = null;
    private Brigada brigada;

    public BomberoData() {
        con = Conexion.getConexion();
    }

    public void guardarBombero(Bombero bombero) {

        String sql = "INSERT INTO bombero (dni, nombre_ape, fecha_nac, celular, codBrigada, grupoSanguineo, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setDate(3, Date.valueOf(bombero.getFecha_nac()));
            ps.setInt(4, bombero.getCelular());
            ps.setInt(5, bombero.getBrigada().getCodBrigada());
            ps.setString(6, bombero.getGrupoSanguineo());
            ps.setBoolean(7, bombero.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                bombero.setId_bombero(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Bombero añadido con éxito. Legajo: " + bombero.getId_bombero());

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero: " + ex.getMessage());
        }
    }

    public Bombero buscarBomberoPorID(int id) {

        Bombero bombero = null;
        String sql = "SELECT dni, nombre_ape, fecha_nac, celular, grupoSanguineo, estado FROM bombero WHERE id_bombero = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bombero = new Bombero();
                bombero.setId_bombero(id);
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre_ape(rs.getString("nombre_ape"));
                bombero.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                bombero.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                bombero.setEstado(rs.getBoolean("estado"));

            } else {
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero " + ex.getMessage());
        }

        return bombero;
    }

    public Bombero buscarBomberoPordni(String dni) {

        Bombero bombero = null;
        String sql = "SELECT * FROM bombero WHERE dni = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bombero = new Bombero();
                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre_ape(rs.getString("nombre_ape"));
                bombero.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                bombero.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                bombero.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el bombero");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero " + ex.getMessage());

        }
        return bombero;
    }

    public List<Bombero> listarBomberos() {

        List<Bombero> bomberos = new ArrayList<>();
        String sql = "SELECT * FROM bombero WHERE estado = 1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Bombero bombero = new Bombero();

                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre_ape(rs.getString("nombre_ape"));
                bombero.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                bombero.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                bombero.setEstado(rs.getBoolean("estado"));
                bomberos.add(bombero);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla bombero " + ex.getMessage());
        }
        return bomberos;
    }

    public void modificarBombero(Bombero bombero) {

        BomberoData bomberodata = new BomberoData();
        int id = bombero.getId_bombero();
        String sql = "UPDATE bombero SET dni = ? , nombre_ape = ?, fecha_nac = ?, grupoSanguineo = ?, estado = ? WHERE id_bombero = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setDate(3, Date.valueOf(bombero.getFecha_nac()));
            ps.setString(4, bombero.getGrupoSanguineo());
            ps.setBoolean(5, bombero.isEstado());
            ps.setInt(6, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Bombero modificado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "El Bombero no existe");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero " + ex.getMessage());
        }
    }

    public void eliminarBombero(int id) {

        String sql = "UPDATE bombero SET estado = 0 WHERE id_bombero = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el bombero.");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla bombero. ");
        }
    }

    public int buscarBomberoIdPorDni(int dni) {

        int bomberoId = -1; // Valor predeterminado en caso de que no se encuentre el alumno
        String sql = "SELECT id_bombero FROM bombero WHERE dni = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bomberoId = rs.getInt("id_bombero");

            } else {
                JOptionPane.showMessageDialog(null, "No existe el bombero con DNI: " + dni);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero " + ex.getMessage());
        }
        return bomberoId;
    }

    public boolean buscarBomberoIdPorDni2(int dni) {

        boolean bomb = false;
        String sql = "SELECT COUNT(*) FROM bombero WHERE dni = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bomb = true;

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero " + ex.getMessage());
        }
        return bomb;
    }
}
