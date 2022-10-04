import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class NMAnimalProject {
    public static void main(String[] args){


    }

    public List<Animal> readCSV(String fname){

        List<Animal> Animals = new ArrayList<>();
        File myFile = new File(fname);

        try{
            Scanner scanner = new Scanner(myFile);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] animal = line.split(",");

                Animal ani = createAnimal(animal);
                Animals.add(ani);


            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
            return Animals;
    }

    private Animal createAnimal(String[] metadata) {
        String animal_name = metadata[];

    }

}