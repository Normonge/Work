import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class NMAnimalProject {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "zoo_animals.csv";
        ArrayList<Animal> animals= readAnimals(fileName);

        for (Animal animal : animals) {
            System.out.println(animal.getAnimal_name() + " " +  animal.getLegs());
        }

    }


    //read zoo_animals.csv and return a list of animals
    public static ArrayList<Animal> readAnimals(String filename) throws FileNotFoundException {
        ArrayList<Animal> animals = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] values = line.split(",");
            String animal_name = values[0];
            int legs = Integer.parseInt(values[9]);
            boolean hair = Boolean.parseBoolean(values[2]);
            boolean feathers = Boolean.parseBoolean(values[3]);
            boolean eggs = Boolean.parseBoolean(values[4]);
            boolean milk = Boolean.parseBoolean(values[5]);
            boolean airborne = Boolean.parseBoolean(values[6]);
            boolean aquatic = Boolean.parseBoolean(values[7]);
            boolean venomous = Boolean.parseBoolean(values[8]);
            boolean fins = Boolean.parseBoolean(values[9]);
            boolean tail = Boolean.parseBoolean(values[10]);
            int class_type = Integer.parseInt(values[11]);
            Animal animal = new Animal(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type) {
                @Override
                void speak() {

                }
            };
            animals.add(animal);
        }
        return animals;
    }


}