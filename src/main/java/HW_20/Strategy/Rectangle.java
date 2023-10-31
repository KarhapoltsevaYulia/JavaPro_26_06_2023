package HW_20.Strategy;

public class Rectangle implements AreaFiguresStrategy {
    @Override
    public float areaFigures(float a, float b) {
        return a*b;
    }
}
