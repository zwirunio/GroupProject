package com.pwn.student.repositories;

import com.pwn.student.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface StudentRepo extends CrudRepository<Student, Long> {
        Student getByName(String studentName);
    }

