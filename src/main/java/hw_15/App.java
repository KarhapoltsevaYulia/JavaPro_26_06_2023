package hw_15;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Animal[] animalWild ={
                new Animal(Animal.AnimalWild.KOALA),
                new Animal(Animal.AnimalWild.ARA),
                new Animal(Animal.AnimalWild.BUFFALO),
                new Animal(Animal.AnimalWild.PELICANS),
                new Animal(Animal.AnimalWild.RHINOCEROS),
        };
        Animal[] pets ={
                new Animal(Animal.Pets.DONKEYS),
                new Animal(Animal.Pets.GOATS),
                new Animal(Animal.Pets.PIGS),
                new Animal(Animal.Pets.SHEEP),
                new Animal(Animal.Pets.HORSES),
        };
        List<Animal.Pets> petsList = List.of(Animal.Pets.DONKEYS,Animal.Pets.GOATS,
                Animal.Pets.PIGS,Animal.Pets.SHEEP,Animal.Pets.HORSES,
                Animal.Pets.PIGS,Animal.Pets.SHEEP,Animal.Pets.HORSES,
                Animal.Pets.PIGS,Animal.Pets.SHEEP,Animal.Pets.HORSES);
        List<Animal.AnimalWild> wildList = List.of(Animal.AnimalWild.KOALA,Animal.AnimalWild.ARA,
                Animal.AnimalWild.BUFFALO,Animal.AnimalWild.KOALA,Animal.AnimalWild.KOALA);

        System.out.println(Animal.findAnimalMostLegsPets(petsList));
        System.out.println(Animal.findAnimalMostLegsAnimal(wildList));
//        System.out.println(Animal.randomAnimalPets(20,petsList));
//        System.out.println(Animal.randomAnimalWild(100, wildList));
        System.out.println(Animal.getRandomAnimal(100, wildList));
    }
}
    
