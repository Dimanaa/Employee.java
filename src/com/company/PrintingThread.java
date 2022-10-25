package com.company;

public class PrintingThread implements Runnable {

    private final PrintingMachine machine;
    private final Publication publication;
    private final int number;

    public PrintingThread(PrintingMachine machine, Publication publication, int number) {
        this.machine = machine;
        this.publication = publication;
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Starting print on " + machine.toString());
    }
}
