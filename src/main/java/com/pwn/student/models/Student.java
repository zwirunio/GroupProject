package com.pwn.student.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long  studentId;

    @Column(name="Student_name")
    @NotEmpty(message = "The name connot be left empty")
    private String name;

    @Column(name="Student_surname")
    @NotEmpty(message = "The surname connot be left empty")
    private String lname;

    @Column(name="Email")
    @Email(message = "Please enter a valid e-mail address")
    private String email;

    @Column(name="Password")
    @Min(value = 6, message = "The password must be equal or longer than 6 characters")
    private String passwd;

    @Column(name="GitHub_login")
    @NotEmpty(message = "The GitHub login connot be left empty")
    private String gitHub;

    @Column(name="Phone_number")
    @NotEmpty(message = "The phone connot be left empty")
    private String phone;

    @Column(name="Project1_grade")
    private String project1grade="N/A";

    @Column(name="Project1_descriptive_grade")
    private String project1descgrade;

    @Column(name="Project2_grade")
    private String project2grade="N/A";

    @Column(name="Project2_descriptive_grade")
    private String project2descgrade;

    @Column(name="Project3_grade")
    private String project3grade="N/A";

    @Column(name="Project3_descriptive_grade")
    private String project3descgrade;

    @Column(name="Project4_grade")
    private String project4grade="N/A";

    @Column(name="Project4_descriptive_grade")
    private String project4descgrade;

    //@Value("ROLE_USER")
    @Column(name="Role")
    private String role="ROLE_USER";

    public Student() {
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
        return "Student details{" +
                "studentId:" + studentId +
                ", student name:'" + name + '\'' +
                ", student surname:'" + lname + '\'' +
                ", e-mail:'" + email + '\'' +
                ", password:'" + passwd + '\'' +
                ", GitHub login:'" + gitHub + '\'' +
                ", phone number:'" + phone + '\'' +
                ", project 1 grade:'" + project1grade + '\'' +
                ", project 1 descriptive grade:'" + project1descgrade + '\'' +
                ", project 2 grade='" + project2grade + '\'' +
                ", project 2 descriptive grade:'" + project2descgrade + '\'' +
                ", project 3 grade='" + project3grade + '\'' +
                ", project 3 descriptive grade:'" + project3descgrade + '\'' +
                ", project 4 grade='" + project4grade + '\'' +
                ", project 4 descriptive grade:'" + project4descgrade + '\'' +
                ", role:='" + role + '\'' +
                '}';
    }
}