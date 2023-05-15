package com.tomerharari.observerpatternexample;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Newspaper newYorkTimes = new Newspaper(new ArrayList<>());
        Observer tomer = new Subscriber(newYorkTimes);

        newYorkTimes.setArticle("THE WAR IS OVER", "Yesterday marks the end of world war 2 thank the heavens");
    }
}
