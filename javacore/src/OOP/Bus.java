package OOP;

public class Bus extends Vehicle{
    private static final double V = 20;
    @Override
    public double time(double s) {
        return s/V;
    }
}
