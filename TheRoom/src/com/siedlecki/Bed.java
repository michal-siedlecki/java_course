package com.siedlecki;

public class Bed {
    private Dimmensions dimmensions;
    private boolean isCovered;

    public Bed(Dimmensions dimmensions, boolean isCovered) {
        this.dimmensions = dimmensions;
        this.isCovered = isCovered;
    }

    public Dimmensions getDimmensions() {
        return dimmensions;
    }

    public boolean isCovered() {
        return isCovered;
    }
    public void cover(){
        this.isCovered = true;
    }
    public void unCover(){
        this.isCovered = false;
    }
}
