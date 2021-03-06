/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.GUI;

import javax.swing.JInternalFrame;

/**
 *
 * @author user
 */
public class JFMainApp extends javax.swing.JFrame {
    JInFrmMark jifMark ;
    /**
     * Creates new form JFMainApp
     */
    public JFMainApp() {
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

        jDesktPnMain = new javax.swing.JDesktopPane();
        jMBMainNavigation = new javax.swing.JMenuBar();
        jMenMaintenance = new javax.swing.JMenu();
        jMenMark = new javax.swing.JMenu();
        jMIAddMark = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Revisa Peru SAC - Control de Pagos");

        javax.swing.GroupLayout jDesktPnMainLayout = new javax.swing.GroupLayout(jDesktPnMain);
        jDesktPnMain.setLayout(jDesktPnMainLayout);
        jDesktPnMainLayout.setHorizontalGroup(
            jDesktPnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktPnMainLayout.setVerticalGroup(
            jDesktPnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenMaintenance.setText("Mantenimiento");

        jMenMark.setText("Marca");

        jMIAddMark.setText("Nuevo");
        jMIAddMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAddMarkActionPerformed(evt);
            }
        });
        jMenMark.add(jMIAddMark);

        jMenMaintenance.add(jMenMark);

        jMBMainNavigation.add(jMenMaintenance);

        jMenu2.setText("Editar");
        jMBMainNavigation.add(jMenu2);

        jMenu3.setText("Pagos");
        jMBMainNavigation.add(jMenu3);

        setJMenuBar(jMBMainNavigation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktPnMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktPnMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAddMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAddMarkActionPerformed
        // TODO add your handling code here:
        jifMark = JInFrmMark.getIntance();
        addWindow(jifMark);
    }//GEN-LAST:event_jMIAddMarkActionPerformed

    private void addWindow(JInternalFrame jInternalFrame)
    {
        jDesktPnMain.add(jInternalFrame);
        jInternalFrame.show();
    }
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
            java.util.logging.Logger.getLogger(JFMainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktPnMain;
    private javax.swing.JMenuBar jMBMainNavigation;
    private javax.swing.JMenuItem jMIAddMark;
    private javax.swing.JMenu jMenMaintenance;
    private javax.swing.JMenu jMenMark;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    // End of variables declaration//GEN-END:variables
}
