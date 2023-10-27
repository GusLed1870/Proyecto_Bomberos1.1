package Vistas;

import Acceso_a_Datos.BomberoData;
import Acceso_a_Datos.BrigadaData;
import Entidades.Bombero;
import Entidades.Brigada;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
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
        jTNombreApellido.requestFocus();
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
        jRBHabilitarID = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1100, 678));

        jPanel1.setBackground(new java.awt.Color(112, 11, 19));
        jPanel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 520));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bomberos");

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

        jRBHabilitarID.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jRBHabilitarID.setText("Deshabilitado");
        jRBHabilitarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBHabilitarIDActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Busque y modifique un cuartel");

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("                   Agregue un cuartel a la base de datos completando los siguientes campos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
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
                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBEstado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBusquedaXDni, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTIdBombero, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRBHabilitarID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBusquedaXId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTNombreApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBBusquedaXNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jBLimpiar)
                            .addGap(75, 75, 75)
                            .addComponent(jBAgregar)
                            .addGap(74, 74, 74)
                            .addComponent(jBModificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBEliminar)
                            .addGap(72, 72, 72)
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jCBBrigadaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLIdBombero)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLIdBombero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jRBHabilitarID)
                    .addComponent(jBBusquedaXId)
                    .addComponent(jLabel9)
                    .addComponent(jTIdBombero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNombreApellido)
                    .addComponent(jBBusquedaXNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBusquedaXDni))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBBrigadaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4))
                    .addComponent(jDCFechaNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRBEstado)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
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
            } catch (DateTimeParseException e) {
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
        // Crear y configurar la ventana de búsqueda
        String apellido = jTNombreApellido.getText();
        JDialog ventanaBusqueda = new JDialog();
        ventanaBusqueda.setTitle("Ventana de Búsqueda");
        ventanaBusqueda.setSize(440, 153);
        ventanaBusqueda.setLocation(762, 402);
        // Crea la tabla y el modelo de datos
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre y Apellido");
        modelo.addColumn("Documento");
        modelo.addColumn("Celular");
        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        ventanaBusqueda.add(scrollPane);
        // Realizar la consulta SQL con el apellido y obtener la lista de bomberos
        BomberoData bomb = new BomberoData();
        List<Bombero> bomberos = bomb.listarBomberos2(apellido);
        // Llenar el modelo de la tabla con los resultados
        for (Bombero bombero : bomberos) {
            modelo.addRow(new Object[]{
                bombero.getId_bombero(),
                bombero.getNombre_ape(),
                bombero.getDni(),
                bombero.getCelular()
            });
        }
        // Hacer visible la ventana de búsqueda
        ventanaBusqueda.setVisible(true);
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Obtiene la fila seleccionada
                int filaSeleccionada = tabla.getSelectedRow();
                // Verifica si se hizo clic en una fila válida
                if (filaSeleccionada >= 0) {
                    // Obtiene el valor de la columna "ID" en la fila seleccionada
                    Object idSeleccionado = modelo.getValueAt(filaSeleccionada, 0);
                    // Comprueba si el valor es válido (no nulo)
                    if (idSeleccionado != null) {
                        idSeleccionado = Integer.parseInt(idSeleccionado.toString());
                        // Ya obtuve el ID y puedo traerme todo lo demás
                        jTIdBombero.setText(String.valueOf(idSeleccionado));
                        jTIdBombero.setEnabled(false);
                        ventanaBusqueda.dispose();
                        // Invoco al método que me va a crea la tabla en una ventana extra para mostrarme todos los alumnos
                        completarTabla(Integer.parseInt(idSeleccionado.toString()));
                    }
                }
            }
        });
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
        LocalDate fechaNacFormateada = null;
        int codBrigada;
        int idBombero = Integer.parseInt(jTIdBombero.getText());
        String nombre = jTNombreApellido.getText();
        String dni = jTDNI.getText();
        Date fechaNac = jDCFechaNac.getDate();
        Brigada bri = obtenerBrigadaSeleccionada();
        String celu = jTCelular.getText();
        String gs;
        boolean estado = jRBEstado.isSelected();
        BomberoData bombData = new BomberoData();
        BrigadaData briData = new BrigadaData();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el nombre y apellido");
            return;
        }
        if (dni.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el DNI");
            return;
        }
        if (obtenerBrigadaSeleccionada() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una brigada");
            return;
        }
        if (jTCelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el celular");
            return;
        }
        if (!validarCelular(jTCelular)) {
            return;
        }
        long celular = Long.parseLong(celu);
        if (jDCFechaNac.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe completar la fecha de nacimiento");
            return;
        }
        try {
            LocalDate FechaNacFormateada = jDCFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            fechaNac = java.sql.Date.valueOf(FechaNacFormateada);
            if (!esFechaValida(FechaNacFormateada)) {
                return;
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Error al procesar la fecha: " + e.getMessage());
            return;
        }
        if (jCBGrupoSanguineo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debe completar el grupo sanguíneo");
            return;
        }
        if (jRBEstado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe establecer el estado: Activo / Inactivo");
            return;
        }
        LocalDate FechaNacFormateada = jDCFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        fechaNac = java.sql.Date.valueOf(FechaNacFormateada);
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
                    brigada = briData.buscarBrigada(codBrigada);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error al ingresar el código de brigada.");
                    return;
                }
            }
        }
        Bombero bomb = new Bombero(idBombero, dni, nombre, FechaNacFormateada, celular, bri, gs, estado);
        bombData.modificarBombero(bomb);
        limpiarCampos();
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        BomberoData bomData = new BomberoData();
        BrigadaData briData = new BrigadaData();
        Brigada bri;
        if (!jTIdBombero.getText().equals("Para agregar un bombero no es necesario colocar el ID") && (!jLIdBombero.getText().equals(jTIdBombero.getText()))) {
            JOptionPane.showMessageDialog(null, "El legajo no se puede modificar");
        } else {
            try {
                String nombre = jTNombreApellido.getText();
                String dni = jTDNI.getText();
                String grupoSanguineo = jCBGrupoSanguineo.getSelectedItem().toString();
                boolean estado = jRBEstado.isSelected();
     
                if (jTNombreApellido.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe completar el nombre y apellido");
                    return;
                }
                if (jTDNI.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe completar el DNI");
                    return;
                }
                if (Integer.parseInt(jTDNI.getText()) >= 100000000) {
                    JOptionPane.showMessageDialog(null, "El número de DNI es demasiado grande controle si es correcto");
                    return;
                }
                if (Integer.parseInt(jTDNI.getText()) <= 5000000) {
                    JOptionPane.showMessageDialog(null, "El número de DNI es demasiado bajo controle si es correcto");
                    return;
                }
                if (obtenerBrigadaSeleccionada() == null) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una brigada");
                    return;
                }
                if (jTCelular.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe completar el celular");
                    return;
                }
                if (!validarCelular(jTCelular)) {
                    return;
                }
                if (jDCFechaNac.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Debe completar la fecha de nacimiento");
                    return;
                }
                if (jCBGrupoSanguineo.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Debe completar el grupo sanguíneo");
                    return;
                }
                if (!jRBEstado.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Debe establecer el estado: Activo / Inactivo");
                    return;
                }
                // Si se llega aquí, todos los campos están completos
                try {
                    LocalDate FechaNacFormateada = jDCFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    Date fechaNac = java.sql.Date.valueOf(FechaNacFormateada);
                    if (!esFechaValida(FechaNacFormateada)) {
                        return;
                    }
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Error al procesar la fecha: " + e.getMessage());
                    return;
                }
                LocalDate FechaNacFormateada = jDCFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Date fechaNac = java.sql.Date.valueOf(FechaNacFormateada);
                long celular = Long.parseLong(jTCelular.getText());
                bri = obtenerBrigadaSeleccionada();
                bombero.setBrigada(bri);
                Bombero bomb = new Bombero(dni, nombre, FechaNacFormateada, celular, bri, grupoSanguineo, estado);
                String dni2 = jTDNI.getText();
                if (bomData.buscarBomberoIdPorDni2(dni2)) {
                    JOptionPane.showMessageDialog(null, "El DNI que quiere agregar ya se encuentra en la base de datos");
                    return;
                }
                bomData.guardarBombero(bomb);
                limpiarCampos();
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
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

    private void jRBHabilitarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBHabilitarIDActionPerformed
     if (jRBHabilitarID.isSelected()) {
            jRBHabilitarID.setText("Habilitado");
            jBBusquedaXId.setEnabled(true);
            jTIdBombero.setEnabled(true);
            jBAgregar.setEnabled(false);
            jBModificar.setEnabled(true);
        } else {
            jRBHabilitarID.setText("Deshabilitado");
            jBBusquedaXId.setEnabled(false);
            jTIdBombero.setEnabled(false);
            jBAgregar.setEnabled(true);
            jBModificar.setEnabled(false);
        }     
    }//GEN-LAST:event_jRBHabilitarIDActionPerformed

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JRadioButton jRBHabilitarID;
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
        jRBEstado.setText("");
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
        jTIdBombero.setText("");
        permitirSoloNumeros(jTIdBombero);
        jTIdBombero.setForeground(Color.GRAY);
        jTNombreApellido.requestFocus();
        jTIdBombero.setEnabled(false);
        jRBHabilitarID.setSelected(false);
        jBBusquedaXId.setEnabled(false);
        jRBHabilitarID.setText("Deshabilitado");
    }

    // Método que me permite escribir sólo números en un campo textField
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

      // Método que me permite escribir sólo letras en un campo textField
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
        BrigadaData briData = new BrigadaData();
        Brigada brigada = null;
        if (objeto != null) {
            // Dividir la cadena por espacios en blanco
            String obj = objeto.toString();
            String[] parts = obj.split(" ");
            if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                try {
                    int codBrigada = Integer.parseInt(parts[1]);
                    brigada = briData.buscarBrigada2(codBrigada);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error al ingresar un tipo de dato: " + e.getMessage());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al buscar la brigada: " + ex.getMessage());
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

    private void completarTabla(int id) {
        Bombero bomb = bomberoData.buscarBomberoPorID(id);
        jTIdBombero.setText(String.valueOf(bomb.getId_bombero()));
        jTNombreApellido.setText(bomb.getNombre_ape());
        jTDNI.setText(bomb.getDni());
        jTCelular.setText(String.valueOf(bomb.getCelular()));
        jDCFechaNac.setDate(java.sql.Date.valueOf(bomb.getFecha_nac()));
        int nroBrigada = bomb.getBrigada().getCodBrigada();
        for (int i = 0; i < jCBBrigadaAsignada.getItemCount(); i++) {
            Brigada brigadaSeleccionada = (Brigada) jCBBrigadaAsignada.getItemAt(i);
            if (brigadaSeleccionada != null && brigadaSeleccionada.getCodBrigada() == nroBrigada) {
                jCBBrigadaAsignada.setSelectedIndex(i);
                break; // Me saca del bucle una vez que se encuentra la brigada
            }
        }
        String sangre = bomb.getGrupoSanguineo();
        int pos = listaGruposSanguineos(sangre);
        jCBGrupoSanguineo.setSelectedIndex(pos + 1);
        jBModificar.setEnabled(true);
        jBEliminar.setEnabled(true);
        jBAgregar.setEnabled(false);
        jTIdBombero.setEnabled(false);
        if (bomb.isEstado()) {
            BomberoActivo(); // Marca el radio button activo y deshabilita y habilita otros botones declarados en el método 
        } else {
            alumnoInactivo(); // Marca el radio button inactivo y deshabilita y habilita otros botones declarados en el método 
        }
    }

    public void BomberoActivo() {
        jRBEstado.setText("Activo");
        jRBEstado.setSelected(true);
        jBModificar.setEnabled(true);
        jBEliminar.setEnabled(true);
        jBAgregar.setEnabled(false);
    }

    public void alumnoInactivo() {
        jRBEstado.setText("Inactivo");
        jRBEstado.setSelected(false);
        jBAgregar.setEnabled(false);
        jBModificar.setEnabled(true);
        jBEliminar.setEnabled(false);
    }

    public boolean esFechaValida(LocalDate FechaNacFormateada) {
        LocalDate fechaNac = FechaNacFormateada;
        LocalDate fechaMaxima = LocalDate.now();
        LocalDate fecha18anios = LocalDate.of(2005, 10, 26);
        LocalDate fechaMinima = LocalDate.of(1923, 10, 26);
        if (fechaNac.isBefore(fechaMinima)) {
            JOptionPane.showMessageDialog(null, "Controle la fecha de nacimiento porque la edad del bombero supera los 100 años");
            return false;
        }
        if(fechaNac.isAfter(fecha18anios)&&fechaNac.isBefore(fechaMaxima.minusDays(1))){
            JOptionPane.showMessageDialog(null, "El bombero que quiere agregar tiene menos de 18 años. Controle la fecha de nacimiento");
        }
        if (fechaNac.isAfter(fechaMaxima)) {
            JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser posterior a la fecha actual");
            return false;
        } else {
            return true;
        }
    }

    public boolean validarCelular(JTextField jTCelular) {
        String celular = jTCelular.getText().replaceAll("\\s", ""); // Eliminar espacios en blanco
        int longitudMin = 8; // Cambiar estos valores según tus requisitos
        int longitudMax = 10;
        int longitud = celular.length();
        if (longitud <= longitudMax && longitud >= longitudMin) {
            return true; // La longitud del número es válida
        } else {
            JOptionPane.showMessageDialog(null, "Número de teléfono no válido.");
            return false; // La longitud del número no es válida
        }
    }
}
