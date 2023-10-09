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
        jButton2 = new javax.swing.JButton();
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
        setPreferredSize(new java.awt.Dimension(1000, 540));

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 720));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Brigadas");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Cuartel:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Especialidad:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Disponiblidad:");

        jBAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Modificar");

        jBBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBBuscar.setText("Buscar por Nombre");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(0, 0, 0));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCBEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar una Especialidad", "Incendios en viviendas, e industrias", "Salvamento en derrumbes", "Rescates en ámbito montaña", "Rescate de personas atrapadas en accidentes de tráfico", "Socorrer inundaciones", "Operativos de prevención" }));

        jCBCuarteles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBCuarteles.setSelectedIndex(-1);
        jCBCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCuartelesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Lista de Brigadas:");

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
        jScrollPane1.setViewportView(jTabla);

        campo_ID_Cuartel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        campo_ID_Cuartel.setForeground(new java.awt.Color(255, 0, 0));
        campo_ID_Cuartel.setText("Faltó Seleccionar un Cuartel");

        campo_Especilidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        campo_Especilidad.setForeground(new java.awt.Color(255, 0, 0));
        campo_Especilidad.setText("Faltó Seleccionar una Especialidad");

        campo_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(255, 0, 0));
        campo_nombre.setText("Faltó ingresar un nombre");

        jBlimpiarCampos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBlimpiarCampos.setForeground(new java.awt.Color(0, 0, 0));
        jBlimpiarCampos.setText("Limpiar Campos");
        jBlimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBLibre)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JRBTodas)
                                .addGap(98, 98, 98)
                                .addComponent(JRBLibres)
                                .addGap(104, 104, 104)
                                .addComponent(jRBOcupadas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(305, 305, 305)
                                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCBEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBCuarteles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_Especilidad)
                                    .addComponent(campo_ID_Cuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_nombre)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jBlimpiarCampos)
                        .addGap(66, 66, 66)
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_ID_Cuartel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(campo_nombre))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCBEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_Especilidad))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBLibre)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JRBTodas)
                    .addComponent(JRBLibres)
                    .addComponent(jRBOcupadas))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jBSalir)
                    .addComponent(jBlimpiarCampos)
                    .addComponent(jBAgregar))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String nombre = tfNombre.getText();
        BrigadaData briData = new BrigadaData();
        int id = briData.buscarBrigada(nombre);
        System.out.println("id: " + id);
        Brigada bri = briData.buscarBrigada2(id);
        tfNombre.setText(bri.getNombre_br());
        ArrayList<String> combo = new ArrayList<>();
        combo.add("Incendios en viviendas, e industrias");
        combo.add("Salvamento en derrumbes");
        combo.add("Rescates en ámbito montaña");
        combo.add("Rescate de personas atrapadas en accidentes de tráfico");
        combo.add("Socorrer inundaciones");
        combo.add("Operativos de prevención");
        int espe = combo.indexOf(bri.getEspecialidad());
        jCBEspecialidad.setSelectedIndex(espe);
        if (bri.isLibre()) {
            jRBLibre.setSelected(true);
            jRBLibre.setText("Ocupada");

        } else {
            jRBLibre.setSelected(false);
            jRBLibre.setText("Libre");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        if (todo_el_formulario_lleno()) {
            JOptionPane.showMessageDialog(this, "Entro");
        }
        /*Cuartel_data cuar = new Cuartel_data();
        Cuartel cuartel = new Cuartel();
        BrigadaData briData = new BrigadaData();

        String selectedItemText = (String) jCBCuarteles.getSelectedItem();
        int codCuartel = -1; // Valor predeterminado si no se encuentra el código de Cuartel

        if (selectedItemText != null) {
            // Dividir la cadena por espacios en blanco
            String[] parts = selectedItemText.split(" ");
            if (parts.length >= 4 && parts[0].equalsIgnoreCase("Código") && parts[1].equalsIgnoreCase("de") && parts[2].equalsIgnoreCase("Cuartel:")) {
                try {

                    codCuartel = Integer.parseInt(parts[3]);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error al ingresar un tipo de dato." + e);
                }
            }

            cuartel = cuar.buscarCuartel(codCuartel);
            Brigada bri = new Brigada(tfNombre.getText(), jCBEspecialidad.getSelectedItem().toString(), jRBLibre.isSelected(), cuartel);
            briData.guardarBrigada(bri);
        }*/
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jCBCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCuartelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCuartelesActionPerformed

    private void jBlimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBlimpiarCamposActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jRBLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLibreActionPerformed
        if (jRBLibre.isSelected()) {
            jRBLibre.setText("SI, esta Libre");
        } else {
            jRBLibre.setText("NO, esta ocupada");
        }
    }//GEN-LAST:event_jRBLibreActionPerformed

    private void JRBLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBLibresActionPerformed
        JRBTodas.setSelected(false);
        jRBOcupadas.setSelected(false);
        
        JRBLibres.setEnabled(false);
        
        jRBOcupadas.setEnabled(true);
        JRBTodas.setEnabled(true);
        modelo.setRowCount(0);
        BrigadaData BriData=new BrigadaData();
        List<Brigada> listaBrigadas2 = BriData.listarBrigadaslibres();
        cargarDatosTablalibres(listaBrigadas2);

    }//GEN-LAST:event_JRBLibresActionPerformed

    private void jRBOcupadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBOcupadasActionPerformed
        JRBTodas.setSelected(false);
        
        jRBOcupadas.setSelected(false);
        JRBLibres.setEnabled(true);
        JRBTodas.setEnabled(true);
        jRBOcupadas.setEnabled(false);
        
        modelo.setRowCount(0);
        BrigadaData BriData=new BrigadaData();
        List<Brigada> listaBrigadas2 = BriData.listarBrigadasocupadas();
        cargarDatosTablalibres(listaBrigadas2);
    }//GEN-LAST:event_jRBOcupadasActionPerformed

    private void JRBTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBTodasActionPerformed
        JRBLibres.setSelected(false);
        jRBOcupadas.setSelected(false);
        
        JRBLibres.setEnabled(true);
        JRBTodas.setEnabled(false);
        jRBOcupadas.setEnabled(true);
        
        modelo.setRowCount(0);
        BrigadaData BriData=new BrigadaData();
        List<Brigada> listaBrigadas2 = BriData.listarBrigadas2();
        cargarDatosTablalibres(listaBrigadas2);
    }//GEN-LAST:event_JRBTodasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JRBLibres;
    private javax.swing.JRadioButton JRBTodas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel campo_Especilidad;
    private javax.swing.JLabel campo_ID_Cuartel;
    private javax.swing.JLabel campo_nombre;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBlimpiarCampos;
    private javax.swing.JButton jButton2;
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
        if(brigada.isLibre()){
            fila[3]="Libre";
        
        }else{
            fila[3]="Ocupada";
        }
        
        
        // Obtén el código de cuartel de la Brigada
        int codCuartel = brigada.getCuartel() != null ? brigada.getCuartel().getCodCuartel() : -1;
        fila[4] = codCuartel;

        modelo.addRow(fila);
    }
    }
}
