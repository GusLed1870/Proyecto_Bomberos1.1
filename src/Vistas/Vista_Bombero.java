package Vistas;

import Acceso_a_Datos.BomberoData;
import Acceso_a_Datos.BrigadaData;
import Entidades.Bombero;
import Entidades.Brigada;
import java.awt.Color;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

public class Vista_Bombero extends javax.swing.JInternalFrame {

    private final BomberoData bomberoData;
    private final BrigadaData brigadaData;
    private final Bombero bombero;
    private Brigada brigada;

    public Vista_Bombero() {
        initComponents();
        jTDNI.setText("");
        jTCelular.setText("");
        jTIdBombero.setForeground(Color.GRAY);
        limpiarCampos();
        permitirSoloLetras(jTNombreApellido);
        permitirSoloNumeros(jTIdBombero);
        bomberoData = new BomberoData();
        brigadaData = new BrigadaData();
        bombero = new Bombero();
        CargarComboBox();
        jCBBrigadaAsignada.setSelectedItem(null);
        jBModificar.setEnabled(false);
        jBEliminar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jSpinField1 = new com.toedter.components.JSpinField();
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
        jCBBrigadaAsignada = new javax.swing.JComboBox<>();
        jCBGrupoSanguineo = new javax.swing.JComboBox<>();
        jBBusquedaXNombre = new javax.swing.JButton();
        jRBEstado = new javax.swing.JRadioButton();
        jLID = new javax.swing.JLabel();
        jTIdBombero = new javax.swing.JTextField();
        jBBusquedaXId = new javax.swing.JButton();
        jBBusquedaXDni = new javax.swing.JButton();
        jLIdBombero = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1100, 678));

        jPanel1.setBackground(new java.awt.Color(112, 11, 19));
        jPanel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 520));

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
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCBGrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el grupo sanguíneo", "A-", "A+", "B-", "B+", "AB-", "AB+", "0-", "0+", " " }));

        jBBusquedaXNombre.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBBusquedaXNombre.setText("Búsqueda por Nombre");
        jBBusquedaXNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBusquedaXNombreActionPerformed(evt);
            }
        });

        jRBEstado.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jRBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEstadoActionPerformed(evt);
            }
        });

        jLID.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLID.setForeground(new java.awt.Color(255, 255, 255));
        jLID.setText("Legajo/ID:");

        jTIdBombero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTIdBomberoMouseClicked(evt);
            }
        });

        jBBusquedaXId.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBBusquedaXId.setText("Búsqueda por ID");
        jBBusquedaXId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBusquedaXIdActionPerformed(evt);
            }
        });

        jBBusquedaXDni.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBBusquedaXDni.setText("Búsqueda por DNI");
        jBBusquedaXDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBusquedaXDniActionPerformed(evt);
            }
        });

        jLIdBombero.setForeground(new java.awt.Color(112, 11, 19));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLID)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTNombreApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                                        .addComponent(jTIdBombero, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jBBusquedaXId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBBusquedaXNombre)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBBusquedaXDni, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                            .addComponent(jCBBrigadaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRBEstado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jBLimpiar)
                        .addGap(74, 74, 74)
                        .addComponent(jBAgregar)
                        .addGap(80, 80, 80)
                        .addComponent(jBModificar)
                        .addGap(76, 76, 76)
                        .addComponent(jBEliminar)
                        .addGap(68, 68, 68)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLIdBombero)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLIdBombero)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIdBombero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLID)
                    .addComponent(jBBusquedaXId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNombreApellido)
                    .addComponent(jBBusquedaXNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBusquedaXDni)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBBrigadaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jRBEstado))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBAgregar)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBusquedaXIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBusquedaXIdActionPerformed
        int idBombero;

        try {
            idBombero = Integer.parseInt(jTIdBombero.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No ingresó ningún ID para buscar");
            return;
        }

        try {
            Bombero bombero = bomberoData.buscarBomberoPorID(idBombero);

            if (bombero == null) {
                JOptionPane.showMessageDialog(null, "No se encontró el bombero con ID: " + idBombero);
                return;
            }

            // Seteo el Nombre y Apellido
            jTNombreApellido.setText(bombero.getNombre_ape());

            // Seteo el DNI
            jTDNI.setText(bombero.getDni());

            // Seteo la Brigada a la que pertenece el bombero
            int nroBrigada = bombero.getBrigada().getCodBrigada();

            for (int i = 0; i < jCBBrigadaAsignada.getItemCount(); i++) {
                Brigada brigadaSeleccionada = (Brigada) jCBBrigadaAsignada.getItemAt(i);
                if (brigadaSeleccionada != null && brigadaSeleccionada.getCodBrigada() == nroBrigada) {
                    jCBBrigadaAsignada.setSelectedIndex(i);
                    break; // Me saca del bucle una vez que se encuentra la brigada
                }
            }

            // Seteo el celular
            jTCelular.setText(String.valueOf(bombero.getCelular()));

            // Seteo la Fecha de Nacimiento
            try {
                jDCFechaNac.setDate(java.sql.Date.valueOf(bombero.getFecha_nac()));
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "La fecha de nacimiento es nula o inválida.");
                return;
            }

            // Seteo el grupo sanguíneo
            String sangre = bombero.getGrupoSanguineo();
            int pos = listaGruposSanguineos(sangre);
            jCBGrupoSanguineo.setSelectedIndex(pos + 1);

            // Seteo el Estado
            if (bombero.isEstado()) {
                jRBEstado.setSelected(true);
                jRBEstado.setText("Activo");
                jBEliminar.setEnabled(true);
            } else {
                jRBEstado.setSelected(false);
                jRBEstado.setText("Inactivo");
                jBEliminar.setEnabled(false);
            }

            jBModificar.setEnabled(true);
            jBAgregar.setEnabled(false);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se encontró el bombero con ID: " + idBombero);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar el bombero por ID: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBBusquedaXIdActionPerformed

    private void jRBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEstadoActionPerformed
        if (jRBEstado.isSelected()) {
            jRBEstado.setText("Activo");
            jBEliminar.setEnabled(true);
        } else {
            jRBEstado.setText("Inactivo");
            jBEliminar.setEnabled(false);

        }
    }//GEN-LAST:event_jRBEstadoActionPerformed

    private void jBBusquedaXNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBusquedaXNombreActionPerformed

    }//GEN-LAST:event_jBBusquedaXNombreActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        String dni = jTDNI.getText();
        int idBombero = bomberoData.buscarBomberoIdPorDni(dni);
        bomberoData.eliminarBombero(idBombero);
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        String nombre = jTNombreApellido.getText();
        String dni = jTDNI.getText();
        int celular = 0;
        LocalDate fechaNacFormateada = null;
        int codBrigada = -1;
        brigada = null;
        String gs = "0+";
        try {
            celular = Integer.parseInt(jTCelular.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar el número de celular.");
            return; // Sale del método si hay un error en el celular
        }

        try {
            Date fechaNac = jDCFechaNac.getDate();
            if (fechaNac != null) {
                fechaNacFormateada = fechaNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una fecha de nacimiento válida.");
                return; // Sale del método si no se ha seleccionado una fecha
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar la fecha de nacimiento.");
            return; // Sale del método si hay un error en la fecha de nacimiento
        }
        try {
            gs = jCBGrupoSanguineo.getSelectedItem().toString();
            if (!gs.equalsIgnoreCase("Seleccione el grupo sanguíneo")) {
                gs = jCBGrupoSanguineo.getSelectedItem().toString();
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un grupo sanguíneo");
                return;
            }
        } catch (NullPointerException e) {
            return;
        }

        Object objeto = jCBBrigadaAsignada.getSelectedItem();
        String obj = objeto.toString();

        if (obj != null) {
            String[] parts = obj.split(" ");
            if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                try {
                    codBrigada = Integer.parseInt(parts[1]);
                    BrigadaData briData = new BrigadaData();
                    brigada = briData.buscarBrigada(codBrigada);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error al ingresar el código de brigada.");
                    return; // Sale del método si hay un error en el código de brigada
                }
            }
        }

        Bombero bomb = bomberoData.buscarBomberoPordni(dni);

        if (bomb != null) {
            bomb.setNombre_ape(nombre);
            bomb.setFecha_nac(fechaNacFormateada);
            bomb.setCelular(celular);
            bomb.setGrupoSanguineo(gs);
            bomb.setEstado(jRBEstado.isSelected());

            if (brigada != null) {
                bomb.setBrigada(brigada);
            } else {
                JOptionPane.showMessageDialog(this, "La brigada seleccionada no es válida.");
                return; // Sale del método si no se ha seleccionado una brigada válida
            }

            bomberoData.modificarBombero(bomb);
        } else {
            JOptionPane.showMessageDialog(this, "Bombero no encontrado.");
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        if (!jTIdBombero.getText().equals("No ingrese datos si va a agregar un bombero") && (!jLIdBombero.getText().equals(jTIdBombero.getText()))) {
            JOptionPane.showMessageDialog(null, "El legajo no se puede modificar");
        } else {
            try {
                String nombre = jTNombreApellido.getText();
                String dni = jTDNI.getText();
                LocalDate FechaNacFormateada = jDCFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                int celular = Integer.parseInt(jTCelular.getText());
                String grupoSanguineo = jCBGrupoSanguineo.getSelectedItem().toString();
                boolean estado = jRBEstado.isSelected();
                Date fechaNac = java.sql.Date.valueOf(FechaNacFormateada);

                if (jCBBrigadaAsignada.getSelectedItem() == null) {
                    JOptionPane.showMessageDialog(null, "Debe asignar una brigada");
                    return;
                }
                // Si faltan todos de los campos
                if (jTNombreApellido.getText().isEmpty() && jTDNI.getText().isEmpty() && jDCFechaNac.getDate() == null
                        && jTCelular.getText().isEmpty() && jCBGrupoSanguineo.getSelectedIndex() == 0
                        && obtenerBrigadaSeleccionada() == null && jRBEstado.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
                    return;
                }
                // Si falta el nombre
                if (jTNombreApellido.getText().isEmpty() && !jTDNI.getText().isEmpty() && jDCFechaNac.getDate() != null
                        && !jTCelular.getText().isEmpty() && jCBGrupoSanguineo.getSelectedIndex() != 0
                        && obtenerBrigadaSeleccionada() != null && jRBEstado.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Debe completar el Nombre y Apellido");
                    return;
                }
                // Si falta el DNI
                if (!jTNombreApellido.getText().isEmpty() && jTDNI.getText().isEmpty() && jDCFechaNac.getDate() != null
                        && !jTCelular.getText().isEmpty() && jCBGrupoSanguineo.getSelectedIndex() != 0
                        && obtenerBrigadaSeleccionada() != null && jRBEstado.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Debe completar el DNI");
                    return;
                }
                // Si falta el grupo sanguíneo
                if (!jTNombreApellido.getText().isEmpty() && !jTDNI.getText().isEmpty() && jDCFechaNac.getDate() != null
                        && !jTCelular.getText().isEmpty() && jCBGrupoSanguineo.getSelectedIndex() == 0
                        && obtenerBrigadaSeleccionada() != null && jRBEstado.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Debe completar el grupo sanguíneo");
                    return;
                }
                // Si falta el estado
                if (!jTNombreApellido.getText().isEmpty() && !jTDNI.getText().isEmpty() && jDCFechaNac.getDate() != null
                        && !jTCelular.getText().isEmpty() && jCBGrupoSanguineo.getSelectedIndex() != 0
                        && obtenerBrigadaSeleccionada() != null && !jRBEstado.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Debe establecer el estado: Activo / Inactivo");
                    return;
                }

                Brigada brigadaSeleccionada = obtenerBrigadaSeleccionada();

                bombero.setBrigada(brigadaSeleccionada);

                Bombero bomb = new Bombero(dni, nombre, FechaNacFormateada, celular, brigadaSeleccionada, grupoSanguineo, estado);

                if(bomberoData.buscarBomberoPordni(dni)!=null){
                    JOptionPane.showMessageDialog(null, "El DNI que quiere agregar ya se encuentra en la base de datos");
                    return;
                }
                
                bomberoData.guardarBombero(bomb);

            } catch (DateTimeException e) {
                JOptionPane.showMessageDialog(null, "La fecha de nacimiento es inválida");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Debe completar el celular");
            } catch (Exception e) {
                // Si falta la fecha de nacimiento
                if (!jTNombreApellido.getText().isEmpty() && !jTDNI.getText().isEmpty() && jDCFechaNac.getDate() == null
                        && !jTCelular.getText().isEmpty() && jCBGrupoSanguineo.getSelectedIndex() != 0
                        && obtenerBrigadaSeleccionada() != null) {
                    JOptionPane.showMessageDialog(null, "Debe completar la fecha de nacimiento");
                } // Si falta la brigada 
                else if (!jTNombreApellido.getText().isEmpty() && !jTDNI.getText().isEmpty() && jDCFechaNac.getDate() != null
                        && !jTCelular.getText().isEmpty() && jCBGrupoSanguineo.getSelectedIndex() != 0
                        && obtenerBrigadaSeleccionada() == null) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una brigada");
                } else {
                    JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
                }
            }
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBBusquedaXDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBusquedaXDniActionPerformed
        String dni = jTDNI.getText();
        try {
            Bombero bomb = bomberoData.buscarBomberoPordni(dni);

            // Seteo Nombre y Apellido del bombero
            jTNombreApellido.setText(bomb.getNombre_ape());

            // Seteo el celular del bombero
            jTCelular.setText(String.valueOf(bomb.getCelular()));

            // Seteo la Brigada a la que pertenece el bombero
            int nroBrigada = bomb.getBrigada().getCodBrigada();

            // Recorro los elementos del ComboBox para encontrar la posición de la brigada
            for (int i = 0; i < jCBBrigadaAsignada.getItemCount(); i++) {
                Brigada brigadaSeleccionada = (Brigada) jCBBrigadaAsignada.getItemAt(i);
                if (brigadaSeleccionada != null && brigadaSeleccionada.getCodBrigada() == nroBrigada) {
                    jCBBrigadaAsignada.setSelectedIndex(i);
                    break;
                }
            }

            // Seteo el idBombero
            jTIdBombero.setText(String.valueOf(bomb.getId_bombero()));

            // Seteo el grupo sanguíneo
            String sangre = bomb.getGrupoSanguineo();
            int pos = listaGruposSanguineos(sangre);
            jCBGrupoSanguineo.setSelectedIndex(pos + 1);

            // Seteo la Fecha de Nacimiento
            jDCFechaNac.setDate(java.sql.Date.valueOf(bomb.getFecha_nac()));

            // Seteo el Estado
            if (bomb.isEstado()) {
                jRBEstado.setSelected(true);
                jRBEstado.setText("Activo");
                jBEliminar.setEnabled(true);
            } else {
                jRBEstado.setSelected(false);
                jRBEstado.setText("Inactivo");
                jBEliminar.setEnabled(false);
            }
            jBModificar.setEnabled(true);
            jBAgregar.setEnabled(false);

        } catch (NullPointerException e) {
            if (jTDNI.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingresó ningún DNI");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el bombero con DNI: " + dni);
            }
        }
    }//GEN-LAST:event_jBBusquedaXDniActionPerformed

    private void jTIdBomberoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTIdBomberoMouseClicked
        permitirSoloLetras(jTIdBombero);
        jTIdBombero.setText("");
        jTIdBombero.setForeground(Color.BLACK);
        permitirSoloNumeros(jTIdBombero);
    }//GEN-LAST:event_jTIdBomberoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBusquedaXDni;
    private javax.swing.JButton jBBusquedaXId;
    private javax.swing.JButton jBBusquedaXNombre;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Brigada> jCBBrigadaAsignada;
    private javax.swing.JComboBox<String> jCBGrupoSanguineo;
    private com.toedter.calendar.JDateChooser jDCFechaNac;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLIdBombero;
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
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTIdBombero;
    private javax.swing.JTextField jTNombreApellido;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jTNombreApellido.setText(null);
        jDCFechaNac.setDate(null);
        jCBBrigadaAsignada.setSelectedItem(null);
        jTCelular.setText("");
        jRBEstado.setText(null);
        jRBEstado.setSelected(false);
        jCBGrupoSanguineo.setSelectedIndex(0);
        jBAgregar.setEnabled(true);
        jBModificar.setEnabled(false);
        permitirSoloLetras(jTDNI);
        jTDNI.setText("");
        permitirSoloNumeros(jTDNI);
        permitirSoloLetras(jTCelular);
        jTCelular.setText("");
        permitirSoloNumeros(jTCelular);
        permitirSoloLetras(jTNombreApellido);
        jTNombreApellido.setText("");
        permitirSoloLetras(jTIdBombero);
        jTIdBombero.setText("No ingrese datos si va a agregar un bombero");
        permitirSoloNumeros(jTIdBombero);
        jTIdBombero.setForeground(Color.GRAY);

    }

    public void permitirSoloNumeros(JTextField textField) {
        AbstractDocument doc = (AbstractDocument) textField.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                try {
                    if (string.matches("[0-9]+")) {
                        super.insertString(fb, offset, string, attr);
                        // Después de aplicar el filtro, establece el campo jTDNI en una cadena vacía
                        jTDNI.setText("");
                    }
                } catch (BadLocationException e) {
                    // Manejar la excepción BadLocationException, por ejemplo, mostrar un mensaje de error.
                    System.err.println("Error al insertar texto: " + e.getMessage());
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                try {
                    if (text.matches("[0-9]+")) {
                        super.replace(fb, offset, length, text, attrs);
                        // Después de aplicar el filtro, establece el campo jTDNI en una cadena vacía
                        jTDNI.setText("");
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
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string == null) {
                    return;
                }
                if (contieneSoloLetrasYEspacios(string)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
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

    private void CargarComboBox() {
        ArrayList<Brigada> listaBrigadas = (ArrayList<Brigada>) brigadaData.listarBrigadas();

        DefaultComboBoxModel<Brigada> model = new DefaultComboBoxModel<>();
        jCBBrigadaAsignada.setModel(model);

        listaBrigadas.forEach((brig) -> {
            model.addElement(brig);
        });
    }

    private Brigada obtenerBrigadaSeleccionada() {
        Object objeto = jCBBrigadaAsignada.getSelectedItem();
        String obj = objeto.toString();
        BrigadaData briData = new BrigadaData();
        Brigada brigada = new Brigada();
        int codBrigada = -1; // Valor predeterminado si no se encuentra el código de Cuartel

        if (objeto != null) {
            // Dividir la cadena por espacios en blanco
            String[] parts = obj.split(" ");
            if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                try {
                    codBrigada = Integer.parseInt(parts[1]);
                    brigada = briData.buscarBrigada2(codBrigada);
                    // return brigada;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error al ingresar un tipo de dato." + e);
                }
            }
        }
        return brigada;
    }

    private int listaGruposSanguineos(String grupoSanguineo) {
        ArrayList<String> lista = new ArrayList<>();
        int pos = -1;
        lista.add("A-");
        lista.add("A+");
        lista.add("B-");
        lista.add("B+");
        lista.add("AB-");
        lista.add("AB+");
        lista.add("0-");
        lista.add("0+");
        pos = lista.indexOf(grupoSanguineo);
        return pos;
    }

}
