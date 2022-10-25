package com.company;

public enum PageSize {
    A1(5), A2(10), A3(15), A4(20), A5(25);

    private double priceperpage;

    PageSize(double priceperpage) {
        this.priceperpage = priceperpage;
    }

    public double getPriceperpage() {
        return priceperpage;
    }
}
