/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person.alumniEmployment;

import java.util.List;
import model.course.Course;
import model.person.AlumniPromotion;

/**
 *
 * @author Hp
 */
public class Employment {
    private List<AlumniPromotion> promotions;
    private List<Course> employmentCourses;

    public Employment() {
    }

    public List<AlumniPromotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<AlumniPromotion> promotions) {
        this.promotions = promotions;
    }

    public List<Course> getEmploymentCourses() {
        return employmentCourses;
    }

    public void setEmploymentCourses(List<Course> employmentCourses) {
        this.employmentCourses = employmentCourses;
    }
    
}
