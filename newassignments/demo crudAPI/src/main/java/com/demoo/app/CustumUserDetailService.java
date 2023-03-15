package com.demoo.app;

import com.demoo.app.model.Student;
import com.demoo.app.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustumUserDetailService implements UserDetailsService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student = this.studentRepo.findByName(username).orElseThrow(()->new UsernameNotFoundException("User not valid"));



        return student;
    }
}
