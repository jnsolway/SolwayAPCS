package school;

import java.util.*;

public class Course {
    public String courseName;
    public String courseId;
    public String teacherName;
    public String room;

    public Course(String courseName, String courseId, String teacherName, String room) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.teacherName = teacherName;
        this.room = room;
    }

    public String toString() {
        return "Course: " + courseName + " | ID: " + courseId + " | Teacher: " + teacherName + " | Room: " + room;
    }
}
