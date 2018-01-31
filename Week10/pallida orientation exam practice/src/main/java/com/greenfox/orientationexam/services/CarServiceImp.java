package com.greenfox.orientationexam.services;

import com.greenfox.orientationexam.models.Car;
import com.greenfox.orientationexam.models.Response;
import com.greenfox.orientationexam.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
  @Autowired
  CarRepository carRepository;

  @Override
  public List<Car> getAllCars() {
    return (List<Car>) carRepository.findAll();
  }

  @Override
  public List<Car> getCarByLicencePlate(String plate,int police,int diplomat) {
    if (police==(1)) {
      return carRepository.findAllByPlateStartsWith("RB");
    }
    else if (diplomat==1) {
      return carRepository.findAllByPlateStartsWith("DT");
    }
    return carRepository.findAllByPlateContaining(plate);
  }

  @Override
  public List<Car> getCarByBrand(String brand) {
    return carRepository.findAllByCarBrand(brand);
  }

  @Override
  public Response restRespoonse(String brand) {
    Response response = new Response();
    response.setResult("ok");
    response.setData(carRepository.findAllByCarBrand(brand));
    return response;
  }

  @Override
  public boolean plateValidator(String plate) {
    ArrayList<Character> validCharacters = new ArrayList<Character>(Arrays.asList('-','0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
    if (plate.length() <= 7 && carRepository.findAllByPlateContaining(plate) != null) {
      for (int j = 0; j < plate.length(); j++) {
        if (!validCharacters.contains(plate.charAt(j))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
}
