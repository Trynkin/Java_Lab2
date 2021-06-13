package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws FileNotFoundException {
        InitCalc currentContext = new InitCalc();
        Scanner scanner;
        if (args.length > 0) {
            scanner = new Scanner(new FileInputStream(args[0]));
        } else {
            scanner = new Scanner(System.in);
        }
        String s;
        ObjectFactory factory = new ObjectFactory();
        while (scanner.hasNextLine()){
            s = scanner.nextLine();
            String[] line = s.split(" ");
            if ('#' == line[0].charAt(0)) continue;
            else {
                factory.getCommand(line[0]).exec(currentContext, line);
            }
        }
    }
}
