    package com.company;

public class EmptyPrintingMachineException extends Exception {
    PrintingMachine machine;

    public EmptyPrintingMachineException(PrintingMachine machine) {
        this.machine = machine;
    }

    @Override
    public String toString() {
        return "You can load the machine with maximum " + machine.getMaxpaper() + " number of papers.";
    }
}
