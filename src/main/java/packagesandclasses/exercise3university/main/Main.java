package packagesandclasses.exercise3university.main;

import packagesandclasses.exercise3university.university.Course;
import packagesandclasses.exercise3university.university.Enrollment;
import packagesandclasses.exercise3university.university.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentId = 101;
        student.name = "Jane Doe";

        Course course = new Course();
        course.courseId = 1;
        course.courseName = "Introduction to Computer Science";

        Enrollment enrollment = new Enrollment();
        enrollment.student = student;
        enrollment.course = course;

        System.out.println("Student ID: " + enrollment.student.studentId + ", Name: " + enrollment.student.name);
        System.out.println("Course ID: " + enrollment.course.courseId + ", Name: " + enrollment.course.courseName);
    }
}

