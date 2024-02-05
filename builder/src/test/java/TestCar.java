import org.example.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestCar {
    @Test
    public void TestMakeSUV() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.makeSUV(carBuilder);
        Car car = carBuilder.getResult();

        assertNotNull(car);
    }

    @Test
    public void TestMakeSportsCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.makeSportsCar(carBuilder);
        Car car = carBuilder.getResult();

        assertNotNull(car);
    }

    @Test
    public void TestCarManual() {
        Director director = new Director();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        director.makeSUV(carManualBuilder);
        Manual manual = carManualBuilder.getResult();

        assertNotNull(manual);
    }
}
