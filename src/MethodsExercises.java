import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//            int ten = 10;
//            int two = 2;
//            System.out.print("Addition of given numbers = ");
//            System.out.println(ten + two);
//            System.out.println(ten - two);
//            System.out.println(ten * two);
//            System.out.println(ten % two);
        System.out.println("Addition of two integers: " + addInteger(10,2));
        System.out.println("Subtraction of two integers: " + subtractInteger(10,2));
        System.out.println("Multiplication of two integers: " + multiplyInteger(10,2));
        System.out.println("Division of two integers: " + divideInteger(10,2));
        System.out.println("Remainder of two integers: " + modulusInteger(10,2));
        System.out.println("Alternative Multiplication of two integers: " + multiplyBonusInteger(10,2));

//        twoIntegers(10,2);

    }

    public static int addInteger(int a, int b){
        return a+b;
    }
    public static int subtractInteger(int a, int b){
        return a-b;
    }
    public static int multiplyInteger(int a, int b){
        return a*b;
    }
    public static int divideInteger(int a, int b){
        return a/b;
    }
    public static int modulusInteger(int a, int b){
        return a%b;
    }
    public static int multiplyBonusInteger(int a,int b){
        int result =  a*b;
        return result;
    }
}
