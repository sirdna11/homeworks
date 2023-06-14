package io.codelex.task;


import java.math.BigDecimal;
import java.util.Map;

public class RatesResponse {
    private Map<String, BigDecimal> rates;

    public RatesResponse(Map<String, BigDecimal> rates) {
        this.rates = rates;
    }

    public RatesResponse() {
    }

    public Map<String, BigDecimal> getRates() {
        return rates;
    }

    public void setRates(Map<String, BigDecimal> rates) {
        this.rates = rates;
    }
}
