package com.tertiaryinfotech.day_2.module_9;



class Olive {
    public String oliveName;
    public long color = 0x000000;

    // Static Initializer
    static {
        System.out.println("Starting Olive Static...");
    }

//    InstanceFieldInitializer
//    {
//        System.out.println("Starting Olive Instance...");
//    }

    public Olive() {
        this("Empty");
    }

    public Olive(String oliveName) {
        this.oliveName = oliveName;
        System.out.println("Olive Created: " + oliveName);
    }

    public Olive(String oliveName, long color) {
        this(oliveName);
        this.color = color;
    }

    public String toString() {
        return "name: " + this.oliveName + ": " + "color: " + this.color;
    }
}