package org.example.cars_wiki.exceptions;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(int id) {
        super("Car not found " + id);
    }
}

