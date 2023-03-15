package com.demoo.app;

import com.demoo.app.model.Student;
import com.demoo.app.repository.StudentRepo;
import com.demoo.app.services.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
public class StudentServiceDeleteStudentTest{
    @Autowired
    StudentService studentService;
    @Mock
    StudentRepo studentRepo;

    @Test
    void notDeleteStudent(){

        Student student = new Student();


        Mockito.verify(studentRepo).deleteById(any());


    }

}
