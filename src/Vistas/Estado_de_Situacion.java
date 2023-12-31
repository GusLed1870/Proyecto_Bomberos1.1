
package Vistas;

import Acceso_a_Datos.BrigadaData;
import Entidades.Brigada;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Estado_de_Situacion extends javax.swing.JInternalFrame {

    public Estado_de_Situacion() {
        initComponents();
        cargarCB();
        armarCabecera();
        jBActualizar.setEnabled(false);
        jTabla.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRBEnProgreso = new javax.swing.JRadioButton();
        jRBFinalizado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBLimpiarCampos = new javax.swing.JButton();
        jCBrigadas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jBActualizar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jLabel5 = new javax.swing.JLabel();
        jBActualizarFecha = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1100, 676));

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setForeground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Situación de los Siniestros");

        jRBEnProgreso.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRBEnProgreso.setForeground(new java.awt.Color(0, 0, 0));
        jRBEnProgreso.setText("En Progreso");
        jRBEnProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEnProgresoActionPerformed(evt);
            }
        });

        jRBFinalizado.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRBFinalizado.setForeground(new java.awt.Color(0, 0, 0));
        jRBFinalizado.setText("Finalizados");
        jRBFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBFinalizadoActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Lista de Siniestros");

        jBLimpiarCampos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBLimpiarCampos.setForeground(new java.awt.Color(0, 0, 0));
        jBLimpiarCampos.setText("Limpiar Campos");
        jBLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCamposActionPerformed(evt);
            }
        });

        jCBrigadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBrigadasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Seleccione una brigada");

        jBActualizar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBActualizar.setForeground(new java.awt.Color(0, 0, 0));
        jBActualizar.setText("Actualizar la puntuación");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(0, 0, 0));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Seleccione un estado");

        jYearChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jYearChooser1MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Seleccione un año");

        jBActualizarFecha.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBActualizarFecha.setForeground(new java.awt.Color(0, 0, 0));
        jBActualizarFecha.setText("Actualizar Fecha");
        jBActualizarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBrigadas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRBEnProgreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                                .addComponent(jRBFinalizado)
                                .addGap(170, 170, 170))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBLimpiarCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBActualizar)
                        .addGap(107, 107, 107)
                        .addComponent(jBActualizarFecha)
                        .addGap(122, 122, 122)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(384, 384, 384))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRBEnProgreso)
                    .addComponent(jRBFinalizado))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiarCampos)
                    .addComponent(jBActualizar)
                    .addComponent(jBActualizarFecha)
                    .addComponent(jBSalir))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBEnProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEnProgresoActionPerformed
        if (jRBEnProgreso.isSelected()) {
            jBActualizar.setEnabled(true);

            jRBFinalizado.setSelected(false);
            if (jCBrigadas.getSelectedIndex() == 0) {
                llenarTablaBrigadaenProgreso2();
            } else {
                llenarTablaBrigadaenProgreso();
            }
        } else {

        }
        if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTabla();

        } else if (jCBrigadas.getSelectedIndex() == 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTablaBrigadaenProgreso2();
        } else if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
            llenarTodosFinalizados();

        } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTablaBrigada();
        } else if (jCBrigadas.getSelectedIndex() > 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTablaBrigadaenProgreso();
        } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
            llenarTablaBrigadaFinalizados();
        } else {
            llenarTablaBrigada();
        }
    }//GEN-LAST:event_jRBEnProgresoActionPerformed

    private void jRBFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBFinalizadoActionPerformed
        if (jRBFinalizado.isSelected()) {
            jBActualizar.setEnabled(false);
            jRBEnProgreso.setSelected(false);
            if (jCBrigadas.getSelectedIndex() == 0) {
                llenarTodosFinalizados();
            } else {
                llenarTablaBrigadaFinalizados();
            }
        } else {
            jBActualizar.setEnabled(false);
        }
        if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTabla();

        } else if (jCBrigadas.getSelectedIndex() == 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTablaBrigadaenProgreso2();
        } else if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
            llenarTodosFinalizados();

        } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTablaBrigada();
        } else if (jCBrigadas.getSelectedIndex() > 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTablaBrigadaenProgreso();
        } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
            llenarTablaBrigadaFinalizados();
        } else {
            llenarTablaBrigada();
        }
    }//GEN-LAST:event_jRBFinalizadoActionPerformed

    private void jYearChooser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jYearChooser1MouseExited
        llenarTablaBrigadaFinalizados();
    }//GEN-LAST:event_jYearChooser1MouseExited

    private void jCBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBrigadasActionPerformed
        if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTabla();

        } else if (jCBrigadas.getSelectedIndex() == 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTablaBrigadaenProgreso2();
        } else if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
            llenarTodosFinalizados();

        } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTablaBrigada();
        } else if (jCBrigadas.getSelectedIndex() > 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
            llenarTablaBrigadaenProgreso();
        } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
            llenarTablaBrigadaFinalizados();
        } else {
            llenarTablaBrigada();
        }
    }//GEN-LAST:event_jCBrigadasActionPerformed

    private void jBLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCamposActionPerformed
        lipiarCampos();
    }//GEN-LAST:event_jBLimpiarCamposActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        actualizarNotaDesdeTabla();

    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBActualizarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarFechaActionPerformed
        actualizarFecha();
    }//GEN-LAST:event_jBActualizarFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBActualizarFecha;
    private javax.swing.JButton jBLimpiarCampos;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBrigadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEnProgreso;
    private javax.swing.JRadioButton jRBFinalizado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables
    private void cargarCB() {
        BrigadaData briData = new BrigadaData();
        ArrayList<Brigada> listaBrigadas = (ArrayList<Brigada>) briData.listarBrigadas2();

        // Limpia el JComboBox si tiene elementos previos
        jCBrigadas.removeAllItems();

        if (!listaBrigadas.isEmpty()) {
            jCBrigadas.addItem("--Todas las Brigadas--"); // Agrega el elemento cuando hay cuarteles
            for (Brigada brigada : listaBrigadas) {
                // Agrega el nombre o algún atributo del cuartel en el JComboBox
                jCBrigadas.addItem(brigada.toString());
            }

            // Selecciona el primer elemento en la lista
            jCBrigadas.setSelectedIndex(0);
        } else {
            jCBrigadas.addItem("--Todas las Brigadas--"); // Agrega el elemento cuando no hay cuarteles
            jCBrigadas.setSelectedIndex(0); // Establece la selección en la posición 0
        }
    }

    private void armarCabecera() {
        modelo.addColumn("Cod. Brigada");
        modelo.addColumn("Nom. Brigada");
        modelo.addColumn("ID_Siniestro");
        modelo.addColumn("Fecha Siniestro");
        modelo.addColumn("Fecha Resolución");
        modelo.addColumn("Puntuacion");
        jTabla.setModel(modelo);
    }
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return c >= 4;
        }
    };

    private void llenarTabla() {
        modelo.setRowCount(0);
        BrigadaData briData = new BrigadaData();

        List<String> listaValores = briData.actualizavalores(jYearChooser1.getYear()); // Aquí debes poner el año que desees

        // Llena la tabla con los datos obtenidos
        for (String fila : listaValores) {
            String[] datos = fila.split(", ");
            modelo.addRow(datos);
        }

    }

    private void llenarTablaBrigada() {
        modelo.setRowCount(0);
        BrigadaData briData = new BrigadaData();
        String selectedItemText = (String) jCBrigadas.getSelectedItem();
        int codCuartel = -1; // Valor predeterminado si no se encuentra el código de Cuartel

        if (selectedItemText != null) {
            // Dividir la cadena por espacios en blanco
            String[] parts = selectedItemText.split(" ");
            if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                try {

                    codCuartel = Integer.parseInt(parts[1]);
                    List<String> listaValores = briData.actualizavalores2(jYearChooser1.getYear(), codCuartel); // Aquí debes poner el año que desees

                    // Llena la tabla con los datos obtenidos
                    for (String fila : listaValores) {
                        String[] datos = fila.split(", ");
                        modelo.addRow(datos);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error al ingresar un tipo de dato." + e);
                }
            }
        }
    }

    private void llenarTablaBrigadaenProgreso() {
        modelo.setRowCount(0);
        BrigadaData briData = new BrigadaData();
        String selectedItemText = (String) jCBrigadas.getSelectedItem();
        int codCuartel = -1; // Valor predeterminado si no se encuentra el código de Cuartel

        if (selectedItemText != null) {
            // Dividir la cadena por espacios en blanco
            String[] parts = selectedItemText.split(" ");
            if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                try {

                    codCuartel = Integer.parseInt(parts[1]);
                    List<String> listaValores = briData.actualizavalores4(jYearChooser1.getYear(), codCuartel); // Aquí debes poner el año que desees

                    // Llena la tabla con los datos obtenidos
                    for (String fila : listaValores) {
                        String[] datos = fila.split(", ");
                        modelo.addRow(datos);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error al ingresar un tipo de dato." + e);
                }
            }
        }
    }

    private void llenarTablaBrigadaenProgreso2() {
        modelo.setRowCount(0);
        BrigadaData briData = new BrigadaData();

        List<String> listaValores = briData.todosEnprogreso(jYearChooser1.getYear()); // Aquí debes poner el año que desees

        // Llena la tabla con los datos obtenidos
        for (String fila : listaValores) {
            String[] datos = fila.split(", ");
            modelo.addRow(datos);
        }

    }

    private void llenarTodosFinalizados() {
        modelo.setRowCount(0);
        BrigadaData briData = new BrigadaData();

        List<String> listaValores = briData.todosFinalizados(jYearChooser1.getYear()); // Aquí debes poner el año que desees

        // Llena la tabla con los datos obtenidos
        for (String fila : listaValores) {
            String[] datos = fila.split(", ");
            modelo.addRow(datos);
        }

    }

    private void llenarTablaBrigadaFinalizados() {
        modelo.setRowCount(0);
        BrigadaData briData = new BrigadaData();
        String selectedItemText = (String) jCBrigadas.getSelectedItem();
        int codCuartel = -1; // Valor predeterminado si no se encuentra el código de Cuartel

        if (selectedItemText != null) {
            // Dividir la cadena por espacios en blanco
            String[] parts = selectedItemText.split(" ");
            if (parts.length >= 2 && parts[0].equalsIgnoreCase("ID:")) {
                try {

                    codCuartel = Integer.parseInt(parts[1]);
                    List<String> listaValores = briData.siniestrosFinalizadosxbrigada(jYearChooser1.getYear(), codCuartel); // Aquí debes poner el año que desees

                    // Llena la tabla con los datos obtenidos
                    for (String fila : listaValores) {
                        String[] datos = fila.split(", ");
                        modelo.addRow(datos);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error al ingresar un tipo de dato." + e);
                }
            }
        }

    }

    private void lipiarCampos() {
        jCBrigadas.setSelectedIndex(0);
        jYearChooser1.setYear(2023);
        jRBEnProgreso.setSelected(false);
        jRBFinalizado.setSelected(false);
        jBActualizar.setEnabled(false);
    }

    private void actualizarNotaDesdeTabla() {

        int filaSeleccionada = jTabla.getSelectedRow();
        Object valor = jTabla.getValueAt(filaSeleccionada, 2);
        int id = -1; // Valor predeterminado en caso de error o valor no válido
        int nota = -1;

        if (filaSeleccionada >= 0 && filaSeleccionada < jTabla.getRowCount()) {
            // Si se cumple la condición la fila seleccionada es válida

            try {
                if (valor != null) {
                    id = Integer.parseInt(valor.toString());
                }
            } catch (NumberFormatException e) {
              
                e.printStackTrace();
            }
            // Obtiene el valor de "nota" en la columna 2 (suponiendo que "nota" está en la tercera columna)
            Object valorCelda = jTabla.getValueAt(filaSeleccionada, 5);

            try {
                nota = Integer.parseInt(valorCelda.toString());

                // Verifica si la nota está dentro del rango permitido (-1 a 10)
                if (nota < 1 || nota > 10) {
                    // Si la condición se cumple la nota está fuera del rango permitido, muestra un mensaje de error y no actualiza la base de datos
                    JOptionPane.showMessageDialog(this, "La nota debe estar entre 1 y 10");
                    if (jCBrigadas.getSelectedIndex() > 0) {
                        llenarTablaBrigadaenProgreso();
                    } else {
                        llenarTablaBrigadaenProgreso2();
                    }
                    return; // Sale del método sin actualizar la base de datos
                }
            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(this, "Error: La nota debe ser un número válido.");
                if (jCBrigadas.getSelectedIndex() > 0) {
                    llenarTablaBrigadaenProgreso();
                } else {
                    llenarTablaBrigadaenProgreso2();
                }

                return; // Sale del método sin actualizar la base de datos
            }

            BrigadaData is = new BrigadaData();
            is.actualizarNota(id, nota);

            if (jCBrigadas.getSelectedIndex() > 0) {
                llenarTablaBrigadaenProgreso();
            } else {
                llenarTablaBrigadaenProgreso2();
            }

        } else {
            System.out.println("No se ha seleccionado una fila válida.");
        }
    }

    private void actualizarFecha() {

        int filaSeleccionada = jTabla.getSelectedRow();
        Object valor = jTabla.getValueAt(filaSeleccionada, 2);
        int id = -1;
        LocalDate fechainc = null;
        LocalDate fechafin = null;
        int codBrigada = -1;
        BrigadaData briData = new BrigadaData();

        if (filaSeleccionada >= 0 && filaSeleccionada < jTabla.getRowCount()) {
            try {
                if (valor != null) {
                    id = Integer.parseInt(valor.toString());
                }
            } catch (NumberFormatException e) {

                e.printStackTrace();
            }
            Object FechaFinal = jTabla.getValueAt(filaSeleccionada, 4);
            Object FechaInicial = jTabla.getValueAt(filaSeleccionada, 3);
            Object cod = jTabla.getValueAt(filaSeleccionada, 0);
            codBrigada = Integer.parseInt(cod.toString());

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Ajusta el formato según el de tu cadena
                fechainc = LocalDate.parse(FechaInicial.toString(), formatter);

                fechafin = LocalDate.parse(FechaFinal.toString(), formatter);

                if (fechafin.isBefore(fechainc)) {

                    JOptionPane.showMessageDialog(this, "La fecha de resolución no puede ser anterior a la creación del siniestro");
                    if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                        llenarTabla();

                    } else if (jCBrigadas.getSelectedIndex() == 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                        System.out.println("1 ID--" + codBrigada);
                        llenarTablaBrigadaenProgreso2();
                        briData.Brigadalibre(codBrigada);
                    } else if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
                        llenarTodosFinalizados();
                        briData.Brigadalibre(codBrigada);
                        System.out.println("2 ID--" + codBrigada);

                    } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                        llenarTablaBrigada();
                        briData.Brigadalibre(codBrigada);
                        System.out.println("3 ID--" + codBrigada);
                    } else if (jCBrigadas.getSelectedIndex() > 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                        llenarTablaBrigadaenProgreso();
                        briData.Brigadalibre(codBrigada);
                        System.out.println("4 ID--" + codBrigada);
                    } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
                        llenarTablaBrigadaFinalizados();
                        briData.Brigadalibre(codBrigada);
                        System.out.println("5 ID--" + codBrigada);
                    } else {
                        llenarTablaBrigada();
                        briData.Brigadalibre(codBrigada);
                        System.out.println("6 ID--" + codBrigada);
                    }

                    return; // Sale del método sin actualizar la base de datos
                }
            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(this, "Error: La Fecha tiene que tener el siguiente formato \n dd--mm-yyyy ejemplo 01-02-2023.");
                if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                    llenarTabla();

                } else if (jCBrigadas.getSelectedIndex() == 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                    llenarTablaBrigadaenProgreso2();
                } else if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
                    llenarTodosFinalizados();

                } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                    llenarTablaBrigada();
                } else if (jCBrigadas.getSelectedIndex() > 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                    llenarTablaBrigadaenProgreso();
                } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
                    llenarTablaBrigadaFinalizados();
                } else {
                    llenarTablaBrigada();
                }

                return; // Sale del método sin actualizar la base de datos
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Error: En el formato de Fecha.");
                if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                    llenarTabla();

                } else if (jCBrigadas.getSelectedIndex() == 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                    llenarTablaBrigadaenProgreso2();
                } else if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
                    llenarTodosFinalizados();

                } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                    llenarTablaBrigada();
                } else if (jCBrigadas.getSelectedIndex() > 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                    llenarTablaBrigadaenProgreso();
                } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
                    llenarTablaBrigadaFinalizados();
                } else {
                    llenarTablaBrigada();
                }
                return;
            }
            // Llamamos al método para actualizar la nota con los valores obtenidos
            BrigadaData is = new BrigadaData();
            is.actualizarFecha_Resolucion(id, fechafin, fechainc);

            if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                llenarTabla();

            } else if (jCBrigadas.getSelectedIndex() == 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                llenarTablaBrigadaenProgreso2();
            } else if (jCBrigadas.getSelectedIndex() == 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
                llenarTodosFinalizados();

            } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                llenarTablaBrigada();
            } else if (jCBrigadas.getSelectedIndex() > 0 && jRBEnProgreso.isSelected() && !jRBFinalizado.isSelected()) {
                llenarTablaBrigadaenProgreso();
            } else if (jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()) {
                llenarTablaBrigadaFinalizados();
            } else {
                llenarTablaBrigada();
            }

        } else {    
        }
    }

}
