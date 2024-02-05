public class Director {
    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new Engine("SUV", 200));
        builder.setTripComputer();
        builder.setGPS();
    }

    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new Engine("sports", 300));
        builder.setTripComputer();
        builder.setGPS();
    }
}
