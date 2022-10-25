package com.company;

public class PrintingMachine {
    private final int maxpaper;
    private int loadedpaper;
    private final int paperperminute;
    private final PaperColor paperColor;

    public PrintingMachine(int maxpaper, int paperperminute, PaperColor paperColor) {
        this.maxpaper = maxpaper;
        this.paperperminute = paperperminute;
        this.paperColor = paperColor;
    }

    public void loadPaper(int papertoload) {
        if (loadedpaper + papertoload > maxpaper) {
            System.out.println("Sorry, you can't load the machine with " + papertoload + " papers.You can load the machine with maximum " + (maxpaper - loadedpaper) + " more.");
        } else {
            loadedpaper += papertoload;
            System.out.println("You have loaded " + papertoload + " paper.You have in total loaded " + loadedpaper + " papers.");
        }
    }

    public int getMaxpaper() {
        return maxpaper;
    }

    public int getLoadedpaper() {
        return loadedpaper;
    }

    @Override
    public String toString() {
        return "PrintingMachine{" +
                "maxpaper=" + maxpaper +
                ", loadedpaper=" + loadedpaper +
                ", paperperminute=" + paperperminute +
                ", paperColor=" + paperColor +
                '}';
    }
}



