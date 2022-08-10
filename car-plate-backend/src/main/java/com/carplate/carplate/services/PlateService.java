package com.carplate.carplate.services;


import com.carplate.carplate.Entity.Person;
import com.carplate.carplate.Entity.Plate;
import com.carplate.carplate.repository.PersonRepository;
import com.carplate.carplate.repository.PlateRepository;
import com.carplate.carplate.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlateService   {


    private final PlateRepository plateRepository;

    @Autowired
    public PlateService(PlateRepository plateRepository) {
        this.plateRepository = plateRepository;
    }
    public Result addNewPlate(Plate plate){

        Result result=new Result();
        plateRepository.saveAndFlush(plate);
        result.setMessage("Plate added successfully");
        result.setResult(true);

        return  result;
    }


    public void deletePlate(Long id) {

        plateRepository.deleteById(id);
    }

    public void updatePlate(Plate plate) {
        Optional<Plate> plateExist=plateRepository.findById(plate.getId());
        if (plateExist.isPresent()){


        }

    }
}
