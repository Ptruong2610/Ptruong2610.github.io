package OOP;

public class Plan extends Vehicle {
    private static final double V = 80;

    @Override
    public double time(double s) {
        return s/V;
    }
}
