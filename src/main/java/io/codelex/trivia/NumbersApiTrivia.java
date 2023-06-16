package io.codelex.trivia;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NumbersApiTrivia {
    private static final String NUMBERS_API_BASE = "http://numbersapi.com/random/trivia?json";

    private CloseableHttpClient httpClient = HttpClients.createDefault();

    public Trivia getTriviaQuestion() throws Exception {
        HttpGet request = new HttpGet(NUMBERS_API_BASE);
        HttpResponse response = httpClient.execute(request);
        String responseString = EntityUtils.toString(response.getEntity());

        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(responseString);
        String fact = (String) json.get("text");
        int number = ((Long) json.get("number")).intValue();

        String triviaQuestion = fact.replaceAll("^\\d+ is", "What number is");
        List<Integer> options = new ArrayList<>();
        Random rand = new Random();
        options.add(number);
        while (options.size() < 4) {
            int option = rand.nextInt(1000) + 1;
            if (option != number && !options.contains(option)) {
                options.add(option);
            }
        }

        Collections.shuffle(options);

        return new Trivia(triviaQuestion, number, options);
    }


    public record Trivia(String question, int answer, List<Integer> options) {
    }
}
