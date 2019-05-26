package com.tertiaryinfotech.day_2.module_10;

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
