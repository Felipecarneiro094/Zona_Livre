package Login;

import conexao.Conectar;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import scheduler.ConsultaVagas;

public class login extends javax.swing.JFrame {

    private final Conectar objCon;

    public login() {
        initComponents();

        setResizable(false);
        setLocationRelativeTo(null);

        objCon = new Conectar();
        
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        campo_user = new javax.swing.JTextField();
        campo_pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 51, 51));
        setResizable(false);

        user.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\usuario.png")); // NOI18N
        user.setText(" Usuário");

        pass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\senha.png")); // NOI18N
        pass.setText(" Senha");

        login.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\login.png")); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        sair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\sair.png")); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        campo_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_userActionPerformed(evt);
            }
        });

        campo_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_passActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\Icone zona livre P.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 48)); // NOI18N
        jLabel2.setText("Zona Livre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_user, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(25, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user)
                    .addComponent(campo_user, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass)
                    .addComponent(campo_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(sair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            objCon.openConnection();
            String SQL = "select * from usuario where nome = 'Felipe' and senha = 'admin'";
            PreparedStatement ps = objCon.con.prepareStatement(SQL);
            objCon.rs = ps.executeQuery();
            objCon.rs.next();

            if (campo_user.getText().equals(objCon.rs.getString("nome")) && campo_pass.getText().equals(objCon.rs.getString("senha"))) {
                JOptionPane.showMessageDialog(null, "Bem vindo ao Zona Livre!");

                dashboard dashboard = new dashboard();
                dashboard.setVisible(true);
                
                Timer timer = new Timer();
                timer.schedule(new ConsultaVagas(dashboard), 0, 1000);

                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou Senha incorreto!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void campo_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_passActionPerformed

    private void campo_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_userActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField campo_pass;
    private javax.swing.JTextField campo_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    private javax.swing.JLabel pass;
    private javax.swing.JButton sair;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        ImageIcon icon = new ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\Logo.png");
        setIconImage(icon.getImage());
    }
}
