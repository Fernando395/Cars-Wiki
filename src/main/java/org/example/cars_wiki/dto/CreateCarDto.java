package org.example.cars_wiki.dto;

public class CreateCarDto {

    private String name;
    private String image;
    private double fipeTable;
    private String story;
    private String engine;
    private String fuel;
    private int horsePower;
    private double torque;
    private String topSpeed;
    private String acceleration;
    private String exchange;
    private String traction;
    private String suspension;
    private String brakes;

    public CreateCarDto(String name, String image, double fipeTable, String story, String engine, String fuel, int horsePower, double torque, String topSpeed, String acceleration, String exchange, String traction, String suspension, String brakes) {
        this.name = name;
        this.image = image;
        this.fipeTable = fipeTable;
        this.story = story;
        this.engine = engine;
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.torque = torque;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.exchange = exchange;
        this.traction = traction;
        this.suspension = suspension;
        this.brakes = brakes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getFipeTable() {
        return fipeTable;
    }

    public void setFipeTable(double fipeTable) {
        this.fipeTable = fipeTable;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getTraction() {
        return traction;
    }

    public void setTraction(String traction) {
        this.traction = traction;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String getBrakes() {
        return brakes;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }
}
