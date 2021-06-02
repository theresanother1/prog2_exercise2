package trafficlight.states;

import trafficlight.gui.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    public static List<Observer> lights = new ArrayList<Observer>();

    //eventuell teilweise schon implementieren
    public static <T extends Observer> void addObserver(T t){
        lights.add(t);
      //  System.out.println(lights);
    }
    public static <T extends Observer> void removeObserver(T t){
        lights.remove(t);
    }
    abstract public void notifyObservers(String string);


}
