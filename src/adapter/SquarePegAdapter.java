package adapter;

public class SquarePegAdapter extends RoundPeg { //наследуемся
    private SqarePeg peg;

    public SquarePegAdapter(SqarePeg peg) {
        this.peg = peg;
    }

    @Override //переопределяем метод
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
