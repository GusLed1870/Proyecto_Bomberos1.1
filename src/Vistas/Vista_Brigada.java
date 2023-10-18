package Vistas;

import Acceso_a_Datos.BrigadaData;
import Acceso_a_Datos.Cuartel_data;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class Vista_Brigada extends javax.swing.JInternalFrame {

    public Vista_Brigada() {
        initComponents();
        cargarCB();
        armarCabecera();
        campo_ID_Cuartel.setVisible(false);
        campo_Especilidad.setVisible(false);
        campo_nombre.setVisible(false);
        JRBTodas.setSelected(true);
        BrigadaData BriData = new BrigadaData();
        List<Brigada> listaBrigadas = BriData.listarBrigadas2();
        jBModificar.setEnabled(false);
        cargarDatosTabla(listaBrigadas);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jCBEspecialidad = new javax.swing.JComboBox<>();
        tfNombre = new javax.swing.JTextField();
        jCBCuarteles = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRBLibre = new javax.swing.JRadioButton();
        JRBTodas = new javax.swing.JRadioButton();
        JRBLibres = new javax.swing.JRadioButton();
        jRBOcupadas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        campo_ID_Cuartel = new javax.swing.JLabel();
        campo_Especilidad = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JLabel();
        jBlimpiarCampos = new javax.swing.JButton();
        id_brigada = new javax.swing.JLabel();
        nombre_anterior = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1100, 820));

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 820));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Brigadas");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("ID Cuartel:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Especialidad:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("Disponiblidad:");

        jBAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBBuscar.setText("Buscar por Nombre");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCBEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar una Especialidad--", "Incendios en viviendas, e industrias", "Salvamento en derrumbes", "Rescates en ámbito montaña", "Rescate de personas atrapadas en accidentes de tráfico", "Socorrer inundaciones", "Operativos de prevención" }));

        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNombreKeyReleased(evt);
            }
        });

        jCBCuarteles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBCuarteles.setSelectedIndex(-1);
        jCBCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCuartelesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("Lista de Brigadas (puedes hacer click en la tabla para editar alguna brigada de la lista)");

        jRBLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBLibreActionPerformed(evt);
            }
        });

        JRBTodas.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JRBTodas.setText("Todas");
        JRBTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBTodasActionPerformed(evt);
            }
        });

        JRBLibres.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JRBLibres.setText("Libres");
        JRBLibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBLibresActionPerformed(evt);
            }
        });

        jRBOcupadas.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRBOcupadas.setText("Ocupadas");
        jRBOcupadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBOcupadasActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        campo_ID_Cuartel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        campo_ID_Cuartel.setForeground(new java.awt.Color(255, 0, 0));
        campo_ID_Cuartel.setText("Faltó el Cuartel");

        campo_Especilidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        campo_Especilidad.setForeground(new java.awt.Color(255, 0, 0));
        campo_Especilidad.setText("Faltó la Especialidad");

        campo_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(255, 0, 0));
        campo_nombre.setText("Faltó el Nombre");

        jBlimpiarCampos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBlimpiarCampos.setText("Limpiar Campos");
        jBlimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarCamposActionPerformed(evt);
            }
        });

        id_brigada.setBackground(new java.awt.Color(102, 255, 204));
        id_brigada.setForeground(new java.awt.Color(102, 255, 204));

        nombre_anterior.setForeground(new java.awt.Color(102, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_brigada)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nombre_anterior)
                                .addGap(413, 413, 413)
                                .addComponent(jLabel1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCBEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_nombre)
                            .addComponent(campo_Especilidad)
                            .addComponent(campo_ID_Cuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBlimpiarCampos)
                            .addComponent(jRBLibre))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(JRBTodas)
                        .addGap(191, 191, 191)
                        .addComponent(JRBLibres)
                        .addGap(160, 160, 160)
                        .addComponent(jRBOcupadas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(nombre_anterior))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id_brigada)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_ID_Cuartel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jBBuscar)
                    .addComponent(campo_nombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCBEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_Especilidad))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBLibre)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBlimpiarCampos)
                    .addComponent(jBAgregar)
                    .addComponent(jBModificar)
                    .addComponent(jBSalir))
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBTodas)
                    .addComponent(jRBOcupadas)
                    .addComponent(JRBLibres))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1251, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBlimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarCamposActionPerformed
        limpiarCampos();
        JRBTodasActionPerformed(evt);
    }//GEN-LAST:event_jBlimpiarCamposActionPerformed

    private void jRBOcupadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBOcupadasActionPerformed
        JRBTodas.setSelected(false);

        JRBLibres.setSelected(false);
        JRBLibres.setEnabled(true);
        JRBTodas.setEnabled(true);
        jRBOcupadas.setEnabled(false);

        modelo.setRowCount(0);
        BrigadaData BriData = new BrigadaData();
        List<Brigada> listaBrigadas2 = BriData.listarBrigadasocupadas();
        cargarDatosTablalibres(listaBrigadas2);
    }//GEN-LAST:event_jRBOcupadasActionPerformed

    private void JRBLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBLibresActionPerformed
        JRBTodas.setSelected(false);
        jRBOcupadas.setSelected(false);

        JRBLibres.setEnabled(false);

        jRBOcupadas.setEnabled(true);
        JRBTodas.setEnabled(true);
        modelo.setRowCount(0);
        BrigadaData BriData = new BrigadaData();
        List<Brigada> listaBrigadas2 = BriData.listarBrigadaslibres();
        cargarDatosTablalibres(listaBrigadas2);
    }//GEN-LAST:event_JRBLibresActionPerformed

    private void JRBTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBTodasActionPerformed
        JRBLibres.setSelected(false);
        jRBOcupadas.setSelected(false);
        JRBTodas.setSelected(true);

        JRBLibres.setEnabled(true);
        JRBTodas.setEnabled(false);
        jRBOcupadas.setEnabled(true);

        modelo.setRowCount(0);
        BrigadaData BriData = new BrigadaData();
        List<Brigada> listaBrigadas2 = BriData.listarBrigadas2();
        cargarDatosTablalibres(listaBrigadas2);
    }//GEN-LAST:event_JRBTodasActionPerformed

    private void jRBLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLibreActionPerformed
        if (jRBLibre.isSelected()) {
            jRBLibre.setText("SI, esta Libre");
        } else {
            jRBLibre.setText("NO, esta ocupada");
        }
    }//GEN-LAST:event_jRBLibreActionPerformed

    private void jCBCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCuartelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCuartelesActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        if (tfNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Ingresaste un nombre");
            return;
        } else {
            String nombre = tfNombre.getText();
            BrigadaData briData = new BrigadaData();
            int id = briData.buscarBrigada(nombre);
            if (id == -1) {
                JOptionPane.showMessageDialog(this, "El nombre no se encuentra en la base de datos revisa la tabla con todos los nombres");
                return;
            } else {
                Brigada bri = briData.buscarBrigada2(id);

                tfNombre.setText(bri.getNombre_br());
                ArrayList<String> combo = new ArrayList<>();
                combo.add("Incendios en viviendas, e industrias");
                combo.add("Salvamento en derrumbes");
                combo.add("Rescates en ámbito montaña");
                combo.add("Rescate de personas atrapadas en accidentes de tráfico");
                combo.add("Socorrer inundaciones");
                combo.add("Operativos de prevención");
                int espe = combo.indexOf((bri.getEspecialidad()));

                jCBEspecialidad.setSelectedIndex(espe + 1); //le sumo uno porque tiene el seleccionar
                if (bri.isLibre()) {
                    jRBLibre.setSelected(true);
                    jRBLibre.setText("Libre");

                } else {
                    jRBLibre.setSelected(false);
                    jRBLibre.setText("Ocupada");
                }
            }
            Brigada bri = briData.buscarBrigada2(id);
            int posicion = posicionCBOX(bri.getCuartel().getCodCuartel());
            //System.out.println("posicion en el combox "+posicion);
            jCBCuarteles.setSelectedIndex(posicion - 1);
            jBAgregar.setEnabled(false);
            jBModificar.setEnabled(true);

            id_brigada.setText(String.valueOf(bri.getCodBrigada()));
            nombre_anterior.setText(bri.getNombre_br());

        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        if (todo_el_formulario_lleno()) {
            Cuartel_data cuar = new Cuartel_data();
            Cuartel cuartel = new Cuartel();
            BrigadaData briData = new BrigadaData();
            if (validaTexto() && briData.nombreNORepetido(tfNombre.getText())) {

                String selectedItemText = (String) jCBCuarteles.getSelectedItem();
                int codCuartel = -1; // Valor predeterminado si no se encuentra el código de Cuartel

                if (selectedItemText != null) {
                    // Dividir la cadena por espacios en blanco
                    String[] parts = selectedItemText.split(" ");
                    if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                        try {

                            codCuartel = Integer.parseInt(parts[1]);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(this, "Error al ingresar un tipo de dato." + e);
                        }
                    }
                    //System.out.println("ID " + codCuartel);
                    cuartel = cuar.buscarCuartel(codCuartel);
                    Brigada bri = new Brigada(tfNombre.getText(), jCBEspecialidad.getSelectedItem().toString(), jRBLibre.isSelected(), cuartel);
                    briData.guardarBrigada(bri);
                    //JRBTodasActionPerformed(evt);
                    jBlimpiarCamposActionPerformed(evt);
                    

                }

            }
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        if (todo_el_formulario_lleno()) {
            Cuartel_data cuar = new Cuartel_data();
            Cuartel cuartel = new Cuartel();
            BrigadaData briData = new BrigadaData();
            if (validaTexto()) {
                if (tfNombre.getText().equals(nombre_anterior.getText())) {
                    String selectedItemText = (String) jCBCuarteles.getSelectedItem();
                    int codCuartel = -1; // Valor predeterminado si no se encuentra el código de Cuartel

                    if (selectedItemText != null) {
                        // Dividir la cadena por espacios en blanco
                        String[] parts = selectedItemText.split(" ");
                        if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                            try {

                                codCuartel = Integer.parseInt(parts[1]);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(this, "Error al ingresar un tipo de dato." + e);
                            }
                        }
                        //System.out.println("ID " + codCuartel);
                        cuartel = cuar.buscarCuartel(codCuartel);
                        Brigada bri = new Brigada(Integer.parseInt(id_brigada.getText()), tfNombre.getText(), jCBEspecialidad.getSelectedItem().toString(), jRBLibre.isSelected(), cuartel);
                        briData.modificarBrigada(bri);
                        //JRBTodasActionPerformed(evt);
                        jBlimpiarCamposActionPerformed(evt);

                    }

                }else{
                    if (briData.nombreNORepetido(tfNombre.getText())) {
                    String selectedItemText = (String) jCBCuarteles.getSelectedItem();
                    int codCuartel = -1; // Valor predeterminado si no se encuentra el código de Cuartel

                    if (selectedItemText != null) {
                        // Dividir la cadena por espacios en blanco
                        String[] parts = selectedItemText.split(" ");
                        if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                            try {

                                codCuartel = Integer.parseInt(parts[1]);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(this, "Error al ingresar un tipo de dato." + e);
                            }
                        }
                        //System.out.println("ID " + codCuartel);
                        cuartel = cuar.buscarCuartel(codCuartel);
                        Brigada bri = new Brigada(Integer.parseInt(id_brigada.getText()), tfNombre.getText(), jCBEspecialidad.getSelectedItem().toString(), jRBLibre.isSelected(), cuartel);
                        briData.modificarBrigada(bri);
                        //JRBTodasActionPerformed(evt);
                        jBlimpiarCamposActionPerformed(evt);

                    }

                }
                
                
                }

            }

        }

    }//GEN-LAST:event_jBModificarActionPerformed

    private void tfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyReleased
        String nombre = tfNombre.getText();
        modelo.setRowCount(0);
        BrigadaData BriData = new BrigadaData();
        List<Brigada> listaBrigadas2 = BriData.listarBrigadasporNombre(nombre);
        cargarDatosTablalibres(listaBrigadas2);

    }//GEN-LAST:event_tfNombreKeyReleased

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        int filaSeleccionada = jTabla.getSelectedRow();
        BrigadaData briData = new BrigadaData();
        Brigada briga = new Brigada();
        if (filaSeleccionada != -1) { // Asegurarse de que se haya seleccionado una fila válida
            Object valorPrimeraColumna = jTabla.getValueAt(filaSeleccionada, 0);

            int id = Integer.parseInt(valorPrimeraColumna.toString());

            briga = briData.buscarBrigada(id);
            int posicion = posicionCBOX(briga.getCuartel().getCodCuartel());
            //System.out.println("posicion en el combox "+posicion);
            jCBCuarteles.setSelectedIndex(posicion - 1);
            tfNombre.setText(briga.getNombre_br());
            ArrayList<String> combo = new ArrayList<>();
            combo.add("Incendios en viviendas, e industrias");
            combo.add("Salvamento en derrumbes");
            combo.add("Rescates en ámbito montaña");
            combo.add("Rescate de personas atrapadas en accidentes de tráfico");
            combo.add("Socorrer inundaciones");
            combo.add("Operativos de prevención");
            int espe = combo.indexOf((briga.getEspecialidad()));

            jCBEspecialidad.setSelectedIndex(espe + 1); //le sumo uno porque tiene el seleccionar
            if (briga.isLibre()) {
                jRBLibre.setSelected(true);
                jRBLibre.setText("Libre");

            } else {
                jRBLibre.setSelected(false);
                jRBLibre.setText("Ocupada");
            }

            jBAgregar.setEnabled(false);
            jBModificar.setEnabled(true);
            id_brigada.setText(String.valueOf(briga.getCodBrigada()));
            nombre_anterior.setText(briga.getNombre_br());
        }
    }//GEN-LAST:event_jTablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JRBLibres;
    private javax.swing.JRadioButton JRBTodas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel campo_Especilidad;
    private javax.swing.JLabel campo_ID_Cuartel;
    private javax.swing.JLabel campo_nombre;
    private javax.swing.JLabel id_brigada;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBlimpiarCampos;
    private javax.swing.JComboBox<String> jCBCuarteles;
    private javax.swing.JComboBox<String> jCBEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRBLibre;
    private javax.swing.JRadioButton jRBOcupadas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JLabel nombre_anterior;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
    private void cargarCB() {
        Cuartel_data cuartelData = new Cuartel_data();
        ArrayList<Cuartel> listaCuarteles = (ArrayList<Cuartel>) cuartelData.listarCuarteles();

        // Limpia el JComboBox si tiene elementos previos
        jCBCuarteles.removeAllItems();

        if (!listaCuarteles.isEmpty()) {
            jCBCuarteles.addItem("--Seleccionar un cuartel--"); // Agrega el elemento cuando hay cuarteles
            for (Cuartel cuartel : listaCuarteles) {
                // Agrega el nombre o algún atributo del cuartel en el JComboBox
                jCBCuarteles.addItem(cuartel.toString());
            }

            // Selecciona el primer elemento en la lista
            jCBCuarteles.setSelectedIndex(0);
        } else {
            jCBCuarteles.addItem("--Seleccionar un cuartel--"); // Agrega el elemento cuando no hay cuarteles
            jCBCuarteles.setSelectedIndex(0); // Establece la selección en la posición 0
        }
    }

    private boolean todo_el_formulario_lleno() {
        boolean vacias = false;
        if (jCBCuarteles.getSelectedIndex() == 0 && jCBEspecialidad.getSelectedIndex() == 0 && tfNombre.getText().isEmpty()) {
            campo_ID_Cuartel.setVisible(true);
            campo_Especilidad.setVisible(true);
            campo_nombre.setVisible(true);

            int tiempoVisible = 10000; // 20 segundos en milisegundos
            Timer temporizador = new Timer(tiempoVisible, e -> {
                campo_ID_Cuartel.setVisible(false);
                campo_Especilidad.setVisible(false);
                campo_nombre.setVisible(false);
            });

            temporizador.setRepeats(false); // Solo se ejecutará una vez
            temporizador.start();
            JOptionPane.showMessageDialog(this, "Faltaron Completar los siguientes Campos:\n-Cuartel\n-Nombre\n-Especialidad");
            return vacias;

        } else if (jCBCuarteles.getSelectedIndex() != 0 && jCBEspecialidad.getSelectedIndex() == 0 && tfNombre.getText().isEmpty()) {

            campo_Especilidad.setVisible(true);
            campo_nombre.setVisible(true);

            int tiempoVisible = 10000; // 20 segundos en milisegundos
            Timer temporizador = new Timer(tiempoVisible, e -> {

                campo_Especilidad.setVisible(false);
                campo_nombre.setVisible(false);
            });

            temporizador.setRepeats(false); // Solo se ejecutará una vez
            temporizador.start();
            JOptionPane.showMessageDialog(this, "Faltaron Completar los siguientes Campos:\n-Nombre\n-Especialidad");
            return vacias;
        } else if (jCBCuarteles.getSelectedIndex() != 0 && jCBEspecialidad.getSelectedIndex() != 0 && tfNombre.getText().isEmpty()) {

            campo_nombre.setVisible(true);

            int tiempoVisible = 10000; // 20 segundos en milisegundos
            Timer temporizador = new Timer(tiempoVisible, e -> {

                campo_nombre.setVisible(false);
            });

            temporizador.setRepeats(false); // Solo se ejecutará una vez
            temporizador.start();
            JOptionPane.showMessageDialog(this, "Falta Completar el Campo:\n-Nombre");
            return vacias;

        } else if (jCBCuarteles.getSelectedIndex() != 0 && jCBEspecialidad.getSelectedIndex() == 0 && !tfNombre.getText().isEmpty()) {

            campo_Especilidad.setVisible(true);

            int tiempoVisible = 10000; // 20 segundos en milisegundos
            Timer temporizador = new Timer(tiempoVisible, e -> {

                campo_Especilidad.setVisible(false);

            });

            temporizador.setRepeats(false); // Solo se ejecutará una vez
            temporizador.start();
            JOptionPane.showMessageDialog(this, "Falta Completar el Campo:\n-Especialidad");
            return vacias;

        } else if (jCBCuarteles.getSelectedIndex() == 0 && jCBEspecialidad.getSelectedIndex() != 0 && tfNombre.getText().isEmpty()) {
            campo_ID_Cuartel.setVisible(true);

            campo_nombre.setVisible(true);

            int tiempoVisible = 10000; // 20 segundos en milisegundos
            Timer temporizador = new Timer(tiempoVisible, e -> {
                campo_ID_Cuartel.setVisible(false);

                campo_nombre.setVisible(false);
            });

            temporizador.setRepeats(false); // Solo se ejecutará una vez
            temporizador.start();
            JOptionPane.showMessageDialog(this, "Faltaron Completar los siguientes Campos:\n-Cuartel\n-Nombre");
            return vacias;

        } else if (jCBCuarteles.getSelectedIndex() == 0 && jCBEspecialidad.getSelectedIndex() == 0 && !tfNombre.getText().isEmpty()) {
            campo_ID_Cuartel.setVisible(true);

            campo_Especilidad.setVisible(true);

            int tiempoVisible = 10000; // 20 segundos en milisegundos
            Timer temporizador = new Timer(tiempoVisible, e -> {
                campo_ID_Cuartel.setVisible(false);

                campo_Especilidad.setVisible(false);
            });

            temporizador.setRepeats(false); // Solo se ejecutará una vez
            temporizador.start();
            JOptionPane.showMessageDialog(this, "Faltaron Completar los siguientes Campos:\n-Cuartel\n-Especialidad");
            return vacias;

        } else if (jCBCuarteles.getSelectedIndex() == 0 && jCBEspecialidad.getSelectedIndex() != 0 && !tfNombre.getText().isEmpty()) {

            campo_Especilidad.setVisible(true);

            int tiempoVisible = 10000; // 20 segundos en milisegundos
            Timer temporizador = new Timer(tiempoVisible, e -> {

                campo_Especilidad.setVisible(false);
            });

            temporizador.setRepeats(false); // Solo se ejecutará una vez
            temporizador.start();
            JOptionPane.showMessageDialog(this, "Falta Completar el Campo:\n-Cuartel");
            return vacias;

        } else {
            return vacias = true;
        }

    }

    public void limpiarCampos() {
        jCBCuarteles.setSelectedIndex(0);
        jCBEspecialidad.setSelectedIndex(0);
        tfNombre.setText("");
        jRBLibre.setSelected(false);
        jRBLibre.setText("");
        jBAgregar.setEnabled(true);
        jBModificar.setEnabled(false);
        id_brigada.setText("");
        nombre_anterior.setText("");

    }

    private void armarCabecera() {
        modelo.addColumn("Codigo Brigada");
        modelo.addColumn("Nombre");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Disponibilidad");
        modelo.addColumn("Nro de Cuartel");
        jTabla.setModel(modelo);
    }
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public void cargarDatosTabla(List<Brigada> listaBrigadas) {
        // Borra cualquier fila existente en la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        // Recorre la lista de Brigadas y agrega cada fila al modelo de tabla
        for (Brigada brigada : listaBrigadas) {
            Object[] fila = new Object[5]; // 5 columnas en este ejemplo

            fila[0] = brigada.getCodBrigada();
            fila[1] = brigada.getNombre_br();
            fila[2] = brigada.getEspecialidad();
            if (brigada.isLibre()) {
                fila[3] = "Libre";

            } else {
                fila[3] = "Ocupada";
            }

            // Obtén el código de cuartel de la Brigada
            int codCuartel = brigada.getCuartel() != null ? brigada.getCuartel().getCodCuartel() : -1;
            fila[4] = codCuartel;

            modelo.addRow(fila);
        }

    }

    public void cargarDatosTablalibres(List<Brigada> listaBrigadas) {
        // Borra cualquier fila existente en la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        // Recorre la lista de Brigadas y agrega cada fila al modelo de tabla
        for (Brigada brigada : listaBrigadas) {
            Object[] fila = new Object[5]; // 5 columnas en este ejemplo

            fila[0] = brigada.getCodBrigada();
            fila[1] = brigada.getNombre_br();
            fila[2] = brigada.getEspecialidad();
            if (brigada.isLibre()) {
                fila[3] = "Libre";

            } else {
                fila[3] = "Ocupada";
            }

            // Obtén el código de cuartel de la Brigada
            int codCuartel = brigada.getCuartel() != null ? brigada.getCuartel().getCodCuartel() : -1;
            fila[4] = codCuartel;

            modelo.addRow(fila);
        }
    }

    public boolean validaTexto() {
        boolean texto = false;
        if (tfNombre.getText().matches("[a-zA-Z ]+")) {

            return texto = true;

        } else {
            campo_nombre.setVisible(true);
            campo_nombre.setText("Sólo se pueden incluir letras");
            int tiempoVisible = 10000; // 20 segundos en milisegundos
            Timer temporizador = new Timer(tiempoVisible, e -> {

                campo_nombre.setVisible(false);
                campo_nombre.setText("");
            });
            temporizador.setRepeats(false); // Solo se ejecutará una vez
            temporizador.start();
            JOptionPane.showMessageDialog(this, "ERROR!!!\nEn el campo nombre se aceptan letras");
            return texto;
        }

    }

    public int posicionCBOX(int id) {
        int count = 0;
        for (int i = 0; i < jCBCuarteles.getItemCount(); i++) {
            String item = jCBCuarteles.getItemAt(i).toString();
            String[] partes = item.split(" ");
            count++;
            //System.out.println("CONTADOR NORMAL "+count);
            try {
                int codBrigada = Integer.parseInt(partes[1]);
                if (codBrigada == id) {
                    //System.out.println("AQUI ENTRO "+count);
                    return count;

                }
            } catch (NumberFormatException e) {

            }
        }
        return count;
    }

}
