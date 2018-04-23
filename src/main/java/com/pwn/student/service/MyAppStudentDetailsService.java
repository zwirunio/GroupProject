package com.pwn.student.service;

import com.pwn.student.models.Student;
import com.pwn.student.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
<<<<<<< HEAD
import org.springframework.security.core.userdetails.UserDetails;
=======
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
>>>>>>> 3eb7b74c2003abdb80b09c6d7be3cee2d430fc52
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
<<<<<<< HEAD
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
=======
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
>>>>>>> 3eb7b74c2003abdb80b09c6d7be3cee2d430fc52

        //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String userNameVal                    = activeUserInfo.getName();
        String userSurnameVal                 = activeUserInfo.getPasswd();

<<<<<<< HEAD
       // UserDetails userDetails = new org.springframework.security.core.userdetails.User(userNameVal, userSurnameVal, Arrays.asList(authority));
       // return userDetails;
    }
}
=======
       UserDetails userDetails = new org.springframework.security.core.userdetails.User(userNameVal, userSurnameVal, Arrays.asList(authority));
       return userDetails;
    }
}
>>>>>>> 3eb7b74c2003abdb80b09c6d7be3cee2d430fc52
