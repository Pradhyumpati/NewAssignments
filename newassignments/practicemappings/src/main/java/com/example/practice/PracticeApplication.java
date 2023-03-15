package com.example.practice;

import com.example.practice.model.Address;
import com.example.practice.model.Laptop;
import com.example.practice.model.Student;
import com.example.practice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner {
	@Autowired
	private StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);

	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println("Helllooo");

//		onetoone------
//		Student student = new Student();
//		student.setName("mendiss patidar");
//		student.setId(12);
//		student.setAge(22);
//
//		Laptop laptop = new Laptop();
//		laptop.setLaptopId(1234);
//		laptop.setBrand("dell");
//		laptop.setModelNumber("12344");
//
//		laptop.setStudent(student);
//
//		student.setLaptop(laptop);
//
//Student save = studentRepo.save(student);
//
//          fetch data-----
//		Student student = studentRepo.findById(12).get();
//		System.out.println(student.getName());
//		Laptop laptop = student.getLaptop();
//		System.out.println(laptop.getBrand());



//		**********onetomany ----

//
//		Student student = new Student();
//		student.setName("supernova ");
//		student.setId(12);
//		student.setAge(22);
//
//		Address a1 = new Address();
//
//		a1.setCity("badnagar");
//		a1.setAddressId(121);
//		a1.setCountry("ujjain");
//		a1.setStreet("broooken");
//		a1.setStudent(student);
//
//		Address a2 = new Address();
//
//		a2.setCity("badnagar11");
//		a2.setAddressId(12111);
//		a2.setCountry("ujjain11");
//		a2.setStreet("broooken11");
//		a2.setStudent(student);
//
//
//		 ArrayList<Address> addressList= new ArrayList<>();
//		 addressList.add(a1);
//		addressList.add(a2);
//		student.setAddressList(addressList);
//
//		Student save = studentRepo.save(student);

	}



}
