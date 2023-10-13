package hw_15;

import java.util.*;

import static java.util.Objects.nonNull;

public  class Animal {
    static String name;

    public static String getName() {
        return name;
    }

    static AnimalWild animalWild;
    static Pets pets;

    public Animal(AnimalWild animalWild) {
        this.name = animalWild.name();
    }

    public Animal(Pets pets) {
        this.name = pets.name();
    }

    public static Optional<Pets> findAnimalMostLegsPets(List<Pets> list) {
        Objects.requireNonNull(list);
        return list.stream().max(Animal.Pets::getLegs);
    }

    public static Optional<AnimalWild> findAnimalMostLegsAnimal(List<AnimalWild> wildList) {
        Objects.requireNonNull(wildList);
       return wildList.stream().max(Animal.AnimalWild::getLegs);
    }
//    public <T extends Enum<T>> Optional<AnimalWild>  findAnimalMostLegs(List<T> wildList){
//        switch (Animal.getName()){
//            (AnimalWild)-> {
////                Optional<T> max;
////                max = wildList.stream().max( Comparator.comparing(legs ->legs.)
////                       // Animal.AnimalWild::getLegs);
////                return max;
//            }
//
//        }  return null;
//    }
     //public static <T extends Enum<T>> int
    public static <T extends Enum<T>> List<String>  getRandomAnimal (int counter, List<T> enumList){
       Objects.requireNonNull(enumList);
       nonNull(counter);
       return   enumList.stream()
                .map(Enum::name)
                .limit(counter)
                .toList();
        }

   
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public  enum AnimalWild{
        ARA(2),
        RHINOCEROS(4),
        KOALA(4),
        PELICANS(2),
        BUFFALO(4);
        private static  int legs;

        AnimalWild(int legs) { }
        public static int getLegs(AnimalWild animalWild) {
            return legs;
        }

        public static int getLegs(AnimalWild animalWild ,AnimalWild animalWilds  ) {
            return legs;
        }

        public static void getLegs() {
        }
    }
    public  enum Pets{
        HORSES (4),
        DONKEYS(4),
        SHEEP(4),
        GOATS(4),
        PIGS(4);
       private static   int legs;

        Pets(int legs) {
        }

        public int getLegs(Pets pets) {
           return legs;
        }
    }
}
