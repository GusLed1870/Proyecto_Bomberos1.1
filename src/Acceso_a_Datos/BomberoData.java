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
        int brigadaId = bombero.getBrigada().getCodBrigada();
        int cantidadBomberosEnBrigada = contarBomberosEnBrigada(brigadaId);
        if (cantidadBomberosEnBrigada >= 5) {
            JOptionPane.showMessageDialog(null, "La brigada ya tiene 5 bomberos. Debe asignar otra brigada.");
        } else {
            String sql = "INSERT INTO bombero (dni, nombre_ape, fecha_nac, celular, codBrigada, grupoSanguineo, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, bombero.getDni());
                ps.setString(2, bombero.getNombre_ape());
                ps.setDate(3, Date.valueOf(bombero.getFecha_nac()));
                ps.setLong(4, bombero.getCelular());
                ps.setInt(5, brigadaId);
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
                JOptionPane.showMessageDialog(null, "Error al guardar el bombero: " + ex.getMessage());
            }
        }
    }

    public Bombero buscarBomberoPorID(int id) {
        Bombero bombero = null;
        String sql = "SELECT * FROM bombero WHERE id_bombero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bombero = new Bombero();
                brigada = new Brigada();
                BrigadaData briData = new BrigadaData();
                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre_ape(rs.getString("nombre_ape"));
                bombero.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                bombero.setCelular(rs.getLong("celular"));
                bombero.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                bombero.setEstado(rs.getBoolean("estado"));
                int codBri = rs.getInt("codBrigada");
                brigada = briData.buscarBrigada(codBri);
                bombero.setBrigada(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una brigada");
        }
        return bombero;
    }

    public Bombero buscarBomberoPordni(String dni) {
        Bombero bombero = null;
        String sql = "SELECT * FROM bombero WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bombero = new Bombero();
                brigada = new Brigada();
                BrigadaData briData = new BrigadaData();
                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre_ape(rs.getString("nombre_ape"));
                bombero.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                bombero.setCelular(rs.getLong("celular"));
                bombero.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                bombero.setEstado(rs.getBoolean("estado"));
                int codBri = rs.getInt("codBrigada");
                brigada = briData.buscarBrigada(codBri);
                bombero.setBrigada(brigada);
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
        int brigadaId = bombero.getBrigada().getCodBrigada();
        int cantidadBomberosEnBrigada = contarBomberosEnBrigada(brigadaId);
        if (cantidadBomberosEnBrigada >= 5) {
            JOptionPane.showMessageDialog(null, "La brigada ya tiene 5 bomberos. Debe asignar otra brigada.");
            return;
        }
        String sql = "UPDATE bombero SET dni = ?, nombre_ape = ?, fecha_nac = ?, celular = ?, codBrigada = ?, grupoSanguineo = ?, estado = ? WHERE id_bombero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setDate(3, java.sql.Date.valueOf(bombero.getFecha_nac()));
            ps.setLong(4, bombero.getCelular());
            ps.setInt(5, bombero.getBrigada().getCodBrigada());
            ps.setString(6, bombero.getGrupoSanguineo());
            ps.setBoolean(7, bombero.isEstado());
            ps.setInt(8, bombero.getId_bombero());
            int modificado = ps.executeUpdate();
            if (modificado == 1) {
                JOptionPane.showMessageDialog(null, "Bombero modificado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un bombero con DNI: " + bombero.getDni());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero " + ex.getMessage());
        }
    }

    private int contarBomberosEnBrigada(int brigadaId) {
        String cantBomberos = "SELECT COUNT(*) FROM bombero WHERE codBrigada = ?";
        int cont = 0;
        try {
            PreparedStatement ps1 = con.prepareStatement(cantBomberos);
            ps1.setInt(1, brigadaId);
            ResultSet rs = ps1.executeQuery();
            if (rs.next()) {
                cont = rs.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al contar los bomberos en la brigada: " + ex.getMessage());
        }
        return cont; // En caso de error, se asume que no hay bomberos en la brigada.
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

    public int buscarBomberoIdPorDni(String dni) {
        int bomberoId = -1; // Valor predeterminado en caso de que no se encuentre el bombero
        String sql = "SELECT id_bombero FROM bombero WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bomberoId = rs.getInt("id_bombero");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un bombero con DNI: " + dni);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero " + ex.getMessage());
        }
        return bomberoId;
    }

    public boolean buscarBomberoIdPorDni2(String dni) {
        boolean bomb = false;
        String sql = "SELECT COUNT(*) FROM bombero WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);  // Obtener el valor COUNT(*) del resultado
                if (count > 0) {
                    bomb = true;  // Si count es mayor que 0, se encontró un bombero
                    return bomb;
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero " + ex.getMessage());
        }
        return bomb;
    }

    public List<Bombero> listarBomberos2(String apell) {
        List<Bombero> bomberos = new ArrayList<>();
        try {
            String sql = "SELECT id_Bombero, dni, nombre_ape, celular FROM bombero WHERE nombre_ape like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, apell + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bombero bomb = new Bombero();
                bomb.setId_bombero(rs.getInt("id_bombero"));
                bomb.setDni(rs.getString("dni"));
                bomb.setNombre_ape(rs.getString("nombre_ape"));
                bomb.setCelular(rs.getLong("celular"));
                bomberos.add(bomb);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Bombero. Error: " + ex.getMessage());
        }
        return bomberos;
    }
}
