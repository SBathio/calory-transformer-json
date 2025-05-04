package com.example.calorytransformerjson.controller;

import com.example.calorytransformerjson.model.Welcome;
import com.example.calorytransformerjson.service.CaloryService;
import com.example.calorytransformerjson.service.PubSubPublisher;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calories")
public class CaloryController {

    private final CaloryService caloryService;
    private final PubSubPublisher pubSubPublisher;

    public CaloryController(CaloryService caloryService, PubSubPublisher pubSubPublisher) {
        this.caloryService = caloryService;
        this.pubSubPublisher = pubSubPublisher;
    }

    @GetMapping("/source")
    public List<Welcome> getRawData() {
        return caloryService.loadFromFile();
    }

    @PostMapping("/target")
    public ResponseEntity<String> postTransformedData(@RequestBody List<Welcome> data) throws Exception {
        String result = caloryService.postToTarget(data);
        pubSubPublisher.publishMessage(new ObjectMapper().writeValueAsString(data));
        return ResponseEntity.ok(result);
    }
}
