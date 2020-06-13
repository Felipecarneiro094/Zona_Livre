package scheduler.observer;

import model.Vagas;

public interface Observable {
    
    void addObserver(Observer observer);
    void notifyObservers(Vagas vagas);
    
}
