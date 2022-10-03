package SvnthLesson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;

public class MainClass {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города на русском языке");
        String city = scanner.nextLine();

        OkHttpClient cityClient = new OkHttpClient();
        HttpUrl urlCity = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", "Ae2nhniKbkd5AyBWgyYcYyjOsLEBahu3")
                .addQueryParameter("q", city)
                .addQueryParameter("language", "ru-ru")
                .build();
        Request cityReq = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(urlCity)
                .get()
                .build();

        String jsCityResponse = cityClient.newCall(cityReq).execute().body().string();
        char[] tempArr = jsCityResponse.toCharArray();
        //System.out.println(tempArr);
        char [] chars = new char[6];
        chars[0] = tempArr[21];
        chars[1] = tempArr[22];
        chars[2] = tempArr[23];
        chars[3] = tempArr[24];
        chars[4] = tempArr[25];
        chars[5] = tempArr[26];
        String cityKey = new String(chars);

        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment(cityKey)
                .addQueryParameter("apikey", "Ae2nhniKbkd5AyBWgyYcYyjOsLEBahu3")
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();
        Request weatherReq = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .get()
                .build();

        String jsonResponse = client.newCall(weatherReq).execute().body().string();
        System.out.println(jsonResponse);

        ObjectMapper newObM = new ObjectMapper();

       // WeatherPar weather = newObM.readValue(jsonResponse, WeatherPar.class);
        JsonNode getWeatherDate = newObM
               .readTree(jsonResponse)
               .at("/Headline/EffectiveDate");
        JsonNode getMinTemp = newObM
                .readTree(jsonResponse)
                .at("/DailyForecasts/Temperature/Maximum/Value");                ;

        JsonNode getMaxTemp = newObM
                .readTree(jsonResponse)
                .at("/DailyForecasts/Temperature/Maximum/Value");

        JsonNode getWeatherText = newObM
                .readTree(jsonResponse)
                .at("/Headline/Text");
        for (int i = 0; i<5; i++){
                System.out.println("В городе " + city +
                        " на дату " + getWeatherDate.asText() +
                        " \n " + getWeatherText +
                        " \nтемпература от " + getMinTemp.asText() + "С до " + getMaxTemp.asText() + "C");   }

        //System.out.println(weather.getHeadline().getText()+weather.getHeadline().getCategory()+weather.getDailyForecasts());


}
}
