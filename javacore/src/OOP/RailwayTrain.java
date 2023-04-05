package OOP;

public class RailwayTrain extends Vehicle{
    private static final double V = 40;
    @Override
    public double time(double s) {
        return s/V;
    }
}
