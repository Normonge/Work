public class Amphibian extends Vertebrate{
    public Amphibian(boolean hair, boolean feathers, boolean eggs, boolean milk, boolean airborne, boolean aquatic, boolean venomous, boolean fins, boolean tail, String animal_name, int legs, int class_type) {
        super(hair, feathers, eggs, milk, airborne, aquatic, venomous, fins, tail, animal_name, legs, class_type);
    }

    @Override
    public String speak() {
        String quote = "";
        if(getLegs() == 4){
            quote =  "Four legs good.";
        }
        else if(getLegs() == 2){
            quote = "Two legs baa-d.";
        }
        if(isTail()){
            quote = quote + " Has a tail.";
        }
        return quote;
    }
}
