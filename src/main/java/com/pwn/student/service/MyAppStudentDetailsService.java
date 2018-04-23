package com.pwn.student.service;

import com.pwn.student.models.Student;
import com.pwn.student.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyAppStudentDetailsService implements UserDetailsService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public UserDetails loadUserByUsername(String studentName) throws UsernameNotFoundException {

        Student activeUserInfo                   = studentRepo.getByName(studentName);

        if(activeUserInfo == null) {
            throw new UsernameNotFoundException("Student not found");
        }

        GrantedAuthority authority            = new SimpleGrantedAuthority(activeUserInfo.getRole());

        //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String userNameVal                    = activeUserInfo.getName();
        String userSurnameVal                 = activeUserInfo.getPasswd();

       UserDetails userDetails = new org.springframework.security.core.userdetails.User(userNameVal, userSurnameVal, Arrays.asList(authority));
       return userDetails;
    }
}

