package com.tomerharari.observerpattern;

public class Subscriber implements Observer {
    private String header;
    private String article;
    private Subject newspaper;
    private String name;

    public Subscriber(Subject s, String name) {
        newspaper = s;
        newspaper.registerObserver(this);
        this.name = name;
    }

    @Override
    public void update(String header, String article) {
        System.out.println("SUBSCRIBER READING DATA");
        this.article = article;
        this.header = header;
        printNewspaper();
    }
    public void printNewspaper() {
        System.out.println("NEWS FOR " + name + " -- HEADER: " + header + "\nARTICLE: " + article);
    }
}
