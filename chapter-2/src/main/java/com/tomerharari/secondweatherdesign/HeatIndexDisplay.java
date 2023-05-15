package com.tomerharari.secondweatherdesign;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex = 0.0f;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // PUSH METHOD VERSION WHERE SUBJECT PUSHES DATA TO OBSERVERS
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        this.heatIndex = computeHeatIndex(temp, humidity);
//        display();
//    }
    // PULL METHOD VERSION WHERE OBSERVER ASKS SUBJECT FOR DATA
    @Override
    public void update() {
        heatIndex = computeHeatIndex(weatherData.getTemp(), weatherData.getHumidity());
        display();
    }
    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }
    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
