package com.tomerharari.observerpatternexample;

public class Subscriber implements Observer{
    private Newspaper newspaper;
    private String header;
    private String body;

    public Subscriber(Newspaper newspaper) {
        this.newspaper = newspaper;
        newspaper.registerObserver(this);
    }

    @Override
    public void update(String header, String body) {
        this.header = header;
        this.body = body;
        display();
    }

    private void display() {
        System.out.println("EXTRA EXTRA READ ALL ABOUT IT:\n" + header + "\n" + body);
    }
}
