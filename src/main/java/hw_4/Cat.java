package hw_4;

public class Cat extends Animals implements Runnable {
    // кіт біг 200 метрів,  не вміє плавати
    private static final int maxCatRun = 200;
    private static int counterCat;

    public Cat(String name) {
        super(name);
        counterCat++;
    }
    public static int getCounterCat() {
        return counterCat;
    }
    @Override
    public void runningInt(int lengthObstacles){
        System.out.println(this.name +" пробіг "+сapacityСheckRunInt(lengthObstacles,maxCatRun,this.name)+" метрів");
    }
}
