package com.sample.service;

import com.sample.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/12/5/005.
 */

public interface IStudentService {

    List<Student> getAllStudent();

    Student addStudent(Student student);

    Student updateStudent(Student student);

    List <Student> delectById(Student id);


    List <Student> findAll();
}
