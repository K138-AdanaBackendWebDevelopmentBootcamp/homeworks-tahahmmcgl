package model;

import java.util.List;
import java.util.Objects;

public class Course {
    private String courseName;
    private int courseCode;
    private int creditScore;
    private List<Student> studentList;
    private Instructor instructor;


    public Course(String courseName, int courseCode, int creditScore, List<Student> studentList, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
        this.studentList = studentList;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseCode, creditScore, studentList, instructor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return courseCode == course.courseCode && creditScore == course.creditScore && Objects.equals(courseName, course.courseName) && Objects.equals(studentList, course.studentList) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", courseCode=" + courseCode +
                ", creditScore=" + creditScore +
                ", studentList=" + studentList +
                ", instructor=" + instructor +
                '}';
    }

}
