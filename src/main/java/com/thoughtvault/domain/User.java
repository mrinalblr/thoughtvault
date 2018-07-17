package com.thoughtvault.domain;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;

@Entity
@Table(name="USER")
public class User {
    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;
    @Column(name="USERNAME")
    private String username;
    @Column(name="EMAIL_ID")
    private String emailId;
    @Column(name="CONTACT_NUMBER")
    private String contactNumber;
    @Column(name="GENDER")
    private String gender;
    @Column(name="PASSWORD")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User() {
    }

    public User(String username, String emailId, String contactNumber, String gender) {
        this.username = username;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.gender = gender;
    }

    public User(String username, String emailId, String contactNumber, String gender, String password) {
        this.username = username;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", emailId='" + emailId + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
