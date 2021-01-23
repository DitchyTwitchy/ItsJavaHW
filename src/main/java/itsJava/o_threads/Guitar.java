package itsJava.o_threads;

import lombok.SneakyThrows;

public class Guitar implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            for (int x = 0; x < 6; x++) {
                System.out.print("to ");
                Thread.sleep(250);
            }
            System.out.print("ti ");
            Thread.sleep(250);
            System.out.print("ta ");
            Thread.sleep(250);
        }
    }
}
