package builder;

public class Car { //класс машина со всеми парамметрами и геттерами
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final double fuel = 0;

    public Car(CarType carType, int seats, Engine engine) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getFuel() {
        return fuel;
    }
}
