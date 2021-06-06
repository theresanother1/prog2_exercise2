package trafficlight.states;

//TODO implement a part of the pattern here


import trafficlight.gui.Observer;

public abstract class State extends Subject{

    public abstract State getNextState();

    public abstract String getColor();

    //wird gesetted über getColor overwrite in TrafficLightCtrl
    public String getSting(){
        return getColor();
    }


    @Override
    public void notifyObservers(String string){
        for (Observer t : observers){
            t.update(string);
        }
    }

}
