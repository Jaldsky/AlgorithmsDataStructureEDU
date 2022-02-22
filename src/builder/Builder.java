package builder;

public interface Builder { //интерфейс сборщика
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
}
