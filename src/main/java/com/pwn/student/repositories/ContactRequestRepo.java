package com.pwn.student.repositories;

import com.pwn.student.models.ContactRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ContactRequestRepo extends CrudRepository<ContactRequest, Long> {
        ContactRequest getByContactRequestId(Long contactId);
    }



