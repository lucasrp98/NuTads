/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Deposito;

import Banco.Conexao;
import Entidades.Conta;
import Entidades.ContaComum;
import Entidades.ContaPremium;
import Principal.Principal;

public class Deposito extends javax.swing.JFrame {
    
    Conta conta = new Conta();
    ContaComum contaComum = new ContaComum();
    ContaPremium contaPremium = new ContaPremium();
    Conexao conexao = new Conexao();
   
    public Deposito() {
        initComponents();
         setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tfDeposito = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnConfirmarDeposito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 570));

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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Source Sans Pro Light", 1, 18)); // NOI18N
        jLabel12.setText("Valor do depósito?\n");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(50, 30, 210, 30);

        tfDeposito.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfDeposito.setText("R$ 0,00\n");
        tfDeposito.setMaximumSize(new java.awt.Dimension(7, 22));
        tfDeposito.setMinimumSize(new java.awt.Dimension(7, 22));
        tfDeposito.setPreferredSize(new java.awt.Dimension(7, 22));
        tfDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDepositoActionPerformed(evt);
            }
        });
        jPanel6.add(tfDeposito);
        tfDeposito.setBounds(20, 110, 130, 40);

        jLabel13.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Seu saldo: ");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(20, 80, 90, 20);

        btnConfirmarDeposito.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmarDeposito.setFont(new java.awt.Font("Source Sans Pro Light", 1, 18)); // NOI18N
        btnConfirmarDeposito.setForeground(new java.awt.Color(153, 0, 153));
        btnConfirmarDeposito.setText("Confirmar\n");
        btnConfirmarDeposito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        btnConfirmarDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarDepositoActionPerformed(evt);
            }
        });
        jPanel6.add(btnConfirmarDeposito);
        btnConfirmarDeposito.setBounds(20, 190, 260, 50);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(42, 100, 300, 380);

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

    private void tfDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDepositoActionPerformed

    private void btnConfirmarDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarDepositoActionPerformed
        conta.depositar(Double.parseDouble(tfDeposito.getText()));
        Principal form = new Principal();
        form.setVisible(true);
    }//GEN-LAST:event_btnConfirmarDepositoActionPerformed

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
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarDeposito;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField tfDeposito;
    // End of variables declaration//GEN-END:variables
}
