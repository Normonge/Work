public class Bug extends Invertebrate{

    public Bug(boolean hair, boolean feathers, boolean eggs, boolean milk, boolean airborne, boolean aquatic, boolean venomous, boolean fins, boolean tail, String animal_name, int legs, int class_type) {
        super(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type);
    }

    @Override
    public String speak() {
        return "I have " + getLegs() + " legs. " + getLegs() + " legs best!";
    }
}
