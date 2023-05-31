package com.student.StudentApp.repoImpl;

import com.student.StudentApp.model.Student;
import com.student.StudentApp.repository.StudentRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepoImp extends JdbcDaoSupport implements StudentRepo {
@Autowired
DataSource dataSource;
    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }
    @Override
    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM student";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
        List<Student> result = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            Student student = new Student();
            student.setId((String) row.get("StudentId"));
            student.setName((String) row.get("EmployeeName"));
            result.add(student);

        }
        return result;
    }
}
