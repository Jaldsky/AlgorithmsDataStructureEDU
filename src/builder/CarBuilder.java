package builder;

public class CarBuilder implements Builder{ //реализуем интерфейс
    private CarType type;
    private int seats;
    private Engine engine;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult(){ //получаем результат
        return new Car (type, seats, engine);
    }
}
