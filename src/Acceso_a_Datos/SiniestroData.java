package Acceso_a_Datos;

import Entidades.Brigada;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SiniestroData {
    
    //Atributos
    private Connection con = null;
    private Brigada brigada;
    
    //Constructor
    public SiniestroData() {
        con = Conexion.getConexion();
    }
    
    //Métodos ABM
    public void cargarSiniestro(Siniestro siniestro){
        
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
            
            if(registro > 0){
                JOptionPane.showMessageDialog(null, "Siniestro cargado correctamente.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro.");
        }
        
    }
    
}