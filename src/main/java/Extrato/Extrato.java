
package Extrato;

import Entidades.Conta;
import Principal.Principal;
import java.awt.PopupMenu;


public class Extrato extends javax.swing.JFrame {
    
    Conta conta = new Conta();
    
    public Extrato() {
        initComponents();
         setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpTelaExtrato = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConfirmarDeposito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 570));
        setMinimumSize(new java.awt.Dimension(400, 570));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(153, 0, 153));
        jPanel5.setMaximumSize(new java.awt.Dimension(400, 570));
        jPanel5.setMinimumSize(new java.awt.Dimension(400, 570));
        jPanel5.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Hobo Std", 0, 60)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nu");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(130, 10, 90, 80);

        jLabel10.setFont(new java.awt.Font("Linux Libertine G", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TADS");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(210, 40, 70, 30);

        jpTelaExtrato.setBackground(new java.awt.Color(255, 255, 255));
        jpTelaExtrato.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Extrato Bancário\n");
        jpTelaExtrato.add(jLabel1);
        jLabel1.setBounds(100, 10, 120, 17);

        jPanel5.add(jpTelaExtrato);
        jpTelaExtrato.setBounds(42, 90, 300, 410);

        btnConfirmarDeposito.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmarDeposito.setFont(new java.awt.Font("Source Sans Pro Light", 1, 18)); // NOI18N
        btnConfirmarDeposito.setForeground(new java.awt.Color(153, 0, 153));
        btnConfirmarDeposito.setText("Voltar a página inicial");
        btnConfirmarDeposito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        btnConfirmarDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarDepositoActionPerformed(evt);
            }
        });
        jPanel5.add(btnConfirmarDeposito);
        btnConfirmarDeposito.setBounds(60, 510, 260, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarDepositoActionPerformed

        Principal form = new Principal();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConfirmarDepositoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        jpTelaExtrato.add((PopupMenu) conta.getEntrada());
//        jpTelaExtrato.add((PopupMenu) conta.getSaida());
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Extrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarDeposito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jpTelaExtrato;
    // End of variables declaration//GEN-END:variables
}
