package com.sampledb.controller;

import com.sampledb.domain.Data;
import com.sampledb.service.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JsonProcessorController {

    private DataService dataService;

    public JsonProcessorController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/list")
    public Iterable<Data> list() {
        return dataService.list();
    }

}
