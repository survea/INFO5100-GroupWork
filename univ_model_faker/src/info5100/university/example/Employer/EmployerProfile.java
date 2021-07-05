/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Employer;

import info5100.university.example.Persona.EmploymentHistory.Employment;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EmployerProfile {
    String name; //"Company": "Hettinger LLC",
    String profession; //"Profession": "artist",
    String website; //"Website": "www.marni-company.com",
    String industry; //"Industry": "Nonprofit Organization Management",

    ArrayList<Employment> employments;

    // could be company instead of just a name as a string
    public EmployerProfile(String n){
        name = n;
    }
    
    public boolean isMatch(String id){
        //String is an object and can do equal match.
        return name.equals(id);
    }
    
}
