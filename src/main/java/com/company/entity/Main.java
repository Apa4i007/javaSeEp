package com.company.entity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sWhatever;
        Bill bill = new Bill();
        ConsoleReader reader = new ConsoleReader(new Scanner(System.in));
        Security security = new Security();
        while (true) {
            System.out.println("Print pass or 'cancel' to exit");
            sWhatever = reader.getLine();
            if (security.isUser(sWhatever)) {
                runOperations(bill, reader);
            }
        }
    }

    private static void runOperations(Bill bill, ConsoleReader reader) {
        String sWhatever;
        while (true) {
            System.out.println("Select an option: fill | balance | withdraw | exit");
            sWhatever = reader.getLine();
            if (sWhatever.equals("fill")) {
                fillBill(bill, reader);
            } else if (sWhatever.equals("withdraw")) {
                withdrawBill(bill, reader);
            } else if (sWhatever.equals("balance")) {
                System.out.println(bill.getBalance());
            } else if (reader.isExit(sWhatever)) {
                System.exit(0);
            } else {
                System.out.println("Wrong command");
            }
        }
    }

    private static void withdrawBill(Bill bill, ConsoleReader reader) {
        String sWhatever;
        while (true) {
            try {
                sWhatever = reader.getValueFromConsole();
                if (reader.isExit(sWhatever)) break;
                withdrawSum(bill, sWhatever);
                System.out.println("Bill successfully updated");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect sum, please print valid sum");
            }
        }
    }

    private static void withdrawSum(Bill bill, String sWhatever) {
        if (isValidWithdrawSum(bill, sWhatever)) {
            bill.withdraw(Integer.parseInt(sWhatever));
        } else {
            System.out.println("Less money than the balance!!!");
        }
    }

    private static boolean isValidWithdrawSum(Bill bill, String sWhatever) {
        return bill.getBalance() - Integer.valueOf(sWhatever) >= 0;
    }


    private static void fillBill(Bill bill, ConsoleReader reader) {
        while (true) {
            try {
                bill.fill(Integer.parseInt(reader.getValueFromConsole()));
                System.out.println("Bill successfully updated");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect sum, please print valid sum");
            }
        }
    }
}
