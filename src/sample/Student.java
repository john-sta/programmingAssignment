package sample;

import java.util.ArrayList;

public class Student {

    private String studentID;
    private String studentName;
    private String studentAddress;
    private String result; //for exam on course
    private ArrayList<Course> courseRegister = new ArrayList<>();
    private Course courses;

    public Student(String studentID, String studentName, String studentAddress, Course courses) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.courses = courses;
    }

    public void add(Student student) {

    }

    public void addCourse(Course course) {
        courseRegister = getCourseRegister();
    //    courseRegister.add(Student student);
    }

    public ArrayList<Course> getCourseRegister() {
        return courseRegister;
    }

    public void setCourseRegister(ArrayList<Course> courseRegister) {
        this.courseRegister = courseRegister;
    }

    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}
