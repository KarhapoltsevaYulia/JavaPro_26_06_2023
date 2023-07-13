package hw_3;

public class Burger {
    private  BunType bun;
    private  CheeseType cheese;
    private  GreenType green;
    private  MeatType meat;
    private  int counterMeat;
    private  boolean mayonnaise;
        //diet burger
    public Burger(BunType bun,CheeseType cheese,GreenType green,MeatType meat){
         this.bun = bun;
         this.cheese = cheese;
         this.green = green;
         this.meat = meat;
         this.counterMeat=1;
    }
    //burgerDouble or original
    public Burger(int counterMeat){
        this(BunType.BRANBUN,CheeseType.HARDCHEESE,GreenType.SALAD,MeatType.BEEF);
        this.counterMeat = (counterMeat==2) ? 2 : 1;
        this.mayonnaise=false;
    }
    //burgerDouble or original
    public Burger (int counterMeat, boolean mayonnaise){
        this(BunType.WHEATBUN,CheeseType.MILKCHEESE,GreenType.GREENERY,MeatType.PORK);
        this.counterMeat = (counterMeat==2) ? 2 : 1;
        this.mayonnaise=true;
    }
        //burger oll
    public Burger(BunType bun, CheeseType cheese, GreenType green, MeatType meat,int counterMeat, boolean mayonnaise){
        this.bun = bun;
        this.cheese = cheese;
        this.green = green;
        this.meat = meat;
        this.counterMeat = counterMeat;
        this.mayonnaise = mayonnaise;
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

