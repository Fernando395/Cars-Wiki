package org.example.cars_wiki.controller;

import org.example.cars_wiki.dto.CreateCarDto;
import org.example.cars_wiki.dto.PartialUpdateCarDto;
import org.example.cars_wiki.model.Car;
import org.example.cars_wiki.repository.DataBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CarController {

    @Autowired
    private DataBaseRepository dataBaseRepository;

    @GetMapping(path = "/car")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public @ResponseBody
    Iterable<Car> findCars() {
        return dataBaseRepository.findAll();
    }

    @GetMapping(path = "/car/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Car> findCarById(@PathVariable int id) {
        return dataBaseRepository.findById(id);
    }

    @DeleteMapping(path = "/car/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCar(@PathVariable int id) {
        dataBaseRepository.deleteById(id);
    }

    @PostMapping(path = "/car")
    @ResponseStatus(HttpStatus.CREATED)
    public Car createCar(@RequestBody CreateCarDto carDto) {
        Car car = new Car(carDto);
        return dataBaseRepository.save(car);
    }

    /*PutMapping(path = "/car/{id}")
    public Car UpdateCar(@RequestBody CreateCarDto updateCarDto, @PathVariable int id) {
        Optional<Car> car = dataBaseRepository.findById(id);
        return car.updateFromDto(updateCarDto);
    }

    @PatchMapping(path = "/car/{id}")
    public Car PartialUpdateCar(@RequestBody PartialUpdateCarDto dto, @PathVariable int id) {
        Optional<Car> car = dataBaseRepository.findById(id);
        return car.partialUpdateFromDto(dto);
    }*/
}
