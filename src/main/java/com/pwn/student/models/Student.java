package com.pwn.student.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long   studentId;

    @NotEmpty(message = "The name connot be left empty")
    private String name;

    @NotEmpty(message = "The surname connot be left empty")
    private String lname;

    @Email(message = "Please enter a valid e-mail address")
    private String email;

    @Min(value = 6, message = "The password must be equal or longer than 6 characters")
    private String passwd;

    @NotEmpty(message = "The GitHub login connot be left empty")
    private String gitHub;

    @NotEmpty(message = "The phone connot be left empty")
    private String phone;
    private String project1grade;
    private String project1descgrade;
    private String project2grade;
    private String project2descgrade;
    private String project3grade;
    private String project3descgrade;
    private String project4grade;
    private String project4descgrade;
    private String role;

    public Student() {
    }

    public Student(String name, String lname, String email, String passwd, String gitHub, String phone, String project1grade, String project1descgrade, String project2grade, String project2descgrade, String project3grade, String project3descgrade, String project4grade, String project4descgrade, String role) {
        this.name = name;
        this.lname = lname;
        this.email = email;
        this.passwd = passwd;
        this.gitHub = gitHub;
        this.phone = phone;
        this.project1grade = "N/A";
        this.project1descgrade = project1descgrade;
        this.project2grade = "N/A";
        this.project2descgrade = project2descgrade;
        this.project3grade = "N/A";
        this.project3descgrade = project3descgrade;
        this.project4grade = "N/A";
        this.project4descgrade = project4descgrade;
        this.role = "ROLE_USER";
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

    public String getProject1grade() {
        return project1grade;
    }

    public void setProject1grade(String project1grade) {
        this.project1grade = project1grade;
    }

    public String getProject1descgrade() {
        return project1descgrade;
    }

    public void setProject1descgrade(String project1descgrade) {
        this.project1descgrade = project1descgrade;
    }

    public String getProject2grade() {
        return project2grade;
    }

    public void setProject2grade(String project2grade) {
        this.project2grade = project2grade;
    }

    public String getProject2descgrade() {
        return project2descgrade;
    }

    public void setProject2descgrade(String project2descgrade) {
        this.project2descgrade = project2descgrade;
    }

    public String getProject3grade() {
        return project3grade;
    }

    public void setProject3grade(String project3grade) {
        this.project3grade = project3grade;
    }

    public String getProject3descgrade() {
        return project3descgrade;
    }

    public void setProject3descgrade(String project3descgrade) {
        this.project3descgrade = project3descgrade;
    }

    public String getProject4grade() {
        return project4grade;
    }

    public void setProject4grade(String project4grade) {
        this.project4grade = project4grade;
    }

    public String getProject4descgrade() {
        return project4descgrade;
    }

    public void setProject4descgrade(String project4descgrade) {
        this.project4descgrade = project4descgrade;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
                ", project1grade='" + project1grade + '\'' +
                ", project1descgrade='" + project1descgrade + '\'' +
                ", project2grade='" + project2grade + '\'' +
                ", project2descgrade='" + project2descgrade + '\'' +
                ", project3grade='" + project3grade + '\'' +
                ", project3descgrade='" + project3descgrade + '\'' +
                ", project4grade='" + project4grade + '\'' +
                ", project4descgrade='" + project4descgrade + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}