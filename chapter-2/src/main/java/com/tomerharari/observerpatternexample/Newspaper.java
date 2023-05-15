package com.tomerharari.observerpatternexample;

import java.util.List;

public class Newspaper implements Subject{
    private List<Observer> observers;
    private String header;
    private String body;

    public Newspaper(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(header, body));
    }
    public void articleChanged() {
        notifyObservers();
    }
    public void setArticle(String header, String body) {
        this.header = header;
        this.body = body;
        articleChanged();
    }
}
