package com.pluralsight;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;

public class SearchEngineLogger {
    public static void main(String[] args) {

        //Creates the scanner
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //Try Catch to Create and write to the file
        try {
            FileWriter writer = new FileWriter("src/main/resources/logs.txt", true);

            //launches the log
            writer.write(LocalDateTime.now().format(formatter) + " launch\n");

            boolean run = true;

            while (run) {
                System.out.print("Enter search term or For exit press x: ");
                String searchTerm = scanner.nextLine();

                if (searchTerm.equals("x")) {
                    run = false;
                } else {
                    writer.write(LocalDateTime.now().format(formatter) + " search : " + searchTerm + "\n");
                }
                writer.flush(); //add the text to the txt file.
            }
            //closes the writer
            writer.close();

        } catch (Exception e) {
            System.out.println("Error writing to log file");
        }
        scanner.close();
    }
}