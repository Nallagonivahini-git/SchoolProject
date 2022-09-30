package com.acs.studentDetails.service;

import com.acs.studentDetails.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    void save(Student student);

    List<Student> getAllStudent();

    void  update(Student student);
    void deleteByid(int id);

    Student getByid(int id);
}
