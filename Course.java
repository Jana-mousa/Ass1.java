package edu.najah.cap.java;
import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseCode;
    private String title;
    private String instructor;
    private int maxCapacity;
    private List <Student>enrolledStudent;



    public Course(){
        this.courseCode=null;
        this.title=null;
        this.instructor=null;
        this.maxCapacity=0;

    }

    public Course(String courseCode, String title, String instructor, int maxCapacity) {
        this.courseCode=courseCode;
        this.title=title;
        this.instructor=instructor;
        this.maxCapacity=maxCapacity;
        this.enrolledStudent=new ArrayList<>();
    }


    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public List<Student> getEnrolledStudent() {
        return enrolledStudent;
    }

    public void setEnrolledStudent(List<Student> enrolledStudent) {
        this.enrolledStudent = enrolledStudent;
    }

    public boolean addStudent(Student student){
       if( enrolledStudent.size()<getMaxCapacity()){
           enrolledStudent.add(student);
           return true;
       }
       else {
           return false;
       }
    }

    public void dropStudent(Student student){
        enrolledStudent.remove(student);
    }



}
