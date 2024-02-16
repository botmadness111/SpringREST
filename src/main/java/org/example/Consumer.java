package org.example;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> json = new HashMap<>();
        json.put("name", "morpheus");
        json.put("job", "asdf");

        HttpEntity<Map<String, String>> request = new HttpEntity<>(json);

        String url = "https://reqres.in/\n" +
                "/api/users";
        String response = restTemplate.postForObject(url, request, String.class);

        System.out.println(response);
    }
}
