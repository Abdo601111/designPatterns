package com.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class StudentDTO implements Cloneable{

   static List<Student> students;
    static {
        students= new ArrayList<>();
        Student student1= new Student();
        Student student2= new Student();
        student1.setId(1);
        student1.setName("abdo");
        student2.setId(2);
        student2.setName("mohammed");
        students.add(student1);
        students.add(student2);

    }

    public List<Student> listAllStudents(){
        return students;
    }

    @Override
    protected List<Student> clone() throws CloneNotSupportedException {
        List<Student> studentsDummy= new ArrayList<>();
        students.forEach(student -> studentsDummy.add(student));

        return studentsDummy;
    }
}
