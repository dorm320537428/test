package com.sample.service.impl;

import com.sample.entity.Student;
import com.sample.repository.StudentRepository;
import com.sample.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/12/5/005.
 */
@Service
@Transactional
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List <Student> findAll() {
        //根据id排序,升序.
        Sort sort = new Sort( Sort.Direction.DESC, "id" );
        List <Student> list = studentRepository.findAll( sort );

        return list;
    }

    @Override
    public List <Student> delectById(Student person) {
        studentRepository.delete( person );
        List <Student> list = findAll();
        return list;
    }
}
