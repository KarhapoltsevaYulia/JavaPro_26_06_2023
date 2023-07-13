package hw_4;

public class Dog extends Animals implements Runnable,Swimable {
    // собака біг 500 метрів, пливе 10 метрів
    private static final int maxDogRun = 200;
    private static final int maxDogSwim = 10;
    private static int counterDog;

    public Dog(String name) {
        super(name);
        counterDog++;
    }
    public static int getCounterDog() {
        return counterDog;
    }
    @Override
    public void runningInt(int lengthObstacles){
        System.out.println(this.name +" пробіг "+сapacityСheckRunInt(lengthObstacles, maxDogRun,this.name)+" метрів");
    }
    @Override
    public void swimableInt(int lengthObstacles){
        System.out.println(this.name +" проплив "+сapacityСheckSwimInt(lengthObstacles, maxDogSwim,this.name)+" метрів");
    }
}
