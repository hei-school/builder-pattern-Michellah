package org.example;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }
    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(Integer number) {
        this.car.setNumberOfSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        this.car.setHasTripComputer(true);
    }

    @Override
    public void setGPS() {
        this.car.setHasGPS(true);
    }


    public Car getResult() {
        return this.car;
    }
}
