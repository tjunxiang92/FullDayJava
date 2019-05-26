package com.tertiaryinfotech.day_2.module_13;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/com/tertiaryinfotech/day_2/module_13/newFile.txt");
        System.out.println(path.toString());
        System.out.println(path.getNameCount());
        // Get the filename
        System.out.println(path.getFileName());
        System.out.println(path.getName(path.getNameCount()-1));
        // Get the absolute path
        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
        System.out.println(realPath);

    }
}
