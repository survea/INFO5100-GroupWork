/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5100UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String semesterName = "Fall2020";
        String studentId = "0112303";

        Department department = new Department("Information Systems");

        Course course = department.newCourse("app eng", "info 5100", 4);

        CourseSchedule courseschedule = department.newCourseSchedule(semesterName);

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        
        if (courseoffer == null) {
            System.out.println("The course cannot be offered as its not in catalog");
            return;
        }
        
        courseoffer.generateSeats(10);
        
        PersonDirectory pd = department.getPersonDirectory();
        Person person = pd.newPerson(studentId);
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        CourseLoad courseload = student.newCourseLoad(semesterName);
        
        // check and make sure student can take course       
        
        SeatAssignment seatAssignment = courseload.newSeatAssignment(courseoffer);

        // Register student in class
        courseload.registerStudent(seatAssignment);
        courseload.addCredit(seatAssignment.getSeat(), 4.0f);

        int total = department.calculateRevenuesBySemester(semesterName);
        System.out.println("Total: " + total);

        int totalSeats = department.getTotalSeats(semesterName);
        System.out.println("Total seats: " + totalSeats);

        StudentDirectory studentDirectory = department.getStudentDirectory();
        StudentProfile studentProfile = studentDirectory.findStudent(studentId);
        double gpa = studentProfile.getGpa();

        System.out.println("Total GPA of this student with ID: " + studentId + " -> " + gpa);
        studentProfile.printCourses();
    }

}
