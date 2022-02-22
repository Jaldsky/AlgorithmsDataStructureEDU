package builder;

public class Director {
    public void constructCityCar(Builder builder){ //строительство городской машины
        builder.setCarType(CarType.CITY_CAR);
        builder.setEngine(new Engine(1, 0));
        builder.setSeats(4);
    }

    public void constructSportCar(Builder builder){ //строительство спортивной машины
        builder.setCarType(CarType.SPOR_CAR);
        builder.setEngine(new Engine(4, 0));
        builder.setSeats(2);
    }

    public void constructTruck (Builder builder){ //строительство грузовой машины
        builder.setCarType(CarType.TRUCK_CAR);
        builder.setEngine(new Engine(6, 0));
        builder.setSeats(2);
    }
}
