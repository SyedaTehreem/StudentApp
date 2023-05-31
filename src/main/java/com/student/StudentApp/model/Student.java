package com.student.StudentApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="student")
public class Student {
    @Id
    private String id;
    private String name;
    private String f_name;
    private String roll_no;
    private String class_name;

    /*public Student(String id, String name, String f_name, String roll_no, String class_name) {
        this.id = id;
        this.name = name;
        this.f_name = f_name;
        this.roll_no = roll_no;
        this.class_name = class_name;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
}
