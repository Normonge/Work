import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class NMAnimalProject {
    public static void main(String[] args) throws FileNotFoundException {
       Repository repo = new Repository();

         ArrayList<Animal> animals = repo.getAnimals();

        System.out.println("Welcome to the Animal Kingdom!");

        for (Animal animal : animals) {
            System.out.println("The " + animal.getAnimal_name() + " is type " + animal.getClass_type() + "...");
            if(animal.isHair()){
                System.out.println("It has hair");
            }

            if(animal.isTail()){
                System.out.println("It has a tail");
            }

            if(animal.isMilk()){
                System.out.println("It gives milk");
            }

            System.out.println("\t" + "Quote: " + animal.speak());

        }

    }


    //read zoo_animals.csv and return a list of animals



}