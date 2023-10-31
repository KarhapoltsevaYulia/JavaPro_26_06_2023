package HW_20.Strategy;

public class Triangle implements AreaFiguresStrategy  {
    @Override
    public float areaFigures(float a, float b) {
        //S = (a · h)/2 триугольник
        return (a*b)/2;
    }
}
