package info5100.university.example.businessmodel;

/**
 * @author Moumita
 */
public class Course implements Comparable<Course> {
    String courseId;
    String courseName;
    Popularity popularity;

    public Course(String courseId, String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public void setCoursePopularity(Popularity popularity){
        this.popularity = popularity;
    }

    public String getCourseId(){
        return courseId;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getCoursePopularity(){
        return popularity.name();
    }

    @Override
    public int compareTo(Course course) {
        if(course.popularity.ordinal() < this.popularity.ordinal())
            return 1;
        else if(course.popularity.ordinal() > this.popularity.ordinal())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", popularity=" + popularity.name() +
                '}';
    }
}
