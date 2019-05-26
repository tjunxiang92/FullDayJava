package com.tertiaryinfotech.day_2.module_13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ManipulateFilesExample {
    static String directory = "src/com/tertiaryinfotech/day_2/module_13/";
    static Path source = Paths.get(directory + "newFile.txt");
    static Path target = Paths.get(directory + "copiedFile.txt");

    public static void main(String[] args) throws IOException {
        // Copy File
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
//        // Delete File
//        Files.delete(target);

//        // Create Directory
//        Path newDir = Paths.get(directory + "/newFolder");
//        Files.createDirectory(newDir);
//        // Move File
//        Files.move(target, newDir.resolve(target.getFileName()), StandardCopyOption.REPLACE_EXISTING);





    }
}
