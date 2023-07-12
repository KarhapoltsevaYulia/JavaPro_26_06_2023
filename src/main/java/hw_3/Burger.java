package hw_3;

public class Burger {
        private BunType bun;
        private CheeseType cheese;
        private GreenType green;
        private MeatType meat;
        private int counterMeat;
        private boolean mayonnaise;

    public Burger() {
        this.bun = bun.WHEATBUN;
        this.cheese = cheese.MILKCHEESE;
        this.green = green.GREENERY;
    }
    public Burger(MeatType meat, int counterMeat,boolean mayonnaise){
        this();
        this.meat = meat.BEEF;
        this.counterMeat=2;
        this.mayonnaise= true;
    }
    public Burger(MeatType meat, int counterMeat){
        this();
        this.meat = meat.CHICKEN;
        this.counterMeat=1;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun=" + this.bun +
                ", cheese=" + this.cheese +
                ", green=" + this.green +
                ", meat=" + this.meat +
                ", counterMeat=" + this.counterMeat +
                ", mayonnaise=" + this.mayonnaise +
                '}';
    }

    public enum BunType {
        WHEATBUN,
        BRANBUN;
    }
    public enum CheeseType {
        MILKCHEESE,
        HARDCHEESE
    }
    public enum GreenType {
        SALAD,
        GREENERY
    }
    public enum MeatType {
        CHICKEN,
        PORK,
        BEEF
    }
}

