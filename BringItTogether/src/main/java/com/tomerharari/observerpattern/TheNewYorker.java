package com.tomerharari.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class TheNewYorker implements Subject {
    private List<Observer> observers;
    private String header;
    private String article;


    public TheNewYorker() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(header, article));
    }

    public void setArticle(String header, String article) {
        this.header = header;
        this.article = article;
        notifyObservers();
    }
}
