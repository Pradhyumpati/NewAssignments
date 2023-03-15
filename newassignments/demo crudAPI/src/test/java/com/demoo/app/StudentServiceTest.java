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

import java.util.List;

@SpringBootTest
public class StudentServiceTest{
    @Autowired
    StudentService studentService;
    @Mock
    StudentRepo studentRepo;

@Test
      void notgetStudents(){

         Student student = new Student();


    Mockito.when(studentRepo.findAll()).thenReturn(List.of(student));
        List<Student> student1 =studentService.getStudents();
        Assertions.assertNotNull(student1);
    }

}
