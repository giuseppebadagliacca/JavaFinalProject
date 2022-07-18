package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary(String id)
    {
    if(students.containsKey(id)){
        System.out.println("Student name: " + students.get(id).getName());
        System.out.println("Student ID: " + students.get(id).getId());
        System.out.println("Enrolled Classes: " + students.get(id).getClass());
        System.out.println("Student Average: " + students.get(id).getAverage());
        System.out.println("Student Email: " + students.get(id).getEmail());
        System.out.println("Student DOB: " + students.get(id).getBirthDate());
    }

    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
