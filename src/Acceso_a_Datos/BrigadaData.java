/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_a_Datos;

import Entidades.Brigada;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
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
    Cuartel_data CuartelData = new Cuartel_data();
    String sql = "SELECT codBrigada, nombre_br, especialidad, libre, codCuartel FROM brigada WHERE codBrigada = ?";
    PreparedStatement ps = null;
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, codBrigada);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            brigada = new Brigada();
            brigada.setCodBrigada(codBrigada);
            brigada.setNombre_br(rs.getString("nombre_br"));
            brigada.setEspecialidad(rs.getString("especialidad")); // Corrección aquí
            brigada.setLibre(rs.getBoolean("libre"));
            
            int codCuartel = rs.getInt("codCuartel"); // Obtener el valor de codCuartel desde la base de datos

            // Aquí debes obtener un objeto Cuartel relacionado con el código de cuartel
            Cuartel cuartel = CuartelData.buscarCuartel(codCuartel);

            // Establecer el objeto Cuartel en la Brigada
            brigada.setCuartel(cuartel);
        } else {
            ps.close();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada " + ex.getMessage());
    }
    return brigada;
}

    

}
