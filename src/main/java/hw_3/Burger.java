package hw_3;

public class Burger {
        private String bun;
        private String meat;
        private String cheese;
        private String green;
        private String mayonnaise;
        private boolean doubleMeat = false;
        private boolean vubor =false;


    public Burger(String bun, String meat, String cheese, String green) {
        this.vubor=true;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.printBurger(bun,meat, cheese, green,null,false);
    }
    public Burger(String bun, String meat, String cheese, String green, String mayonnaise){
        this(bun,meat,cheese,green);
        this.vubor=true;
        this.mayonnaise=mayonnaise;
        this.printBurger(bun,meat, cheese, green,mayonnaise,false);
    }
    public Burger(String bun, String meat, String cheese, String green, String mayonnaise, boolean doubleMeat){
        this(bun,meat,cheese,green,mayonnaise);
        this.vubor=true;
        this.doubleMeat=doubleMeat;
        this.printBurger(bun,meat, cheese, green,mayonnaise,doubleMeat);

    }

    private void printBurger(String bun, String meat, String cheese, String green,String mayonnaise,boolean doubleMeat){



        if (this.doubleMeat) {
            System.out.println("BurgerDoubleMeat: " + this.bun + ", Double" + this.meat +
                    "," + this.cheese + ", " + this.green + ", " + this.mayonnaise);
        }
        if (this.doubleMeat!=true && ) {
        /*else {
            if (this.mayonnaise != null) {
                System.out.println("Burger: " + this.bun + "," + this.meat +
                        "," + this.cheese + ", " + this.green + ", " + this.mayonnaise);
            } else { if (this.mayonnaise==null)
                System.out.println("BurgerDiet: " + this.bun + "," + this.meat +
                        "," + this.cheese + ", " + this.green);

            }
        }*/
        }
        }

