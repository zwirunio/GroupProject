package com.pwn.student.repositories;

import com.pwn.student.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface StudentRepo extends CrudRepository<Student, Long> {

        Student getByName(String name);

        Student getByEmail(String email);

        Student getByEmailAndPhone(String email, String phone);

        //Student getById (Long studentId);

        //Student getByEmailAndPasswd(String email, String passwd);


    }

