package com.example.calorytransformerjson.controller;

import com.example.calorytransformerjson.model.Welcome;
import com.example.calorytransformerjson.service.CaloryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calories")
public class CaloryController {

    private final CaloryService caloryService;

    public CaloryController(CaloryService caloryService) {
        this.caloryService = caloryService;
    }

    @GetMapping("/source")
    public List<Welcome> getRawData() {
        return caloryService.loadFromFile();
    }

    @PostMapping("/target")
    public ResponseEntity<String> postTransformedData(@RequestBody List<Welcome> data) {
        String result = caloryService.postToTarget(data);
        return ResponseEntity.ok(result);
    }
}
