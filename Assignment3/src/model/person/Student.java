/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person;

import java.util.List;
import model.course.Course;

/**
 *
 * @author Hp
 */
public class Student extends Person {

    private List<Course> course;
    private double gpa;

    public Student(List<Course> course, double gpa, int id, String firstName, String lastName, int age) {
        super(id, firstName, lastName, age);
        this.course = course;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id " + super.getId() + ", first name " + super.getFirstName() + ", last name " + super.getLastName() + ", course=" + course + ", gpa=" + gpa + '}';
    }

}
