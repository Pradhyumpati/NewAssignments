package com.demoo.app;

import com.demoo.app.model.Student;
import com.demoo.app.repository.StudentRepo;
import com.demoo.app.services.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceCreateTest{
    @Autowired
    StudentService studentService;
    @Mock
    StudentRepo studentRepo;

    @Test
    void notgetStudents(){

        Student student = new Student();



        Mockito.when(studentRepo.existsById(student.getId())).thenReturn(true);
       String student1 =studentService.createStudent(student);
        Assertions.assertNotNull(student1);
    }

}
