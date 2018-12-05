package com.sample.controller;

import com.sample.entity.Student;
import com.sample.service.IStudentService;
import com.sample.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/12/5/005.
 */
@RestController
public class StudentController {


    @Autowired
    private IStudentService studentService;


    private  final String SUCCESS = "success";
    private  final String FAIL = "fail";


    @RequestMapping("/test")
    public String test() {
        return "test";
    }


    @RequestMapping("/save")
    public String save(@RequestBody Student student) {
        try {
            studentService.addStudent( student );
            return  SUCCESS ;
        } catch (Exception e) {
            e.printStackTrace();
            return FAIL;
        }
    }

    @RequestMapping("/update")
    public String updateById(@RequestBody Student student) {
        try {
            studentService.updateStudent( student );
            return  SUCCESS ;
        } catch (Exception e) {
            e.printStackTrace();
            return FAIL;
        }
    }

    @RequestMapping("/del")
    public String delById(@RequestBody Student student) {
        try {
            List <Student> list = studentService.delectById( student );
            return  SUCCESS ;
        } catch (Exception e) {
            e.printStackTrace();
            return FAIL;
        }
    }

    @RequestMapping(value = "/findAll")
    public String findAll() {
        try {
            List<Student> p = studentService.findAll();
            return  SUCCESS ;
        } catch (Exception e) {
            e.printStackTrace();
            return FAIL;
        }
    }

}
