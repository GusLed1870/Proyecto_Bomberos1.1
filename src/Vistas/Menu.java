package Vistas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Gus
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar3 = new javax.swing.JMenuBar();
        jBbrigada = new javax.swing.JMenu();
        jBbombero = new javax.swing.JMenuItem();
        jBbrigadas = new javax.swing.JMenuItem();
        jBcuarteles = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jbEmergencias = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jBen_proceso = new javax.swing.JMenuItem();
        jBfinalizado = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu10.setText("jMenu10");

        jMenu11.setText("jMenu11");

        jMenu12.setText("jMenu12");

        jMenuItem1.setText("jMenuItem1");

        jMenu13.setText("File");
        jMenuBar4.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar4.add(jMenu14);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu15.setText("File");
        jMenuBar5.add(jMenu15);

        jMenu16.setText("Edit");
        jMenuBar5.add(jMenu16);

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jBbrigada.setText("Administracion");
        jBbrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbrigadaActionPerformed(evt);
            }
        });

        jBbombero.setText("Bomberos.");
        jBbombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbomberoActionPerformed(evt);
            }
        });
        jBbrigada.add(jBbombero);

        jBbrigadas.setText("Brigadas.");
        jBbrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbrigadasActionPerformed(evt);
            }
        });
        jBbrigada.add(jBbrigadas);

        jBcuarteles.setText("Cuarteles.");
        jBcuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcuartelesActionPerformed(evt);
            }
        });
        jBbrigada.add(jBcuarteles);

        jMenuBar3.add(jBbrigada);

        jMenu8.setText("Emergencias");

        jbEmergencias.setText("Click.");
        jMenu8.add(jbEmergencias);

        jMenuBar3.add(jMenu8);

        jMenu9.setText("Estado");

        jBen_proceso.setText("En progreso.");
        jMenu9.add(jBen_proceso);

        jBfinalizado.setText("Finalizado.");
        jBfinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfinalizadoActionPerformed(evt);
            }
        });
        jMenu9.add(jBfinalizado);

        jMenuBar3.add(jMenu9);

        jMenu1.setText("Calificacion");
        jMenuBar3.add(jMenu1);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbrigadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBbrigadasActionPerformed

    private void jBfinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinalizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBfinalizadoActionPerformed

    private void jBcuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcuartelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBcuartelesActionPerformed

    private void jBbomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbomberoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        Vista_Bombero bom = new Vista_Bombero();

        escritorio.add(bom);
        escritorio.moveToFront(bom);
        bom.setVisible(true);
    }//GEN-LAST:event_jBbomberoActionPerformed

    private void jBbrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbrigadaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
     
        
        
        
       /* Vistas_Brigada brig = new Vistas_Brigada();
        
        escritorio.add(brig);
        escritorio.moveToFront(brig);
        brig.setVisible(true);
                
        */
    }//GEN-LAST:event_jBbrigadaActionPerformed

       
       
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jBbombero;
    private javax.swing.JMenu jBbrigada;
    private javax.swing.JMenuItem jBbrigadas;
    private javax.swing.JMenuItem jBcuarteles;
    private javax.swing.JMenuItem jBen_proceso;
    private javax.swing.JMenuItem jBfinalizado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jbEmergencias;
    // End of variables declaration//GEN-END:variables
}
