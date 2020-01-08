package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    Student[] students = Students.getInstance();
    Instructor[] instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students, numberOfHours);
    }

    public Map getStudyMap(){
        Map map = new HashMap();
        for (Student s : students){
            map.put(s, s.getTotalStudyTime());
        }
        return map;
    }
}
