package scheduler.observer.impl;

import java.util.HashSet;
import java.util.Set;
import model.Vagas;
import scheduler.SingleVagas;
import scheduler.observer.Observable;
import scheduler.observer.Observer;

public class ConsultaVagasObservable implements Observable {

    private Set<Observer> observers = new HashSet<>();
    
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers(Vagas vagas) {
       //this.observers.forEach(o -> o.update(SingleVagas.getInstance()));
        System.out.println("");
    }

}