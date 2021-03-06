package Login;

import conexao.Conectar;
import javax.swing.ImageIcon;

public class dashboard extends javax.swing.JFrame {

    private final Conectar objCon;

    public dashboard() {
        initComponents();

        setExtendedState(MAXIMIZED_BOTH);

        objCon = new Conectar();
        
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cad_vagas = new javax.swing.JButton();
        vis_vagas = new javax.swing.JButton();
        sair_sistema = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cad_vagas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\cadastrar.png")); // NOI18N
        cad_vagas.setText("Cadastrar Vagas");
        cad_vagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_vagasActionPerformed(evt);
            }
        });

        vis_vagas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\visualizar.png")); // NOI18N
        vis_vagas.setText("Visualizar Vagas");
        vis_vagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vis_vagasActionPerformed(evt);
            }
        });

        sair_sistema.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\sair_sistema.png")); // NOI18N
        sair_sistema.setText("Sair");
        sair_sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_sistemaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\Zona livre P.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(cad_vagas, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vis_vagas, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5004, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vis_vagas)
                    .addComponent(sair_sistema)
                    .addComponent(cad_vagas))
                .addGap(240, 240, 240)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addGap(1578, 1578, 1578))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public visualizarVagas tela = new visualizarVagas();
    
    private void vis_vagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vis_vagasActionPerformed
        
        tela.setVisible(true);
    }//GEN-LAST:event_vis_vagasActionPerformed

    private void sair_sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_sistemaActionPerformed
        dispose();
    }//GEN-LAST:event_sair_sistemaActionPerformed

    private void cad_vagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_vagasActionPerformed
        cadastro_vagas tela = new cadastro_vagas();
        tela.setVisible(true);
    }//GEN-LAST:event_cad_vagasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cad_vagas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sair_sistema;
    private javax.swing.JButton vis_vagas;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        ImageIcon icon = new ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\Logo.png");
        setIconImage(icon.getImage());
    }
}
