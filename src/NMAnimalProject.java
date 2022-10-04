import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class NMAnimalProject {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "zoo_animals.csv";
        ArrayList<Animal> animals= readAnimals(fileName);

        for (Animal animal : animals) {
            System.out.println(animal.getAnimal_name() + " " +  animal.getFeathers());
        }

    }


    //read zoo_animals.csv and return a list of animals
    public static ArrayList<Animal> readAnimals(String filename) throws FileNotFoundException {
        ArrayList<Animal> animals = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        //parse boolean 0 = false, 1 = true

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] values = line.split(",");
            String animal_name = values[0];
            int legs = Integer.parseInt(values[9]);
            boolean hair = values[1].equals("1");
            boolean feathers = values[2].equals("1");
            boolean eggs = values[3].equals("1");
            boolean milk = values[4].equals("1");
            boolean airborne = values[5].equals("1");
            boolean aquatic = values[6].equals("1");
            boolean venomous = values[7].equals("1");
            boolean fins = values[8].equals("1");
            boolean tail = values[10].equals("1");
            int class_type = Integer.parseInt(values[11]);
            if (class_type == 1) {
                animals.add(new Mammal(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type));
            } else if (class_type == 2) {
                animals.add(new Bird(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type));
            } else if (class_type == 3) {
                animals.add(new Reptile(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type));
            } else if (class_type == 4) {
                animals.add(new Fish(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type));
            } else if (class_type == 5) {
                animals.add(new Amphibian(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type));
            } else if (class_type == 6) {
                animals.add(new Bug(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type));
            } else if (class_type == 7) {
                animals.add(new Invertebrate(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type));
            }
        }
        return animals;
    }


}