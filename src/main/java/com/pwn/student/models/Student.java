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
    private String projectGrade1;
    private String projectGradeDesc1;
    private String projectGrade2;
    private String projectGradeDesc2;
    private String projectGrade3;
    private String projectGradeDesc3;
    private String projectGrade4;
    private String projectGradeDesc4;
    private String rola;

    public Student() {
    }

    public Student(String projectGrade1, String projectGrade2, String projectGrade3, String projectGrade4, String rola) {
        this.projectGrade1 = "N/A";
        this.projectGrade2 = "N/A";
        this.projectGrade3 = "N/A";
        this.projectGrade4 = "N/A";
        this.rola = "ROLE_USER";
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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

    public String getProjectGrade1() {
        return projectGrade1;
    }

    public void setProjectGrade1(String projectGrade1) {
        this.projectGrade1 = projectGrade1;
    }

    public String getProjectGradeDesc1() {
        return projectGradeDesc1;
    }

    public void setProjectGradeDesc1(String projectGradeDesc1) {
        this.projectGradeDesc1 = projectGradeDesc1;
    }

    public String getProjectGrade2() {
        return projectGrade2;
    }

    public void setProjectGrade2(String projectGrade2) {
        this.projectGrade2 = projectGrade2;
    }

    public String getProjectGradeDesc2() {
        return projectGradeDesc2;
    }

    public void setProjectGradeDesc2(String projectGradeDesc2) {
        this.projectGradeDesc2 = projectGradeDesc2;
    }

    public String getProjectGrade3() {
        return projectGrade3;
    }

    public void setProjectGrade3(String projectGrade3) {
        this.projectGrade3 = projectGrade3;
    }

    public String getProjectGradeDesc3() {
        return projectGradeDesc3;
    }

    public void setProjectGradeDesc3(String projectGradeDesc3) {
        this.projectGradeDesc3 = projectGradeDesc3;
    }

    public String getProjectGrade4() {
        return projectGrade4;
    }

    public void setProjectGrade4(String projectGrade4) {
        this.projectGrade4 = projectGrade4;
    }

    public String getProjectGradeDesc4() {
        return projectGradeDesc4;
    }

    public void setProjectGradeDesc4(String projectGradeDesc4) {
        this.projectGradeDesc4 = projectGradeDesc4;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
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
                ", projectGrade1='" + projectGrade1 + '\'' +
                ", projectGradeDesc1='" + projectGradeDesc1 + '\'' +
                ", projectGrade2='" + projectGrade2 + '\'' +
                ", projectGradeDesc2='" + projectGradeDesc2 + '\'' +
                ", projectGrade3='" + projectGrade3 + '\'' +
                ", projectGradeDesc3='" + projectGradeDesc3 + '\'' +
                ", projectGrade4='" + projectGrade4 + '\'' +
                ", projectGradeDesc4='" + projectGradeDesc4 + '\'' +
                ", rola='" + rola + '\'' +
                '}';
    }
}