public class ServerNameGenerator {
     /*We are going to build a server name generator. Create a class inside of src named ServerNameGenerator,
        and follow the specs below.
                1. Create two arrays whose elements are strings: one with at least 10 adjectives, another with at
                least 10 nouns. - Done

                2. Create a method that will return a random element from an array of strings. - DONE

                3. Add a main method, and in your main method select and random noun and adjective and hyphenate the
                combination and display the generated name to the user.*/

    static String getRandom (String[] array){
        int randomNum = (int) (Math.floor(Math.random() * (array.length-1)));
        return array[randomNum];
    }

    public static void main(String[] args) {
        String[] adjectives = {"zealous","moist","sharp","rough","perfect","huge","gentle","fantastic","cruel","charming"};
        String[] nouns = {"man", "woman", "child", "dog", "cat", "house", "car", "tacos", "coffee", "phone"};
        System.out.println("Here is your server name: \n" + getRandom(adjectives) + "-" + getRandom(nouns));
    }
}
