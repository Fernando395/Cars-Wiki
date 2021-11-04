package org.example.cars_wiki.repository;

import org.example.cars_wiki.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface DataBaseRepository extends CrudRepository<Car, Integer> {
}
