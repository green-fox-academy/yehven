package com.greenfox.orientationexam.repositories;

import com.greenfox.orientationexam.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, String> {
  List<Car> findAllByPlateContaining(String plate);
  List<Car> findAllByPlateStartsWith(String specialPlate);
  List<Car> findAllByCarBrand(String brand);
}
