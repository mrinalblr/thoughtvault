package com.thoughtvault.model.request;

public class UserRequest {
    private String username;
    private String emailId;
    private String contactNumber;
    private String gender;
    private String password;

    public UserRequest(String username, String emailId, String contactNumber, String gender, String password) {
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

    public UserRequest(String username, String emailId, String contactNumber, String gender) {
        this.username = username;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.gender = gender;
    }

    public UserRequest() {
    }
}
