package Login;
import javax.swing.ImageIcon;
import model.Vagas;

public class visualizarVagas extends javax.swing.JFrame{

    public visualizarVagas() {
        initComponents();
        
        setIcon();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JLabel();
        vagas_livre = new javax.swing.JLabel();
        vagas_ocupadas = new javax.swing.JLabel();
        total_vagas = new javax.swing.JLabel();
        label_imagem = new javax.swing.JLabel();
        campo_livres = new javax.swing.JTextField();
        campo_ocupadas = new javax.swing.JTextField();
        campo_total = new javax.swing.JTextField();
        botao_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel_principal.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        painel_principal.setText("                   Vagas do Seu Estacionamento");

        vagas_livre.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        vagas_livre.setText("Vagas Livres:");

        vagas_ocupadas.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        vagas_ocupadas.setText("Vagas Ocupadas:");

        total_vagas.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        total_vagas.setText("Total de Vagas:");

        label_imagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\Zona livre P.png")); // NOI18N

        campo_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_totalActionPerformed(evt);
            }
        });

        botao_sair.setText("Sair");
        botao_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label_imagem, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vagas_ocupadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vagas_livre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_livres, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(campo_ocupadas)))
                    .addComponent(botao_sair)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(total_vagas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_total, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(label_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_livres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vagas_livre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vagas_ocupadas)
                            .addComponent(campo_ocupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campo_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_vagas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_sair)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_sairActionPerformed
       dispose();
    }//GEN-LAST:event_botao_sairActionPerformed

    private void campo_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_totalActionPerformed

    //@Override
    public void update(Vagas vagas) {
        System.out.println("VAGAS: " + vagas);
        this.campo_livres.setText(String.valueOf(vagas.getVagasLivres()));
        this.campo_ocupadas.setText(String.valueOf(vagas.getVagasOcupadas()));
        this.campo_total.setText(String.valueOf(vagas.getTotal()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_sair;
    private javax.swing.JTextField campo_livres;
    private javax.swing.JTextField campo_ocupadas;
    private javax.swing.JTextField campo_total;
    private javax.swing.JLabel label_imagem;
    private javax.swing.JLabel painel_principal;
    private javax.swing.JLabel total_vagas;
    private javax.swing.JLabel vagas_livre;
    private javax.swing.JLabel vagas_ocupadas;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        ImageIcon icon = new ImageIcon("C:\\Users\\Felipe Carneiro\\Documents\\NetBeansProjects\\Zona_Livre\\src\\imagens\\Logo.png");
        setIconImage(icon.getImage());
    }

}
