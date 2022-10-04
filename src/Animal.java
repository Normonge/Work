public abstract class Animal {

    private boolean hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail;
    private String animal_name;
    private int legs;
    private int class_type;





    /*
    Speak is an abstract method in this class since the different types of animals
    define the speak method instead of the Animal class itself.
     */
    abstract void speak();
}

