package com.tomerharari.observerpattern;

public class Main {
    public static void main(String[] args) {
        TheNewYorker newYorker = new TheNewYorker();
        Subscriber tomer = new Subscriber(newYorker, "tomer");
        Subscriber john = new Subscriber(newYorker, "John");
        newYorker.setArticle("EXTRA EXTRA", "THis is an article");
    }
}
