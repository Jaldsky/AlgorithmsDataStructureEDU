package builder;

public class Engine { //класс с парамметрами двигателя и его геттерами
    private final int volueme;
    private final int milerage;

    public Engine(int volueme, int milerage){
        this.volueme = volueme;
        this.milerage = milerage;
    }

    public int getVolueme() {
        return volueme;
    }

    public int getMilerage() {
        return milerage;
    }
}
