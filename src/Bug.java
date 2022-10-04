public class Bug extends Invertebrate{

    public Bug(boolean hair, boolean feathers, boolean eggs, boolean milk, boolean airborne, boolean aquatic, boolean venomous, boolean fins, boolean tail, String animal_name, int legs, int class_type) {
        super(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type);
    }

    /*
        The bug class defines Speak by associating the String skuttle to the bug class
         */
    @Override
    void speak() {
        System.out.println("Skuttle");
    }
}
