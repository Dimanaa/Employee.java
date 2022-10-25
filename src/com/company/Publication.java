package com.company;

public class Publication {
    private final String title;
    private final int numberofpages;
    private final PageSize pageSize;
    private final PageType pageType;

    public Publication(String title, int numberofpages, PageSize pageSize, PageType pageType) {
        this.title = title;
        this.numberofpages = numberofpages;
        this.pageSize = pageSize;
        this.pageType = pageType;
    }

    public double getPrice() {
        double priceperpage;
        priceperpage = pageSize.getPriceperpage() + pageType.getPriceperpage();
        return priceperpage * numberofpages;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberofpages() {
        return numberofpages;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", numberofpages=" + numberofpages +
                ", pageSize=" + pageSize +
                ", pageType=" + pageType +
                '}';
    }
}
