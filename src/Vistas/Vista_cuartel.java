package Vistas;

import Acceso_a_Datos.Cuartel_data;
import Entidades.Cuartel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class Vista_cuartel extends javax.swing.JInternalFrame {

    //Atributos
    private Cuartel_data cuar;

    //Constructor
    public Vista_cuartel() {
        initComponents();
        cuar = new Cuartel_data();
        jBguardar.setEnabled(false);
    }

    public void validacionNumeros(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 32 && evento.getKeyChar() <= 47
                || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 255) {
            evento.consume();
            JOptionPane.showInternalMessageDialog(this, "Ingrese solo numeros");
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

    public void habilitarBoton() {
        if (jTnombre.getText().isEmpty()
                || jTdireccion.getText().isEmpty()
                || jTx.getText().isEmpty()
                || jTy.getText().isEmpty()
                || jTtelefono.getText().isEmpty()
                || jTcorreo.getText().isEmpty()
                || !jLcorreo.getText().isEmpty()) {

            jBguardar.setEnabled(false);

        } else {
            jBguardar.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jBguardar = new javax.swing.JButton();
        jLnombre = new javax.swing.JLabel();
        jLdireccion = new javax.swing.JLabel();
        jLtelefono = new javax.swing.JLabel();
        jLcorreo = new javax.swing.JLabel();
        jLy = new javax.swing.JLabel();
        jLx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1100, 678));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE:");

        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DIRECCION:");

        jTdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTdireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdireccionKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LATITUD:");

        jTx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LONGITUD:");

        jTy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTyActionPerformed(evt);
            }
        });
        jTy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTyKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TELEFONO:");

        jTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTtelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTtelefonoKeyTyped(evt);
            }
        });

        jTcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTcorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcorreoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CORREO:");

        jBsalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(0, 0, 0));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBguardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBguardar.setForeground(new java.awt.Color(0, 0, 0));
        jBguardar.setText("Guardar ");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jLnombre.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(204, 0, 0));

        jLdireccion.setForeground(new java.awt.Color(204, 0, 0));

        jLtelefono.setForeground(new java.awt.Color(204, 0, 0));

        jLcorreo.setForeground(new java.awt.Color(204, 0, 0));

        jLy.setForeground(new java.awt.Color(204, 0, 0));

        jLx.setForeground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cuarteles");

        jBLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(0, 0, 0));
        jBModificar.setText("Modificar ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLy, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(341, 341, 341)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTy, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTx, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTcorreo)
                                    .addComponent(jTdireccion)
                                    .addComponent(jTnombre)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addComponent(jLabel1)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLnombre)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLdireccion)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)))
                .addComponent(jLx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLtelefono)
                .addGap(62, 62, 62)
                .addComponent(jLcorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBguardar)
                    .addComponent(jBModificar)
                    .addComponent(jBsalir))
                .addGap(152, 152, 152))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jTyActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jBguardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarDatosActionPerformed
    }//GEN-LAST:event_jBguardarDatosActionPerformed


    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        String vacios[] = new String[6];

        try {

            if (jTdireccion.getText().isEmpty() || jTnombre.getText().isEmpty() || jTtelefono.getText().isEmpty() || jTcorreo.getText().isEmpty() || jTx.getText().isEmpty() || jTy.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, vacios);
                return;
            }
            String nombre_cuartel = jTnombre.getText();
            String direccion = jTdireccion.getText();
            String telefono = jTtelefono.getText();
            String correo = jTcorreo.getText();  
            int coord_X = Integer.parseInt(jTx.getText());
            int coord_Y = Integer.parseInt(jTy.getText());
            
            if(!validarCorreoElectronico(correo)){
                JOptionPane.showMessageDialog(null, "El correo electrónico ingresado no es válido");
                return;
            }
            
            Cuartel cua = new Cuartel(nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo);

            cuar.cargarCuartel(cua);

            JOptionPane.showMessageDialog(this, "Cuartel añadido con éxito");

        } catch (NumberFormatException nfe) {

        }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyReleased
        habilitarBoton();

    }//GEN-LAST:event_jTnombreKeyReleased

    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped
        validacionCaracteres(evt);
    }//GEN-LAST:event_jTnombreKeyTyped

    private void jTdireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdireccionKeyReleased
        habilitarBoton();

    }//GEN-LAST:event_jTdireccionKeyReleased

    private void jTdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdireccionKeyTyped
        validacionCaracteres(evt);
    }//GEN-LAST:event_jTdireccionKeyTyped

    private void jTtelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtelefonoKeyReleased
        habilitarBoton();

    }//GEN-LAST:event_jTtelefonoKeyReleased

    private void jTtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtelefonoKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_jTtelefonoKeyTyped

    private void jTcorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcorreoKeyReleased
        habilitarBoton();

    }//GEN-LAST:event_jTcorreoKeyReleased

    private void jTcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcorreoKeyTyped
        validarCorreo(evt);
    }//GEN-LAST:event_jTcorreoKeyTyped

    private void jTxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTxKeyReleased

    private void jTxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_jTxKeyTyped

    private void jTyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTyKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTyKeyReleased

    private void jTyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTyKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_jTyKeyTyped

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLcorreo;
    private javax.swing.JLabel jLdireccion;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLtelefono;
    private javax.swing.JLabel jLx;
    private javax.swing.JLabel jLy;
    private javax.swing.JPanel jPanel1;
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
    }

    public void permitirSoloNumeros(JTextField textField) {
        AbstractDocument doc = (AbstractDocument) textField.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                try {
                    if (string.matches("[0-9]+")) {
                        super.insertString(fb, offset, string, attr);
                        // Después de aplicar el filtro, establece el campo jTDNI en una cadena vacía
                        jTx.setText("");
                        jTy.setText("");
                    }
                } catch (BadLocationException e) {
                    // Manejar la excepción BadLocationException, por ejemplo, mostrar un mensaje de error.
                    System.err.println("Error al insertar texto: " + e.getMessage());
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                try {
                    if (text.matches("[0-9]+")) {
                        super.replace(fb, offset, length, text, attrs);
                        // Después de aplicar el filtro, establece el campo jTDNI en una cadena vacía
                        jTx.setText("");
                        jTy.setText("");
                    }
                } catch (Exception e) {
                    // Manejar la excepción BadLocationException, por ejemplo, mostrar un mensaje de error.
                    System.err.println("Error al reemplazar texto: " + e.getMessage());
                }
            }
        });
    }

    public void permitirSoloLetras(JTextField textField) {
        AbstractDocument doc = (AbstractDocument) textField.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string == null) {
                    return;
                }
                if (contieneSoloLetrasYEspacios(string)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text == null) {
                    return;
                }
                if (contieneSoloLetrasYEspacios(text)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean contieneSoloLetrasYEspacios(String text) {
                for (char c : text.toCharArray()) {
                    if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                        return false;
                    }
                }
                return true;
            }
        });
    }

    public boolean validarCorreoElectronico(String correo) {
        // Expresión regular para validar un correo electrónico
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        // Compila la expresión regular en un patrón
        Pattern pattern = Pattern.compile(regex);

        // Crea un objeto Matcher para comparar el texto con el patrón
        Matcher matcher = pattern.matcher(correo);

        // Comprueba si el correo coincide con el patrón
        return matcher.matches();
    }
}

