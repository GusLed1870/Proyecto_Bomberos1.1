/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Acceso_a_Datos.BrigadaData;
import Acceso_a_Datos.Cuartel_data;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gus
 */
public class Estado_de_Situacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form Estado_de_Situacion
     */
    public Estado_de_Situacion() {
        initComponents();
        cargarCB();

        armarCabecera();
        llenarTabla();
        jBActualizar.setEnabled(false);
        jTabla.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setForeground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Situación de los Siniestros");

        jRBEnProgreso.setText("En Progreso");
        jRBEnProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEnProgresoActionPerformed(evt);
            }
        });

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

        jBActualizar.setText("Actualizar la puntuación");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Estado del Siniestro");

        jYearChooser1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jYearChooser1AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jYearChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jYearChooser1MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Seleccione un año");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jBLimpiarCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBActualizar)
                .addGap(183, 183, 183)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(230, 230, 230))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCBrigadas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBEnProgreso)
                                .addGap(58, 58, 58)
                                .addComponent(jRBFinalizado)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 64, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jRBEnProgreso))
                    .addComponent(jRBFinalizado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiarCampos)
                    .addComponent(jBActualizar)
                    .addComponent(jBSalir))
                .addContainerGap(130, Short.MAX_VALUE))
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
           // jRBFinalizado.setSelected(true);
           //  jBActualizar.setEnabled(false);
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
           // jRBEnProgreso.setSelected(true);
           // jBActualizar.setEnabled(false);
        }
    }//GEN-LAST:event_jRBFinalizadoActionPerformed

    private void jYearChooser1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jYearChooser1AncestorMoved
        llenarTabla();
    }//GEN-LAST:event_jYearChooser1AncestorMoved

    private void jYearChooser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jYearChooser1MouseExited
        llenarTabla();
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
        } else if(jCBrigadas.getSelectedIndex() > 0 && !jRBEnProgreso.isSelected() && jRBFinalizado.isSelected()){
            llenarTablaBrigadaFinalizados();
        }else {
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
        BrigadaData briData=new BrigadaData();
        
    }//GEN-LAST:event_jBActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
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
        //modelo.addColumn("Detalle");
        modelo.addColumn("Puntuacion");
        jTabla.setModel(modelo);
    }
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return c== 4;
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
        //System.out.println("ID "+codCuartel);

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
        //System.out.println("ID "+codCuartel);

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
        //System.out.println("ID "+codCuartel);

    }

    private void lipiarCampos() {
        jCBrigadas.setSelectedIndex(0);
        jYearChooser1.setYear(2023);
        llenarTabla();

        jRBEnProgreso.setSelected(false);
        jRBFinalizado.setSelected(false);
        jBActualizar.setEnabled(false);
    }

}
