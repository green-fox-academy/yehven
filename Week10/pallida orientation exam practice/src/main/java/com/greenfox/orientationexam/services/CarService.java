package com.greenfox.orientationexam.services;

import com.greenfox.orientationexam.models.Car;
import com.greenfox.orientationexam.models.Response;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {
  List<Car> getAllCars();
  List<Car> getCarByLicencePlate(String plate, int police, int diplomat);
  List<Car> getCarByBrand(String brand);
  Response restRespoonse(String brand);
  boolean plateValidator(String plate);
}
