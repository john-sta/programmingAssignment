package sample;

import java.util.ArrayList;

public class Course {

    private String courseID;
    private String courseName;
    private boolean isFinished;
    private ArrayList<Course> courseRegister = new ArrayList<>();

    public Course(String courseID, String courseName, boolean isFinished) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.isFinished = isFinished;
    }


    public ArrayList<Course> getCourseRegister() {
        return courseRegister;
    }

    public void setCourseRegister(ArrayList<Course> courseRegister) {
        this.courseRegister = courseRegister;
    }

    public String getCourseID() {
        return courseID;
    }
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isFinished() {
        return isFinished;
    }
    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public void add(Course course) {
        courseRegister.add(course);
    }


}
