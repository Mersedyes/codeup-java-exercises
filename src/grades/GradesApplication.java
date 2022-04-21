package grades;

import util.Input;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

//INSTRUCTIONS FOR PART 2
//    Create a map for students and Github usernames
//
//    Create a class named GradesApplication with a main method. Inside the main
//    method, create a HashMap named students. It should have keys that are strings
//    that represent github usernames, and values that are Student objects.
//    Create at least 4 student objects with at least 3 grades each, and add them to the map.
//
//    Be creative! Make up github usernames and grades for your student objects.
public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        Student elijah = new Student("Elijah");
        Student avamarie = new Student("AvaMarie");
        Student wesley = new Student("Wesley");
        Student mersedyes = new Student("Mersedyes");

        elijah.addGrade(85);
        elijah.addGrade(92);
        elijah.addGrade(96);

        avamarie.addGrade(100);
        avamarie.addGrade(96);
        avamarie.addGrade(92);

        wesley.addGrade(100);
        wesley.addGrade(90);
        wesley.addGrade(85);

        mersedyes.addGrade(100);
        mersedyes.addGrade(96);
        mersedyes.addGrade(92);

        HashMap<String, Student> student = new HashMap<>();
        student.put("ElijahBoo@github.com", elijah);
        student.put("AvaMarie@github.com", avamarie);
        student.put("WesleyNoSnipes@github.com", wesley);
        student.put("MersedyesNotTheCar@github.com", mersedyes);

        Scanner sc = new Scanner(System.in);

//        System.out.println(avamarie.getGradeAverage());
        System.out.println("Here is the GitHub usernames for these students: ");
        System.out.println(student.keySet());

        System.out.println("\nWhich student would you like more information on?\n ");

    }
            //System.out.println();

}
