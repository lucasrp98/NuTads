package Cadastro;

import Banco.Conexao;
import Controladores.ContaJpaController;
import Entidades.Conta;
import Login.Login;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

    Conta conta = new Conta();
    private boolean teste = false;
    Conexao conexao = new Conexao();

    public Cadastro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 600));
        setMinimumSize(new java.awt.Dimension(400, 600));
        setPreferredSize(new java.awt.Dimension(400, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Hobo Std", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nu");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 10, 90, 80);

        jLabel2.setFont(new java.awt.Font("Linux Libertine G", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TADS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 40, 70, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(360, 480));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Cadastro de cliente");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 10, 130, 20);

        tfCPF.setMaximumSize(new java.awt.Dimension(7, 22));
        tfCPF.setMinimumSize(new java.awt.Dimension(7, 22));
        tfCPF.setPreferredSize(new java.awt.Dimension(7, 22));
        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFActionPerformed(evt);
            }
        });
        jPanel2.add(tfCPF);
        tfCPF.setBounds(40, 120, 260, 40);

        jLabel6.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel6.setText("CPF");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 100, 30, 20);

        jLabel7.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Nome");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 40, 50, 20);

        tfNome.setMaximumSize(new java.awt.Dimension(7, 22));
        tfNome.setMinimumSize(new java.awt.Dimension(7, 22));
        tfNome.setPreferredSize(new java.awt.Dimension(7, 22));
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        jPanel2.add(tfNome);
        tfNome.setBounds(40, 60, 260, 40);

        jLabel8.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Telefone");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 160, 60, 20);

        tfTelefone.setMaximumSize(new java.awt.Dimension(7, 22));
        tfTelefone.setMinimumSize(new java.awt.Dimension(7, 22));
        tfTelefone.setPreferredSize(new java.awt.Dimension(7, 22));
        tfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(tfTelefone);
        tfTelefone.setBounds(40, 180, 260, 40);

        jLabel9.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Salário");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 220, 80, 20);

        tfSalario.setMaximumSize(new java.awt.Dimension(7, 22));
        tfSalario.setMinimumSize(new java.awt.Dimension(7, 22));
        tfSalario.setPreferredSize(new java.awt.Dimension(7, 22));
        tfSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalarioActionPerformed(evt);
            }
        });
        jPanel2.add(tfSalario);
        tfSalario.setBounds(40, 240, 260, 40);

        jLabel10.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Email");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 280, 60, 20);

        tfEmail.setMaximumSize(new java.awt.Dimension(7, 22));
        tfEmail.setMinimumSize(new java.awt.Dimension(7, 22));
        tfEmail.setPreferredSize(new java.awt.Dimension(7, 22));
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        jPanel2.add(tfEmail);
        tfEmail.setBounds(40, 300, 260, 40);

        jLabel11.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Senha");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 340, 60, 20);

        tfSenha.setMaximumSize(new java.awt.Dimension(7, 22));
        tfSenha.setMinimumSize(new java.awt.Dimension(7, 22));
        tfSenha.setPreferredSize(new java.awt.Dimension(7, 22));
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(tfSenha);
        tfSenha.setBounds(40, 360, 260, 40);

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("Source Sans Pro Light", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(153, 0, 153));
        btnCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 153)));
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setLabel("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar);
        btnCadastrar.setBounds(40, 410, 260, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(26, 80, 330, 470);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void CadastroSucesso() {

        if (tfNome.getText().isEmpty() || tfCPF.getText().isEmpty() || tfTelefone.getText().isEmpty() || tfSalario.getText().isEmpty()
                || tfEmail.getText().isEmpty() || tfSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deixou de preencher algum campo obrigatório!");
            return;
        } else {
            teste = true;
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
        }

    }
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastroSucesso();
        if (teste = true) {
            ContaJpaController contaController = new ContaJpaController(conexao.getConexao());
            Conta conta = new Conta(tfNome.getText(),tfCPF.getText(),tfTelefone.getText(),Double.parseDouble(tfSalario.getText()),
            tfEmail.getText(), tfSenha.getText());
            contaController.create(conta);
            Login form = new Login();
            form.setVisible(true);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed

    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed

    }//GEN-LAST:event_tfCPFActionPerformed

    private void tfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneActionPerformed

    }//GEN-LAST:event_tfTelefoneActionPerformed

    private void tfSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalarioActionPerformed

    }//GEN-LAST:event_tfSalarioActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed

    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed

    }//GEN-LAST:event_tfSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
