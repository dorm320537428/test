package com.sample.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by Administrator on 2018/12/5/005.
 */
@Entity
@Table(name = "person")
@Data
@DynamicUpdate
@DynamicInsert
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private  Integer stuID;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "age", nullable = false)
    private String age;

    @Column(name = "classyear", nullable = false)
    private String classyear;



    public Student() {
    }

    public Integer getStuID() {
        return stuID;
    }

    public void setStuID(Integer stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassyear() {
        return classyear;
    }


    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }



}