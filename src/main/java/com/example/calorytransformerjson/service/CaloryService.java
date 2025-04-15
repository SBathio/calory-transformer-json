package com.example.calorytransformerjson.service;

import com.example.calorytransformerjson.model.Welcome;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;

@Service
public class CaloryService {

    public List<Welcome> loadFromFile() {
        try {
            InputStream is = new ClassPathResource("calories.json").getInputStream();
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            return mapper.readValue(is, new TypeReference<>() {});
        } catch (Exception e) {
            throw new RuntimeException("Failed to load calories.json", e);
        }
    }


//    public String postToTarget(List<Welcome> transformed) {
//        // Simulate posting: log or validate output
//        System.out.println("POSTING transformed data:");
//        transformed.forEach(System.out::println);
//        return "Data successfully posted (simulated)";
//    }

    public String postToTarget(List<Welcome> rawData) {
        List<Welcome> transformed = transformHighDensityMeals(rawData);

        System.out.println("=== POSTING Top 5 Calorie-Dense Meals ===");
        transformed.forEach(System.out::println);

        return "Top 5 high-calorie meals successfully processed.";
    }




    public List<Welcome> transformHighDensityMeals(List<Welcome> input) {
        return input.stream()
                .filter(w -> w.getCalories() > 250 && w.getWeight() > 0)
                .peek(w -> {
                    double density = (w.getCalories() * 100.0) / w.getWeight();
                    w.setCaloriesPer100g(Math.round(density * 100.0) / 100.0); // round to 2 decimal places
                })
                .sorted(Comparator.comparingDouble(Welcome::getCaloriesPer100g).reversed())
                .limit(5)
                .toList();
    }

}
