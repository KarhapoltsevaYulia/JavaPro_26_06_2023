package hw_4;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

       Cat catBarsik = new Cat("Barsik");
       Cat catSnechok = new Cat("Snezhok");
       Dog dogBarsik = new Dog("Barsik");
       Dog dogSnechok = new Dog("Snezhok");

       catSnechok.runningInt(150);
       catSnechok.runningInt(200);
       catSnechok.runningInt(300);
       dogSnechok.swimableInt(300);
       dogSnechok.swimableInt(600);

       System.out.println("Cat create: "+ Cat.getCounterCat());
       System.out.println("Dog create: "+ Dog.getCounterDog());

       int partisipant = Cat.getCounterCat()+Dog.getCounterDog();
       System.out.println("Partisipant create: "+ partisipant);

   }
}

