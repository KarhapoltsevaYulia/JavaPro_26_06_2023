package hw_3;

public class Burger {
        private String bun;
        private String meat;
        private String cheese;
        private String green;
        private String mayonnaise;
        private boolean doubleMeat = false;

        public Burger(String bun, String meat, String cheese, String green, String mayonnaise) {
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.green = green;
            this.mayonnaise = mayonnaise;
            this.printRegularBurger(this.bun, this.meat, this.cheese, this.green, this.mayonnaise);
        }

        public Burger(String bun, String meat, String cheese, String green) {
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.green = green;
            this.printDietBurger(this.bun, this.meat, this.cheese, this.green);
        }

        public Burger(String bun, boolean doubleMeat,String meat, String cheese, String green, String mayonnaise) {
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.green = green;
            this.mayonnaise = mayonnaise;
            this.doubleMeat = doubleMeat;
            this.printBurgerDoubleMeat(this.bun,this.doubleMeat, this.meat, this.cheese, this.green, this.mayonnaise);
        }

        private void printBurgerDoubleMeat(String bun, boolean doubleMeat,String meat,
                                           String cheese, String green, String mayonnaise){

            if (this.doubleMeat){
                System.out.println("BurgerDoubleMeat: "+ this.bun + ", Double" + this.meat +
                        "," + this.cheese+", "+this.green+", "+this.mayonnaise);

            }
        }

        private void printDietBurger(String bun, String meat, String cheese, String green) {

            System.out.println("DietBurger: "+ this.bun + ", "+ this.meat + ","
                    + this.cheese+", "+this.green);
        }

        private void printRegularBurger(String bun, String meat, String cheese, String green, String mayonnaise) {

            System.out.println("RegularBurger: "+ this.bun + ", "+ this.meat + ","
                    + this.cheese+", "+this.green+", "+this.mayonnaise);
        }
    }
