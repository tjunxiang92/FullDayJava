package com.tertiaryinfotech.day_2.module_14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) throws IOException {
        String directory = "src/com/tertiaryinfotech/day_2/module_14/";
        FileInputStream in = new FileInputStream(directory + "flower.jpg");
        FileOutputStream out = new FileOutputStream(directory + "newFlower.jpg");
        int inByte;
        while((inByte = in.read()) != -1) {
            System.out.print(inByte);
            System.out.print(" ");
            out.write(inByte);
        }
        in.close();
        out.close();
    }
}
