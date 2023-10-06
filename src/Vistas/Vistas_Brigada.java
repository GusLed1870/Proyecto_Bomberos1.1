package Vistas;

import Acceso_a_Datos.Cuartel_data;
import Entidades.Cuartel;
import java.util.ArrayList;

public class Vistas_Brigada extends javax.swing.JInternalFrame {

    //Constructor
    public Vistas_Brigada() {
        initComponents();
        cargarCB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelBrigada = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRBlibretrue = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRBlibrefalse = new javax.swing.JRadioButton();
        jbAgregar = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jbModificar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jbTodas = new javax.swing.JButton();
        jbLibres = new javax.swing.JButton();
        Ocupadas = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCBCuarteles = new javax.swing.JComboBox<>();

        JpanelBrigada.setBackground(new java.awt.Color(102, 255, 255));
        JpanelBrigada.setForeground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Brigadas");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Especialidad:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Libre");

        jRBlibretrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBlibretrueActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nº de Cuartel:");

        jRBlibrefalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBlibrefalseActionPerformed(evt);
            }
        });

        jbAgregar.setBackground(new java.awt.Color(102, 255, 255));
        jbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(102, 255, 255));
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Salir");

        jbModificar1.setBackground(new java.awt.Color(102, 255, 255));
        jbModificar1.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar1.setText("Modificar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Lista de Brigadas:");

        jbTodas.setBackground(new java.awt.Color(102, 255, 255));
        jbTodas.setText("Todas");

        jbLibres.setBackground(new java.awt.Color(102, 255, 255));
        jbLibres.setText("Libres");

        Ocupadas.setBackground(new java.awt.Color(102, 255, 255));
        Ocupadas.setText("Ocupadas");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar una especialidad--", " Incendios en viviendas, e industrias", "Salvamento en derrumbes", "Rescates en ámbito montaña", "Rescate de personas atrapadas en accidentes de tráfico", "Socorrer inundaciones", "Operativos de prevención" }));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Todas");

        jCBCuarteles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCuartelesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelBrigadaLayout = new javax.swing.GroupLayout(JpanelBrigada);
        JpanelBrigada.setLayout(JpanelBrigadaLayout);
        JpanelBrigadaLayout.setHorizontalGroup(
            JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                                .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jRBlibretrue)
                                        .addGap(151, 151, 151)
                                        .addComponent(jRBlibrefalse))
                                    .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                                        .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(62, 62, 62)
                                        .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfNombre)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCBCuarteles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(20, 20, 20))
                            .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jbAgregar)
                                .addGap(126, 126, 126)
                                .addComponent(jbModificar1)
                                .addGap(138, 138, 138)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))))
                    .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1)))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelBrigadaLayout.createSequentialGroup()
                .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jbTodas)
                                .addGap(121, 121, 121)
                                .addComponent(jbLibres)
                                .addGap(123, 123, 123)
                                .addComponent(Ocupadas))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
        );
        JpanelBrigadaLayout.setVerticalGroup(
            JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelBrigadaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jRBlibretrue)
                    .addComponent(jRBlibrefalse))
                .addGap(66, 66, 66)
                .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbModificar)
                    .addComponent(jbModificar1))
                .addGap(47, 47, 47)
                .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(JpanelBrigadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTodas)
                    .addComponent(jbLibres)
                    .addComponent(Ocupadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelBrigada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelBrigada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBlibretrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBlibretrueActionPerformed
        jRBlibrefalse.setSelected(false);
        jRBlibrefalse.setText("");
        jRBlibretrue.setText("SI");
    }//GEN-LAST:event_jRBlibretrueActionPerformed

    private void jRBlibrefalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBlibrefalseActionPerformed
        jRBlibretrue.setSelected(false);
        jRBlibretrue.setText("");
        jRBlibrefalse.setText("NO");
    }//GEN-LAST:event_jRBlibrefalseActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        Cuartel_data cuar = new Cuartel_data();
        Cuartel cuartel = new Cuartel();
        
        String selectedItemText = (String) jCBCuarteles.getSelectedItem();
    int codCuartel = -1; // Valor predeterminado si no se encuentra el código de Cuartel

    if (selectedItemText != null) {
        // Dividir la cadena por espacios en blanco
        String[] parts = selectedItemText.split(" ");
        if (parts.length >= 4 && parts[0].equalsIgnoreCase("Codigo") && parts[1].equalsIgnoreCase("de") && parts[2].equalsIgnoreCase("Cuartel:")) {
            try {
               
                codCuartel = Integer.parseInt(parts[3]);
            } catch (NumberFormatException e) {
                // Manejo de error en caso de que la conversión a entero falle
                e.printStackTrace();
            }
        }
        //System.out.println("CodCuartel "+codCuartel);
        cuartel = cuar.buscarCuartel(codCuartel);
        //System.out.println("Nombre "+cuartel.getNombre_cuartel());
        
    }
        

    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jCBCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCuartelesActionPerformed
 
   

   
    }//GEN-LAST:event_jCBCuartelesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelBrigada;
    private javax.swing.JButton Ocupadas;
    private javax.swing.JComboBox<String> jCBCuarteles;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRBlibrefalse;
    private javax.swing.JRadioButton jRBlibretrue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbLibres;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbModificar1;
    private javax.swing.JButton jbTodas;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
    private void cargarCB() {
        Cuartel_data al = new Cuartel_data();
        ArrayList<Cuartel> listaCuarteles = (ArrayList<Cuartel>) al.listarCuarteles();

        // Limpia el JComboBox si tiene elementos previos
        jCBCuarteles.removeAllItems();

        for (Cuartel cuartel : listaCuarteles) {
            // Agrega el nombre o algún atributo del alumno en el JComboBox
            jCBCuarteles.addItem(cuartel.toString());
        }

        if (!listaCuarteles.isEmpty()) {
            // Selecciona el primer alumno de la lista
            jCBCuarteles.setSelectedItem(listaCuarteles.get(0).toString());
        }
    }

}
