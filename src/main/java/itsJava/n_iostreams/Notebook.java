package itsJava.n_iostreams;

import java.io.*;
import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        System.out.println("Please enter the notebook name without spaces:");
        String fileName = readString();
        File notebook = new File("src/main/resources/" + fileName + ".txt");
        if (notebook.isFile()) {
            System.out.println("Working with existing \"" + fileName + "\" notebook");
        } else {
            System.out.println("Creating new \"" + fileName + "\" notebook");
        }

        while (true) {
            printMenu();
            int menuChoice = readInt();
            if (menuChoice == 0) {
                System.out.println("Bye! See you later!");
                break;
            } else if (menuChoice == 1) {
                System.out.println("Please enter new note:");
                addLine(notebook);
            } else if (menuChoice == 2) {
                System.out.println("Your notes:");
                readNotebook(notebook);
            } else {
                System.out.println("Incorrect input! Please enter correct menu item.");
            }
        }
    }

    public static void readNotebook(File notebook) {
        try (BufferedReader br = new BufferedReader(new FileReader(notebook))) {
            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TODO: 22.01.2021 - remove old lines if count > 10 
    public static void addLine(File notebook) {
        try (FileWriter fw = new FileWriter(notebook, true)) {
            PrintWriter out = new PrintWriter(fw);
            out.println(readString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printMenu() {
        System.out.println("=========== Menu ===========");
        System.out.println("1 - Add note");
        System.out.println("2 - Read notes");
        System.out.println("0 - Exit");
    }

    // TODO: 22.01.2021 - validate file name
    public static String readString() {
        String fileName;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Your input: ");
                fileName = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Incorrect input! Please enter filename without path.");
            }
        }
        return fileName;
    }

    public static int readInt() {
        int menuItem;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Your input: ");
                menuItem = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Incorrect input! Please enter menu item as an integer.");
            }
        }
        return menuItem;
    }
}
