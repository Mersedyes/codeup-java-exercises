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
        double avg = 0;
        for(Integer grade: grades) {
            avg += grade;
        }
        return (avg / grades.size());
    }

    public static void main(String[] args) {
    Student ernie = new Student("Ernie");
        ernie.addGrade(85);
        ernie.addGrade(92);
        ernie.addGrade(96);
        System.out.println(ernie.getGradeAverage());
    }
}
