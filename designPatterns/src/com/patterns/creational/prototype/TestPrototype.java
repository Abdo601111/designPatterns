package com.patterns.creational.prototype;

import java.util.List;

public class TestPrototype  {

    public static void main(String[] args) throws CloneNotSupportedException {
        StudentDTO studentDTO= new StudentDTO();
        List<Student> students = studentDTO.listAllStudents();
        System.out.println("Original Student List ");
        students.forEach(System.out::println);

        List<Student>  studentDTOClone= studentDTO.clone();
        Student student = new Student();
        student.setId(3);
        student.setName("ali");
        studentDTOClone.add(student);

        System.out.println("Updated Student List ");
        studentDTOClone.forEach(System.out::println);



    }


}
