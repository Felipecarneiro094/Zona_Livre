/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Felipe Carneiro
 */
public class cadastro_vagas extends javax.swing.JFrame {

    /**
     * Creates new form cadastro_vagas
     */
    public cadastro_vagas() {
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

        uso_geral = new javax.swing.JRadioButton();
        uso_idoso = new javax.swing.JRadioButton();
        uso_deficiente = new javax.swing.JRadioButton();
        texto_pagina = new javax.swing.JLabel();
        quantidade = new javax.swing.JLabel();
        campo_quantidade = new javax.swing.JTextField();
        enviar_cad_vagas = new javax.swing.JButton();
        sair_cad_vagas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uso_geral.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        uso_geral.setText("Vagas de uso geral.");

        uso_idoso.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        uso_idoso.setText("Vagas Idoso.");

        uso_deficiente.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        uso_deficiente.setText("Vagas Deficiente Físico.");

        texto_pagina.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        texto_pagina.setText("      Cadastrar Novas Vagas de Estacionamento.");
        texto_pagina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        quantidade.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        quantidade.setText("  Quantidade:");
        quantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        enviar_cad_vagas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        enviar_cad_vagas.setText("Cadastrar");

        sair_cad_vagas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        sair_cad_vagas.setText("Sair");
        sair_cad_vagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_cad_vagasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uso_deficiente)
                    .addComponent(uso_geral)
                    .addComponent(texto_pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uso_idoso)
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enviar_cad_vagas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sair_cad_vagas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(texto_pagina)
                .addGap(45, 45, 45)
                .addComponent(uso_geral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uso_idoso)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(uso_deficiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviar_cad_vagas)
                    .addComponent(sair_cad_vagas))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sair_cad_vagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_cad_vagasActionPerformed
        dispose();
    }//GEN-LAST:event_sair_cad_vagasActionPerformed

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
            java.util.logging.Logger.getLogger(cadastro_vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro_vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro_vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro_vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro_vagas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_quantidade;
    private javax.swing.JButton enviar_cad_vagas;
    private javax.swing.JLabel quantidade;
    private javax.swing.JButton sair_cad_vagas;
    private javax.swing.JLabel texto_pagina;
    private javax.swing.JRadioButton uso_deficiente;
    private javax.swing.JRadioButton uso_geral;
    private javax.swing.JRadioButton uso_idoso;
    // End of variables declaration//GEN-END:variables
}
