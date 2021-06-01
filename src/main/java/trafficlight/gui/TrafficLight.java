package trafficlight.gui;


import java.awt.*;

public class TrafficLight extends Light {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    //TODO implement a part of the pattern here

 /*   @Override
    public void update(String string){
        //Aufruf findet über notify statt!!!!
        //derzeit reines Blinken, da Lichter notified werden
     /*   System.out.println("Updating TrafficLight");
        if (isOn()){
            System.out.println("Trafficlight is on - turned off");
            turnOn(false);
        }
        else if (!isOn()){
            System.out.println("Trafficlight is off - turned on");
            turnOn(true);
        }
    }*/



}
