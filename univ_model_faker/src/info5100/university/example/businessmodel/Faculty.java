package info5100.university.example.businessmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * @author Moumita
 */
public class Faculty {
    String facultyName;
    String facultyID;

    HashMap<Course, Popularity> coursesTaughtWithRatings;

    List<Course> coursesTaughtList;

    public Faculty(String facultyID, String facultyName){
        this.facultyID = facultyID;
        this.facultyName = facultyName;
        coursesTaughtList = new ArrayList<>();
        coursesTaughtWithRatings = new HashMap<>();
    }

    public void updateCoursesTaught(Course course){
        coursesTaughtList.add(course);
    }

    public void updateCourseRating(String courseID, Popularity rating){
        coursesTaughtList.forEach(course -> {
            if(course.courseId.equals(courseID)){
                coursesTaughtWithRatings.put(course, rating);
            }
        });
    }

    public Popularity getFacultyRating(String courseId){
        Optional<Course> found = Optional.empty();
        for (Course c : coursesTaughtList) {
            if (c.getCourseId().equals(courseId)) {
                found = Optional.of(c);
                break;
            }
        }
        Course course = found.get();

        return coursesTaughtWithRatings.get(course);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' + "\n" +
                ", facultyID='" + facultyID + '\'' + "\n" +
                ", coursesTaughtWithRatings=" + coursesTaughtWithRatings + "\n" +
                ", coursesTaughtList=" + coursesTaughtList + "\n" +
                '}';
    }

    public String getName() {
        return facultyName;
    }
}
