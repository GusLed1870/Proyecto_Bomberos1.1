
package Vistas;

import Acceso_a_Datos.BrigadaData;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.time.LocalDate;


public class Ranking extends javax.swing.JInternalFrame {


    public Ranking() {
        initComponents();
        armarCabecera();
        cargarTabla();
        armarCabecera2();
        llenarTabla();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBuscar = new javax.swing.JButton();
        anio = new com.toedter.calendar.JYearChooser();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1100, 678));

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ranking de Brigadas");

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

        jBuscar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Cantidad de Siniestros por año");

        jTabla1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTabla1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(380, 380, 380))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1)))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBuscar)
                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
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

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        
        llenarTabla();
    }//GEN-LAST:event_jBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser anio;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JTable jTabla1;
    // End of variables declaration//GEN-END:variables
     private void armarCabecera2() {
        modelo2.addColumn("Ene");
        modelo2.addColumn("Feb");
        modelo2.addColumn("Mar");
        modelo2.addColumn("Abr");
        modelo2.addColumn("May");
        modelo2.addColumn("Jun");
        modelo2.addColumn("Jul");
        modelo2.addColumn("Ago");
        modelo2.addColumn("Sep");
        modelo2.addColumn("Oct");
        modelo2.addColumn("Nov");
        modelo2.addColumn("Dic");
     
        jTabla1.setModel(modelo2);
    } 
    

    private void armarCabecera() {
       modelo.addColumn("Codigo Brigada");
        modelo.addColumn("Nombre de la Brigada");
        modelo.addColumn("Nro de Cuartel");
        modelo.addColumn("Nombre del Cuartel");
        modelo.addColumn("Cantidad de Siniestros");
        modelo.addColumn("Puntuación");
        jTabla.setModel(modelo);
    } 
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modelo2 = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        modelo.setRowCount(0); // Limpia la tabla antes de cargar nuevos datos
        BrigadaData bri = new BrigadaData();
        List<String> listaValores = bri.listarValoresSiniestros();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        for (String fila : listaValores) {
            String[] valores = fila.split(", ");
            // Formatea la puntuación con dos decimales
            valores[5] = decimalFormat.format(Double.parseDouble(valores[5]));
            modelo.addRow(valores);
        }

        jTabla.setModel(modelo);
    }

    private void llenarTabla() {
    int anio2=0;
    try{
        LocalDate fechaActual = LocalDate.now();
        int fechahoy=fechaActual.getYear();
        anio2=anio.getYear();
        if(fechahoy-anio2<0){
            JOptionPane.showMessageDialog(this, "ERROR!!!\nRecorda que todavia estamos en el año "+fechahoy);
            return;
        }
           if(anio2<1990){
            JOptionPane.showMessageDialog(this, "ERROR!!!\nNo hay registros tan antiguos, el ultimo registro es el año 1991");
            return;
        }
        
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(this, "No Ingreso un numero");
    }
    
    BrigadaData bri=new BrigadaData();
    modelo2.setRowCount(0); // Limpia la tabla antes de llenarla nuevamente

    Map<Integer, Integer> datos = bri.obtenerCantidadSiniestrosPorMes(anio2);

        Object[] fila = new Object[12]; // Crear una fila con 12 columnas

    // Inicializa todas las columnas en 0
    for (int i = 0; i < 12; i++) {
        fila[i] = 0;
    }

    for (Map.Entry<Integer, Integer> entry : datos.entrySet()) {
        int mes = entry.getKey();
        int cantidadSiniestros = entry.getValue();

        // La columna correspondiente al mes obtiene su valor
        fila[mes - 1] = cantidadSiniestros;
    }

    modelo2.addRow(fila); // Agrega la fila a tu modelo de tabla

}

    
}
