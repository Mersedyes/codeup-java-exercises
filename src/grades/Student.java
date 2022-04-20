package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
//gives student name
    public String getName(){
        return this.name;
    };

    //adds the grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    //returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade: grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {

    }
}
