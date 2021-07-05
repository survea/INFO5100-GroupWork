/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    String semester;
    ArrayList<SeatAssignment> seatAssignments;
    
    public CourseLoad(String s){
        seatAssignments = new ArrayList<>();
        semester = s;
    }
    
    public SeatAssignment newSeatAssignment(CourseOffer co){
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment();
        seatAssignments.add(sa);  //add to students course
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        sa.assignSeatToStudent(this);
        seatAssignments.add(sa);
    }
    
    public ArrayList<SeatAssignment> getSeatsAssigned() {
        return seatAssignments;
    }
    
    public void addCredit(Seat s, Float earned) {
        s.addCredit(earned);
    }
    
    public float getCredit(Seat s) {
        return s.getCreditEarned();
    }

    public List<String> getCourses(){
        List<String > courses = seatAssignments.stream()
                .map(seatAssignment -> seatAssignment.getSeat()
                        .courseoffer.course.getCourseName())
                .collect(Collectors.toList());

        return courses.stream().distinct().collect(Collectors.toList());
    }

}
