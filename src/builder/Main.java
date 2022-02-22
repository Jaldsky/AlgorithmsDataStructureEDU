package builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(); //создаем директора для управления сборки
        CarBuilder carBuilder = new CarBuilder(); //создаем строителя для непосредственного строительства

        director.constructCityCar(carBuilder); //приказываем директору построить городсткую машину

        Car car = carBuilder.getResult(); //получаем результат

        System.out.println("Car type " + car.getCarType() +
                           " car seats " + car.getSeats() +
                           " car engine volume " + car.getEngine().getVolueme());
    }
}
