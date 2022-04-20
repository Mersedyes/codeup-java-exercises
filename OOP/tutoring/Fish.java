package tutoring;

public class Fish extends Animal {

    private boolean isSaltwater;

    public Fish(String prefdClimate, boolean isSaltwater) {
        super(prefdClimate);
        this.isSaltwater = isSaltwater;
    }

    public boolean isSaltwater() {
        return isSaltwater;
    }

    public void setSaltwater(boolean saltwater) {
        isSaltwater = saltwater;
    }

    @Override
    public String getAnimalInfo() {
        "Fish Details: \n" +
                "Preferred Climate: " + preferredClimate + "\n" +
                "Water Habitat: " + (isSaltwater ? "saltwater" : "freshwater");
    }
}
