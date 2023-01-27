package factory;

import factory.cars.BMWModel;
import factory.cars.Car;
import factory.cars.FordModel;

public class AppFactory {
    public static void main(String[] args) {
        Factory factoryOfLeftSteeringWheelCar = new LeftSteeringWheelCarFactory();
        Factory factoryRightSteeringWheelCar = new RightSteeringWheelCarFactory();

        Car car = factoryRightSteeringWheelCar.createBMW(BMWModel.E92);
        Car car2 = factoryOfLeftSteeringWheelCar.createFord(FordModel.FOCUS);

        System.out.println(car.toString());
        System.out.println(car2.toString());


    }
}
