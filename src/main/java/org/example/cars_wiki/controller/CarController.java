package org.example.cars_wiki.controller;

import org.example.cars_wiki.dto.CreateCarDto;
import org.example.cars_wiki.dto.PartialUpdateCarDto;
import org.example.cars_wiki.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarController {

    @Autowired
    private DataBaseRepository dataBaseRepository;

    @GetMapping(path = "/car")
    public @ResponseBody
    Iterable<Car> findCars() {
        return dataBaseRepository.findAll();
    }

    @GetMapping("/car/{id}")
    public Car findCarById(@PathVariable int id) {
        return findCarById(id);
    }

    @DeleteMapping("/car/{id}")
    public void deleteCar(@PathVariable int id) {
        dataBaseRepository.deleteById(id);
    }

    @PostMapping(path = "/car")
    @ResponseStatus(HttpStatus.CREATED)
    public Car createCar(@RequestBody CreateCarDto carDto) {
        Car car = new Car(carDto);
        return dataBaseRepository.save(car);
    }

    @PutMapping("/car/{id}")
    public Car UpdateCar(@RequestBody CreateCarDto updateCarDto, @PathVariable int id) {
        Car car = findCarById(id);
        return car.updateFromDto(updateCarDto);
    }

    @PatchMapping("/car/{id}")
    public Car PartialUpdateCar(@RequestBody PartialUpdateCarDto dto, @PathVariable int id) {
        Car car = findCarById(id);
        return car.partialUpdateFromDto(dto);
    }
}
