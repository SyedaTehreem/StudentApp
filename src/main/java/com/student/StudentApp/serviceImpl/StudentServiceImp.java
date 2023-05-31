package com.student.StudentApp.serviceImpl;

import com.student.StudentApp.model.Student;
import com.student.StudentApp.repository.StudentRepo;
import com.student.StudentApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceImp implements StudentService {
    @Autowired
    StudentRepo studentRepo;
    public List<Student> getAllStudents(){
        List<Student> students = studentRepo.getAllStudents();
        return students;
    }
}
