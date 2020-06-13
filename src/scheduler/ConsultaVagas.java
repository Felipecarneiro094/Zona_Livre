package scheduler;

import Login.dashboard;
import Login.visualizarVagas;
import conexao.Conectar;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Vagas;

public class ConsultaVagas extends TimerTask {

    private final Conectar objCon;
    private final dashboard dashboard;

    public ConsultaVagas(dashboard dashboard) {
        this.objCon = new Conectar();
        this.dashboard = dashboard;
    }

    public Vagas ConsultaVagas() {
        int vagasLivres = 0;
        int vagasOcupadas = 0;
        
        try {
            vagasLivres = countVagasByStatus("0");        
            vagasOcupadas = countVagasByStatus("1");
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaVagas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return new Vagas(vagasLivres, vagasOcupadas);
    }

    public int countVagasByStatus(String status) throws SQLException {
        objCon.openConnection();
        String SQL = "select count(*) as vagas from jobs where status = ?";
        PreparedStatement ps = objCon.con.prepareStatement(SQL);
        ps.setString(1, status);
        objCon.rs = ps.executeQuery();
        objCon.rs.next();
        int countVagas = objCon.rs.getInt("vagas");
        return countVagas;
    }

    @Override
    public void run() {
        dashboard.tela.update(ConsultaVagas());
    }
}
