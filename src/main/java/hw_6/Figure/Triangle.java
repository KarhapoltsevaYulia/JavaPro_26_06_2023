package hw_6;

public  class Triangle implements BaseGeometricFigure{
    private  double areaTriangle;

    public Triangle(double  catetA, double catetB) {
        this.areaTriangle = areaRectangularPencilCaseTriangle(catetA,catetB);
    }
    public Triangle(double  sideTriangle) {
        this.areaTriangle = areaQuilateralTriangle(sideTriangle);
    }
    public Triangle(double sideTriangleA, double sideTriangleB, double sideTriangleC){
        this.areaTriangle=areaAccordingHeronFormula(sideTriangleA,sideTriangleB,sideTriangleC);
    }
    @Override
    public double areaFigureInt() {
        return this.areaTriangle;
    }
    private double areaRectangularPencilCaseTriangle(double catetA,double catetB){
        if ((catetA>0)&&(catetB>0)){
        return this.areaTriangle= (double) 1/2 * (catetA*catetB);
        }else {
            return 0;
        }
    }

    private double areaQuilateralTriangle(double sideTriangle){
        if (sideTriangle>0){
            return this.areaTriangle = (Math.pow(sideTriangle,2) * Math.sqrt(3))/4;
        } else {
            return 0;
        }
    }
   private double areaAccordingHeronFormula(double sideTriangleA, double sideTriangleB, double sideTriangleC){
        if ((sideTriangleA>0)&&(sideTriangleB>0)&&(sideTriangleC>0)){
            double p = ((sideTriangleA+sideTriangleB+sideTriangleC))/2;
            return this.areaTriangle = Math.sqrt(p*(p-sideTriangleA)*(p-sideTriangleB)*(p-sideTriangleC));
        } else {
            return 0;
        }
    }

    public double getAreaTriangle() {
        return areaTriangle;
    }
}
