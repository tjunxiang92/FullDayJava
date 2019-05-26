package com.tertiaryinfotech.day_2.module_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteFiles {
    public static void main(String[] args) throws IOException {
        String directory = "src/com/tertiaryinfotech/day_2/module_13/";
        Path source = Paths.get(directory + "newFile.txt");
        Path target = Paths.get(directory + "copiedFile.txt");

        // Define Charset
        Charset charset = Charset.forName("US-ASCII");
        // Define Reader
        BufferedReader reader = Files.newBufferedReader(source, charset);
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        // Define Writer
        BufferedWriter writer = Files.newBufferedWriter(target, charset);
        writer.write("Writing to Files\n");
        writer.write("End of File\n");
        writer.close();

    }
}
