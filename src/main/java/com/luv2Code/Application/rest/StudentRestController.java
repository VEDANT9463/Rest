package com.luv2Code.Application.rest;
import com.luv2Code.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    //define endpoint for "/students" - return  a list of students
    List<Student> theStudents = new ArrayList<>();
    @GetMapping("/students")
    public List<Student> getStudents(){
        theStudents.add(new Student("Poornima","Patel"));
        theStudents.add(new Student("Mario","Rossi"));
        theStudents.add(new Student("Mary","Smith"));
        return theStudents;
    }
}
