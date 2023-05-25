package io.codelex.exceptions.practice;

import java.io.*;

public class Exercise3 {
    public static void cat(File file) {
        try (RandomAccessFile input = new RandomAccessFile(file, "r")) {
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        } catch (IOException e) {
            System.out.println("Error reading file: " + file);
        }
    }
}
