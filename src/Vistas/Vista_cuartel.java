package Vistas;

import Acceso_a_Datos.Cuartel_data;
import Entidades.Cuartel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Vista_cuartel extends javax.swing.JInternalFrame {

    private Cuartel_data cuar;

    public Vista_cuartel() {
        initComponents();
        cuar = new Cuartel_data();
        jBguardarDatos.setEnabled(false);
        jTCodigo.setEnabled(false);
        jBBuscarPorID.setEnabled(false);
        jBguardarDatos.setEnabled(true);
        jBModificar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTdireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTx = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTy = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTtelefono = new javax.swing.JTextField();
        jTcorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jBguardarDatos = new javax.swing.JButton();
        jLnombre = new javax.swing.JLabel();
        jLdireccion = new javax.swing.JLabel();
        jLtelefono = new javax.swing.JLabel();
        jLcorreo = new javax.swing.JLabel();
        jLy = new javax.swing.JLabel();
        jLx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jBBuscarPorID = new javax.swing.JButton();
        jRBHabilitarID = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1100, 678));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("NOMBRE:");

        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("DIRECCION:");

        jTdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdireccionKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("LATITUD:");

        jTx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("LONGITUD:");

        jTy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTyKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("TELEFONO:");

        jTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTtelefonoKeyTyped(evt);
            }
        });

        jTcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcorreoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("CORREO:");

        jBsalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBguardarDatos.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBguardarDatos.setText("Guardar ");
        jBguardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarDatosActionPerformed(evt);
            }
        });

        jLnombre.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(204, 0, 0));

        jLdireccion.setForeground(new java.awt.Color(204, 0, 0));

        jLtelefono.setForeground(new java.awt.Color(204, 0, 0));

        jLcorreo.setForeground(new java.awt.Color(204, 0, 0));

        jLy.setForeground(new java.awt.Color(204, 0, 0));

        jLx.setForeground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Cuarteles");

        jBLimpiar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBModificar.setText("Modificar ");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("ID/CÓDIGO:");

        jTCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCodigoKeyTyped(evt);
            }
        });

        jBBuscarPorID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBBuscarPorID.setText("Buscar cuartel por código");
        jBBuscarPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPorIDActionPerformed(evt);
            }
        });

        jRBHabilitarID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRBHabilitarID.setForeground(new java.awt.Color(0, 0, 0));
        jRBHabilitarID.setText("Deshabilitado");
        jRBHabilitarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBHabilitarIDActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("                   Agregue un cuartel a la base de datos completando los siguientes campos:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Busque y modifique un cuartel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLy, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(741, 741, 741)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTdireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
                                    .addComponent(jTx, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTy, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(jBguardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45)
                                            .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRBHabilitarID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBBuscarPorID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLnombre)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jBBuscarPorID)
                    .addComponent(jRBHabilitarID)
                    .addComponent(jLabel10))
                .addGap(8, 8, 8)
                .addComponent(jLdireccion)
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLtelefono)
                        .addGap(62, 62, 62)
                        .addComponent(jLcorreo)
                        .addGap(195, 195, 195))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBLimpiar)
                            .addComponent(jBguardarDatos)
                            .addComponent(jBModificar)
                            .addComponent(jBsalir))
                        .addGap(90, 90, 90))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBguardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarDatosActionPerformed
        String vacios[] = new String[6];
        try {
            if (jTdireccion.getText().isEmpty() || jTnombre.getText().isEmpty() || jTtelefono.getText().isEmpty() || jTcorreo.getText().isEmpty() || jTx.getText().isEmpty() || jTy.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
                return;
            }
            String nombre_cuartel = jTnombre.getText();
            String direccion = jTdireccion.getText();
            String telefono = jTtelefono.getText();
            if(!validarCelular(jTtelefono)){
               return;
            }
            int coord_X = Integer.parseInt(jTx.getText());
            int coord_Y = Integer.parseInt(jTy.getText());
            String correo = jTcorreo.getText();
            if (!validarCorreoElectronico(correo)) {
                JOptionPane.showMessageDialog(null, "El correo electrónico ingresado no es válido");
                return;
            }
            Cuartel cua = new Cuartel(nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo);
            if (cuar.compararCuarteles(cua)) {
                return;
            } else {
            cuar.cargarCuartel(cua);
            limpiarCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado del tipo: " + e);
        }
    }//GEN-LAST:event_jBguardarDatosActionPerformed

    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped
        validacionCaracteres(evt);
    }//GEN-LAST:event_jTnombreKeyTyped

    private void jTdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdireccionKeyTyped
        validacionCaracteres(evt);
    }//GEN-LAST:event_jTdireccionKeyTyped

    private void jTtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtelefonoKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_jTtelefonoKeyTyped

    private void jTcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcorreoKeyTyped
        validarCorreo(evt);
    }//GEN-LAST:event_jTcorreoKeyTyped

    private void jTxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_jTxKeyTyped

    private void jTyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTyKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_jTyKeyTyped

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
           String vacios[] = new String[6];
        try {
            if (jTdireccion.getText().isEmpty() || jTnombre.getText().isEmpty() || jTtelefono.getText().isEmpty() || jTcorreo.getText().isEmpty() || jTx.getText().isEmpty() || jTy.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
                return;
            }
            int codigo = Integer.parseInt(jTCodigo.getText());
            String nombre_cuartel = jTnombre.getText();
            String direccion = jTdireccion.getText();
            String telefono = jTtelefono.getText();
            if(!validarCelular(jTtelefono)){
               return;
            }
            int coord_X = Integer.parseInt(jTx.getText());
            int coord_Y = Integer.parseInt(jTy.getText());
            String correo = jTcorreo.getText();
            if (!validarCorreoElectronico(correo)) {
                JOptionPane.showMessageDialog(null, "El correo electrónico ingresado no es válido");
                return;
            }
            Cuartel cua = new Cuartel(codigo, nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo);
            cuar.modificarCuartel(cua);
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado del tipo: " + e);
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jTCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodigoKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_jTCodigoKeyTyped

    private void jRBHabilitarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBHabilitarIDActionPerformed
            if (jRBHabilitarID.isSelected()) {
            jRBHabilitarID.setText("Habilitado");
            jBBuscarPorID.setEnabled(true);
            jTCodigo.setEnabled(true);
            jBguardarDatos.setEnabled(false);
            jBModificar.setEnabled(true);
        } else {
            jRBHabilitarID.setText("Deshabilitado");
            jBBuscarPorID.setEnabled(false);
            jTCodigo.setEnabled(false);
            jBguardarDatos.setEnabled(true);
            jBModificar.setEnabled(false);
        }
    
        
    }//GEN-LAST:event_jRBHabilitarIDActionPerformed

    private void jBBuscarPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarPorIDActionPerformed
       int codigo = Integer.parseInt(jTCodigo.getText());
       Cuartel cuartel = cuar.buscarCuartelPorId(codigo);
       jTCodigo.setText(String.valueOf(cuartel.getCodCuartel()));
       jTnombre.setText(cuartel.getNombre_cuartel());
       jTdireccion.setText(cuartel.getDireccion());
       jTx.setText(String.valueOf(cuartel.getCoord_X()));
       jTy.setText(String.valueOf(cuartel.getCoord_Y()));
       jTtelefono.setText(cuartel.getTelefono());
       jTcorreo.setText(cuartel.getCorreo());
       jBguardarDatos.setEnabled(false);
       
    }//GEN-LAST:event_jBBuscarPorIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarPorID;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBguardarDatos;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcorreo;
    private javax.swing.JLabel jLdireccion;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLtelefono;
    private javax.swing.JLabel jLx;
    private javax.swing.JLabel jLy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRBHabilitarID;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTcorreo;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JTextField jTx;
    private javax.swing.JTextField jTy;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos() {
        jTnombre.setText(null);
        jTcorreo.setText(null);
        jTtelefono.setText(null);
        jTdireccion.setText(null);
        jTx.setText(null);
        jTy.setText(null);
        jTCodigo.setEnabled(false);
        jTCodigo.setText(null);
        jRBHabilitarID.setSelected(false);
        jRBHabilitarID.setSelected(false);
        jBBuscarPorID.setEnabled(false);
        jRBHabilitarID.setText("Deshabilitado");
        jBModificar.setEnabled(false);
        jBguardarDatos.setEnabled(true);
    }

    public void validacionNumeros(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 32 && evento.getKeyChar() <= 47
                || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 255) {
            evento.consume();
            JOptionPane.showInternalMessageDialog(this, "Ingrese solo números");
        }
    }

    public void validacionCaracteres(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 33 && evento.getKeyChar() <= 47
                || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 64
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 208
                || evento.getKeyChar() >= 210 && evento.getKeyChar() <= 240
                || evento.getKeyChar() >= 242 && evento.getKeyChar() <= 255) {
            evento.consume();
            JOptionPane.showInternalMessageDialog(this, "Caracter no permitido");
        }
    }

    public void validacionSoloLetras(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 33 && evento.getKeyChar() <= 64
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 208
                || evento.getKeyChar() >= 210 && evento.getKeyChar() <= 240
                || evento.getKeyChar() >= 242 && evento.getKeyChar() <= 255) {
            evento.consume();
            JOptionPane.showInternalMessageDialog(this, "Caracter no permitido");
        }
    }

    public void validarCorreo(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 32 && evento.getKeyChar() <= 44
                || evento.getKeyChar() == 47
                || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 63
                || evento.getKeyChar() == 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 255) {
            evento.consume();
            JOptionPane.showInternalMessageDialog(this, "Caracter no permitido");
        }
    }

public boolean validarCorreoElectronico(String correo) {
    // Expresión regular para validar un correo electrónico
    String regex = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+)$";

    // Compila la expresión regular en un patrón
    Pattern pattern = Pattern.compile(regex);

    // Crea un objeto Matcher para comparar el texto con el patrón
    Matcher matcher = pattern.matcher(correo);

    // Comprueba si el correo coincide con el patrón y si no contiene más de un símbolo "@"
    return matcher.matches() && correo.indexOf('@') == correo.lastIndexOf('@');
}

    public boolean validarCelular(JTextField jTtelefono) {
        String telefono = jTtelefono.getText().replaceAll("\\s", ""); // Eliminar espacios en blanco
        int longitudMin = 8; // Cambiar estos valores según tus requisitos
        int longitudMax = 10; 
        int longitud = telefono.length();
        if (longitud <= longitudMax && longitud >= longitudMin) {
            return true; // La longitud del número es válida
        } else {
            JOptionPane.showMessageDialog(null, "Número de teléfono no válido.");
            return false; // La longitud del número no es válida
        }
    }
}
