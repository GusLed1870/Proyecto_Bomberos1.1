package Acceso_a_Datos;

import Entidades.Brigada;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class BrigadaData {

    private Connection con = null;

    public BrigadaData() {
        con = Conexion.getConexion();
    }

    public void guardarBrigada(Brigada brigada) {

        String sql = "INSERT INTO brigada(codBrigada, nombre_br, especialidad, libre, nro_cuartel) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, brigada.getCodBrigada());
            ps.setString(2, brigada.getNombre_br());
            ps.setString(3, brigada.getEspecialidad());
            ps.setBoolean(4, brigada.isLibre());
            ps.setInt(5, brigada.getCuartel().getCodCuartel());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Brigada Añadida con éxito: ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada " + ex.getMessage());
        }
    }

    public int buscarBrigada(String nombreBrigada) {
        int codBrigada = -1; // Valor por defecto si no se encuentra la brigada
        String sql = "SELECT codBrigada FROM brigada WHERE nombre_br = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreBrigada);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                codBrigada = rs.getInt("codBrigada");

            } else {
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada " + ex.getMessage());
        }
        return codBrigada;
    }

    public Brigada buscarBrigada(int codBrigada) {
        Brigada brigada = null;
        Cuartel_data cuartelData = new Cuartel_data(); // Cambio de Cuartel_data a CuartelData
        String sql = "SELECT codBrigada, nombre_br, especialidad, libre, nro_cuartel FROM brigada WHERE codBrigada = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                brigada = new Brigada();
                brigada.setCodBrigada(codBrigada);
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));

                int codCuartel = rs.getInt("nro_cuartel");

                Cuartel cuartel = cuartelData.buscarCuartel(codCuartel); // Usar cuartelData en lugar de CuartelData

                brigada.setCuartel(cuartel);
            } else {
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada " + ex.getMessage());
        }
        return brigada;
    }

    public List<Brigada> listarBrigadas() {

        List<Brigada> listaBrigadas = new ArrayList<>();
        String sql = "SELECT b.*, c.* FROM brigada b JOIN cuartel c ON b.nro_cuartel = c.codCuartel";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();
                Cuartel cuartel = new Cuartel();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));

                cuartel.setCodCuartel(rs.getInt("nro_cuartel"));
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));

                brigada.setCuartel(cuartel);

                listaBrigadas.add(brigada);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada " + ex.getMessage());
        }
        return listaBrigadas;
    }

    public Brigada buscarBrigada2(int codBrigada) {
        Brigada brigada = null;
        Cuartel_data cuartelData = new Cuartel_data();
        String sql = "SELECT codBrigada, nombre_br, especialidad, libre, nro_cuartel FROM brigada WHERE codBrigada = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                brigada = new Brigada();
                brigada.setCodBrigada(codBrigada);
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));

                int codCuartel = rs.getInt("nro_cuartel");

                Cuartel cuartel = cuartelData.buscarCuartel(codCuartel);

                brigada.setCuartel(cuartel);
            } else {
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada " + ex.getMessage());
        }
        return brigada;
    }

    public List<Brigada> listarBrigadas2() {
        List<Brigada> listaBrigadas = new ArrayList<>();
        String sql = "SELECT * FROM brigada ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();
                Cuartel cuartel = new Cuartel();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));

                int codCuartel = rs.getInt("nro_cuartel");
                cuartel.setCodCuartel(codCuartel);

                // Ahora debes obtener el objeto Cuartel asociado al código del cuartel
                Cuartel_data cuartelData = new Cuartel_data();
                Cuartel cuartelAsociado = cuartelData.buscarCuartel(codCuartel);

                /* if (cuartelAsociado != null) {
                    cuartel.setNombre_cuartel(cuartelAsociado.getNombre_cuartel());
                    // Otros atributos del cuartel si es necesario
                }*/
                brigada.setCuartel(cuartelAsociado);

                listaBrigadas.add(brigada);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada " + ex.getMessage());
        }
        return listaBrigadas;
    }

    public List<Brigada> listarBrigadaslibres() {
        List<Brigada> listaBrigadas = new ArrayList<>();
        String sql = "SELECT * FROM brigada where libre=1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();
                Cuartel cuartel = new Cuartel();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));

                int codCuartel = rs.getInt("nro_cuartel");
                cuartel.setCodCuartel(codCuartel);

                // Ahora debes obtener el objeto Cuartel asociado al código del cuartel
                Cuartel_data cuartelData = new Cuartel_data();
                Cuartel cuartelAsociado = cuartelData.buscarCuartel(codCuartel);

                if (cuartelAsociado != null) {
                    cuartel.setNombre_cuartel(cuartelAsociado.getNombre_cuartel());
                    // Otros atributos del cuartel si es necesario
                }

                brigada.setCuartel(cuartel);

                listaBrigadas.add(brigada);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada " + ex.getMessage());
        }
        return listaBrigadas;
    }

    public List<Brigada> listarBrigadasocupadas() {
        List<Brigada> listaBrigadas = new ArrayList<>();
        String sql = "SELECT * FROM brigada where libre=0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();
                Cuartel cuartel = new Cuartel();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));

                int codCuartel = rs.getInt("nro_cuartel");
                cuartel.setCodCuartel(codCuartel);

                // Ahora debes obtener el objeto Cuartel asociado al código del cuartel
                Cuartel_data cuartelData = new Cuartel_data();
                Cuartel cuartelAsociado = cuartelData.buscarCuartel(codCuartel);

                if (cuartelAsociado != null) {
                    cuartel.setNombre_cuartel(cuartelAsociado.getNombre_cuartel());
                    // Otros atributos del cuartel si es necesario
                }

                brigada.setCuartel(cuartel);

                listaBrigadas.add(brigada);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada " + ex.getMessage());
        }
        return listaBrigadas;
    }

    public boolean nombreNORepetido(String nombre) {
        boolean texto = true;
        String sql = "SELECT COUNT(*) FROM brigada WHERE nombre_br=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1); // Obtiene el valor del recuento
                if (count > 0) {
                    JOptionPane.showMessageDialog(null, "ERROR!!!\nEl Nombre ya se encuentra en la base de datos");
                    texto = false; // El nombre ya existe
                }
            } else {
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada " + ex.getMessage());
        }

        return texto;

    }

    public void modificarBrigada(Brigada brigada) {
        String sql = "UPDATE brigada SET nombre_br=?, especialidad=?, libre=?, nro_cuartel=? WHERE codBrigada=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, brigada.getNombre_br());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCuartel().getCodCuartel());
            ps.setInt(5, brigada.getCodBrigada());

            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Brigada modificada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna brigada con el código especificado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la brigada: " + ex.getMessage());
        }
    }

    public List<Brigada> listarBrigadasporNombre(String nom) {
        List<Brigada> listaBrigadas = new ArrayList<>();
        String sql = "SELECT * FROM brigada WHERE nombre_br LIKE ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // Establecer el valor del parámetro en la consulta SQL
            ps.setString(1, nom + "%"); // Usamos '%' para buscar nombres que contengan la cadena 'nom'

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();
                Cuartel cuartel = new Cuartel();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));

                int codCuartel = rs.getInt("nro_cuartel");
                cuartel.setCodCuartel(codCuartel);

                // Ahora debes obtener el objeto Cuartel asociado al código del cuartel
                Cuartel_data cuartelData = new Cuartel_data();
                Cuartel cuartelAsociado = cuartelData.buscarCuartel(codCuartel);

                /* if (cuartelAsociado != null) {
                cuartel.setNombre_cuartel(cuartelAsociado.getNombre_cuartel());
                // Otros atributos del cuartel si es necesario
            }*/
                brigada.setCuartel(cuartelAsociado);

                listaBrigadas.add(brigada);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada " + ex.getMessage());
        }
        return listaBrigadas;
    }

    public List<String> listarValoresSiniestros() {
        List<String> listaValores = new ArrayList<>();
        String sql = "SELECT brigada.codBrigada as Nºbrigada, brigada.nombre_br as Nombre_Brigada, brigada.nro_cuartel, cuartel.nombre_cuartel, COUNT(siniestro.tipo) as Cant_Siniestros, AVG(siniestro.puntuacion) as Promedio_Puntuacion "
                + "FROM siniestro JOIN brigada ON brigada.codBrigada = siniestro.codBrigada JOIN cuartel ON brigada.nro_cuartel = cuartel.codCuartel "
                + "WHERE siniestro.puntuacion > 0 GROUP BY brigada.codBrigada ORDER BY AVG(siniestro.puntuacion) DESC";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                StringBuilder valores = new StringBuilder();
                valores.append(rs.getString("Nºbrigada")).append(", ");
                valores.append(rs.getString("Nombre_Brigada")).append(", ");
                valores.append(rs.getString("nro_cuartel")).append(", ");
                valores.append(rs.getString("nombre_cuartel")).append(", ");
                valores.append(rs.getString("Cant_Siniestros")).append(", ");

                valores.append(rs.getString("Promedio_Puntuacion"));

                listaValores.add(valores.toString());
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada " + ex.getMessage());
        }
        return listaValores;
    }

    public Map<Integer, Integer> obtenerCantidadSiniestrosPorMes(int año) {
        Map<Integer, Integer> resultados = new HashMap<>();
        ResultSet rs = null;

        try {
            // Crear la consulta SQL
            String sql = "SELECT MONTH(fecha_siniestro) AS Mes, COUNT(*) AS CantidadSiniestros "
                    + "FROM siniestro "
                    + "WHERE YEAR(fecha_siniestro) = ? "
                    + "GROUP BY MONTH(fecha_siniestro)";

            // Crear la sentencia preparada
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, año);

            // Ejecutar la consulta
            rs = ps.executeQuery();

            // Almacenar los resultados en el Map
            while (rs.next()) {
                int mes = rs.getInt("Mes");
                int cantidadSiniestros = rs.getInt("CantidadSiniestros");
                resultados.put(mes, cantidadSiniestros);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultados;
    }

    public List<String> listarValoresSiniestrosFinalizados(int yearfecha) {
        List<String> listaValores = new ArrayList<>();
        String sql = "SELECT brigada.codBrigada as Nºbrigada, brigada.nombre_br as Nombre_Brigada, brigada.nro_cuartel, cuartel.nombre_cuartel, COUNT(siniestro.tipo) as Cant_Siniestros, AVG(siniestro.puntuacion) as Promedio_Puntuacion "
                + "FROM siniestro JOIN brigada ON brigada.codBrigada = siniestro.codBrigada JOIN cuartel ON brigada.nro_cuartel = cuartel.codCuartel "
                + "WHERE siniestro.puntuacion > 0 AND YEAR(fecha_siniestro) = ? GROUP BY brigada.codBrigada ORDER BY AVG(siniestro.puntuacion) DESC";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, yearfecha); // Establece el año como parámetro

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                StringBuilder valores = new StringBuilder();
                valores.append(rs.getString("Nºbrigada")).append(", ");
                valores.append(rs.getString("Nombre_Brigada")).append(", ");
                valores.append(rs.getString("nro_cuartel")).append(", ");
                valores.append(rs.getString("nombre_cuartel")).append(", ");
                valores.append(rs.getString("Cant_Siniestros")).append(", ");
                valores.append(rs.getString("Promedio_Puntuacion"));

                listaValores.add(valores.toString());
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada " + ex.getMessage());
        }
        return listaValores;
    }

}
