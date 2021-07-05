/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author Ankita
 */

public class CourseReview {
    
    int score;
    String suggestion;
    
    public CourseReview(){
        score = 0;
        suggestion = "";
    }
    
    public void addReview(int sc, String s) {
        score = sc;
        suggestion = s;
    }
    
    public int getReviewScore() {
        return score;
    }
    
    public String getReviewSuggestion() {
        return suggestion;
    }
}
