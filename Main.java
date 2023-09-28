package edu.najah.cap.java;
public class Main {
    public static void main(String[] args) {
        University university = new University();

        Student student1=new Student(123,"jana","janamousa@gmail.com");
        Student student2=new Student(234,"Mousa","mousa@gmail.com");

        Course course1=new Course("Advance","introduction in Java","Dr.Mostafa",60);
        Course course2=new Course("c++","introduction in programming","Dr.moustafa",30);


        university.addStudent(student1);
        university.addStudent(student2);
        university.addCourses(course1);
        university.addCourses(course2);


        university.addStudentInCourse(student1,course1);
        university.addStudentInCourse(student2,course2);

        university.generateAllReports();



    }
}