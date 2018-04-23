package com.pwn.student.service;

import com.pwn.student.models.Student;
import com.pwn.student.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyAppStudentDetailsService {

    @Autowired
    private StudentRepo studentRepo;
    //private IUserInfoDAO userInfoDAO;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Student activeUserInfo                   = studentRepo.getByName(userName);           //
        //User activeUserInfo                   = userInfoDAO.getActiveUser(userName);

        if(activeUserInfo == null) {
            throw new UsernameNotFoundException("User not Fund");
        }

       // GrantedAuthority authority            = new SimpleGrantedAuthority(activeUserInfo.getRole());

        //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String userNameVal                    = activeUserInfo.getName();
        String userSurnameVal                 = activeUserInfo.getPasswd();

       // UserDetails userDetails = new org.springframework.security.core.userdetails.User(userNameVal, userSurnameVal, Arrays.asList(authority));
       // return userDetails;
    }
}
