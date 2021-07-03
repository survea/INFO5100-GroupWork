/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.course;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class CourseCatalog {
    private List<Course> courseList;

    public CourseCatalog() {
        courseList = new ArrayList<>();
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        courseList = courseList;
    }
    
    public List<Course> addCourse(Course course) {
        courseList.add(course);
        return courseList;
    };

    @Override
    public String toString() {
        return "CourseCatalog{" + courseList +"}";
    }
    
}
