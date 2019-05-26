package com.tertiaryinfotech.day_2.module_13;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTreeExample {
    public static void main(String[] args) throws IOException {
        // Invoke walkFileTree under Files class
        String directory = "src/com/tertiaryinfotech/day_2";
        Path fileDir = Paths.get(directory);
        MyFileVisitor visitor = new MyFileVisitor("newFile.txt", fileDir);
        Files.walkFileTree(fileDir, visitor);

    }
}

// Implement FileVisitor by extending SimpleFileVisitor
class MyFileVisitor extends SimpleFileVisitor<Path> {
    private String fileName;
    private Path startDir;

    public MyFileVisitor(String fileName, Path startDir) {
        this.fileName = fileName;
        this.startDir = startDir;
    }

    // Visit to the file itself
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        String fileName = file.getFileName().toString();
        System.out.println("File: " + fileName);
        if (fileName.contains("txt")) {
//            System.out.println("File found: " + file.toString());
        } else if (fileName.equals(this.fileName)) {
            System.out.println("File found: " + file.toString());
            return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
//        // Only visits one file
//        return FileVisitResult.SKIP_SIBLINGS;
    }

    // Operating System preventing access to files
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.out.println("Failed to access file: " + file.toString());
        return FileVisitResult.CONTINUE;
    }

    // Before going into a directory
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("Pre Directory: " + dir.toString());
//        // Skips when there are 5 or more directories
//        if (dir.getNameCount() >= 5)
//            return FileVisitResult.SKIP_SUBTREE;
//        else
            return FileVisitResult.CONTINUE;
    }

    // After visiting a directory
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        boolean finishedSearch = Files.isSameFile(dir, startDir);
        System.out.println("Post Directory: " + dir.toString());
        if (finishedSearch) {
            System.out.println("File:" + fileName + " not found");
            return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
    }
}