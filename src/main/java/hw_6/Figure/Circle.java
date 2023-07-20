package hw_6;

public class Circle implements BaseGeometricFigure {
    private   double areaCircle;

    public Circle(double radius) {
        this.areaCircle = areaCircleR(radius);
    }

    private   double areaCircleR(double radius){
        if (radius>0) {
            return this.areaCircle= Math.PI* Math.pow(radius,2);
        } else return 0;
    }

    @Override
    public double areaFigureInt() {
        return this.areaCircle;
    }
    public double getAreaCircle() {
        return areaCircle;
    }
}
