package Domain;

import java.util.ArrayList;

public class Course {
    private String number = null;




    private String name = null;
    private int maxNumbofStudents;
    private ArrayList<Instructor> instructors;

    public Course(String number, String name, ArrayList<Instructor>instructors, int maxNumbofStudents){
        this.number = number;
        this.name = name;
        this.instructors = instructors;
        this.maxNumbofStudents = maxNumbofStudents;

    }

    public String getNumber() {return number;}
    public String getName() {return name;}
    public int getMaxNumbofStudents() {return maxNumbofStudents;}
    public ArrayList<Instructor> getInstructors() {return instructors;}
    @Override
    public String toString() {return name;}

}
