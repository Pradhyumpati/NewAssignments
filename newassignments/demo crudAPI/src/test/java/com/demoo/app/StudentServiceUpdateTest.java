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
public class StudentServiceUpdateTest{
    @Autowired
    StudentService studentService;
    @Mock
    StudentRepo studentRepo;

    @Test
    void notUpdateStudents(){

        Student student = new Student();


        Mockito.when(studentRepo.save((student))).thenReturn(student);
        int  student1 =studentService.updatee(student);
        Assertions.assertNotNull(student1);
    }

}
