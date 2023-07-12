package hw_3;

public class BurgerMain {
    public static void main(String[] args) {

        Burger burger = new Burger(Burger.MeatType.BEEF,1);
        Burger burgerDouble = new Burger(Burger.MeatType.CHICKEN,2,true);
        Burger burgerDiet = new Burger();

        System.out.println(burger.toString());
        System.out.println(burgerDouble.toString());
        System.out.println(burgerDiet.toString());
    }
}
