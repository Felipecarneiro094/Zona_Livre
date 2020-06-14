package Login;

import conexao.Conectar;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class cadastro_vagas extends javax.swing.JFrame {

    private final Conectar objCon;

    public cadastro_vagas() {
        initComponents();

        objCon = new Conectar();
        
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto_pagina = new javax.swing.JLabel();
        quantidade = new javax.swing.JLabel();
        campo_quantidade = new javax.swing.JTextField();
        enviar_cad_vagas = new javax.swing.JButton();
        sair_cad_vagas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto_pagina.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        texto_pagina.setText("           Cadastrar Novas Vagas de Estacionamento.");
        texto_pagina.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        quantidade.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        quantidade.setText("  Quantidade");
        quantidade.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        campo_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_quantidadeActionPerformed(evt);
            }
        });

        enviar_cad_vagas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        enviar_cad_vagas.setText("Cadastrar");
        enviar_cad_vagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_cad_vagasActionPerformed(evt);
            }
        });

        sair_cad_vagas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        sair_cad_vagas.setText("Sair");
        sair_cad_vagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_cad_vagasActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\Icone zona livre P.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enviar_cad_vagas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sair_cad_vagas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_pagina)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enviar_cad_vagas)
                            .addComponent(sair_cad_vagas))
                        .addGap(89, 89, 89))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sair_cad_vagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_cad_vagasActionPerformed
        dispose();
    }//GEN-LAST:event_sair_cad_vagasActionPerformed

    private void enviar_cad_vagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_cad_vagasActionPerformed
        String quantidade = campo_quantidade.getText();
        
        // Lança NullPointerException se a quantidade for null
        Objects.requireNonNull(quantidade);
                
        //Aceita apenas numero inteiros positivos
        if (quantidade.matches("\\d+") && !quantidade.equals("0")) {
            int qnt = Integer.parseInt(quantidade);
            for (int x = 0; x < qnt; x++) {
                objCon.openConnection();
                String SQL = "INSERT INTO jobs (status, updated_at,created_at) VALUES ('0',?,?)";
                try (PreparedStatement ps = objCon.con.prepareStatement(SQL)) {
                    ps.setDate(1, Date.valueOf(LocalDate.now()));
                    ps.setDate(2, Date.valueOf(LocalDate.now()));
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
            JOptionPane.showMessageDialog(null, "Vagas cadastradas com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Quantidade de vagas inválidas!");
        }
        
        campo_quantidade.setText("");
    }//GEN-LAST:event_enviar_cad_vagasActionPerformed

    private void campo_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_quantidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_quantidade;
    private javax.swing.JButton enviar_cad_vagas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel quantidade;
    private javax.swing.JButton sair_cad_vagas;
    private javax.swing.JLabel texto_pagina;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        ImageIcon icon = new ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\Logo.png");
        setIconImage(icon.getImage());
    }
}
