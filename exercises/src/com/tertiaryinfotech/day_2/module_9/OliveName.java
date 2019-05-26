package com.tertiaryinfotech.day_2.module_9;

// Enumeration Classes
public enum OliveName {
    KALAMATA("Kalamata"),
    LIGURIO("Ligurio"),
    PICHOLINE("Picholine"),
    GOLDEN("Golden");

    private String name;

    OliveName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class OliveNameMain {
    public static void main(String[] args) {
        OliveName oliveName = OliveName.LIGURIO;
        switch (oliveName) {
            case KALAMATA:
            case LIGURIO:
            case PICHOLINE:
                System.out.println(oliveName.getName());
                break;
            default:
                break;
        }
    }
}