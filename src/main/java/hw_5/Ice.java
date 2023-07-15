package hw_5;

    public class Ice {
        private final MilkType milk;
        private final CreamType cream;
        private final ButterType butter;
        private final SugarType sugar;
        private final FruitsType fruits;
        private final BerriesType berries;

        private Ice(MilkType milk, CreamType cream,
                   ButterType butter, SugarType sugar,
                   FruitsType fruits, BerriesType berries) {
            this.milk = milk;
            this.cream = cream;
            this.butter = butter;
            this.sugar = sugar;
            this.fruits = fruits;
            this.berries = berries;
        }
        public static IceBuilder builder(MilkType milk,CreamType cream,ButterType butter,SugarType sugar){
            if ((milk==null)||(cream==null)||(butter==null)||(sugar==null)){
                throw new IllegalArgumentException("MilkType, CreamType,ButterType,SugarType this fields must be defined");
            }
            return new IceBuilder(milk, cream, butter, sugar);
        }

        public MilkType getMilk() {
            return milk;
        }

        public CreamType getCream() {
            return cream;
        }

        public ButterType getButter() {
            return butter;
        }

        public SugarType getSugar() {
            return sugar;
        }

        public FruitsType getFruits() {
            return fruits;
        }

        public BerriesType getBerries() {
            return berries;
        }

        @Override
        public String toString() {
            return "MyIce{" +
                    "milk=" + milk +
                    ", cream=" + cream +
                    ", butter=" + butter +
                    ", sugar=" + sugar +
                    ", fruits=" + fruits +
                    ", berries=" + berries +
                    '}';
        }

        public static class IceBuilder{
            private final MilkType milk;
            private final CreamType cream;
            private final ButterType butter;
            private final SugarType sugar;
            private  FruitsType fruits;
            private  BerriesType berries;
            public Ice build(){
                return new Ice (
                        this.milk,
                        this.cream,
                        this.butter,
                        this.sugar,
                        this.fruits,
                        this.berries);
            }

            public IceBuilder(MilkType milk, CreamType cream, ButterType butter, SugarType sugar) {
                this.milk = milk;
                this.cream = cream;
                this.butter = butter;
                this.sugar = sugar;
            }

            public IceBuilder fruits(FruitsType fruits) {
                this.fruits = fruits;
                return this;
            }

            public IceBuilder berries(BerriesType berries) {
                this.berries = berries;
                return this;
            }
        }

        public enum MilkType {
            COWS,
            ALMOND,
            COCONUT
        }
        public enum CreamType {
            LACTOSEFREE,
            VEGETABLE,
            PLAIN
        }
        public enum ButterType {
            BUTTER_67,
            BUTTER_78
        }
        public enum SugarType {
            REEDY,
            BEET,
            MAPLE
        }
        public enum FruitsType {
            BANANAS,
            KIWI,
            ORANGES,
            STRAWBERRIES
        }
        public enum BerriesType {
            CURRANT,
            BILBERRY
        }
    }

/*Моро́зиво (зах. також льоди́) — заморожений десерт,
що виробляють переважно з молока, вершків, масла, цукру
з додаванням смакових та запахових речовин, туди ще добавляють різні фрукти та ягоди.

Морозиво може бути також фруктовим (на основі соку і м'якоті фруктів і ягід). Таке морозиво називають «сорбет».*/

