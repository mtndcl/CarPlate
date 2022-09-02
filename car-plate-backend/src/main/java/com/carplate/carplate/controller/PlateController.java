package com.carplate.carplate.controller;


import com.carplate.carplate.Entity.Person;
import com.carplate.carplate.Entity.Plate;
import com.carplate.carplate.result.Result;
import com.carplate.carplate.services.PersonService;
import com.carplate.carplate.services.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "api/plate")
public class PlateController {


    private final PlateService plateService;

    @Autowired
    public PlateController(PlateService plateService) {
        this.plateService = plateService;
    }


    @PostMapping("/addPlate")
    public Result addUser(@RequestBody Plate plate) {

        return plateService.addNewPlate(plate);
    }

    @PostMapping("delete/{id}")
    public void deletePerson(@PathVariable("id") Long id) {

        plateService.deletePlate(id);

    }

    @PostMapping("update/{id}")
    public void updatePerson(@RequestBody Plate plate) {

        plateService.updatePlate(plate);

    }

    @GetMapping("/{id}")
    public Plate getUser(@PathVariable("id") Long id) {


        Plate plate = new Plate();

        return plate;

    }

    @GetMapping("/allPlate")
    public List<Plate> getAllPlate() {
        return plateService.getAllPlate();

    }

}
