package com.tertiaryinfotech.day_2.module_13;

import java.nio.file.*;

public class FindFiles {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        PathMatcher matcher = fs.getPathMatcher("glob:**/*.java");
        String directory = "src/com/tertiaryinfotech/day_2/module_13/";
        System.out.println(matcher.matches(Paths.get(directory + "FileTreeExample.java")));
        System.out.println(matcher.matches(Paths.get(directory + "newFile.txt")));
    }
}
