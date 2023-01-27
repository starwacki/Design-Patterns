package factory;

import factory.cars.*;

public class RightSteeringWheelCarFactory extends Factory {


    @Override
    public Car createBMW(BMWModel bmwModel) {
        Car car;
        switch (bmwModel) {
            case E46 -> car = new BMW(100, FuelType.BENZINE,2010,WheelPosition.RIGHT);
            case X5 -> car = new BMW(200,FuelType.BENZINE,2015,WheelPosition.RIGHT);
            case E92 -> car = new BMW(90,FuelType.BENZINE,2015,WheelPosition.RIGHT);
            default -> throw new IllegalArgumentException();
        }
        return car;
    }

    @Override
    public Car createFord(FordModel fordModel) {
        Car car;
        switch (fordModel) {
            case FOCUS -> car = new Ford(120,FuelType.GAS,2010,WheelPosition.RIGHT);
            case MUSTANG -> car = new BMW(300,FuelType.BENZINE,2015,WheelPosition.RIGHT);
            default -> throw new IllegalArgumentException();
        }
        return car;
    }
}
