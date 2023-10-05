package Vistas;

import Acceso_a_Datos.BomberoData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

public class Vista_Bombero extends javax.swing.JInternalFrame {

    private BomberoData bomberoData;

    public Vista_Bombero() {
        initComponents();
        limpiarCampos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTNombreApellido = new javax.swing.JTextField();
        jTDNI = new javax.swing.JTextField();
        jTCelular = new javax.swing.JTextField();
        jDCFechaNac = new com.toedter.calendar.JDateChooser();
        jBLimpiar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        calendarioOculto = new javax.swing.JLabel();
        jCBBrigadaAsignada = new javax.swing.JComboBox<>();
        jCBGrupoSanguineo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jRBEstado = new javax.swing.JRadioButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(112, 11, 19));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Bombero");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Nombre y Apellido: ");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Documento: ");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Celular:");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Brigada Asignada: ");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Grupo Sanguíneo:");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Estado:");

        jBLimpiar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBAgregar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBModificar.setText("Modificar");

        jBEliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBEliminar.setText("Eliminar");

        jBSalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        calendarioOculto.setBackground(new java.awt.Color(112, 12, 19));
        calendarioOculto.setForeground(new java.awt.Color(112, 11, 19));
        calendarioOculto.setText("jLabel9");

        jCBBrigadaAsignada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Explosivos", "Incendios", "Catástrofes", "Accidentes" }));
        jCBBrigadaAsignada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBBrigadaAsignadaActionPerformed(evt);
            }
        });

        jCBGrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el grupo sanguíneo", "A-", "A+", "B-", "B+", "AB-", "AB+", "0+", "0-", " " }));

        jButton1.setText("Búsqueda por DNI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(calendarioOculto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(342, 342, 342))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBLimpiar)
                                .addGap(52, 52, 52)
                                .addComponent(jBAgregar))
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jBModificar)
                        .addGap(56, 56, 56)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jBSalir)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTNombreApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBBrigadaAsignada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jDCFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                        .addComponent(jTDNI))
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1))
                                .addComponent(jCBGrupoSanguineo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jRBEstado))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(calendarioOculto))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBBrigadaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRBEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBAgregar)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        String nombre = jTNombreApellido.getText();
        String dni = jTDNI.getText();
        LocalDate FechaNacFormateada = jDCFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int celular = Integer.parseInt(jTCelular.getText());
        String grupoSanguineo = jCBGrupoSanguineo.getSelectedItem().toString();
        boolean estado = jRBEstado.isSelected();
        Cuartel cuartel=new Cuartel();
        Date fechaNac = java.sql.Date.valueOf(FechaNacFormateada);
        
        Brigada brigada= new Brigada(1, "alfa", "incendios forestales",true, cuartel); // Cuando cargue el combo box de brigada obtengo este dato y borro esta línea
      
        
      

        if (jTNombreApellido.getText().isEmpty() || jTDNI.getText().isEmpty() || jDCFechaNac.getDate() == null
                || jTCelular.getText().isEmpty() || jCBGrupoSanguineo.getSelectedIndex() == 0
                || jCBBrigadaAsignada.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "No debe dejar campos vacíos");
            return;
        }
        Bombero bombero = new Bombero(dni, nombre, FechaNacFormateada, celular, brigada, grupoSanguineo, estado);
        bomberoData.guardarBombero(bombero);
        JOptionPane.showMessageDialog(null,"Bombero agregado con éxito");
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jCBBrigadaAsignadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBBrigadaAsignadaActionPerformed

    }//GEN-LAST:event_jCBBrigadaAsignadaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel calendarioOculto;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBBrigadaAsignada;
    private javax.swing.JComboBox<String> jCBGrupoSanguineo;
    private com.toedter.calendar.JDateChooser jDCFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTNombreApellido;
    // End of variables declaration//GEN-END:variables

    private void obtenerfecha() {
        Date fechaSeleccionada = jDCFechaNac.getDate();
        if (fechaSeleccionada != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String FechaFormateada = sdf.format(fechaSeleccionada);
            calendarioOculto.setText(FechaFormateada);
        } else {
            calendarioOculto.setText("");
        }
    }

    private void limpiarCampos() {
        jTNombreApellido.setText(null);
        jTDNI.setText(null);
        jDCFechaNac.setDate(null);
        jCBBrigadaAsignada.setSelectedItem(null);
        jTCelular.setText(null);
        jCBBrigadaAsignada.setSelectedIndex(0);
        jCBGrupoSanguineo.setSelectedIndex(0);
        jRBEstado.setText(null);
        jRBEstado.setSelected(false);
    }

    private void obtenerFechaFormateada() {
        Date fechaSeleccionada = jDCFechaNac.getDate();
        if (fechaSeleccionada != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String FechaFormateada = sdf.format(fechaSeleccionada);
            calendarioOculto.setText(FechaFormateada);
        } else {
            calendarioOculto.setText("");
        }
    }

}
