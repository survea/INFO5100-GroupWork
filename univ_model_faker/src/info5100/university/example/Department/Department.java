/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Department {

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    //EmployerDirectory employerdirectory;

    Calendar mastercoursecatalog;

    public Department(String n) {
        name = n;
        mastercoursecatalog = new Calendar();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentdirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {
        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.addCourseSchedule(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {
        return mastercoursecatalog.getCourseSchedule(semester);
    }

    public CourseCatalog getCourseCatalog() {
        return coursecatalog;
    }

    public Course newCourse(String n, String nm, int cr) {
        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.getCourseSchedule(semester);

        return css.calculateTotalRevenues();

    }

    public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = mastercoursecatalog.getCourseSchedule(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);
    }

    public int getTotalSeats(String semester){
        CourseSchedule css = mastercoursecatalog.getCourseSchedule(semester);
        return css.getTotalSeats();
    }

    public void getPopularCoursesInDepartment(String semester){
        CourseSchedule css = mastercoursecatalog.getCourseSchedule(semester);
        System.out.println("The most popular course is: " + css.getMostPopularCourse());
    }
}
