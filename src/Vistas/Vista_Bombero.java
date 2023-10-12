package Vistas;

import Acceso_a_Datos.BomberoData;
import Acceso_a_Datos.BrigadaData;
import Entidades.Bombero;
import Entidades.Brigada;
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
        limpiarCampos();
        bomberoData = new BomberoData();
        brigadaData = new BrigadaData();
        bombero = new Bombero();
        CargarComboBox();
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
        calendarioOculto = new javax.swing.JLabel();
        jCBBrigadaAsignada = new javax.swing.JComboBox<>();
        jCBGrupoSanguineo = new javax.swing.JComboBox<>();
        jBBusquedaXDni = new javax.swing.JButton();
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

        calendarioOculto.setBackground(new java.awt.Color(112, 12, 19));
        calendarioOculto.setForeground(new java.awt.Color(112, 11, 19));
        calendarioOculto.setText("jLabel9");

        jCBGrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el grupo sanguíneo", "A-", "A+", "B-", "B+", "AB-", "AB+", "0-", "0+", " " }));

        jBBusquedaXDni.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBBusquedaXDni.setText("Búsqueda por DNI");
        jBBusquedaXDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBusquedaXDniActionPerformed(evt);
            }
        });

        jRBEstado.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jRBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEstadoActionPerformed(evt);
            }
        });

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
                                .addComponent(jBBusquedaXDni))
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
                        .addComponent(jBBusquedaXDni)
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
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBSalir)
                            .addComponent(jBEliminar)
                            .addComponent(jBModificar)
                            .addComponent(jBAgregar)
                            .addComponent(jBLimpiar))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRBEstado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        Date fechaNac = java.sql.Date.valueOf(FechaNacFormateada);

        Brigada brigadaSeleccionada = obtenerBrigadaSeleccionada();

        bombero.setBrigada(brigadaSeleccionada);

        Bombero bomb = new Bombero(dni, nombre, FechaNacFormateada, celular, brigadaSeleccionada, grupoSanguineo, estado);

        if (jTNombreApellido.getText().isEmpty() || jTDNI.getText().isEmpty() || jDCFechaNac.getDate() == null
                || jTCelular.getText().isEmpty() || jCBGrupoSanguineo.getSelectedIndex() == 0
                || jCBBrigadaAsignada.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "No debe dejar campos vacíos");
            return;
        }
        bomberoData.guardarBombero(bomb);
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        String nombre = jTNombreApellido.getText();
        String dni = jTDNI.getText();
        LocalDate fechaNacFormateada = jDCFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int celular = Integer.parseInt(jTCelular.getText());
        String grupoSanguineo = jCBGrupoSanguineo.getSelectedItem().toString();
        boolean estado = jRBEstado.isSelected();

        Bombero bomb = bomberoData.buscarBomberoPordni(dni);

        if (bomb != null) {

            bomb.setNombre_ape(nombre);
            bomb.setFecha_nac(fechaNacFormateada);
            bomb.setCelular(celular);
            bomb.setGrupoSanguineo(grupoSanguineo);
            bomb.setEstado(estado);

            Object objeto = jCBBrigadaAsignada.getSelectedItem();
            String obj = objeto.toString();
            int codBrigada = -1;
            Brigada brigada = null;

            if (objeto != null) {

                String[] parts = obj.split(" ");
                if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                    try {
                        codBrigada = Integer.parseInt(parts[1]);
                        BrigadaData briData = new BrigadaData();
                        brigada = briData.buscarBrigada(codBrigada);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Error al ingresar un tipo de dato." + e);
                    }
                }
            }

            if (brigada != null) {
                bomb.setBrigada(brigada);
            } else {
                JOptionPane.showMessageDialog(this, "La brigada seleccionada no es válida.");
            }

            bomberoData.modificarBombero(bomb);
        }

    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBBusquedaXDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBusquedaXDniActionPerformed
        String dni = jTDNI.getText();
        try {
            Bombero bomb = bomberoData.buscarBomberoPordni(dni);

            jTNombreApellido.setText(bomb.getNombre_ape());
            jTCelular.setText(String.valueOf(bomb.getCelular()));

            // Seteo el grupo sanguíneo
            String sangre = bomb.getGrupoSanguineo();
            int pos = listaGruposSanguineos(sangre);
            jCBGrupoSanguineo.setSelectedIndex(pos + 1);
            jDCFechaNac.setDate(java.sql.Date.valueOf(bomb.getFecha_nac()));

            // Seteo la Brigada a la que pertenece el bombero
            int nroBrigada = bomb.getBrigada().getCodBrigada();

            // Recorro los elementos del ComboBox para encontrar la posición de la brigada
            for (int i = 0; i < jCBBrigadaAsignada.getItemCount(); i++) {
                Brigada brigadaSeleccionada = (Brigada) jCBBrigadaAsignada.getItemAt(i);
                if (brigadaSeleccionada != null && brigadaSeleccionada.getCodBrigada() == nroBrigada) {
                    jCBBrigadaAsignada.setSelectedIndex(i);
                    break;  // Me saca del bucle una vez que se encuentra la brigada
                }
            }
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
            if (jTDNI.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No ingresó ningún DNI");
            } else {

                JOptionPane.showMessageDialog(null, "No se encontró el bombero con DNI: " + dni);
            }
        }
    }//GEN-LAST:event_jBBusquedaXDniActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        String dni = jTDNI.getText();
        int idBombero = bomberoData.buscarBomberoIdPorDni(dni);
        bomberoData.eliminarBombero(idBombero);
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jRBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEstadoActionPerformed
        if (jRBEstado.isSelected()) {
            jRBEstado.setText("Activo");
            jBEliminar.setEnabled(true);
        } else {
            jRBEstado.setText("Inactivo");
            jBEliminar.setEnabled(false);

        }
    }//GEN-LAST:event_jRBEstadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel calendarioOculto;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBusquedaXDni;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
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
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTDNI;
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
                if (contieneSoloLetras(string)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text == null) {
                    return;
                }
                if (contieneSoloLetras(text)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean contieneSoloLetras(String text) {
                for (char c : text.toCharArray()) {
                    if (!Character.isLetter(c)) {
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
        int codBrigada = -1; // Valor predeterminado si no se encuentra el código de Cuartel

        if (objeto != null) {
            // Dividir la cadena por espacios en blanco
            String[] parts = obj.split(" ");
            if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                try {
                    codBrigada = Integer.parseInt(parts[1]);
                    BrigadaData briData = new BrigadaData();
                    Brigada brigada = new Brigada();
                    brigada = briData.buscarBrigada2(codBrigada);
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
