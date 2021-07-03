/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person;

import java.util.List;
import model.course.Course;
import model.course.CourseCatalog;
import model.person.alumniEmployment.EmploymentHistory;

/**
 *
 * @author Hp
 */
public class Alumni extends Student {

    private CourseCatalog courseCatalog;
    private String employer;
    private List<EmploymentHistory> employmentHistory;

    public Alumni(String employer, List<EmploymentHistory> employmentHistory, CourseCatalog course, double gpa, int id, String firstName, String lastName, int age) {
        super(gpa, id, firstName, lastName, age);
        this.courseCatalog = course;
        this.employer = employer;
        this.employmentHistory = employmentHistory;
    }

//    public Alumni() {
//    }
    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public List<EmploymentHistory> getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEmploymentHistory(List<EmploymentHistory> employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    public CourseCatalog addCourse(Course course) {
        courseCatalog.addCourse(course);
        return courseCatalog;
    }

    @Override
    public String toString() {
        return "Alumni{" + "id " + super.getId() + ", first name " + super.getFirstName() + ", last name " + super.getLastName() + ", employer=" + employer + ", employmentHistory=" + employmentHistory + '}';
    }

}
