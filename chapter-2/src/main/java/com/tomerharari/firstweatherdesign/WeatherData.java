package com.tomerharari.firstweatherdesign;

public class WeatherData {
    // The three methods below pull data from the weather station which we don't care about - it is given to us
    // get most recent temperature



//    public float getTemperature() {}
//    // get most recent humidity
//    public float getHumidity() {}
//    // get most recent pressure
//    public float getPressure() {}
    // Whenever values update (the WeatherData class obtains new values for temperature, humidity, or pressure) this method is called
    // this is the only method we care about
    // This method will check for updates in temp, humidity or pressure
    // and update our the display of the weather monitoring physical device
    /*
    We know we need to implement a display and then have the WeatherData update that display each time it has new values,
    or, in other words, each time the measurementsChanged() method is called. But how? Let’s think through what we’re trying to acheive:

       We know the WeatherData class has getter methods for three measurement values: temperature, humidity, and barometric pressure.

        We know the measurementsChanged() method is called anytime new weather measurement data is available. (Again, we don’t know or care how this method is called; we just know that it is called.)

        We’ll need to implement three display elements that use the weather data: a current conditions display, a statistics display, and a forecast display. These displays must be updated as often as the WeatherData has new measurements.

        To update the displays, we’ll add code to the measurementsChanged() method.

     */
    public void measurementsChanged() {
        // get the real time temperature, humidity and pressure
//        float temp = getTemperature();
//        float humidity = getHumidity();
//        float pressure = getPressure();

        // our device has 3 displays and we need to update each one with most recent measurements
//        currentConditionsDisplay.update(temp, humidity, pressure);
//        statisticsDisplay.update(temp, humidity, pressure);
//        forecastDisplay.update(temp, humidity, pressure);
    }

}
