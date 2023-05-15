package com.tomerharari.secondweatherdesign;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

//    public void update(float temp, float humidity, float pressure) {
//        this.temp = temp;
//        this.humidity = humidity;
//        display();
//    }
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }
}
