package com.tertiaryinfotech.day_2.module_10;

class Olive {
    public OliveName oliveName;
    public long color = 0x000000;

    public Olive() {
        this(OliveName.GOLDEN);
    }

    public Olive(OliveName oliveName) {
        this.oliveName = oliveName;
//        System.out.println("Olive Created: " + oliveName);
    }

    public Olive(OliveName oliveName, long color) {
        this(oliveName);
        this.color = color;
    }

    private String toString(String extra, int extra1) {

        return "name: " + this.oliveName + ": " + "color: " + this.color + ". Extras: " + extra + ", " + extra1;
    }
}
