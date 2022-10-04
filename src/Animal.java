
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
    abstract void speak();
    //get name of animal
    public String getAnimal_name() {
        return animal_name;
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

