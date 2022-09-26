package SxthLesson;

import okhttp3.*;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {

        OkHttpClient weatherClient = new OkHttpClient()
            .newBuilder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .followRedirects(true)
            .retryOnConnectionFailure(true)
            .build();
    /*String apikey = "HASr4SqQSzOMiZv0n24YAHbnGKOu50zr";
    String sPb = "295212";
    String gldzh = "288685";
    String queryParamsStr = "{" +
            "\"apkiey\": \"HASr4SqQSzOMiZv0n24YAHbnGKOu50zr\", " +
            "\"language\": \"ru-ru\", " + "\"metric\": \"true\"" +
            "}";
    RequestBody queryParams = RequestBody.create(queryParamsStr, MediaType.parse("application/json"));
*/
    Request weatherReq = new Request.Builder()
            .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=HASr4SqQSzOMiZv0n24YAHbnGKOu50zr&language=ru-ru&metric=true")
            .get()
            .build();

    Response response = weatherClient.newCall(weatherReq).execute();
        System.out.println("Заголовок ответа: "+response.headers());
        System.out.println("Погода в Санкт-Петербурге на 5 дней: "+response.body().string());


    }
}
