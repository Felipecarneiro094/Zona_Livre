package scheduler;

import Login.visualizarVagas;
import conexao.Conectar;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Vagas;
import scheduler.observer.Observable;
import scheduler.observer.impl.ConsultaVagasObservable;

public class ConsultaVagas extends TimerTask {

    private final Conectar objCon;
    
    public ConsultaVagas(){
        this.objCon = new Conectar();
    }
    
    public int countVagasByStatus(String status) throws SQLException{
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
        Vagas vagas = null;
        
        try {
            int vagasLivres = countVagasByStatus("0");
            //System.out.println(vagasLivres);
            int vagasOcupadas = countVagasByStatus("1");
            //System.out.println(vagasOcupadas);            
            vagas = new Vagas(vagasLivres, vagasOcupadas);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaVagas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //TODO criar consultas
        System.out.println(vagas.toString());
        //Observable observable = new ConsultaVagasObservable();
        //observable.addObserver(new visualizarVagas());
        //observable.notifyObservers(vagas.get);
    }
    
    
    
}
