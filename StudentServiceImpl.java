package com.acs.studentDetails.serviceImpl;

import com.acs.studentDetails.dao.StudentDao;
import com.acs.studentDetails.dao.StudentRepository;
import com.acs.studentDetails.model.Student;
import com.acs.studentDetails.service.StudentService;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  StudentRepository studentRepository;

    @Override
    public void save(Student student) {

        studentRepository.save(student);

    }

  @Override
  public List<Student> getAllStudent() {
    return studentRepository.findAll();
  }

  @Override
  public void update(Student student) {
    studentRepository.save(student);

  }

  @Override
  public void deleteByid(int id) {
    studentRepository.deleteById(id);
  }

  @Override
  public Student getByid(int id) {
   return studentRepository.findById(id).get();
  }

}
