package com.student.StudentApp.controller;

import com.student.StudentApp.model.Student;
import com.student.StudentApp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepo student;

@RequestMapping(value = "/student",method = RequestMethod.GET)
public List<Student> getStudents(){
return student.getAllStudents();
}



}
