package com.pwn.student.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
public class ContactRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactRequestId;

    @Column(name = "Email")
    @Email(message = "Please enter a valid e-mail address")
    private String email;

    @Column(name = "Subject")
    @NotEmpty(message = "Please enter a subject")
    private String subject;

    @Column(name = "Contact_message")
    @NotEmpty(message = "Please enter a message")
    private String message;


    public ContactRequest() {
    }

    public Long getContactRequestId() {
        return contactRequestId;
    }

    public void setContactRequestId(Long contactRequestId) {
        this.contactRequestId = contactRequestId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ContactRequest{" +
                "contactRequestId=" + contactRequestId +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
