package com.thoughtvault.model.response;

public class UserResponse {

    private String username;
    private String emailId;
    private String contactNumber;
    private String gender;

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

    public UserResponse(String username, String emailId, String contactNumber, String gender) {
        this.username = username;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.gender = gender;
    }

    public UserResponse() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
