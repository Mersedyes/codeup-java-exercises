package warmups;

import java.util.*;
import java.util.Scanner;

/*Create a Warmup.java class with a main method
Create a method (isPalindrome) to determine if a string is a palindrome (do not define this in your
main method and make sure it’s within the class)
            It should return a boolean
            It should accept a String as an argument
            Think of how to use the String class’ methods to help accomplish this
Invoke isPalindrome in your main method, outputting its return value to the console with a contextual message*/
public class Warmup {
    //used a method where the number or string is not predefined. The user has to pput the number or string as
    // input to check if the numver or string is a palindrome
    public static void main(String[] args) {

        String original, reverse = "";//objects of the string class
        Scanner in = new Scanner(System.in);
        //ask user to input number or word
        System.out.println("Enter a word or number to check if it is a palindrome");
do{
    original = in.nextLine();
    int length = original.length();
    //the loop runs from the end to the beginning of the string
    //the charAt() method accesses each character of the string
    //each character of the string is accessed in reverse order and stored
    for (int i = length-1; i >= 0; i--)
        reverse = reverse + original.charAt(i);
    //the equals method checks if the two strings are equal
    if (original.equals(reverse))
        System.out.println("The entered word or number IS a palindrome");
    else System.out.println("The entered word or number IS NOT a palindrome");
} while(true);
    }
}
