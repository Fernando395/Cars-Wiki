package org.example.cars_wiki.dto;

import org.openapitools.jackson.nullable.JsonNullable;

public class PartialUpdateCarDto {

    private final JsonNullable<String> image = JsonNullable.undefined();
    private final JsonNullable<String> name = JsonNullable.undefined();
    private final JsonNullable<Double> fipeTable = JsonNullable.undefined();
    private final JsonNullable<String> story = JsonNullable.undefined();
    private final JsonNullable<String> engine = JsonNullable.undefined();
    private final JsonNullable<String> fuel = JsonNullable.undefined();
    private final JsonNullable<Integer> horsePower = JsonNullable.undefined();
    private final JsonNullable<Double> torque = JsonNullable.undefined();
    private final JsonNullable<String> topSpeed = JsonNullable.undefined();
    private final JsonNullable<String> acceleration = JsonNullable.undefined();
    private final JsonNullable<String> exchange = JsonNullable.undefined();
    private final JsonNullable<String> traction = JsonNullable.undefined();
    private final JsonNullable<String> suspension = JsonNullable.undefined();
    private final JsonNullable<String> brakes = JsonNullable.undefined();

    @Deprecated
    public PartialUpdateCarDto() {
    }

    public JsonNullable<String> getImage() {
        return image;
    }

    public JsonNullable<String> getName() {
        return name;
    }

    public JsonNullable<Double> getFipeTable() {
        return fipeTable;
    }

    public JsonNullable<String> getStory() {
        return story;
    }

    public JsonNullable<String> getEngine() {
        return engine;
    }

    public JsonNullable<String> getExchange() {
        return exchange;
    }

    public JsonNullable<Double> getTorque() {
        return torque;
    }

    public JsonNullable<String> getAcceleration() {
        return acceleration;
    }

    public JsonNullable<String> getBrakes() {
        return brakes;
    }

    public JsonNullable<Integer> getHorsePower() {
        return horsePower;
    }

    public JsonNullable<String> getFuel() {
        return fuel;
    }

    public JsonNullable<String> getSuspension() {
        return suspension;
    }

    public JsonNullable<String> getTopSpeed() {
        return topSpeed;
    }

    public JsonNullable<String> getTraction() {
        return traction;
    }
}


