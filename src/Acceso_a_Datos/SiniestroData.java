package Acceso_a_Datos;

import Entidades.Brigada;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SiniestroData {

    private Connection con = null;
    private Brigada brigada;

    public SiniestroData() {
        con = Conexion.getConexion();
    }

    public void cargarSiniestro(Siniestro siniestro) {
        String sql = "INSERT INTO siniestro (tipo, fecha_siniestro, coord_X, coord_Y, detalles, fecha_resol, codBrigada) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFecha_siniestro()));
            ps.setInt(3, siniestro.getCoord_X());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setDate(6, Date.valueOf(siniestro.getFecha_resol()));
            ps.setInt(7, siniestro.getBrigada().getCodBrigada());
            int registro = ps.executeUpdate();
            if (registro > 0) {
                JOptionPane.showMessageDialog(null, "Siniestro cargado correctamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro.");
        }
    }

    public void cargarSiniestro2(Siniestro siniestro) {
        String sql = "INSERT INTO siniestro (tipo, fecha_siniestro, coord_X, coord_Y, detalles, codBrigada) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFecha_siniestro()));
            ps.setInt(3, siniestro.getCoord_X());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setInt(6, siniestro.getBrigada().getCodBrigada());
            int registro = ps.executeUpdate();
            if (registro > 0) {
                JOptionPane.showMessageDialog(null, "Siniestro cargado correctamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro.");
        }
    }

    public double[] obtenerCoordenadasCuartel(int cuartelId) {
        String sql = "SELECT coord_X, coord_Y FROM cuartel WHERE codCuartel = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, cuartelId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    double coord_X = rs.getDouble("coord_X");
                    double coord_Y = rs.getDouble("coord_Y");
                    return new double[]{coord_X, coord_Y};
                }
            } catch (SQLException innerEx) {
                JOptionPane.showMessageDialog(null, "Error al intentar conectar con la tabla cuartel");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos");
        }
        return null;
    }

    // Método para obtener las coordenadas de un siniestro desde la base de datos
    public double[] obtenerCoordenadasSiniestro(int siniestroId) {
        String sql = "SELECT coord_X, coord_Y FROM siniestro WHERE codigo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, siniestroId);

            try {
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    double coord_X = rs.getDouble("coord_X");
                    double coord_Y = rs.getDouble("coord_Y");
                    return new double[]{coord_X, coord_Y};
                }
            } catch (SQLException innerEx) {
                JOptionPane.showMessageDialog(null, "Error al intentar conectar con la tabla siniestro");
            } finally {
                if (ps != null) {
                    ps.close();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos");
        }
        return null;
    }

    public ArrayList<String> brigadaAsignada(String especialidad) {
        ArrayList<String> brigadasDisponibles = new ArrayList<>();
        String sql = "SELECT brigada.codBrigada as ID, brigada.nombre_br as Nombre, cuartel.coord_X as coord_X , "
                + "cuartel.coord_Y as coord_Y FROM brigada JOIN cuartel ON brigada.nro_cuartel = cuartel.codCuartel "
                + "WHERE brigada.especialidad = ? AND brigada.libre = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad);

            try {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    StringBuilder valores = new StringBuilder();
                    valores.append(rs.getString("ID")).append(" ");
                    valores.append(rs.getString("Nombre")).append(" ");
                    valores.append(rs.getString("coord_X")).append(" ");
                    valores.append(rs.getString("coord_Y")).append(" ");

                    brigadasDisponibles.add(valores.toString());
                }
            } catch (SQLException innerEx) {
                JOptionPane.showMessageDialog(null, "Error al intentar conectar con una tabla de la base de datos");
            } finally {
                if (ps != null) {
                    ps.close();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos");
        }
        return brigadasDisponibles;
    }

    public void modificarSiniestro(Siniestro siniestro) {
        String sql = "UPDATE INTO siniestro (tipo, fecha_siniestro, coord_X, coord_Y, detalles, fecha_resol, codBrigada,puntuacion) VALUES (?,?,?,?,?,?,?,?) where codigo=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFecha_siniestro()));
            ps.setInt(3, siniestro.getCoord_X());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setDate(6, Date.valueOf(siniestro.getFecha_resol()));
            ps.setInt(7, siniestro.getBrigada().getCodBrigada());
            ps.setInt(8, siniestro.getPuntuacion());
            ps.setInt(9, siniestro.getCodigo());
            int registro = ps.executeUpdate();
            if (registro > 0) {
                JOptionPane.showMessageDialog(null, "Siniestro cargado correctamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro.");
        }
    }

    public void modificarSiniestro2(Siniestro siniestro) {
        String sql = "UPDATE INTO siniestro (tipo, fecha_siniestro, coord_X, coord_Y, detalles, codBrigada) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFecha_siniestro()));
            ps.setInt(3, siniestro.getCoord_X());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalles());
            ps.setInt(6, siniestro.getBrigada().getCodBrigada());
            int registro = ps.executeUpdate();
            if (registro > 0) {
                JOptionPane.showMessageDialog(null, "Siniestro cargado correctamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro.");
        }
    }

    public Siniestro buscarSiniestroPorId(int id) {
        Siniestro siniestro = null;
        String sql = "SELECT * FROM siniestro WHERE codigo = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                siniestro = new Siniestro();
                SiniestroData siniData = new SiniestroData();
                siniestro.setCodigo(rs.getInt("codigo"));
                siniestro.setTipo(rs.getString("tipo"));
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setCoord_X(rs.getInt("coord_X"));
                siniestro.setCoord_Y(rs.getInt("coord_Y"));
                siniestro.setDetalles(rs.getString("detalles"));

                // Verificar si la columna "fecha_resol" es nula en la base de datos
                Date fechaResolDB = rs.getDate("fecha_resol");
                if (fechaResolDB != null) {
                    siniestro.setFecha_resol(fechaResolDB.toLocalDate());
                } else {
                    siniestro.setFecha_resol(null); // Opcionalmente, puedes establecerlo como null si la base de datos almacena NULL
                }

                siniestro.setPuntuacion(rs.getInt("puntuacion"));
                int codBri = rs.getInt("codBrigada");
                BrigadaData briData = new BrigadaData();
                brigada = briData.buscarBrigada(codBri);
                siniestro.setBrigada(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro " + ex.getMessage());
        }
        return siniestro;
    }

    public List<Siniestro> listarSiniestros(String tipo) {
        List<Siniestro> siniestros = new ArrayList<>();
        try {
            String sql = "SELECT codigo, fecha_siniestro, coord_X, coord_Y, detalles, fecha_resol, puntuacion, codBrigada FROM siniestro WHERE tipo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Siniestro sin = new Siniestro();
                sin.setCodigo(rs.getInt("codigo"));
                sin.setTipo(rs.getString("tipo"));
                sin.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                sin.setCoord_X(rs.getInt("coord_X"));
                sin.setCoord_Y(rs.getInt("coord_Y"));
                sin.setDetalles(rs.getString("detalles"));
                sin.setFecha_resol(rs.getDate("fecha_resol").toLocalDate());
                sin.setPuntuacion(rs.getInt("puntuacion"));
                int codBri = rs.getInt("codBrigada");
                BrigadaData briData = new BrigadaData();
                brigada = briData.buscarBrigada(codBri);
                sin.setBrigada(brigada);
                siniestros.add(sin);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro. Error: " + ex.getMessage());
        }
        return siniestros;
    }

    public List<String> listarSiniestros2(String tipo) {
        List<String> siniestrosStrings = new ArrayList<>();

        try {
            String sql = "SELECT codigo, fecha_siniestro, coord_X, coord_Y, detalles, fecha_resol, puntuacion, brigada.nombre_br as nombre FROM siniestro "
                    + "JOIN brigada ON siniestro.codBrigada = brigada.codBrigada WHERE tipo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                StringBuilder siniestroString = new StringBuilder();
                siniestroString.append(rs.getInt("codigo")).append(", ");
//            siniestroString.append(tipo).append(", ");
                siniestroString.append(rs.getDate("fecha_siniestro").toLocalDate()).append(", ");
                siniestroString.append(rs.getInt("coord_X")).append(", ");
                siniestroString.append(rs.getInt("coord_Y")).append(", ");
                siniestroString.append(rs.getString("nombre")).append(", ");

//            // Convertir codBrigada a cadena y agregarlo
//            int codBri = rs.getInt("codBrigada");
//            siniestroString.append(String.valueOf(codBri)).append(", ");         
//            // Convertir puntuacion a cadena y agregarla
//            int puntuacion = rs.getInt("puntuacion");
//            siniestroString.append(String.valueOf(puntuacion));
                siniestrosStrings.add(siniestroString.toString());
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro. Error: " + ex.getMessage());
        }

        return siniestrosStrings;
    }
}
//
//    public List<Siniestro> listarSiniestros(String tipo) {
//
//        List<Siniestro> siniestros = new ArrayList<>();
//        try {
//            String sql = "SELECT siniestro.codigo as ID, siniestro.tipo as Tipo, siniestro.fecha_siniestro as Fecha, "
//                    + "siniestro.coord_X as Coord_X, siniestro.coord_Y as Coord_Y, brigada.nombre_br FROM siniestro "
//                    + "JOIN brigada ON siniestro.codigo = brigada.codBrigada WHERE siniestro.tipo = ?";
//           
//            "SELECT brigada.codBrigada as ID, brigada.nombre_br as Nombre, cuartel.coord_X as coord_X , "
//                    + "cuartel.coord_Y as coord_Y FROM brigada JOIN cuartel ON brigada.codBrigada = cuartel.codCuartel "
//                    + "WHERE brigada.especialidad = ? AND brigada.libre = 1";

//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, apell + "%");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Bombero bomb = new Bombero();
//
//                bomb.setId_bombero(rs.getInt("id_bombero"));
//                bomb.setDni(rs.getString("dni"));
//                bomb.setNombre_ape(rs.getString("nombre_ape"));
//                bomb.setCelular(rs.getInt("celular"));
//
//                bomberos.add(bomb);
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Bombero. Error: " + ex.getMessage());
//        }
//        return bomberos;
//    }
//      
//}
