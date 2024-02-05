public class main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);
        Car car = carBuilder.getResult();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.makeSUV(manualBuilder);
        Manual manual = manualBuilder.getResult();


        System.out.println("Car details: " + car);
        System.out.println("Manual details: " + manual);
    }
}
