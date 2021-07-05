/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Employment {
    ArrayList<CourseOffer> relevantCourseOffers;

    int keySkills; //"Key Skills": "Proactive",
    String jobField; //"Job Field": "Healthcare",
    String jobPosition; // "Job Position": "Consultant",
    String jobTitle; //"Job title": "Construction Analyst",
    String seniority; //"Seniority": "Legacy"
    String email; // "Email": "katherin.fahey@yahoo.com",

    //Employment nextEmplyment;  //next job so they are in a sequence
    
    EmployerProfile employer;
    
    public Employment(String j){
        relevantCourseOffers = new ArrayList<>();
    }

}
