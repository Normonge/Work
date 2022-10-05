public class Bird extends Vertebrate{

    public Bird(boolean hair, boolean feathers, boolean eggs, boolean milk, boolean airborne, boolean aquatic, boolean venomous, boolean fins, boolean tail, String animal_name, int legs, int class_type) {
        super(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type);
    }

    /*
        The bird class defines Speak by associating the String Chirp to the Bird class
         */
    @Override
    public String speak() {
        if (getLegs() == 2){
            return "Two legs baa-d." + " But have wings.";
        }
        return "";
    }
}
