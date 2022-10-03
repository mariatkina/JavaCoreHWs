package SvnthLesson;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    List<WeatherPar> weatherList = new ArrayList<>();

    public Weather(List<WeatherPar> weatherList) {
        this.weatherList = weatherList;
    }

    public List<WeatherPar> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<WeatherPar> weatherList) {
        this.weatherList = weatherList;
    }
}
