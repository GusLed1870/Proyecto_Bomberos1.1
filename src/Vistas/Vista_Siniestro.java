package Vistas;

import Acceso_a_Datos.BrigadaData;
import Acceso_a_Datos.SiniestroData;
import Entidades.Brigada;
import Entidades.Siniestro;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

public class Vista_Siniestro extends javax.swing.JInternalFrame {

    BrigadaData brigadaData;
    SiniestroData siniestroData;

    public Vista_Siniestro() {
        initComponents();
        brigadaData = new BrigadaData();
        siniestroData = new SiniestroData();
        jTCodigo.setEnabled(false);
        jBuscarporID.setEnabled(false);
        jRActivacion.setSelected(false);
        jRActivacion.setText("Deshabilitado");
        jBModificar.setEnabled(false);
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jToggleButton1 = new javax.swing.JToggleButton();
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
        jbLimpiarCampos = new javax.swing.JButton();
        jbCargar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAreaDetalles = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTFBrigadaCercana = new javax.swing.JTextField();
        jBModificar = new javax.swing.JButton();
        jBBuscarSiniestro = new javax.swing.JButton();
        jTCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRActivacion = new javax.swing.JRadioButton();
        jBuscarporID = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jToggleButton1.setText("jToggleButton1");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1100, 678));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(931, 666));

        jlTipoEmergencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTipoEmergencia.setText("Tipo de Emergencia:");

        jcbTipoEmergencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbTipoEmergencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de emergencia", "Incendios en viviendas, e industrias", "Salvamento en derrumbes", "Rescates en ámbito montaña", "Rescate de personas atrapadas en accidentes de tráfico", "Socorrer inundaciones", "Operativos de prevención" }));
        jcbTipoEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoEmergenciaActionPerformed(evt);
            }
        });

        jlFechaSiniestro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlFechaSiniestro.setText("Fecha de Siniestro:");

        jlCoord_X.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCoord_X.setText("Coordenada X:");

        jtfCoord_X.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfCoord_X.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCoord_XKeyReleased(evt);
            }
        });

        jlCoord_Y.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCoord_Y.setText("Coordenada Y:");

        jtfCoord_Y.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfCoord_Y.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCoord_YKeyReleased(evt);
            }
        });

        jlDetalles.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlDetalles.setText("Detalles:");

        jlFechaResolucion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlFechaResolucion.setText("Fecha de Resolución:");

        jlBrigada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlBrigada.setText("Brigada más cercana libre:");

        jbLimpiarCampos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbLimpiarCampos.setText("Limpiar campos");
        jbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCamposActionPerformed(evt);
            }
        });

        jbCargar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCargar.setText("Cargar");
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtAreaDetalles.setColumns(20);
        jtAreaDetalles.setRows(5);
        jScrollPane1.setViewportView(jtAreaDetalles);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("EMERGENCIAS");

        jBModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBBuscarSiniestro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBBuscarSiniestro.setText("Buscar Emergencias Asistidas");
        jBBuscarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarSiniestroActionPerformed(evt);
            }
        });

        jTCodigo.setText("No editable");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Código (interno):");

        jRActivacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRActivacion.setText("Deshabilitado");
        jRActivacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRActivacionActionPerformed(evt);
            }
        });

        jBuscarporID.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBuscarporID.setText("Buscar Emergencia por ID");
        jBuscarporID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarporIDActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("                   Cargue una emergencia a la base de datos completando los siguientes campos:");

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Busque y modifique un siniestro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlBrigada)
                            .addComponent(jlFechaResolucion)
                            .addComponent(jlDetalles)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlTipoEmergencia)
                                    .addComponent(jlFechaSiniestro)
                                    .addComponent(jlCoord_X))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jlCoord_Y))))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCoord_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCoord_X, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jcbTipoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBBuscarSiniestro))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdcFechaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbLimpiarCampos)
                                    .addGap(99, 99, 99)
                                    .addComponent(jbCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80)
                                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTFBrigadaCercana, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRActivacion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBuscarporID, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jLabel1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRActivacion)
                    .addComponent(jBuscarporID)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbTipoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTipoEmergencia)
                            .addComponent(jBBuscarSiniestro))
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlFechaSiniestro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCoord_X, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCoord_X, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCoord_Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCoord_Y))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jlDetalles))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFechaResolucion))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBrigadaCercana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlBrigada))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiarCampos)
                    .addComponent(jbCargar)
                    .addComponent(jBModificar)
                    .addComponent(jbSalir))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
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
        BrigadaData briData = new BrigadaData();
        int cod = -1;
        try {
            if (validacionCamposVacios()) {
                JOptionPane.showMessageDialog(this, "Corrobore los datos ingresados.");
                return;
            }
            Siniestro siniestro = new Siniestro();
            siniestro.setTipo(jcbTipoEmergencia.getSelectedItem().toString());
            siniestro.setFecha_siniestro(jdcFechaSiniestro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            siniestro.setCoord_X(Integer.parseInt(jtfCoord_X.getText()));
            siniestro.setCoord_Y(Integer.parseInt(jtfCoord_Y.getText()));
            siniestro.setDetalles(jtAreaDetalles.getText());
            siniestro.setBrigada(briData.buscarBrigada2(imprimirLista()));
            cod = imprimirLista();
            //Date fecha = (Date) jdcFechaSiniestro.getDate();
            LocalDate fechaLocalDate = jdcFechaSiniestro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaActual = LocalDate.now();
            if (fechaLocalDate.isBefore(fechaActual) || fechaLocalDate.isEqual(fechaActual)) {
                if (jdcFechaResolucion.getDate() != null && !jdcFechaResolucion.getDate().before(jdcFechaSiniestro.getDate())) {
                    siniestro.setFecha_resol(jdcFechaResolucion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    siniestroData.cargarSiniestro(siniestro);
                    limpiarCampos();
                    //briData.Brigadaocupada(cod);
                    return;
                }
                if (jdcFechaResolucion.getDate() != null && jdcFechaResolucion.getDate().before(jdcFechaSiniestro.getDate())) {
                    JOptionPane.showMessageDialog(null, "La fecha de resolución no puede ser anterior a la fecha del siniestro");
                }
                if (jdcFechaResolucion.getDate() == null) {
                    briData.Brigadaocupada(cod);
                    siniestroData.cargarSiniestro2(siniestro);
                    limpiarCampos();
                    return;
                }
            } else {
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Puedes ajustar el formato a tu preferencia
                // Formatea la fecha como una cadena
                String fechaActualTexto = fechaActual.format(formato);
                JOptionPane.showMessageDialog(this, "No se puede ingresar una fecha mayor a la fecha de hoy\nHoy es " + fechaActualTexto);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos numéricos en los campos de coordenadas.");
        } catch (IllegalArgumentException iae) {
            JOptionPane.showMessageDialog(this, "Debe ingresar la fecha en el formato yyyy-MM-dd");
        }
    }//GEN-LAST:event_jbCargarActionPerformed

    private void jtfCoord_XKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCoord_XKeyReleased
        if (!jtfCoord_X.getText().isEmpty() && !jtfCoord_Y.getText().isEmpty()) {
            imprimirLista();
        }
    }//GEN-LAST:event_jtfCoord_XKeyReleased

    private void jtfCoord_YKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCoord_YKeyReleased
        if (!jtfCoord_X.getText().isEmpty() && !jtfCoord_Y.getText().isEmpty()) {
            imprimirLista();
        }
    }//GEN-LAST:event_jtfCoord_YKeyReleased

    private void jcbTipoEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoEmergenciaActionPerformed
        if (!jtfCoord_X.getText().isEmpty() && !jtfCoord_Y.getText().isEmpty()) {
            imprimirLista();
        }
    }//GEN-LAST:event_jcbTipoEmergenciaActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        int codBrigada = 0;
        BrigadaData briData = new BrigadaData();
        Brigada bri = new Brigada();
        String tipo = "";
        String detalles = "";
        Siniestro siniestro = new Siniestro();
        SiniestroData siniData = new SiniestroData();

        int codigo = Integer.parseInt(jTCodigo.getText());

        Date fechaSiniestro = jdcFechaSiniestro.getDate();
        LocalDate fechaSiniestroFormateada = fechaSiniestro.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        fechaSiniestro = java.sql.Date.valueOf(fechaSiniestroFormateada);

        Date fechaResolucion = jdcFechaResolucion.getDate();
        LocalDate fechaResolFormateada = null; // Declare it here

        if (jcbTipoEmergencia.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el tipo de emergencia");
            return;
        }

        if (!tipo.equalsIgnoreCase("Seleccione el tipo de emergencia")) {
            tipo = jcbTipoEmergencia.getSelectedItem().toString();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de emergencia");
            return;
        }

        if (jdcFechaSiniestro.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe completar la fecha de nacimiento");
            return;
        }

        if (jtfCoord_X.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar la Coordenada X");
            return;
        }
        int coord_X = Integer.parseInt(jtfCoord_X.getText());

        if (jtfCoord_Y.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar la Coordenada Y");
            return;
        }
        int coord_Y = Integer.parseInt(jtfCoord_Y.getText());

        detalles = jtAreaDetalles.getText();

        if (detalles.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe agregar detalles sobre el siniestro");
            return;
        }

        if (fechaResolucion != null) {
            fechaResolFormateada = fechaResolucion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (!esFechaValida(fechaResolFormateada)) {
                return;
            }

            if (fechaResolFormateada.isBefore(fechaSiniestroFormateada)) {
                JOptionPane.showMessageDialog(null, "La fecha de resolución no puede ser anterior a la fecha del siniestro");
                return;
            }
        }
        Siniestro sini = siniData.buscarSiniestroPorId(codigo);
        if (!sini.getTipo().equals(jcbTipoEmergencia.getSelectedItem().toString())) {
            codBrigada = imprimirLista();
        } else if (sini.getCoord_X() != Integer.parseInt(jtfCoord_X.getText())) {
            codBrigada = imprimirLista();
        } else if (sini.getCoord_Y() != Integer.parseInt(jtfCoord_Y.getText())) {
            codBrigada = imprimirLista();   
        }   else  {
            codBrigada = sini.getBrigada().getCodBrigada();
        }
        bri = briData.buscarBrigada(codBrigada);
        briData.Brigadaocupada(codBrigada);

        siniestro.setCodigo(codigo);
        siniestro.setTipo(tipo);
        siniestro.setFecha_siniestro(fechaSiniestroFormateada);
        siniestro.setCoord_X(coord_X);
        siniestro.setCoord_Y(coord_Y);
        siniestro.setDetalles(detalles);
        siniestro.setBrigada(bri);

        if (fechaResolFormateada != null) {
            if (codBrigada != sini.getBrigada().getCodBrigada()) {
                briData.Brigadaocupada(codBrigada);
                briData.Brigadalibre(sini.getBrigada().getCodBrigada());
            }
            siniestro.setFecha_resol(fechaResolFormateada);
            briData.modificarsiniestro(siniestro);

        } else {
            
            if (codBrigada != sini.getBrigada().getCodBrigada()) {
                briData.Brigadaocupada(codBrigada);
                briData.Brigadalibre(sini.getBrigada().getCodBrigada());
           
                briData.modificarsiniestro_sinfecha(siniestro);
                return;
            } else {
                briData.modificarsiniestro_sinfecha(siniestro);
               
                return;
            }
        }
        limpiarCampos();
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBBuscarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarSiniestroActionPerformed
        if (jcbTipoEmergencia.getSelectedIndex() > 0) {
            // Crear y configurar la ventana de búsqueda
            JDialog ventanaBusqueda = new JDialog();
            ventanaBusqueda.setTitle("Ventana de Búsqueda");
            ventanaBusqueda.setSize(570, 153);
            ventanaBusqueda.setLocation(610, 263);

            // Crea la tabla y el modelo de datos
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Fecha Inicio");
            modelo.addColumn("Coord_X");
            modelo.addColumn("Coord_Y");
            modelo.addColumn("Brigada Asignada");
            JTable tabla = new JTable(modelo);
            JScrollPane scrollPane = new JScrollPane(tabla);
            ventanaBusqueda.add(scrollPane);

            // Realizar la consulta SQL con el apellido y obtener la lista de siniestros
            SiniestroData sin = new SiniestroData();
            String tipo = jcbTipoEmergencia.getSelectedItem().toString();
            List<String> siniestros = sin.listarSiniestros2(tipo);
            for (String fila : siniestros) {
                String[] datos = fila.split(", ");
                modelo.addRow(datos);
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
                            jTCodigo.setText(String.valueOf(idSeleccionado));
                            jTCodigo.setEnabled(false);
                            ventanaBusqueda.dispose();
                            // Invoco al método que me va a crea la tabla en una ventana extra para mostrarme todos los siniestros
                            completarTabla(Integer.parseInt(idSeleccionado.toString()));
                        }
                    }
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo antes de realizar la búsqueda");
        }
    }//GEN-LAST:event_jBBuscarSiniestroActionPerformed

    private void jRActivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRActivacionActionPerformed
        if (jRActivacion.isSelected()) {
            jTCodigo.setEnabled(true);
            jTCodigo.setEditable(true);
            jTCodigo.setText("");
            jBuscarporID.setEnabled(true);
            jRActivacion.setText("Habilitado");

        } else {
            jTCodigo.setEnabled(false);
            jTCodigo.setEditable(false);
            jTCodigo.setText("No Editable");
            jBuscarporID.setEnabled(false);
            jRActivacion.setText("Deshabilitado");

        }
    }//GEN-LAST:event_jRActivacionActionPerformed

    private void jBuscarporIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarporIDActionPerformed
        int idSiniestro;
        try {
            idSiniestro = Integer.parseInt(jTCodigo.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No ingresó ningún ID para buscar");
            return;
        }
        try {
            Siniestro siniestro = siniestroData.buscarSiniestroPorId(idSiniestro);
            if (siniestro == null) {
                JOptionPane.showMessageDialog(null, "No se encontró el siniestro con ID: " + idSiniestro);
                return;
            }
            completarTabla(idSiniestro);
            jBModificar.setEnabled(true);
            jbCargar.setEnabled(false);
            jRActivacion.setSelected(false);
            jRActivacion.setText("Deshabilitado");
            jBuscarporID.setEnabled(false);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se encontró el bombero con ID: " + idSiniestro);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al buscar el bombero por ID: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBuscarporIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarSiniestro;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBuscarporID;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRActivacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTFBrigadaCercana;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JButton jbSalir;
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

    private void limpiarCampos() {

        jcbTipoEmergencia.setSelectedIndex(0);
        jdcFechaSiniestro.setDate(null);
        jtAreaDetalles.setText(null);
        jdcFechaResolucion.setDate(null);
        jTFBrigadaCercana.setText(null);
        jTCodigo.setText("");
        jBuscarporID.setEnabled(false);
        jRActivacion.setSelected(false);
        jRActivacion.setText("Deshabilitado");
        jBModificar.setEnabled(false);
        jbCargar.setEnabled(true);
        permitirSoloLetras(jtfCoord_X);
        jtfCoord_X.setText("");
        permitirSoloNumeros(jtfCoord_X);
        permitirSoloLetras(jtfCoord_Y);
        jtfCoord_Y.setText("");
        permitirSoloNumeros(jtfCoord_Y);

    }

    private boolean validacionCamposVacios() {
        return jcbTipoEmergencia.getSelectedItem().toString().equalsIgnoreCase("Seleccione el tipo de emergencia") || jtfCoord_X.getText().isEmpty()
                || jtfCoord_Y.getText().isEmpty() || jtAreaDetalles.getText().isEmpty();
    }

    public int imprimirLista() {
        SiniestroData sini = new SiniestroData();
        Brigada bri = new Brigada();
        BrigadaData briData = new BrigadaData();
        if (jcbTipoEmergencia.getSelectedIndex() > 0) {
            ArrayList<String> lista = sini.brigadaAsignada(jcbTipoEmergencia.getSelectedItem().toString());
            double aux = 1000000000;
            for (String string : lista) {
                String[] parts = string.split(" ");
                double corX = Double.parseDouble(parts[2]);
                double corY = Double.parseDouble(parts[3]);
                double distancia = calcularDistancia(corX, corY);
                if (distancia <= aux) {
                    aux = distancia;
                    int id = Integer.parseInt(parts[0]);
                    bri = briData.buscarBrigada2(id);
                    int codBrigada = buscarCodBrigada();
                    jTFBrigadaCercana.setText("ID:  " + codBrigada + "     Nombre: " + bri.getNombre_br()
                            + "    Cuartel: " + bri.getCuartel().getNombre_cuartel() + "    Distancia al sinietro: " + (int) aux);
                }
            }
        }
        return bri.getCodBrigada();
    }
 public int buscarCodBrigada(){ 
       int codigo = Integer.parseInt(jTCodigo.getText());
     SiniestroData siniData = new SiniestroData();
             Siniestro sini = siniData.buscarSiniestroPorId(codigo);
             int codBrigada = 0;
      if (!sini.getTipo().equals(jcbTipoEmergencia.getSelectedItem().toString())) {
            codBrigada = imprimirLista();
        } else if (sini.getCoord_X() != Integer.parseInt(jtfCoord_X.getText())) {
            codBrigada = imprimirLista();
        } else if (sini.getCoord_Y() != Integer.parseInt(jtfCoord_Y.getText())) {
            codBrigada = imprimirLista();   
        }   else  {
            codBrigada = sini.getBrigada().getCodBrigada();
        }
      return codBrigada;
 }
    
    
    // Método para calcular la distancia entre dos puntos
    public double calcularDistancia(double coord_X1, double coord_Y1) {
        double coord_X2 = Double.parseDouble(jtfCoord_X.getText());
        double coord_Y2 = Double.parseDouble(jtfCoord_Y.getText());
        double distanciaX = coord_X2 - coord_X1;
        double distanciaY = coord_Y2 - coord_Y1;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    private void completarTabla(int id) {
        Siniestro siniestro = siniestroData.buscarSiniestroPorId(id);
        jTCodigo.setText(String.valueOf(siniestro.getCodigo()));
        String tipo = siniestro.getTipo();
        int pos = listaTipoEmergencias(tipo);
        jcbTipoEmergencia.setSelectedIndex(pos + 1);
        jBModificar.setEnabled(true);
//        jBEliminar.setEnabled(true);
        jbCargar.setEnabled(false);
        jTCodigo.setEnabled(false);
        jdcFechaSiniestro.setDate(java.sql.Date.valueOf(siniestro.getFecha_siniestro()));
        jtfCoord_X.setText(String.valueOf(siniestro.getCoord_X()));
        jtfCoord_Y.setText(String.valueOf(siniestro.getCoord_Y()));
        jTFBrigadaCercana.setText(siniestro.getBrigada().toString());
        jtAreaDetalles.setText(siniestro.getDetalles());
        if (siniestro.getFecha_resol() == null) {
            jdcFechaResolucion.setDate(null);
        } else {
            jdcFechaResolucion.setDate(java.sql.Date.valueOf(siniestro.getFecha_resol()));
        }
    }

    private int listaTipoEmergencias(String tipo) {
        ArrayList<String> lista = new ArrayList<>();
        int pos = -1;
        lista.add("Incendios en viviendas, e industrias");
        lista.add("Salvamento en derrumbes");
        lista.add("Rescates en ámbito montaña");
        lista.add("Rescate de personas atrapadas en accidentes de tráfico");
        lista.add("Socorrer inundaciones");
        lista.add("Operativos de prevención");
        pos = lista.indexOf(tipo);
        return pos;
    }

    /////////////////////////////////////////////////////////////////////////////////// 
    //                      REVISAR ESTE MÉTODO                                      //
    ///////////////////////////////////////////////////////////////////////////////////  
    public boolean esFechaValida(LocalDate fechaResolFormateada) {
        LocalDate fechaRes = fechaResolFormateada;
        LocalDate fechaMaxima = LocalDate.now();

//        if (fechaRes.isBefore(fechaMinima)) {
//            JOptionPane.showMessageDialog(null, "La fecha de resolución no puede ser anterior a la fecha del siniestro");
//            return false;
//        }
        if (fechaRes.isAfter(fechaMaxima)) {
            JOptionPane.showMessageDialog(null, "La fecha de resolución no puede ser posterior a la fecha del siniestro");
            return false;
        } else {
            return true;
        }
    }
    // Método que me permite escribir sólo números en un campo textField

    public void permitirSoloNumeros(JTextField textField) {
        AbstractDocument doc = (AbstractDocument) textField.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                try {
                    if (string.matches("[0-9]+")) {
                        super.insertString(fb, offset, string, attr);
                        // Después de aplicar el filtro, establece el campo jTDNI en una cadena vacía
                        jtfCoord_X.setText("");
                        jtfCoord_Y.setText("");
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
                        jtfCoord_X.setText("");
                        jtfCoord_Y.setText("");
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

}
