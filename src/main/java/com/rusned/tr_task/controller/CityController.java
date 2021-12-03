package com.rusned.tr_task.controller;

import com.rusned.tr_task.domain.CityEntity;
import com.rusned.tr_task.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    private static final Logger logger= LoggerFactory.getLogger(CityController.class);
    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService){
        this.cityService = cityService;
    }

    @GetMapping()
    public ResponseEntity<List<CityEntity>> findAll(){
        return ResponseEntity.ok(cityService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CityEntity> findById(@PathVariable(value = "id") Long id){
        logger.info("Request to /cities/{id} endpoint (get method) passed");
        return ResponseEntity.ok(cityService.findById(id));
    }

    @PostMapping
    public ResponseEntity<CityEntity> create(@RequestBody CityEntity cityEntity){
        CityEntity cityEntityCreated = cityService.create(cityEntity);
        return ResponseEntity.ok(cityEntityCreated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable(value = "id") Long id){
        cityService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<CityEntity> update(@PathVariable(value = "id") Long id,
                                             @RequestBody CityEntity cityEntity){
        return ResponseEntity.ok(cityService.update(id, cityEntity));
    }
}
