package com.tertiaryinfotech.day_2.module_9;

import java.util.ArrayList;

public class OliveJar {
    /* Member Classes */
    public ArrayList<Olive> olives;

    {
        System.out.println("Starting Olive Jar...");
        olives = new ArrayList<Olive>();
        olives.add(new Olive("Golden", 0xDA9100));
    }

    public OliveJar() {
        System.out.println("Constructor...");
    }

    public OliveJar(int nOlives, String oliveName, long color) {
        for (int i = 0; i < nOlives; i++) {
            olives.add(new Olive(oliveName, color));
        }
    }

    public void reportOlives() {
        // LocalInnerClasses
        class JarLid {
            public void open() {
                System.out.println("Twist, twist, twist...");
                System.out.println("Pop!");
            }
        }
        new JarLid().open();

//        // Anonymous Inner Classes
//        // new ActionListener () {
//        //   public void onClick() {}
//        // }
//        new Object() {
//            public void open() {
//                System.out.println("Twist, twist, twist...");
//                System.out.println("Pop!");
//            }
//        }.open();

    }

    public static void main(String[] args) {
        new OliveJar().reportOlives();
    }

}
