/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class Seat {
    
    Boolean occupied; 
    int number;
    SeatAssignment seatassignment;
    CourseOffer courseoffer;
    CourseReview review;
    float creditEarned;
    
    public Seat (CourseOffer co, int n){
        courseoffer = co;
        number = n;
        occupied = false;
        creditEarned = -1;
    }
    
    public Boolean isOccupied(){
        return occupied;
    }
    
    public SeatAssignment newSeatAssignment(){
        
        seatassignment = new SeatAssignment(); // links seatAssignment to seat
        occupied = true;
        seatassignment.seat = this; // have a reference to this object! Too many references! *facepalm*
        return seatassignment;
    }
    
    public void addReview(int score, String suggestion) {
        review = new CourseReview();
        review.addReview(score, suggestion);
    }
    
    public CourseReview getFeedback() {
        return review;
    }
    
    public void addCredit(float c) {
        creditEarned = c;
    }
    
    public float getCreditEarned() {
        return creditEarned;
    }
}
