package factory.cars;

public abstract class Car {

    private double engineCapacity;
    private FuelType fuelType;
    private int yearOfProduction;
    private WheelPosition wheelPosition;

    protected Car(double engineCapacity, FuelType fuelType, int yearOfProduction,WheelPosition wheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.wheelPosition = wheelPosition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType=" + fuelType +
                ", yearOfProduction=" + yearOfProduction +
                ", wheelPosition=" + wheelPosition +
                '}';
    }
}
