package com.carplate.carplate.repository;

import com.carplate.carplate.Entity.Person;
import com.carplate.carplate.Entity.Plate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlateRepository  extends JpaRepository<Plate,Long> {
}
