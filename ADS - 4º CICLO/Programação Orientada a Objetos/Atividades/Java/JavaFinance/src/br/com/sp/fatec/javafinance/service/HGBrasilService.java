package br.com.sp.fatec.javafinance.service;

import br.com.sp.fatec.javafinance.exception.FinanceException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HGBrasilService {
    private static final String API_URL = "https://api.hgbrasil.com/finance?key=";
    private String apiKey;

    public HGBrasilService(String apiKey) {
        this.apiKey = apiKey;
    }

    public double getPrecoAtual(String symbol) throws FinanceException {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL + apiKey + "&symbol=" + symbol))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new FinanceException("Erro ao consultar API: HTTP " + response.statusCode());
            }

            return parsePrice(response.body(), symbol);
        } catch (Exception e) {
            throw new FinanceException("Falha na comunicação com HG Brasil Finance", e);
        }
    }

    private double parsePrice(String json, String symbol) {
        // Simple manual parsing for demo purposes in "Standard Java" project
        // In a real project, use a library like Jackson or Gson.
        try {
            String searchKey = "\"" + symbol.toUpperCase() + "\":";
            int index = json.indexOf(searchKey);
            if (index == -1) return 0.0;
            
            int priceIndex = json.indexOf("\"price\":", index);
            if (priceIndex == -1) return 0.0;
            
            int start = priceIndex + 8;
            int end = json.indexOf(",", start);
            if (end == -1) end = json.indexOf("}", start);
            
            String priceStr = json.substring(start, end).trim();
            return Double.parseDouble(priceStr);
        } catch (Exception e) {
            return 0.0;
        }
    }
}
