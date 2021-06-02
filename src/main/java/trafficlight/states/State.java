package trafficlight.states;

//TODO implement a part of the pattern here


import trafficlight.gui.Observer;

public abstract class State extends Subject{

    //added by me
    public String current = null;

    public abstract State getNextState();

    public abstract String getColor();

    //wird gesetted über getColor overwrite in TrafficLightCtrl
    public String getSting(){
        return getColor();
    }

    //added by me
   /* public void setString(State state){
        this.current = state.getSting();
    }*/


    @Override
    public void notifyObservers(String string){
        for (Observer t : lights){
            t.update(string);
        }
    }

}
//State sollte Subject sein -> State ändert sich