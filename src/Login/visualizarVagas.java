package Login;
import model.Vagas;

public class visualizarVagas extends javax.swing.JFrame{

    public visualizarVagas() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel_principal.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        painel_principal.setText("              Vagas do Seu Estacionamento");

        vagas_livre.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        vagas_livre.setText("Vagas Livres:");

        vagas_ocupadas.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        vagas_ocupadas.setText("Vagas Ocupadas:");

        total_vagas.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        total_vagas.setText("Total de Vagas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painel_principal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_imagem)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(total_vagas)
                                .addGap(24, 24, 24)
                                .addComponent(campo_total))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vagas_ocupadas)
                                    .addComponent(vagas_livre))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_ocupadas)
                                    .addComponent(campo_livres))))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_imagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vagas_livre)
                            .addComponent(campo_livres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vagas_ocupadas)
                            .addComponent(campo_ocupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total_vagas)
                            .addComponent(campo_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(93, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //@Override
    public void update(Vagas vagas) {
        System.out.println("VAGAS: " + vagas);
        this.campo_livres.setText(String.valueOf(vagas.getVagasLivres()));
        this.campo_ocupadas.setText(String.valueOf(vagas.getVagasOcupadas()));
        this.campo_total.setText(String.valueOf(vagas.getTotal()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_livres;
    private javax.swing.JTextField campo_ocupadas;
    private javax.swing.JTextField campo_total;
    private javax.swing.JLabel label_imagem;
    private javax.swing.JLabel painel_principal;
    private javax.swing.JLabel total_vagas;
    private javax.swing.JLabel vagas_livre;
    private javax.swing.JLabel vagas_ocupadas;
    // End of variables declaration//GEN-END:variables

}
