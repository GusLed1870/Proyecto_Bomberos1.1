package Vistas;

import Acceso_a_Datos.BomberoData;
import Acceso_a_Datos.BrigadaData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Vista_Bombero extends javax.swing.JInternalFrame {

    private BomberoData bomberoData;
    private BrigadaData brigadaData;
    private Bombero bombero;
    private Brigada brigada;

    public Vista_Bombero() {
        initComponents();
        limpiarCampos();
        bomberoData = new BomberoData();
        brigadaData = new BrigadaData();
        bombero = new Bombero();
        CargarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
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
        jPanel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 520));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bombero");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre y Apellido: ");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Documento: ");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Celular:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Brigada Asignada: ");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Grupo Sanguíneo:");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
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

        jCBGrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el grupo sanguíneo", "A-", "A+", "B-", "B+", "AB-", "AB+", "0+", "0-", " " }));

        jButton1.setText("Búsqueda por DNI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTDNI)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jCBBrigadaAsignada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBEstado)
                                    .addComponent(jCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jBLimpiar)
                        .addGap(68, 68, 68)
                        .addComponent(jBAgregar)
                        .addGap(76, 76, 76)
                        .addComponent(jBModificar)
                        .addGap(73, 73, 73)
                        .addComponent(jBEliminar)
                        .addGap(71, 71, 71)
                        .addComponent(jBSalir)
                        .addGap(26, 26, 26)))
                .addGap(146, 146, 146))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(calendarioOculto)
                .addGap(384, 384, 384)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jTNombreApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBBrigadaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jRBEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBEliminar)
                    .addComponent(jBModificar)
                    .addComponent(jBAgregar)
                    .addComponent(jBLimpiar))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Cuartel cuartel = new Cuartel();
        Date fechaNac = java.sql.Date.valueOf(FechaNacFormateada);

        Brigada brigadaSeleccionada = obtenerBrigadaSeleccionada();

        bombero.setBrigada(brigadaSeleccionada);

        Bombero bombero = new Bombero(dni, nombre, FechaNacFormateada, celular, brigadaSeleccionada, grupoSanguineo, estado);

        if (jTNombreApellido.getText().isEmpty() || jTDNI.getText().isEmpty() || jDCFechaNac.getDate() == null
                || jTCelular.getText().isEmpty() || jCBGrupoSanguineo.getSelectedIndex() == 0
                || jCBBrigadaAsignada.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "No debe dejar campos vacíos");
            return;
        }

        bomberoData.guardarBombero(bombero);
        JOptionPane.showMessageDialog(null, "Bombero agregado con éxito");

    }//GEN-LAST:event_jBAgregarActionPerformed

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
    private javax.swing.JComboBox<Brigada> jCBBrigadaAsignada;
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
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTNombreApellido;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jTNombreApellido.setText(null);
        jTDNI.setText(null);
        jDCFechaNac.setDate(null);
        jCBBrigadaAsignada.setSelectedItem(null);
        jTCelular.setText(null);
        jRBEstado.setText(null);
        jRBEstado.setSelected(false);
    }

    private void CargarComboBox() {
        ArrayList<Brigada> listaBrigadas = (ArrayList<Brigada>) brigadaData.listarBrigadas();

        // Limpia el JComboBox si tiene elementos previos
        DefaultComboBoxModel<Brigada> model = new DefaultComboBoxModel<>();
        jCBBrigadaAsignada.setModel(model);

        for (Brigada brigada : listaBrigadas) {
            model.addElement(brigada);
        }
    }

    private Brigada obtenerBrigadaSeleccionada() {
        return (Brigada) jCBBrigadaAsignada.getSelectedItem();
    }
}
