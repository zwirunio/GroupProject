package com.pwn.student.service;

import com.pwn.student.models.Student;
import com.pwn.student.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyAppStudentDetailsService implements UserDetailsService {

    public UserDetails userDetails;

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public UserDetails loadUserByUsername(String studentEmail) throws UsernameNotFoundException {

        //Student activeUserInfo                   = studentRepo.getByName(studentName);
        Student activeUserInfo                   = studentRepo.getByEmail(studentEmail);

        if(activeUserInfo == null) {
            throw new UsernameNotFoundException("Student not found");

        }

        GrantedAuthority authority             = new SimpleGrantedAuthority(activeUserInfo.getRole());

        BCryptPasswordEncoder passwordEncoder  = new BCryptPasswordEncoder();
        String userEmailVal                    = activeUserInfo.getEmail();
        String userPassVal                     = passwordEncoder.encode(activeUserInfo.getPasswd());

        userDetails = new org.springframework.security.core.userdetails.User(userEmailVal, userPassVal, Arrays.asList(authority));
        return userDetails;
    }



}

