package com.tertiaryinfotech.day_2.module_14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
        String directory = "src/com/tertiaryinfotech/day_2/module_14/";
        Scanner s = new Scanner(new BufferedReader(new FileReader(directory + "newFile.txt")));
        s.useDelimiter(",");

        while(s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
