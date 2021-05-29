package trafficlight.states;

//TODO implement a part of the pattern here

//Subject?
public abstract class State {

    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }
}