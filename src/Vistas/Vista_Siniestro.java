package Vistas;

import Acceso_a_Datos.BrigadaData;
import Acceso_a_Datos.SiniestroData;
import Entidades.Brigada;
import Entidades.Siniestro;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Vista_Siniestro extends javax.swing.JInternalFrame {

    //Atributos
    BrigadaData brigadaData;
    SiniestroData siniestroData;

    public Vista_Siniestro() {
        initComponents();
        brigadaData = new BrigadaData();
        siniestroData = new SiniestroData();
        jTCodigo.setEnabled(false);
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
        jBEliminar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jToggleButton1.setText("jToggleButton1");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1100, 678));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(931, 666));

        jlTipoEmergencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTipoEmergencia.setForeground(new java.awt.Color(0, 0, 0));
        jlTipoEmergencia.setText("Tipo de Emergencia:");

        jcbTipoEmergencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbTipoEmergencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de emergencia", "Incendios en viviendas, e industrias", "Salvamento en derrumbes", "Rescates en ámbito montaña", "Rescate de personas atrapadas en accidentes de tráfico", "Socorrer inundaciones", "Operativos de prevención" }));
        jcbTipoEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoEmergenciaActionPerformed(evt);
            }
        });

        jlFechaSiniestro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlFechaSiniestro.setForeground(new java.awt.Color(0, 0, 0));
        jlFechaSiniestro.setText("Fecha de Siniestro:");

        jlCoord_X.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCoord_X.setForeground(new java.awt.Color(0, 0, 0));
        jlCoord_X.setText("Coordenada X:");

        jtfCoord_X.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfCoord_X.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCoord_XKeyReleased(evt);
            }
        });

        jlCoord_Y.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCoord_Y.setForeground(new java.awt.Color(0, 0, 0));
        jlCoord_Y.setText("Coordenada Y:");

        jtfCoord_Y.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfCoord_Y.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCoord_YKeyReleased(evt);
            }
        });

        jlDetalles.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlDetalles.setForeground(new java.awt.Color(0, 0, 0));
        jlDetalles.setText("Detalles:");

        jlFechaResolucion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlFechaResolucion.setForeground(new java.awt.Color(0, 0, 0));
        jlFechaResolucion.setText("Fecha de Resolución:");

        jlBrigada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlBrigada.setForeground(new java.awt.Color(0, 0, 0));
        jlBrigada.setText("Brigada más cercana libre:");

        jbLimpiarCampos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbLimpiarCampos.setForeground(new java.awt.Color(0, 0, 0));
        jbLimpiarCampos.setText("Limpiar campos");
        jbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCamposActionPerformed(evt);
            }
        });

        jbCargar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbCargar.setForeground(new java.awt.Color(0, 0, 0));
        jbCargar.setText("Cargar");
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
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

        jBModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(0, 0, 0));
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBBuscarSiniestro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBBuscarSiniestro.setForeground(new java.awt.Color(0, 0, 0));
        jBBuscarSiniestro.setText("Buscar Emergencias Asistidas");
        jBBuscarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarSiniestroActionPerformed(evt);
            }
        });

        jTCodigo.setText("No editable");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código (interno):");

        jBEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jBEliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlCoord_Y)
                                        .addComponent(jlCoord_X)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTipoEmergencia, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlFechaSiniestro)
                                    .addGap(1, 1, 1))
                                .addComponent(jlDetalles, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlBrigada)
                                    .addComponent(jlFechaResolucion))
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFechaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfCoord_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdcFechaResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfCoord_X, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTFBrigadaCercana, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbLimpiarCampos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbTipoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBBuscarSiniestro)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(436, 436, 436))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbTipoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTipoEmergencia)
                            .addComponent(jBBuscarSiniestro))
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlFechaSiniestro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCoord_X)
                    .addComponent(jtfCoord_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCoord_Y)
                    .addComponent(jtfCoord_Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlFechaResolucion)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBrigada)
                    .addComponent(jTFBrigadaCercana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiarCampos)
                    .addComponent(jbCargar)
                    .addComponent(jBModificar)
                    .addComponent(jbSalir)
                    .addComponent(jBEliminar))
                .addContainerGap(93, Short.MAX_VALUE))
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
            //Date fecha = (Date) jdcFechaSiniestro.getDate();
            LocalDate fechaLocalDate = jdcFechaSiniestro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaActual = LocalDate.now();
            if (fechaLocalDate.isBefore(fechaActual) || fechaLocalDate.isEqual(fechaActual)) {
                if (jdcFechaResolucion.getDate() != null && !jdcFechaResolucion.getDate().before(jdcFechaSiniestro.getDate())) {
                    siniestro.setFecha_resol(jdcFechaResolucion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    siniestroData.cargarSiniestro(siniestro);
                    limpiarCampos();
                    return;
                }
                if (jdcFechaResolucion.getDate() != null && jdcFechaResolucion.getDate().before(jdcFechaSiniestro.getDate())) {
                    JOptionPane.showMessageDialog(null, "La fecha de resolución no puede ser anterior a la fecha del siniestro");
                }
                if (jdcFechaResolucion.getDate() == null) {
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
        BrigadaData briData = new BrigadaData();
        Brigada bri = new Brigada();
        try {
            if (validacionCamposVacios()) {
                JOptionPane.showMessageDialog(this, "Corrobore los datos ingresados.");
                return;
            }
            Siniestro siniestro = new Siniestro();
            siniestro.setCodigo(Integer.parseInt(jTCodigo.getText()));
            siniestro.setTipo(jcbTipoEmergencia.getSelectedItem().toString());
            siniestro.setFecha_siniestro(jdcFechaSiniestro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            siniestro.setCoord_X(Integer.parseInt(jtfCoord_X.getText()));
            siniestro.setCoord_Y(Integer.parseInt(jtfCoord_Y.getText()));
            siniestro.setDetalles(jtAreaDetalles.getText());
            String[] parts = jTFBrigadaCercana.getText().split(" ");
            int codBrigada = Integer.parseInt(parts[1]);
            //System.out.println("CODIGOO BRIGAS " + codBrigada);
            bri = briData.buscarBrigada(codBrigada);
            siniestro.setBrigada(bri);
            //System.out.println("id brigada "+imprimirLista());
            if (jdcFechaResolucion.getDate() != null) {
                siniestro.setFecha_resol(jdcFechaResolucion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                briData.modificarsiniestro(siniestro);
            } else {
                
                siniestroData.modificarSiniestro2(siniestro);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos numéricos en los campos de coordenadas.");
        } catch (IllegalArgumentException iae) {
            JOptionPane.showMessageDialog(this, "Debe ingresar la fecha en el formato yyyy-MM-dd");
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBBuscarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarSiniestroActionPerformed
        if (jcbTipoEmergencia.getSelectedIndex() > 0) {
            // Crear y configurar la ventana de búsqueda
            JDialog ventanaBusqueda = new JDialog();
            ventanaBusqueda.setTitle("Ventana de Búsqueda");
            ventanaBusqueda.setSize(440, 153);
            ventanaBusqueda.setLocation(762, 352);

            // Crea la tabla y el modelo de datos
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
//        modelo.addColumn("Tipo");
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
            //System.out.println("Tipo: " + tipo);
            List<String> siniestros = sin.listarSiniestros2(tipo);
            // Llenar el modelo de la tabla con los resultados
            /*for (Siniestro siniestro : siniestros) {
            modelo.addRow(new Object[]{
                siniestro.getCodigo(),
                siniestro.getTipo(),
                siniestro.getFecha_siniestro(),
                siniestro.getCoord_X(),
                siniestro.getCoord_Y(),
                siniestro.getBrigada().getCodBrigada()
            });
        }*/
            //System.out.println("Lista " + siniestros);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarSiniestro;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
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
        jtfCoord_X.setText(null);
        jtfCoord_Y.setText(null);
        jtAreaDetalles.setText(null);
        jdcFechaResolucion.setDate(null);
        jTFBrigadaCercana.setText(null);
        jTCodigo.setText("");
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
                    jTFBrigadaCercana.setText("ID:  " + bri.getCodBrigada() + "     Nombre: " + bri.getNombre_br()
                            + "    Cuartel: " + bri.getCuartel().getNombre_cuartel() + "    Distancia al sinietro: " + (int) aux);
                }
            }
        }
        return bri.getCodBrigada();
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
        jBEliminar.setEnabled(true);
        jbCargar.setEnabled(false);
        jTCodigo.setEnabled(false);
        jdcFechaSiniestro.setDate(java.sql.Date.valueOf(siniestro.getFecha_siniestro()));
        jtfCoord_X.setText(String.valueOf(siniestro.getCoord_X()));
        jtfCoord_Y.setText(String.valueOf(siniestro.getCoord_Y()));
        jTFBrigadaCercana.setText(siniestro.getBrigada().toString());
        jtAreaDetalles.setText(siniestro.getDetalles());
        if(siniestro.getFecha_resol()==null){
            jdcFechaResolucion.setDate(null);
        }else{
            jdcFechaResolucion.setDate(java.sql.Date.valueOf(siniestro.getFecha_resol()));
        }
//        int nroBrigada = bomb.getBrigada().getCodBrigada();
//        for (int i = 0; i < jCBBrigadaAsignada.getItemCount(); i++) {
//            Brigada brigadaSeleccionada = (Brigada) jCBBrigadaAsignada.getItemAt(i);
//            if (brigadaSeleccionada != null && brigadaSeleccionada.getCodBrigada() == nroBrigada) {
//                jCBBrigadaAsignada.setSelectedIndex(i);
//                break; // Me saca del bucle una vez que se encuentra la brigada                
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
}
