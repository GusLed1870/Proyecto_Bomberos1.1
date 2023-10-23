package Acceso_a_Datos;

import Entidades.Brigada;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SiniestroData {

    //Atributos
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

    // Método para calcular la distancia entre dos puntos
    public double calcularDistancia(double coord_X1, double coord_Y1, double coord_X2, double coord_Y2) {
        double distanciaX = coord_X2 - coord_X1;
        double distanciaY = coord_Y2 - coord_Y1;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
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

    // Método para calcular la distancia entre un cuartel y un siniestro
    public double distanciaCuartelSiniestro(int cuartelId, int siniestroId, Connection connection) {
        double[] coordenadasCuartel = obtenerCoordenadasCuartel(cuartelId);
        double[] coordenadasSiniestro = obtenerCoordenadasSiniestro(siniestroId);

        if (coordenadasCuartel != null && coordenadasSiniestro != null) {
            return calcularDistancia(
                    coordenadasCuartel[0],
                    coordenadasCuartel[1],
                    coordenadasSiniestro[0],
                    coordenadasSiniestro[1]
            );
        } else {
            // Si no se encuentran las coordenadas, retorna un valor negativo para indicar un error
            return -1.0;
        }
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
}
