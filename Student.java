package edu.najah.cap.java;
import java.util.ArrayList;
import java.util.List;

public class Student extends Course {

    private int ID;
    private String name ;
    private String email;
    private List<Course> enrolledCourses;

    public Student(){
        this.ID=0;
        this.name= null;
        this.email= null;
        this.enrolledCourses =new ArrayList<>() ;

    }

    public Student(int ID, String name, String email) {
        this.ID=ID;
        this.name= name;
        this.email= email;
        this.enrolledCourses =new ArrayList<>() ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void addCourse(Course course){
        enrolledCourses.add(course);
    }

    public void dropCourse(Course course){
        enrolledCourses.remove(course);
    }


}
