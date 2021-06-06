package trafficlight.gui;


import trafficlight.gui.Light;

import java.awt.*;

public class TrafficLight extends Light /*implements Observer*/ {

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
    //done in TrafficLightGui
  /*  @Override
    public void update(String string){
       System.out.println("Updating TrafficLight");
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
