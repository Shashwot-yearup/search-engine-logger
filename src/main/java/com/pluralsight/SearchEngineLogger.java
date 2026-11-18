package com.pluralsight;

import java.util.Scanner;
import java.io.FileWriter;

public class SearchEngineLogger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("log.txt", true);

        } catch (Exception e) {
            System.out.println("Error writing to log file");
        }
    }
}