package com.tertiaryinfotech.day_2.module_12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Try, Catch, Finally
        try {
            int a = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unable to divide by 0");
        }

        // File -> Project Structure... -> Modules -> Click "src" -> Change Language Level to 7
        try (
            FileReader fr = new FileReader("src/com/tertiaryinfotech/day_2/module_11/newFile.txt");
//            FileReader fr = new FileReader("newFile.txt");
            BufferedReader br = new BufferedReader(fr)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line);
                if (line != "Correct File")
                    throw new WrongFileException("Wrong file used.");
            }
        } catch (WrongFileException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Close all resources");
        }


    }
}

class WrongFileException extends Exception {
    public WrongFileException(String errorMessage) {
        super(errorMessage);
    }
}