package hw_3;

public class BurgerMain {
    public static void main(String[] args) {

        Burger burgerOll = new Burger(null,null,null, null,8,false);
        Burger burgerDiet = new Burger(Burger.BunType.WHEATBUN, Burger.CheeseType.MILKCHEESE,
                Burger.GreenType.GREENERY, Burger.MeatType.CHICKEN);
        Burger burgerRegular = new Burger(1);
        Burger burgerRegular2 = new Burger(1,true);
        Burger burgerDouble = new Burger(2,true);

        System.out.println(burgerOll.toString());
        System.out.println(burgerDiet.toString());
        System.out.println(burgerRegular.toString());
        System.out.println(burgerRegular2.toString());
        System.out.println(burgerDouble.toString());
    }
}
