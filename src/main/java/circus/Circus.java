package circus;

import circus.animal.*;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
//        makeAnimalsTalk();
//        System.out.println("Total value of animals " + calculateAssetValue(animals));
//        System.out.println("Total value of equipments " + calculateAssetValue(equipments));
        System.out.println("Number of animals: " + animals.length);
//        animals[2] = new Tiger("Sherkhan");
//        makeAnimalsTalk();
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        animalArrayList.add(new Tiger("Sharkhan"));
        System.out.println("Number of animals: " + animalArrayList.size());

        animalArrayList.add(new Parrot("Dplly"));
        Duck louis = new Duck("louis");
        animalArrayList.add(louis);
        Elephant strongOne = new Elephant("StrongOne");
        animalArrayList.add(strongOne);

        printAllAnimal(animalArrayList);
        System.out.println("Louis's position is: " + animalArrayList.indexOf(louis));
        animalArrayList.sort(Animal.AnimalNameComparator);
        System.out.println();
        printAllAnimal(animalArrayList);
        System.out.println("Louis's position is: " + animalArrayList.indexOf(louis));

        System.out.println(Arrays.toString(animals));
    }

    private static void printAllAnimal(ArrayList<Animal> animalArrayList) {
        for (Animal a : animalArrayList) {
            System.out.println(a);
        }
    }
}
