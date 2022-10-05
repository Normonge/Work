
public abstract class Animal {

    private boolean hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail;
    private String animal_name;
    private int legs;
    private int class_type;

    public Animal(boolean hair, boolean feathers, boolean eggs, boolean milk, boolean airborne, boolean aquatic, boolean venomous, boolean fins, boolean tail, String animal_name, int legs, int class_type) {
        this.hair = hair;
        this.feathers = feathers;
        this.eggs = eggs;
        this.milk = milk;
        this.airborne = airborne;
        this.aquatic = aquatic;
        this.venomous = venomous;
        this.fins = fins;
        this.tail = tail;
        this.animal_name = animal_name;
        this.legs = legs;
        this.class_type = class_type;
    }

    /*
        Speak is an abstract method in this class since the different types of animals
        define the speak method instead of the Animal class itself.
         */
    public String speak() {
        return "";
    }

    //get name of animal
    public String getAnimal_name() {
        return animal_name;
    }

    public boolean isEggs() {
        return eggs;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isAirborne() {
        return airborne;
    }

    public boolean isAquatic() {
        return aquatic;
    }

    public boolean isVenomous() {
        return venomous;
    }

    public boolean isFins() {
        return fins;
    }

    public boolean isTail() {
        return tail;
    }

    public String getClass_type() {
        if (class_type == 1) {
            return "Mammal";
        } else if (class_type == 2) {
            return "Bird";
        } else if (class_type == 3) {
            return "Reptile";
        } else if (class_type == 4) {
            return "Amphibian";
        } else if (class_type == 5) {
            return "Fish";
        } else if (class_type == 6) {
            return "Invertebrate";
        }
        else {
            return "Vertebrate";
        }
    }

    //get if animal has hair
    public boolean isHair() {
        return hair;
    }

    public int getLegs() {
        return legs;
    }

    boolean getFeathers() {
        return feathers;
    }
}

