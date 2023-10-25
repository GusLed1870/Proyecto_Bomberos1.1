package Vistas;

import Acceso_a_Datos.Cuartel_data;
import Entidades.Cuartel;
import javax.swing.JOptionPane;

public class Vista_cuartel extends javax.swing.JInternalFrame {

    //Atributos
    private Cuartel_data cuar;
    private Cuartel_data crtel;

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
        if (!jTcorreo.getText().contains("@gmail.")
                && !jTcorreo.getText().contains("@hotmail.")
                && !jTcorreo.getText().contains("@outlook.")
                && !jTcorreo.getText().contains("@yahoo.")) {
            jLcoorreo.setText("Correo NO valido");

        } else {
            jLcoorreo.setText(" ");
        }
    }

    public void habilitarBoton() {
        String palabra = jTcorreo.getText();
        if (jTnombre.getText().isEmpty()
                || jTdireccion.getText().isEmpty()
                || jTx.getText().isEmpty()
                || jTy.getText().isEmpty()
                || jTtelefono.getText().isEmpty()
                || !jTcorreo.getText().isEmpty()) {

            jBguardar.setEnabled(false);

        }
        if (validarArroba()) {

            jBguardar.setEnabled(true);

        } else {

            jBguardar.setEnabled(false);
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
        jBguardar = new javax.swing.JButton();
        jLnombre = new javax.swing.JLabel();
        jLdireccion = new javax.swing.JLabel();
        jLtelefono = new javax.swing.JLabel();
        jLcorreo = new javax.swing.JLabel();
        jLy = new javax.swing.JLabel();
        jLx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBbuscarid = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jLcoorreo = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1018, 678));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 678));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");

        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });
        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("DIRECCION:");

        jTdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdireccionActionPerformed(evt);
            }
        });
        jTdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTdireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdireccionKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("LATITUD:");

        jTx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("CORREO:");

        jBguardar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jBguardar.setText("Guardar cuartel");
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

        jLabel1.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ficha para Cargar cuartel");

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));

        jLabel8.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ingrese un ID:");

        jLabel9.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Bucar cuartel por ID");

        jBbuscarid.setText("Buscar");
        jBbuscarid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscaridActionPerformed(evt);
            }
        });

        jBmodificar.setText("Modificar Cuartel");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTid)
                .addGap(11, 11, 11))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel9)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBbuscarid)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jBbuscarid)
                .addGap(18, 18, 18)
                .addComponent(jBmodificar)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jBlimpiar.setText("Limpiar campos");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jLcoorreo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTy, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                            .addComponent(jTx))
                                        .addGap(249, 249, 249)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addGap(54, 54, 54))
                                                        .addComponent(jLy, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLcoorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 387, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(279, 279, 279))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLy)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLtelefono))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLnombre)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLdireccion))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLx))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTtelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLcoorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addComponent(jLcorreo)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBguardar)
                    .addComponent(jBlimpiar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTyActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jBguardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarDatosActionPerformed
    }//GEN-LAST:event_jBguardarDatosActionPerformed


    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        String vacios[] = new String[6];

        try {

            if (jTdireccion.getText().isEmpty() || jTnombre.getText().isEmpty() || jTtelefono.getText().isEmpty() || jTcorreo.getText().isEmpty() || jTx.getText().isEmpty() || jTy.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "ERROR, campos vacios");
                return;
            }
            String nombre_cuartel = jTnombre.getText();
            String direccion = jTdireccion.getText();
            String telefono = jTtelefono.getText();
            String correo = jTcorreo.getText();
            int coord_X = Integer.parseInt(jTx.getText());
            int coord_Y = Integer.parseInt(jTy.getText());
            Cuartel cua = new Cuartel(nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo);
            if (cuar.compararCuarteles(cua)) {
                return;
            }
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

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed


    }//GEN-LAST:event_jTnombreActionPerformed

    private void jTdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdireccionActionPerformed

    private void jBbuscaridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscaridActionPerformed
        int idcu = Integer.parseInt(jTid.getText());
        crtel = new Cuartel_data();
        Cuartel cuartelencontrado = crtel.buscarCuartelId(idcu);
        if (cuartelencontrado != null) {
            jBguardar.setVisible(false);
            jTnombre.setText(cuartelencontrado.getNombre_cuartel());
            jTdireccion.setText(cuartelencontrado.getDireccion());
            jTx.setText(String.valueOf(cuartelencontrado.getCoord_X()));
            jTy.setText(String.valueOf(cuartelencontrado.getCoord_Y()));
            jTtelefono.setText(cuartelencontrado.getTelefono());
            jTcorreo.setText(cuartelencontrado.getCorreo());

        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un cuartel con el Id " + jTid.getText());
            jTid.setText(null);
        }

    }//GEN-LAST:event_jBbuscaridActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        String nombre = jTnombre.getText();
        String direccion = jTdireccion.getText();
        String telefono = jTtelefono.getText();
        int x = Integer.parseInt(jTx.getText());
        int y = Integer.parseInt(jTy.getText());
        String correo = jTtelefono.getText();

        Cuartel cuar = crtel.buscarCuartelId(Integer.parseInt(jTid.getText()));

        if (cuar != null) {
            cuar.setNombre_cuartel(nombre);
            cuar.setDireccion(direccion);
            cuar.setCoord_X(x);
            cuar.setCoord_Y(y);
            cuar.setTelefono(telefono);
            cuar.setCorreo(correo);
            jBguardar.setVisible(false);
        }

        crtel.modificarCuartel(cuar);
    }//GEN-LAST:event_jBmodificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarid;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcoorreo;
    private javax.swing.JLabel jLcorreo;
    private javax.swing.JLabel jLdireccion;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLtelefono;
    private javax.swing.JLabel jLx;
    private javax.swing.JLabel jLy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTcorreo;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTid;
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
        jTid.setText(null);
    }

    public boolean validarArroba() {
        boolean validacion = false;
        String palabra = jTcorreo.getText();
        int caracter = 0;
        // System.out.println(palabra);
        if (jTcorreo.getText().contains("@")
                && jTcorreo.getText().contains(".")) {

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) != '@') {
                    caracter++;//toma todos los carasteres antes del "@"

                } else {
                    i = palabra.length() + 1;
                }

            }

            if (caracter > 4) {
                return validacion = true;
            }
            System.out.println(caracter);
        }
        return validacion;
    }
}
