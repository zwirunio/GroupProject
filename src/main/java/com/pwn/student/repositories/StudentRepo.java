package com.pwn.student.repositories;

import com.pwn.student.models.Student;
import org.springframework.data.repository.CrudRepository;
<<<<<<< HEAD
=======
import org.springframework.security.core.userdetails.User;
>>>>>>> 3eb7b74c2003abdb80b09c6d7be3cee2d430fc52
import org.springframework.stereotype.Repository;

    @Repository
    public interface StudentRepo extends CrudRepository<Student, Long> {
<<<<<<< HEAD

        Student getByName(String name);


    }
=======
        Student getByName(String studentName);
    }


>>>>>>> 3eb7b74c2003abdb80b09c6d7be3cee2d430fc52
