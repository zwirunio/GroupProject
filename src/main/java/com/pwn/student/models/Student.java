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

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getOcenaProjektu1() {
        return ocenaProjektu1;
    }

    public void setOcenaProjektu1(String ocenaProjektu1) {
        this.ocenaProjektu1 = ocenaProjektu1;
    }

    public String getOcenaOpisowaProjektu1() {
        return ocenaOpisowaProjektu1;
    }

    public void setOcenaOpisowaProjektu1(String ocenaOpisowaProjektu1) {
        this.ocenaOpisowaProjektu1 = ocenaOpisowaProjektu1;
    }

    public String getOcenaProjektu2() {
        return ocenaProjektu2;
    }

    public void setOcenaProjektu2(String ocenaProjektu2) {
        this.ocenaProjektu2 = ocenaProjektu2;
    }

    public String getOcenaOpisowaProjektu2() {
        return ocenaOpisowaProjektu2;
    }

    public void setOcenaOpisowaProjektu2(String ocenaOpisowaProjektu2) {
        this.ocenaOpisowaProjektu2 = ocenaOpisowaProjektu2;
    }

    public String getOcenaProjektu3() {
        return ocenaProjektu3;
    }

    public void setOcenaProjektu3(String ocenaProjektu3) {
        this.ocenaProjektu3 = ocenaProjektu3;
    }

    public String getOcenaOpisowaProjektu3() {
        return ocenaOpisowaProjektu3;
    }

    public void setOcenaOpisowaProjektu3(String ocenaOpisowaProjektu3) {
        this.ocenaOpisowaProjektu3 = ocenaOpisowaProjektu3;
    }

    public String getOcenaProjektu4() {
        return ocenaProjektu4;
    }

    public void setOcenaProjektu4(String ocenaProjektu4) {
        this.ocenaProjektu4 = ocenaProjektu4;
    }

    public String getOcenaOpisowaProjektu4() {
        return ocenaOpisowaProjektu4;
    }

    public void setOcenaOpisowaProjektu4(String ocenaOpisowaProjektu4) {
        this.ocenaOpisowaProjektu4 = ocenaOpisowaProjektu4;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
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
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", passwd='" + passwd + '\'' +
                ", gitHub='" + gitHub + '\'' +
                ", phone='" + phone + '\'' +
                ", ocenaProjektu1='" + ocenaProjektu1 + '\'' +
                ", ocenaOpisowaProjektu1='" + ocenaOpisowaProjektu1 + '\'' +
                ", ocenaProjektu2='" + ocenaProjektu2 + '\'' +
                ", ocenaOpisowaProjektu2='" + ocenaOpisowaProjektu2 + '\'' +
                ", ocenaProjektu3='" + ocenaProjektu3 + '\'' +
                ", ocenaOpisowaProjektu3='" + ocenaOpisowaProjektu3 + '\'' +
                ", ocenaProjektu4='" + ocenaProjektu4 + '\'' +
                ", ocenaOpisowaProjektu4='" + ocenaOpisowaProjektu4 + '\'' +
                ", rola='" + rola + '\'' +
                '}';
    }
}