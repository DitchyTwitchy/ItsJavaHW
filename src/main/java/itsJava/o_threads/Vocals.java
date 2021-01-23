package itsJava.o_threads;

import lombok.SneakyThrows;

public class Vocals extends Thread{
    @SneakyThrows
    @Override
    public void run() {
        System.out.print("DU!");
        Thread.sleep(2000);
        System.out.print("DU HAST!");
        Thread.sleep(2000);
        System.out.print("DU HAST MICH!");
        Thread.sleep(2000);
        System.out.print("\nDU!");
        Thread.sleep(2000);
        System.out.print("DU HAST!");
        Thread.sleep(2000);
        System.out.print("DU HAST MICH!");
        Thread.sleep(2000);
        System.out.print("\nDU HAST MICH!");
        Thread.sleep(2000);
        System.out.print("DU HAST MICH GEFRAGT!");
        Thread.sleep(2000);
        System.out.print("DU HAST MICH GEFRAGT!");
        Thread.sleep(2000);
        System.out.println("\nDU HAST MICH GEFRAGT UND ICH HAB NICHTS GESAGT!");
    }
}
