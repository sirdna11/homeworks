package io.codelex.task;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.codelex.task.RatesResponse;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        RatesResponse resp = mapper.readValue(new URL("https://api.exchangerate.host/latest"), RatesResponse.class);

        // read currency and amount from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the currency to convert to: ");
        String currency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the amount in Euros: ");
        BigDecimal amountInEuros = scanner.nextBigDecimal();

        // calculate converted amount
        BigDecimal conversionRate = resp.getRates().get(currency);
        BigDecimal convertedAmount = amountInEuros.multiply(conversionRate);

        // round to 2 decimal places
        BigDecimal roundedAmount = convertedAmount.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Converted amount in " + currency + ": " + roundedAmount);
    }
}
