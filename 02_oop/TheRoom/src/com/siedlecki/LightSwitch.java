package com.siedlecki;

public class LightSwitch {
    private boolean isOn;


    public LightSwitch(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }
    public void turnOn(){
       if (this.isOn) {
           System.out.println("The switch is already turned on");
       } else {
           System.out.println("turning switch on...");
           isOn = true;
       }
    }
    public void turnOff(){
        if (!this.isOn){
            System.out.println("The switch is already turned off");
        } else {
            System.out.println("turning switch off...");
            isOn = false;
        }
    }


}
