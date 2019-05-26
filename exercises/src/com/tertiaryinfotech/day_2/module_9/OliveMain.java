package com.tertiaryinfotech.day_2.module_9;

import java.util.ArrayList;

public class OliveMain {
    public static ArrayList<Olive> olives;

    static {
        System.out.println("Starting Program...");
        olives = new ArrayList<Olive>();
        olives.add(new Olive("Kalamata", 0x000000));
    }

    public static void main(String[] args) {
//        Olive.class;
        new Olive();
        new Olive("Abc");
        new Olive("Abc", 0xDDDDDD);
    }
}
