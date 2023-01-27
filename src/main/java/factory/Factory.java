package factory;

import factory.cars.BMWModel;
import factory.cars.Car;
import factory.cars.FordModel;

public abstract class Factory {

   abstract Car createBMW(BMWModel bmwModel);

   abstract Car createFord(FordModel fordModel);
}
