package com.pwn.student.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;

    private String name;
    private String lname;
    private String email;
    private String passwd;
    private String gitHub;
    private String phone;
    private String ocenaProjektu1;
    private String ocenaOpisowaProjektu1;
    private String ocenaProjektu2;
    private String ocenaOpisowaProjektu2;
    private String ocenaProjektu3;
    private String ocenaOpisowaProjektu3;
    private String ocenaProjektu4;
    private String ocenaOpisowaProjektu4;
    private String rola;

    public Student() {
    }

    public Student(String ocenaProjektu1, String ocenaOpisowaProjektu1, String ocenaProjektu2, String ocenaOpisowaProjektu2, String ocenaProjektu3, String ocenaOpisowaProjektu3, String ocenaProjektu4, String ocenaOpisowaProjektu4, String rola) {
        this.ocenaProjektu1 = "N/A";
        this.ocenaProjektu2 = "N/A";
        this.ocenaProjektu3 = "N/A";
        this.ocenaProjektu4 = "N/A";
        this.rola = "ROLE_USER";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", passwd='" + passwd + '\'' +
                ", gitHub='" + gitHub + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}