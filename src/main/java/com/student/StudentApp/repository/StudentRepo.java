package com.student.StudentApp.repository;

import com.student.StudentApp.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
/*@Repository*/
public interface StudentRepo {
    List<Student> getAllStudents();
}
