package school;

import java.util.*;

public class Student {
    public String firstName;
    public String lastName;
    public int id;

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return "Name: " + getFullName() + " | ID: " + id;
    }
}

public class Course {
    
}