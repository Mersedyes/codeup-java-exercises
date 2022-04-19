import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        //need Arrays.toString to return as string representation of the contents of the specified array

        //    Create an array that holds 3 Person objects. Assign a new instance of the
        //    Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] persons = new Person[3];
        //System.out.println(persons);

        Person avamarie = new Person("AvaMarie");
        Person wesley = new Person("Wesley");
        Person elijah = new Person("Elijah");
        System.out.println(persons[0]);

//        Create a static method named addPerson. It should accept an array of Person objects, as well as a single
//        person object to add to the passed array. It should return an array whose length is 1 greater than the passed
//        array, with the passed person object at the end of the array.

        public static String[] addPerson(String[] persons, String addPerson){
            String[] newArray = new newArray[persons.length + 1];
            for (int i = 0; i < persons.length; i++) {
                newArray[i] = persons.i;
            }
            newArray[persons.length] = addPerson;
            return newArray;
        }


    }
}
