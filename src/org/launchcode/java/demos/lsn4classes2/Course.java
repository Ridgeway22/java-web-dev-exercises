package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
      public String toString(){
          return ("Topic"+topic+", Insturctor "+instructor.getFirstName()+", Enrolled Students "+enrolledStudents);
      }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Course targets) {

        if (targets == this) {
            return true;
        }

        if (targets == null) {
            return false;
        }

        if (targets.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) targets;
        return theCourse.instructor == instructor && theCourse.topic == topic;
    }
}
