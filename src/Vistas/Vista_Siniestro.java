package Vistas;

import Acceso_a_Datos.BrigadaData;
import Acceso_a_Datos.SiniestroData;
import Entidades.Brigada;
import Entidades.Siniestro;
import java.sql.Date;
import javax.swing.JOptionPane;

public class Vista_Siniestro extends javax.swing.JInternalFrame {

    //Atributos
    BrigadaData brigadaData;
    SiniestroData siniestroData;
    
    public Vista_Siniestro() {
        initComponents();
        brigadaData = new BrigadaData();
        siniestroData = new SiniestroData();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTipoEmergencia = new javax.swing.JLabel();
        jcbTipoEmergencia = new javax.swing.JComboBox<>();
        jlFechaSiniestro = new javax.swing.JLabel();
        jtfFechaSiniestro = new javax.swing.JTextField();
        jlCoord_X = new javax.swing.JLabel();
        jtfCoord_X = new javax.swing.JTextField();
        jlCoord_Y = new javax.swing.JLabel();
        jtfCoord_Y = new javax.swing.JTextField();
        jlDetalles = new javax.swing.JLabel();
        jlFechaResolucion = new javax.swing.JLabel();
        jtfFechaResolucion = new javax.swing.JTextField();
        jlBrigada = new javax.swing.JLabel();
        jcbBrigada = new javax.swing.JComboBox<>();
        jbLimpiarCampos = new javax.swing.JButton();
        jbCargar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAreaDetalles = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(931, 666));

        jlTipoEmergencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlTipoEmergencia.setText("Tipo de Emergencia:");

        jcbTipoEmergencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbTipoEmergencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de emergencia", "1) Incendios en viviendas, e industrias", "2) Salvamento en derrumbes", "3) Rescates en ámbito montaña", "4) Rescate de personas atrapadas en accidentes de tráfico", "5) Socorrer inundaciones", "6) Operativos de prevención" }));

        jlFechaSiniestro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlFechaSiniestro.setText("Fecha de Siniestro:");

        jtfFechaSiniestro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlCoord_X.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlCoord_X.setText("Coordenada X:");

        jtfCoord_X.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlCoord_Y.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlCoord_Y.setText("Coordenada Y:");

        jtfCoord_Y.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlDetalles.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlDetalles.setText("Detalles:");

        jlFechaResolucion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlFechaResolucion.setText("Fecha de Resolución:");

        jtfFechaResolucion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlBrigada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlBrigada.setText("Brigada:");

        jcbBrigada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jbLimpiarCampos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbLimpiarCampos.setText("Limpiar campos");
        jbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCamposActionPerformed(evt);
            }
        });

        jbCargar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbCargar.setText("Cargar");
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtAreaDetalles.setColumns(20);
        jtAreaDetalles.setRows(5);
        jScrollPane1.setViewportView(jtAreaDetalles);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("EMERGENCIAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(312, 312, 312))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLimpiarCampos)
                .addGap(18, 18, 18)
                .addComponent(jbCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlBrigada)
                        .addGap(18, 18, 18)
                        .addComponent(jcbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlTipoEmergencia)
                        .addGap(31, 31, 31)
                        .addComponent(jcbTipoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlFechaSiniestro)
                        .addGap(39, 39, 39)
                        .addComponent(jtfFechaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jlCoord_X)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCoord_X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlCoord_Y)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCoord_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlDetalles)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlFechaResolucion)
                        .addGap(18, 18, 18)
                        .addComponent(jtfFechaResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jlTipoEmergencia))
                    .addComponent(jcbTipoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlFechaSiniestro))
                    .addComponent(jtfFechaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlCoord_X))
                    .addComponent(jtfCoord_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlCoord_Y))
                    .addComponent(jtfCoord_Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlDetalles))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFechaResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFechaResolucion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBrigada)
                    .addComponent(jcbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbLimpiarCampos)
                    .addComponent(jbCargar)
                    .addComponent(jbSalir))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarCamposActionPerformed

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        
        try{
            if(validacionCamposVacios()){
                JOptionPane.showMessageDialog(this, "Corrobore los datos ingresados.");
                return;
            }

            Siniestro siniestro = new Siniestro();
            siniestro.setTipo(jcbBrigada.getSelectedItem().toString());
            siniestro.setFecha_siniestro(Date.valueOf(jtfFechaSiniestro.getText()).toLocalDate());
            siniestro.setCoord_X(Integer.parseInt(jtfCoord_X.getText()));
            siniestro.setCoord_Y(Integer.parseInt(jtfCoord_Y.getText()));
            siniestro.setDetalles(jtAreaDetalles.getText());
            siniestro.setFecha_resol(Date.valueOf(jtfFechaResolucion.getText()).toLocalDate());
            siniestro.setBrigada((Brigada)jcbBrigada.getSelectedItem());

            siniestroData.cargarSiniestro(siniestro);
            
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar datos númericos en los campos de coordenadas.");
        }catch(IllegalArgumentException iae){
            JOptionPane.showMessageDialog(this, "Debe ingresar la fecha en el formato yyyy-MM-dd");
        }
    }//GEN-LAST:event_jbCargarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Brigada> jcbBrigada;
    private javax.swing.JComboBox<String> jcbTipoEmergencia;
    private javax.swing.JLabel jlBrigada;
    private javax.swing.JLabel jlCoord_X;
    private javax.swing.JLabel jlCoord_Y;
    private javax.swing.JLabel jlDetalles;
    private javax.swing.JLabel jlFechaResolucion;
    private javax.swing.JLabel jlFechaSiniestro;
    private javax.swing.JLabel jlTipoEmergencia;
    private javax.swing.JTextArea jtAreaDetalles;
    private javax.swing.JTextField jtfCoord_X;
    private javax.swing.JTextField jtfCoord_Y;
    private javax.swing.JTextField jtfFechaResolucion;
    private javax.swing.JTextField jtfFechaSiniestro;
    // End of variables declaration//GEN-END:variables
    
    private void llenarCombo(){ 
        for (Brigada bri : brigadaData.listarBrigadaslibres()) {
            jcbBrigada.addItem(bri);
        } 
    }
    
    private void limpiarCampos(){
        
        jcbTipoEmergencia.setSelectedIndex(0);
        jtfFechaSiniestro.setText(null);
        jtfCoord_X.setText(null);
        jtfCoord_Y.setText(null);
        jtAreaDetalles.setText(null);
        jcbBrigada.setSelectedIndex(0);
    }
    
    private boolean validacionCamposVacios(){
        if(jcbTipoEmergencia.getSelectedItem().toString().equalsIgnoreCase("Seleccione el tipo de emergencia") || jtfFechaSiniestro.getText().isEmpty() || jtfCoord_X.getText().isEmpty() ||
           jtfCoord_Y.getText().isEmpty() || jtAreaDetalles.getText().isEmpty()){
            return true;
        }        
        return false;
    }
}