package com.rusned.tr_task.controller;

import com.rusned.tr_task.entity.City;
import com.rusned.tr_task.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService){
        this.cityService = cityService;
    }

    @GetMapping()
    public ResponseEntity<List<City>> findAll(){
        return new ResponseEntity<>(
                cityService.findAll(),
                HttpStatus.OK
        );
    }
}
