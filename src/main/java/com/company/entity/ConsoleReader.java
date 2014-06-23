package com.company.entity;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner;

    public ConsoleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getValueFromConsole(){
        System.out.println("Print sum or press 'exit' to return to previous menu");
        return getLine();
    }

    public boolean isExit(String sWhatever) {
        return sWhatever.equals("exit");
    }

    public String getLine() {
        return scanner.nextLine();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
