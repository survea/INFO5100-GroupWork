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
    private static List<Course> courseList;

    public CourseCatalog() {
        courseList = new ArrayList<>();
    }

    public static List<Course> getCourseList() {
        return courseList;
    }

    public static void setCourseList(List<Course> courseList) {
        CourseCatalog.courseList = courseList;
    }
    
    public static List<Course> addList(Course course) {
        courseList.add(course);
        return courseList;
    };

    @Override
    public String toString() {
        return "CourseCatalog{" + '}';
    }
    
}
