package com.siedlecki;

public class DeskLamp {
    private LightSwitch lightSwitch;
    private Bulb bulb;

    public DeskLamp(LightSwitch lightSwitch, Bulb bulb) {
        this.lightSwitch = lightSwitch;
        this.bulb = bulb;
    }

    public LightSwitch getLightSwitch() {
        return lightSwitch;
    }

    public Bulb getBulb() {
        return bulb;
    }
}
