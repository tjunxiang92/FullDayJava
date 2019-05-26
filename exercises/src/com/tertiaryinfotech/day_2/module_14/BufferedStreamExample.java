package com.tertiaryinfotech.day_2.module_14;

import java.io.*;

public class BufferedStreamExample {
    public static void main(String[] args) throws IOException {
        String directory = "src/com/tertiaryinfotech/day_2/module_14/";

        BufferedReader in = new BufferedReader(new FileReader(directory + "newFile.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(directory + "copiedFile.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            out.write("[Copied]" + line + "\n");
        }

        in.close();
        out.close();
    }
}
