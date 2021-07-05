/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.CourseSchedule.SeatAssignment;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author kal bugrara
 */
public class Transcript {
    
    HashMap<String, CourseLoad> courseloadlist;
    
    CourseLoad currentcourseload;
    
    public Transcript(){
        courseloadlist = new HashMap<String, CourseLoad>();
    }
    
    public CourseLoad newCourseLoad(String sem){
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    
    public CourseLoad getCurrentCourseLoad(){
        return currentcourseload;
    }
    
    public CourseLoad getCourseLoadBySemester(String semester){
        return courseloadlist.get(semester);
        
    }
    
    public float getGPA() {
        int courses = 0;
        float gpa = 0;
        CourseLoad c;
        for (Entry<String, CourseLoad> e : courseloadlist.entrySet()) {
            c = e.getValue();
            for (SeatAssignment seatassignment : c.getSeatsAssigned()) {
                float courseGPA;
                Seat s = seatassignment.getSeat();
                courseGPA = c.getCredit(s);
                if (courseGPA >= 0) {
                    gpa += courseGPA;
                    courses++;
                }
            }
        }
        if (courses > 0)
            gpa = gpa / courses;
        return gpa;
    }

    public void printAllCourseList(){
        courseloadlist.forEach((s, courseLoad) -> {
            System.out.println("Courses: " + courseLoad.getCourses());
        });
    }
}
