/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person;

import model.course.Course;

/**
 *
 * @author Hp
 */
public class Faculty extends Person {

    private Course course;
    private static int rating;
    private String position;

    public Faculty() {
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public static int getRating() {
        return rating;
    }

    public static void setRating(int rating) {
        Faculty.rating = rating;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
