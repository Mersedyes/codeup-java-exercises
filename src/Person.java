public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
        return name;
    };

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    };
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hi, " + this.name);
    };

    /*The class should have a constructor that accepts a `String` value and sets
    the person's name to the passed string.*/
    public Person(String name){
        setName(name);
        sayHello();
    }

    /*Create a `main` method on the class that creates a new `Person` object and
    tests the above methods.*/
    public static void main(String[] args) {
        Person mersedyes = new Person("Mersedyes");
        System.out.println(mersedyes.name);
    }
}
