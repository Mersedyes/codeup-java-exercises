package tutoring;

public class Dog extends Animal {
    //needsAttention is a unique field to Dog
    private boolean needsAttention = true;

    //add a constructor which can immediately set the super class (Animal) fields by passing
    //numberOfLegs and preferredClimate to your chosen super()
    public Dog(int numberOfLegs, String preferredClimate){
        super(numberOfLegs, preferredClimate);
    }

    public boolean isNeedsAttention() {
        return needsAttention;
    }

    public void setNeedsAttention(boolean needsAttention) {
        this.needsAttention = needsAttention;
    }

    @Override // need to understand this better, i don't understand it besides the concept
    public String getAnimalInfo(){
        //when String or int, must use return to get a String or int back
        return "Dog Details: \n" +
                "Number of Legs: " + numberOfLegs + "\n" +
                "Preferred Climate: " + preferredClimate + "\n" +
                "Needs Attention: " + needsAttention;
    }
}
