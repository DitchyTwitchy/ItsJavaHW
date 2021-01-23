package itsJava.o_threads;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread poke = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.print("We don't have all day, you know =): ");
            } catch (InterruptedException e) {
            }
        });

        poke.setDaemon(true);
        poke.start();

        int menuChoice;
        while (true) {
            System.out.println("Are you ready?! (1 = yes)");
            menuChoice = readInt();
            if (menuChoice == 1) {
                System.out.println("Lets go!");
                if (!poke.isInterrupted()) poke.interrupt();
                break;
            }
        }

        Runnable runnableGuitar = new Guitar();
        Thread guitar = new Thread(runnableGuitar);
        guitar.start();

        Thread vocals = new Vocals();
        vocals.start();
        vocals.join();

        Thread endSound = new Thread(() -> System.out.println("BA-DUM-TSS!"));
        endSound.start();
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
