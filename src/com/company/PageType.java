package com.company;

public enum PageType {
    NEWSPAPER(5), PLAIN(10), GLOSSY(15);

    private double priceperpage;

    PageType(double priceperpage) {
        this.priceperpage = priceperpage;
    }

    public double getPriceperpage() {
        return priceperpage;
    }
}
