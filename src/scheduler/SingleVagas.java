package scheduler;

import model.Vagas;

public class SingleVagas {
    
    private Vagas vagasWrapper;
    private static SingleVagas instance;
    
    private SingleVagas(){}
            
    public Vagas getVagasWrapper() {
        return vagasWrapper;
    }

    public void setVagasWrapper(Vagas vagasWrapper) {
        this.vagasWrapper = vagasWrapper;
    }   
    
    public static SingleVagas getInstance() {
        if (instance == null) {
            instance = new SingleVagas();
        }
        return instance;
    }
    
}
