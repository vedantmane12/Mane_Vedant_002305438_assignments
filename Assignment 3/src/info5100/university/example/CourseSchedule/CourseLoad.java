/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    String semester;
    ArrayList<SeatAssignment> seatassignments; //each represent 1 course registration
    
    public CourseLoad(String s){
        seatassignments = new ArrayList();
        semester = s;
    }
    
    public ArrayList<SeatAssignment> getSeatAssignment(){
        return seatassignments;
    }
    
    public void registerStudent(SeatAssignment sa){
        
        
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }
    
    public float getSemesterScore(){ //total score for a full semeter
        float sum = 0;
        
        for (SeatAssignment sa: seatassignments){
            sum = sum + sa.GetCourseStudentScore() / sa.getCreditHours();
        }
        return sum / seatassignments.size();
    }
    
    public String getSemester(){
        return semester;
    }
    
    public ArrayList<SeatAssignment> getSeatAssignments(){
            return seatassignments;
        }
        
    public SeatAssignment registerStudentInClass(CourseOffer co, String g){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment(this); 
        sa.setG(g);
        seatassignments.add(sa);  //add to students course 
        
        
        return sa;
        
    }
            
}
