package edu.najah.cap.java;
import java.util.ArrayList;
import java.util.List;
public class University  {


    private List<Student> students;
    private List<Course> courses;

    public University(){
        students=new ArrayList<>();
        courses=new ArrayList<>();
    }


    public void addStudent(Student student){
        students.add(student);
    }

    public void addCourses(Course course){
        courses.add(course);
    }

    public void addStudentInCourse(Student student,Course course){
        if(!students.contains(student)|| !courses.contains(course)) {
            System.out.println("Student or Course not found");

            if (course.addStudent(student)) {
                student.addCourse(course);
            } else {
                System.out.println("course is full!");

            }
        }
    }


     public void generateAllReports(){
         generateAllAvailabelCourse();
      genarateForSpasticStudentReport();
     generateStudentForSpasticCourseReport();
    }

    private void generateAllAvailabelCourse() {

        System.out.println("Report 1 :Available all course");
        for(Course course : courses){
            System.out.println("* Course number: "+ (courses.indexOf(course)+1) );
            System.out.println("CourseCode: "+course.getCourseCode());
            System.out.println("Title: "+course.getTitle());
            System.out.println("Instructor: "+course.getInstructor());
            System.out.println("MaxCapacity: "+course.getMaxCapacity());
        }
    }

    private void generateStudentForSpasticCourseReport( ) {
    //   Student students = new Student();
        Student studentReport= new Student(123,"jana","janamousa@gmail.com");
        System.out.println("Report 3 :Courses For Student : "+studentReport.getName());
        for(Course course:studentReport.getEnrolledCourses()){
            System.out.println("CourseCode: "+course.getCourseCode());
            System.out.println("Title: "+course.getTitle());
            System.out.println("Instructor: "+course.getInstructor());
            System.out.println("MaxCapacity: "+course.getMaxCapacity());

        }

    }


    private void genarateForSpasticStudentReport() {
        Course courseReport=new Course("Advance","introduction in Java","Dr.Mostafa",60);
        System.out.println("Report2: Student Enrolled In Course : " + courseReport.getCourseCode());
        for(Student student:courseReport.getEnrolledStudent()){
            System.out.println("ID: "+student.getID());
            System.out.println("Name: "+student.getName());
            System.out.println("Email: "+student.getEmail());

        }



    }


}





