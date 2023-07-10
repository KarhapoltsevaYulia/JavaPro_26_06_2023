package hw_3;

public class BurgerMain {
    public static void main(String[] args) {

        Burger burger = new Burger("Bun","Meat","Chesse","Salute","Mayonnaise");
        Burger burgerDiet = new Burger("Bun","Meat","Chesse","Salute");
        Burger burgerMeat = new Burger("Bun","Meat","Chesse","Salute",
              "Mayonnaise",true);
    }
}
