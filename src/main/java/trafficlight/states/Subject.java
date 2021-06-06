package trafficlight.states;

import trafficlight.gui.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    public static List<Observer> observers = new ArrayList<Observer>();

    public static <T extends Observer> void addObserver(T t){
        observers.add(t);
    }
    public static <T extends Observer> void removeObserver(T t){
        observers.remove(t);
    }
    abstract public void notifyObservers(String string);


}
