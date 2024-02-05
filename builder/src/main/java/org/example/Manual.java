package org.example;

public class Manual {
    private boolean hasGPS;
    private boolean hasTripComputer;
    private int numberOfSeats;
    private Engine engine;

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public void setHasTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Manual{" +
                "hasGPS=" + hasGPS +
                ", hasTripComputer=" + hasTripComputer +
                ", numberOfSeats=" + numberOfSeats +
                ", engine=" + engine +
                '}';
    }

}
