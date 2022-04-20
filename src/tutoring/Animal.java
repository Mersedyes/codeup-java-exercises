package tutoring;

public abstract class Animal {

    //fields
    protected int numberOfLegs;
    protected String preferredClimate;

    //constructor(s)
    public Animal(int numberOfLegs, String preferredClimate){
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;

        //properties
        public int getNumberOfLegs() {
            return numberOfLegs;
        }

        public void setNumberOfLegs(int numberOfLegs) {
            this.numberOfLegs = numberOfLegs;
        }

        public String getPreferredClimate() {
            return preferredClimate;
        }

        public void setPreferredClimate(String preferredClimate) {
            this.preferredClimate = preferredClimate;
        }
    }
}