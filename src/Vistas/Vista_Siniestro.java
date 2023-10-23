package Vistas;

import Acceso_a_Datos.BrigadaData;
import Acceso_a_Datos.SiniestroData;
import Entidades.Brigada;
import Entidades.Siniestro;
import java.time.ZoneId;
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
        jdcFechaSiniestro = new com.toedter.calendar.JDateChooser();
        jlCoord_X = new javax.swing.JLabel();
        jtfCoord_X = new javax.swing.JTextField();
        jlCoord_Y = new javax.swing.JLabel();
        jtfCoord_Y = new javax.swing.JTextField();
        jlDetalles = new javax.swing.JLabel();
        jlFechaResolucion = new javax.swing.JLabel();
        jdcFechaResolucion = new com.toedter.calendar.JDateChooser();
        jlBrigada = new javax.swing.JLabel();
        jcbBrigada = new javax.swing.JComboBox<>();
        jbLimpiarCampos = new javax.swing.JButton();
        jbCargar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAreaDetalles = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1100, 678));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(931, 666));

        jlTipoEmergencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlTipoEmergencia.setText("Tipo de Emergencia:");

        jcbTipoEmergencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbTipoEmergencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de emergencia", "Incendios en viviendas, e industrias", "Salvamento en derrumbes", "Rescates en ámbito montaña", "Rescate de personas atrapadas en accidentes de tráfico", "Socorrer inundaciones", "Operativos de prevención" }));

        jlFechaSiniestro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlFechaSiniestro.setText("Fecha de Siniestro:");

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

        jlBrigada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlBrigada.setText("Brigada:");

        jcbBrigada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTipoEmergencia)
                    .addComponent(jlBrigada)
                    .addComponent(jlFechaResolucion)
                    .addComponent(jlDetalles)
                    .addComponent(jlCoord_Y)
                    .addComponent(jlCoord_X)
                    .addComponent(jlFechaSiniestro))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbLimpiarCampos)
                        .addGap(213, 213, 213)
                        .addComponent(jbCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTipoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCoord_X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCoord_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(622, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbTipoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTipoEmergencia))
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlFechaSiniestro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCoord_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCoord_X))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCoord_Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCoord_Y))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlFechaResolucion)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBrigada)
                    .addComponent(jcbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCargar)
                    .addComponent(jbLimpiarCampos)
                    .addComponent(jbSalir))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
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
            siniestro.setTipo(jcbTipoEmergencia.getSelectedItem().toString());
            siniestro.setFecha_siniestro(jdcFechaSiniestro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            siniestro.setCoord_X(Integer.parseInt(jtfCoord_X.getText()));
            siniestro.setCoord_Y(Integer.parseInt(jtfCoord_Y.getText()));
            siniestro.setDetalles(jtAreaDetalles.getText());
            siniestro.setFecha_resol(jdcFechaResolucion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
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
    private com.toedter.calendar.JDateChooser jdcFechaResolucion;
    private com.toedter.calendar.JDateChooser jdcFechaSiniestro;
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
    // End of variables declaration//GEN-END:variables
    
    private void llenarCombo(){ 
        for (Brigada bri : brigadaData.listarBrigadaslibres()) {
            jcbBrigada.addItem(bri);
        } 
    }
    
    private void limpiarCampos(){
        
        jcbTipoEmergencia.setSelectedIndex(0);
        jdcFechaSiniestro.setDate(null);
        jtfCoord_X.setText(null);
        jtfCoord_Y.setText(null);
        jtAreaDetalles.setText(null);
        jdcFechaResolucion.setDate(null);
        jcbBrigada.setSelectedIndex(0);
    }
    
    private boolean validacionCamposVacios(){
        return jcbTipoEmergencia.getSelectedItem().toString().equalsIgnoreCase("Seleccione el tipo de emergencia") || jtfCoord_X.getText().isEmpty() ||
                jtfCoord_Y.getText().isEmpty() || jtAreaDetalles.getText().isEmpty();
    }
}