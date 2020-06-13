package scheduler.observer;

import model.Vagas;
import scheduler.SingleVagas;

public interface Observable {
    
    void addObserver(Observer observer);
    void notifyObservers(Vagas vagas);
    
}
